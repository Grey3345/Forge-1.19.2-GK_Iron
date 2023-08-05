package net.grey3345.gkIronmod.world;

import net.grey3345.gkIronmod.GkIronMod;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, GkIronMod.MOD_ID);

    public static final RegistryObject<PlacedFeature> RAW_WROUGHT_IRON_PLACED = PLACED_FEATURES.register("raw_wrought_iron_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.RAW_WROUGHT_IRON.getHolder().get(),
                    commonOrePlacement(16/* this number is how common it will be */, HeightRangePlacement.triangle(VerticalAnchor.absolute(50), VerticalAnchor.absolute(112))))
            );

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
