package net.grey3345.gkIronmod.block.custom;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.item.ModItems;
import net.grey3345.gkIronmod.item.custom.ModBlockItem;
import net.grey3345.gkIronmod.util.HeatStateMap;
import net.grey3345.gkIronmod.util.RustStateMap;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;
import java.util.Random;

public class RustableBlock extends Block implements WeatheringCopper {

    private final WeatheringCopper.WeatherState weatherState;

    public RustableBlock(Properties properties, WeatheringCopper.WeatherState weatherState) {
        super(properties.randomTicks());
        this.weatherState = weatherState;
    }

    @Override
    public void onPlace(BlockState p_60566_, Level p_60567_, BlockPos p_60568_, BlockState p_60569_, boolean p_60570_) {
        super.onPlace(p_60566_, p_60567_, p_60568_, p_60569_, p_60570_);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        ItemStack stack = player.getItemInHand(hand);
        if (stack.getItem() == Items.HONEYCOMB) {
            setWaxed(state,world,pos,player,hand);
        } else
        if (stack.getItem() == Items.FLINT_AND_STEEL){
            setUnwaxed(state,world,pos,player,hand);
        } else
        if (stack.getItem() == ModItems.SAND_PAPER.get()){
            decreaseStage(state,world,pos,player,hand);
        }
        return InteractionResult.PASS;
    }

    public static void decreaseStage(BlockState state, Level world, BlockPos pos, @Nullable Player player, @Nullable InteractionHand hand) {
        Optional<Block> block = RustStateMap.getDecrease(state.getBlock());
        if (block.isPresent()) {
            world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
            world.levelEvent(player, 3003, pos, 0);
            if (player != null) {
                world.levelEvent(player, 3003, pos, 0);
                player.getItemInHand(hand != null ? hand : InteractionHand.MAIN_HAND).shrink(1);
            }
        }
    }

    public static void decreaseStage(BlockState state, Level world, BlockPos pos) {
        decreaseStage(state,world,pos,null,null);
    }

    public static void setWaxed(BlockState state, Level world, BlockPos pos, @Nullable Player player, @Nullable InteractionHand hand) {
        Optional<Block> block = RustStateMap.getWaxed(state.getBlock());
        if (block.isPresent()) {
            world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
            if (player != null) {
                world.levelEvent(player, 3003, pos, 0);
                player.getItemInHand(hand != null ? hand : InteractionHand.MAIN_HAND).shrink(1);
            }
        }
    }

    public static void setWaxed(BlockState state, Level world, BlockPos pos) {
        setWaxed(state,world,pos,null,null);
    }

    public static void setUnwaxed(BlockState state, Level world, BlockPos pos, @Nullable Player player, @Nullable InteractionHand hand) {
        Optional<Block> block = RustStateMap.getUnwaxed(state.getBlock());
        if (block.isPresent()) {
            world.setBlock(pos, block.map(b -> b.withPropertiesOf(state)).get(), 11);
            if (player != null) {
                world.levelEvent(player, 3003, pos, 0);
                ItemStack stack = player.getItemInHand(hand != null ? hand : InteractionHand.MAIN_HAND);
                stack.setDamageValue(stack.getDamageValue() + 1);
            }
        }
    }

    public static void setUnwaxed(BlockState state, Level world, BlockPos pos) {
        setUnwaxed(state,world,pos,null,null);
    }

    @Override
    public Optional<BlockState> getNext(BlockState state) {
        return RustStateMap.getIncrease(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.onRandomTick(state, level, pos, random);
    }

    @Override
    public void applyChangeOverTime(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        int i = this.getAge().ordinal();
        int j = 0;
        int k = 0;

        for(BlockPos blockpos : BlockPos.withinManhattan(pos, 4, 4, 4)) {
            int l = blockpos.distManhattan(pos);
            if (l > 4) {
                break;
            }

            if (!blockpos.equals(pos)) {
                BlockState blockstate = level.getBlockState(blockpos);
                Block block = blockstate.getBlock();
                if (block instanceof ChangeOverTimeBlock) {
                    Enum<?> oenum = ((ChangeOverTimeBlock)block).getAge();
                    if (this.getAge().getClass() == oenum.getClass()) {
                        int i1 = oenum.ordinal();
                        if (i1 < i) {
                            return;
                        }

                        if (i1 > i) {
                            ++k;
                        } else {
                            ++j;
                        }
                    }
                }
            }
        }

        float f = (float)(k + 1) / (float)(k + j + 1);
        float f1 = f * f * this.getChanceModifier();
        if (random.nextFloat() < f1) {
            // Heat up
            if (HeatStateMap.getHeated(state.getBlock()).isPresent()) {
                level.setBlock(pos, HeatStateMap.getHeated(state.getBlock()).get().defaultBlockState(), 3);
            }
        }

        WeatheringCopper.super.applyChangeOverTime(state, level, pos, random);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return RustStateMap.getIncrease(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return this.weatherState;
    }
}