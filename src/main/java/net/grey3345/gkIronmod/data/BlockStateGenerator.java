package net.grey3345.gkIronmod.data;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.models.blockstates.Condition;
import net.minecraft.data.models.blockstates.MultiPartGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateGenerator extends BlockStateProvider {
    private final ExistingFileHelper fileHelper;
    public BlockStateGenerator(DataGenerator output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
        this.fileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        for (RegistryObject<Block> entry : ModBlocks.BLOCKS.getEntries()) {
            // @TODO this better
            if (entry.get() instanceof StairBlock) {
                stairsBlock((StairBlock) entry.get(), new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + entry.get().getDescriptionId() + ".png"));
                continue;
            }
            if (entry.get() instanceof WallBlock) {
                wallBlock((WallBlock) entry.get(), new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + entry.get().getDescriptionId() + ".png"));
            }
            if (entry.get() instanceof SlabBlock) {
                slabBlock((SlabBlock) entry.get(), new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + entry.get().getDescriptionId() + ".png"), new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + entry.get().getDescriptionId() + ".png"));
            }
            if (entry.get() instanceof IronBarsBlock) {
                paneBlock((IronBarsBlock) entry.get(),new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + entry.get().getDescriptionId() + ".png"),new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + entry.get().getDescriptionId() + "_side.png"));
            }

            simpleBlock(entry.get());
        }
    }
}
