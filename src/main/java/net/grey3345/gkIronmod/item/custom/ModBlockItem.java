package net.grey3345.gkIronmod.item.custom;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.item.ModCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

@Deprecated(forRemoval = true)
public class ModBlockItem extends BlockItem {

    public ModBlockItem(Block block, Properties properties) {
        super(block, properties.tab(ModCreativeModeTab.GKIRON_TAB));
    }
}