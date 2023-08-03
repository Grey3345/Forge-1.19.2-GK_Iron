package net.grey3345.gkIronmod.data;

import net.grey3345.gkIronmod.GkIronMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

public class SoundDataGeneration extends SoundDefinitionsProvider {

    public SoundDataGeneration(DataGenerator output, ExistingFileHelper helper) {
        super(output, GkIronMod.MOD_ID, helper);
    }

    @Override
    public void registerSounds() {
        // @TODO No sounds yet so nothing to generate
//        for (RegistryObject<SoundEvent> entry : ModSounds.SOUNDS.getEntries()) {
//            createDefinitionAndAdd(entry.get(), SoundDefinition.SoundType.SOUND, entry.get().getLocation().getPath(), entry.get().getLocation().getPath());
//        }
    }

    public void createDefinitionAndAdd(SoundEvent mainSound, SoundDefinition.SoundType soundType, String subtitle, String... soundEvent) {
        SoundDefinition def = SoundDefinition.definition().subtitle("subtitle." + GkIronMod.MOD_ID + "." + subtitle);
        for (String event : soundEvent) {
            def.with(SoundDefinition.Sound.sound(new ResourceLocation(GkIronMod.MOD_ID, event), soundType));
        }
        add(mainSound, def);
    }
}
