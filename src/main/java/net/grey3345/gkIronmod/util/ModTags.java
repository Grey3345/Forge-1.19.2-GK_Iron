package net.grey3345.gkIronmod.util;

import net.grey3345.gkIronmod.GkIronMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WROUGHT_GEODE_CANNOT_REPLACE = createTag("wrought_geode_cannot_replace");
        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(new ResourceLocation(GkIronMod.MOD_ID,name));
        }
        private static TagKey<Block> createForgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge",name));
        }
    }
}
