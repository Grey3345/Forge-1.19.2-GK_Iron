package net.grey3345.gkIronmod.world;

import com.google.common.base.Suppliers;
import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedBlockStateProvider;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?,?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, GkIronMod.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_RAW_WROUGHT_IRON = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RAW_WROUGHT_IRON_BLOCK.get().defaultBlockState())
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.RAW_WROUGHT_IRON_BLOCK.get().defaultBlockState())
    ));

    public static final RegistryObject<ConfiguredFeature<?,?>> RAW_WROUGHT_IRON = CONFIGURED_FEATURES.register("raw_wrought_iron", () -> new ConfiguredFeature<>(Feature.DISK, new DiskConfiguration(RuleBasedBlockStateProvider.simple(ModBlocks.RAW_WROUGHT_IRON_BLOCK.get()), BlockPredicate.matchesBlocks(List.of(Blocks.DIRT, ModBlocks.RAW_WROUGHT_IRON_BLOCK.get(), Blocks.STONE)), UniformInt.of(2, 3), 1)));
}