package net.grey3345.gkIronmod.data;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.data.client.LangGenEnglish;
import net.grey3345.gkIronmod.data.client.ModelProviderItem;
import net.grey3345.gkIronmod.data.loot.BlockLootTables;
import net.grey3345.gkIronmod.data.loot.ModLootTableProvider;
import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.FileNotFoundException;

@Mod.EventBusSubscriber(modid = GkIronMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerationEvent {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        // @TODO all items and blocks require textures for this to work correctly, uncomment when done.
        generator.addProvider(true, new ModelProviderItem(generator,existingFileHelper));
        generator.addProvider(true, new SoundDataGeneration(generator,existingFileHelper));
        generator.addProvider(true, new LangGenEnglish(generator));
        generator.addProvider(true,new BlockStateGenerator(generator, GkIronMod.MOD_ID,existingFileHelper));
        generator.addProvider(true,new ModLootTableProvider(generator));
        generator.addProvider(true,new ModBlockTagsProvider(generator,GkIronMod.MOD_ID,existingFileHelper));
    }
    public static boolean hasTexture(ExistingFileHelper helper,Block block) {
        return helper.exists(new ResourceLocation(GkIronMod.MOD_ID,"textures/block/" + block.getDescriptionId() + ".png"),new ExistingFileHelper.ResourceType(PackType.CLIENT_RESOURCES, ".png", "textures"));
    }
    public static boolean hasTexture(ExistingFileHelper helper,Item item) {
        return helper.exists(new ResourceLocation(GkIronMod.MOD_ID,"textures/item/" + item.getDescriptionId() + ".png"),new ExistingFileHelper.ResourceType(PackType.CLIENT_RESOURCES, ".png", "textures"));
    }
}