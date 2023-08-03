package net.grey3345.gkIronmod.data;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.data.client.LangGenEnglish;
import net.grey3345.gkIronmod.data.client.ModelProviderItem;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GkIronMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerationEvent {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new ModelProviderItem(generator,existingFileHelper));
        generator.addProvider(true, new SoundDataGeneration(generator,existingFileHelper));
        generator.addProvider(true, new LangGenEnglish(generator));
        generator.addProvider(true,new BlockStateGenerator(generator, GkIronMod.MOD_ID,existingFileHelper));
    }
}