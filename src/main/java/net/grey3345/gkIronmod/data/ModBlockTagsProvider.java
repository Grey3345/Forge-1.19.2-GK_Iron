package net.grey3345.gkIronmod.data;

import net.grey3345.gkIronmod.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generator, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(generator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        // Adds iron tool requirement to ALL blocks.
        for (Iterator<Block> it = ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).iterator(); it.hasNext(); ) {
            Block block = it.next();
            this.tag(BlockTags.NEEDS_IRON_TOOL).add(block);
        }
    }
}
