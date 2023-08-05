package net.grey3345.gkIronmod.block.custom;

import net.grey3345.gkIronmod.block.entities.ModBlockEntities;
import net.grey3345.gkIronmod.block.entities.WeightBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEventListener;
import org.apache.commons.lang3.Range;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.IntStream;

public class WeightBlock extends BaseEntityBlock {
    public WeightBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.MODEL;
    }

    public static void attemptPush(Level level, BlockPos pos) {
        if (level.isClientSide) return;

        if (level.getBlockState(pos.below()).isAir()) {
            // Move self down
            moveBlockDown(pos,level.getBlockState(pos),level);
            return;
        };
        // Definitely something below

        // Ignore other weighted blocks
        if (level.getBlockState(pos.below()).getBlock() instanceof WeightBlock) return;

        HashMap<BlockPos, BlockState> above = getAboveWeightedBlocks(level,pos);
        int count = above.size() + 1; // + 1 for this block itself

        HashMap<BlockPos, BlockState> below = getBlocksBelow(level,pos,count);
        moveAllBlocksOneDown(below,level);
    }

    public static void moveBlockDown(BlockPos pos, BlockState state, Level level) {
        if (level.getBlockState(pos).isAir() || !level.getBlockState(pos.below()).isAir()) return;
        level.setBlock(pos.below(),state,3);
        level.setBlock(pos, Blocks.AIR.defaultBlockState(),3);
    }

    public static void moveAllBlocksOneDown(HashMap<BlockPos, BlockState> coords, Level level) {
        for (BlockPos pos : coords.keySet()) {
            moveBlockDown(pos,coords.get(pos),level);
        }
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static HashMap<BlockPos, BlockState> getBlocksBelow(Level level, BlockPos pos, int count) {
        BlockPos check = pos;
        BlockState checkState;
        HashMap<BlockPos, BlockState> list = new HashMap<>();
        for (int i = 0; i < count; i++) {
            check = check.below();
            checkState = level.getBlockState(check);

            if (checkState.isAir()) return list; // Stop once we reach the first air.

            list.put(check,checkState);
        }
        return list;
    }

    public static HashMap<BlockPos, BlockState> getAboveWeightedBlocks(Level level, BlockPos pos) {
        BlockPos check = pos;
        BlockState checkState;
        HashMap<BlockPos, BlockState> list = new HashMap<>();
        for (int i = 0; i < 15; i++) { // 15 because only checking 15 above blocks
            check = check.above();
            checkState = level.getBlockState(check);

            if (checkState.isAir()) return list; // Stop once we reach the first air.

            if (checkState.getBlock() instanceof WeightBlock) {
                list.put(check,checkState);
            }
        }
        return list;
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        return level.isClientSide() ? null : ($0, $1, $2, blockEntity) -> {
            if(blockEntity instanceof WeightBlockEntity) {
                WeightBlockEntity weight = (WeightBlockEntity) blockEntity;
                weight.tick();
            }
        };
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos p_153215_, BlockState p_153216_) {
        return ModBlockEntities.WEIGHT_BLOCK_ENTITY.get().create(p_153215_, p_153216_);
    }
}
