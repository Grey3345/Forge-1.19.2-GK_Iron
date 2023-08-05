package net.grey3345.gkIronmod.data.loot;

import net.grey3345.gkIronmod.block.ModBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class BlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        // All blocks drop self
        for (Block block : getKnownBlocks()) {
            this.dropSelf(block);
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
