package net.grey3345.gkIronmod.block.entities;

import net.grey3345.gkIronmod.block.custom.WeightBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class WeightBlockEntity extends BlockEntity {
    public WeightBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WEIGHT_BLOCK_ENTITY.get(), pos, state);
    }

    public void tick() {
        if (this.level == null) return;

        WeightBlock.attemptPush(this.level,this.worldPosition);
    }
}
