package net.grey3345.gkIronmod.block;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.block.custom.*;
import net.grey3345.gkIronmod.item.ModCreativeModeTab;
import net.grey3345.gkIronmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GkIronMod.MOD_ID);

    //region Raw Wrought Iron
    // Raw wrought Iron
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK = registerBlock("raw_wrought_iron_block",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_EXPOSED = registerBlock("raw_wrought_iron_block_exposed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WEATHERED = registerBlock("raw_wrought_iron_block_weathered",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_RUSTED = registerBlock("raw_wrought_iron_block_rusted",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Raw wrought Iron Waxed
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WAXED = registerBlock("raw_wrought_iron_block_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = registerBlock("raw_wrought_iron_block_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = registerBlock("raw_wrought_iron_block_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_RUSTED_WAXED = registerBlock("raw_wrought_iron_block_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //endregion

    //region Formed Wrought Iron Blocks
    // Formed wrought Iron

    public static final RegistryObject<Block> WROUGHT_IRON_FENCE = registerBlock("wrought_iron_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_FENCE_GATE = registerBlock("wrought_iron_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);


    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK = registerBlock("wrought_iron_block",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_EXPOSED = registerBlock("wrought_iron_block_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WEATHERED = registerBlock("wrought_iron_block_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_RUSTED = registerBlock("wrought_iron_block_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WAXED = registerBlock("wrought_iron_block_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_EXPOSED_WAXED = registerBlock("wrought_iron_block_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WEATHERED_WAXED = registerBlock("wrought_iron_block_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_RUSTED_WAXED = registerBlock("wrought_iron_block_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Various blocks
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS = registerBlock("wrought_iron_block_stairs",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_EXPOSED = registerBlock("wrought_iron_block_stairs_exposed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_EXPOSED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_WEATHERED = registerBlock("wrought_iron_block_stairs_weathered",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_WEATHERED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_RUSTED = registerBlock("wrought_iron_block_stairs_rusted",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_RUSTED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_WAXED = registerBlock("wrought_iron_block_stairs_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED = registerBlock("wrought_iron_block_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED = registerBlock("wrought_iron_block_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED = registerBlock("wrought_iron_block_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB = registerBlock("wrought_iron_block_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_EXPOSED = registerBlock("wrought_iron_block_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_WEATHERED = registerBlock("wrought_iron_block_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_RUSTED = registerBlock("wrought_iron_block_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_WAXED = registerBlock("wrought_iron_block_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED = registerBlock("wrought_iron_block_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED = registerBlock("wrought_iron_block_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED = registerBlock("wrought_iron_block_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL = registerBlock("wrought_iron_block_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_EXPOSED = registerBlock("wrought_iron_block_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_WEATHERED = registerBlock("wrought_iron_block_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_RUSTED = registerBlock("wrought_iron_block_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_WAXED = registerBlock("wrought_iron_block_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED = registerBlock("wrought_iron_block_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED = registerBlock("wrought_iron_block_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED = registerBlock("wrought_iron_block_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS = registerBlock("wrought_iron_block_bars",
            () -> new RustableBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_EXPOSED = registerBlock("wrought_iron_block_bars_exposed",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_WEATHERED = registerBlock("wrought_iron_block_bars_weathered",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_RUSTED = registerBlock("wrought_iron_block_bars_rusted",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_WAXED = registerBlock("wrought_iron_block_bars_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_EXPOSED_WAXED = registerBlock("wrought_iron_block_bars_exposed_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_WEATHERED_WAXED = registerBlock("wrought_iron_block_bars_weathered_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_RUSTED_WAXED = registerBlock("wrought_iron_block_bars_rusted_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS = registerBlock("wrought_iron_block_beams",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_EXPOSED = registerBlock("wrought_iron_block_beams_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_WEATHERED = registerBlock("wrought_iron_block_beams_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_RUSTED = registerBlock("wrought_iron_block_beams_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_WAXED = registerBlock("wrought_iron_block_beams_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_EXPOSED_WAXED = registerBlock("wrought_iron_block_beams_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_WEATHERED_WAXED = registerBlock("wrought_iron_block_beams_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_RUSTED_WAXED = registerBlock("wrought_iron_block_beams_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron CHISELED
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED = registerBlock("wrought_iron_block_chiseled",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_EXPOSED = registerBlock("wrought_iron_block_chiseled_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_WEATHERED = registerBlock("wrought_iron_block_chiseled_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_RUSTED = registerBlock("wrought_iron_block_chiseled_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron CHISELED Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_WAXED = registerBlock("wrought_iron_block_chiseled_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_EXPOSED_WAXED = registerBlock("wrought_iron_block_chiseled_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_WEATHERED_WAXED = registerBlock("wrought_iron_block_chiseled_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELED_RUSTED_WAXED = registerBlock("wrought_iron_block_chiseled_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR = registerBlock("wrought_iron_block_pillar",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_EXPOSED = registerBlock("wrought_iron_block_pillar_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_WEATHERED = registerBlock("wrought_iron_block_pillar_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_RUSTED = registerBlock("wrought_iron_block_pillar_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_WAXED = registerBlock("wrought_iron_block_pillar_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_EXPOSED_WAXED = registerBlock("wrought_iron_block_pillar_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_WEATHERED_WAXED = registerBlock("wrought_iron_block_pillar_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_RUSTED_WAXED = registerBlock("wrought_iron_block_pillar_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED = registerBlock("wrought_iron_block_plated",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_EXPOSED = registerBlock("wrought_iron_block_plated_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WEATHERED = registerBlock("wrought_iron_block_plated_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_RUSTED = registerBlock("wrought_iron_block_plated_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WAXED = registerBlock("wrought_iron_block_plated_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED = registerBlock("wrought_iron_block_plated_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED = registerBlock("wrought_iron_block_plated_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED = registerBlock("wrought_iron_block_plated_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Stairs
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS = registerBlock("wrought_iron_block_planted_stairs",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED = registerBlock("wrought_iron_block_planted_stairs_exposed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_EXPOSED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED = registerBlock("wrought_iron_block_planted_stairs_weathered",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_WEATHERED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED = registerBlock("wrought_iron_block_planted_stairs_rusted",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_RUSTED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WAXED = registerBlock("wrought_iron_block_planted_stairs_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED_WAXED = registerBlock("wrought_iron_block_planted_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED_WAXED = registerBlock("wrought_iron_block_planted_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED_WAXED = registerBlock("wrought_iron_block_planted_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Slab
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB = registerBlock("wrought_iron_block_plated_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED = registerBlock("wrought_iron_block_plated_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED = registerBlock("wrought_iron_block_plated_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED = registerBlock("wrought_iron_block_plated_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_WAXED = registerBlock("wrought_iron_block_plated_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED_WAXED = registerBlock("wrought_iron_block_plated_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED_WAXED = registerBlock("wrought_iron_block_plated_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED_WAXED = registerBlock("wrought_iron_block_plated_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated wall
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL = registerBlock("wrought_iron_block_plated_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED = registerBlock("wrought_iron_block_plated_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED = registerBlock("wrought_iron_block_plated_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED = registerBlock("wrought_iron_block_plated_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_WAXED = registerBlock("wrought_iron_block_plated_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED_WAXED = registerBlock("wrought_iron_block_plated_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED_WAXED = registerBlock("wrought_iron_block_plated_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED_WAXED = registerBlock("wrought_iron_block_plated_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut block

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT = registerBlock("wrought_iron_block_cut",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_EXPOSED = registerBlock("wrought_iron_block_cut_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WEATHERED = registerBlock("wrought_iron_block_cut_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_RUSTED = registerBlock("wrought_iron_block_cut_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WAXED = registerBlock("wrought_iron_block_cut_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED = registerBlock("wrought_iron_block_cut_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED = registerBlock("wrought_iron_block_cut_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED = registerBlock("wrought_iron_block_cut_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Stairs
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS = registerBlock("wrought_iron_block_cut_stairs",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED = registerBlock("wrought_iron_block_cut_stairs_exposed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_EXPOSED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED = registerBlock("wrought_iron_block_cut_stairs_weathered",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_WEATHERED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED = registerBlock("wrought_iron_block_cut_stairs_rusted",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_RUSTED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_WAXED = registerBlock("wrought_iron_block_cut_stairs_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED_WAXED = registerBlock("wrought_iron_block_cut_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED_WAXED = registerBlock("wrought_iron_block_cut_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED_WAXED = registerBlock("wrought_iron_block_cut_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Slab
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB = registerBlock("wrought_iron_block_cut_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED = registerBlock("wrought_iron_block_cut_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED = registerBlock("wrought_iron_block_cut_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED = registerBlock("wrought_iron_block_cut_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_WAXED = registerBlock("wrought_iron_block_cut_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED_WAXED = registerBlock("wrought_iron_block_cut_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED_WAXED = registerBlock("wrought_iron_block_cut_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED_WAXED = registerBlock("wrought_iron_block_cut_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //wall
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL = registerBlock("wrought_iron_block_cut_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED = registerBlock("wrought_iron_block_cut_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED = registerBlock("wrought_iron_block_cut_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED = registerBlock("wrought_iron_block_cut_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_WAXED = registerBlock("wrought_iron_block_cut_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED_WAXED = registerBlock("wrought_iron_block_cut_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED_WAXED = registerBlock("wrought_iron_block_cut_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED_WAXED = registerBlock("wrought_iron_block_cut_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //beam
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM = registerBlock("wrought_iron_block_cut_beam",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED = registerBlock("wrought_iron_block_cut_beam_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED = registerBlock("wrought_iron_block_cut_beam_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED = registerBlock("wrought_iron_block_cut_beam_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_WAXED = registerBlock("wrought_iron_block_cut_beam_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED_WAXED = registerBlock("wrought_iron_block_cut_beam_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED_WAXED = registerBlock("wrought_iron_block_cut_beam_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED_WAXED = registerBlock("wrought_iron_block_cut_beam_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron hammered block
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED = registerBlock("wrought_iron_block_hammered",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED = registerBlock("wrought_iron_block_hammered_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED = registerBlock("wrought_iron_block_hammered_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_RUSTED = registerBlock("wrought_iron_block_hammered_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WAXED = registerBlock("wrought_iron_block_hammered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED_WAXED = registerBlock("wrought_iron_block_hammered_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED_WAXED = registerBlock("wrought_iron_block_hammered_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_RUSTED_WAXED = registerBlock("wrought_iron_block_hammered_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron hammered Stairs
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS = registerBlock("wrought_iron_block_hammered_stairs",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_EXPOSED = registerBlock("wrought_iron_block_hammered_stairs_exposed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_WEATHERED = registerBlock("wrought_iron_block_hammered_stairs_weathered",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_RUSTED = registerBlock("wrought_iron_block_hammered_stairs_rusted",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_RUSTED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_WAXED = registerBlock("wrought_iron_block_hammered_stairs_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_EXPOSED_WAXED = registerBlock("wrought_iron_block_hammered_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_WEATHERED_WAXED = registerBlock("wrought_iron_block_hammered_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_RUSTED_WAXED = registerBlock("wrought_iron_block_hammered_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> WROUGHT_IRON_BLOCK_HAMMERED_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));

    // Formed wrought Iron hammered Slab
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB = registerBlock("wrought_iron_block_hammered_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_EXPOSED = registerBlock("wrought_iron_block_hammered_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_WEATHERED = registerBlock("wrought_iron_block_hammered_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_RUSTED = registerBlock("wrought_iron_block_hammered_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_WAXED = registerBlock("wrought_iron_block_hammered_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_EXPOSED_WAXED = registerBlock("wrought_iron_block_hammered_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_WEATHERED_WAXED = registerBlock("wrought_iron_block_hammered_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_SLAB_RUSTED_WAXED = registerBlock("wrought_iron_block_hammered_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // wall
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL = registerBlock("wrought_iron_block_hammered_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_EXPOSED = registerBlock("wrought_iron_block_hammered_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_WEATHERED = registerBlock("wrought_iron_block_hammered_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_RUSTED = registerBlock("wrought_iron_block_hammered_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_WAXED = registerBlock("wrought_iron_block_hammered_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_EXPOSED_WAXED = registerBlock("wrought_iron_block_hammered_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_WEATHERED_WAXED = registerBlock("wrought_iron_block_hammered_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_WALL_RUSTED_WAXED = registerBlock("wrought_iron_block_hammered_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // beam
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM = registerBlock("wrought_iron_block_hammered_beam",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_EXPOSED = registerBlock("wrought_iron_block_hammered_beam_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_WEATHERED = registerBlock("wrought_iron_block_hammered_beam_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_RUSTED = registerBlock("wrought_iron_block_hammered_beam_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_WAXED = registerBlock("wrought_iron_block_hammered_beam_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_EXPOSED_WAXED = registerBlock("wrought_iron_block_hammered_beam_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_WEATHERED_WAXED = registerBlock("wrought_iron_block_hammered_beam_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HAMMERED_BEAM_RUSTED_WAXED = registerBlock("wrought_iron_block_hammered_beam_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));


    public static final RegistryObject<Block> WROUGHT_IRON_DOOR = registerBlock("wrought_iron_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_EXPOSED = registerBlock("wrought_iron_door_exposed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_WEATHERED = registerBlock("wrought_iron_door_weathered",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_RUSTED = registerBlock("wrought_iron_door_rusted",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_WAXED = registerBlock("wrought_iron_door_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_EXPOSED_WAXED = registerBlock("wrought_iron_door_exposed_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_WEATHERED_WAXED = registerBlock("wrought_iron_door_weathered_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_DOOR_RUSTED_WAXED = registerBlock("wrought_iron_door_rusted_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);


    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR = registerBlock("wrought_iron_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_EXPOSED = registerBlock("wrought_iron_trapdoor_exposed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_WEATHERED = registerBlock("wrought_iron_trapdoor_weathered",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_RUSTED = registerBlock("wrought_iron_trapdoor_rusted",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_WAXED = registerBlock("wrought_iron_trapdoor_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_EXPOSED_WAXED = registerBlock("wrought_iron_trapdoor_exposed_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_WEATHERED_WAXED = registerBlock("wrought_iron_trapdoor_weathered_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WROUGHT_IRON_TRAPDOOR_RUSTED_WAXED = registerBlock("wrought_iron_trapdoor_rusted_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);


    //endregion

    //region Refined Wrought Iron
    // Refined wrought Iron
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK = registerBlock("refined_wrought_iron_block",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_EXPOSED = registerBlock("refined_wrought_iron_block_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WEATHERED = registerBlock("refined_wrought_iron_block_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_RUSTED = registerBlock("refined_wrought_iron_block_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Refined wrought Iron Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WAXED = registerBlock("refined_wrought_iron_block_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Various blocks
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS = registerBlock("refined_wrought_iron_block_stairs",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_EXPOSED = registerBlock("refined_wrought_iron_block_stairs_exposed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_EXPOSED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WEATHERED = registerBlock("refined_wrought_iron_block_stairs_weathered",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_WEATHERED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_RUSTED = registerBlock("refined_wrought_iron_block_stairs_rusted",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_RUSTED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WAXED = registerBlock("refined_wrought_iron_block_stairs_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB = registerBlock("refined_wrought_iron_block_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_EXPOSED = registerBlock("refined_wrought_iron_block_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_WEATHERED = registerBlock("refined_wrought_iron_block_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_RUSTED = registerBlock("refined_wrought_iron_block_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_WAXED = registerBlock("refined_wrought_iron_block_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL = registerBlock("refined_wrought_iron_block_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_EXPOSED = registerBlock("refined_wrought_iron_block_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_WEATHERED = registerBlock("refined_wrought_iron_block_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_RUSTED = registerBlock("refined_wrought_iron_block_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_WAXED = registerBlock("refined_wrought_iron_block_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS = registerBlock("refined_wrought_iron_block_bars",
            () -> new RustableBarsBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_EXPOSED = registerBlock("refined_wrought_iron_block_bars_exposed",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_WEATHERED = registerBlock("refined_wrought_iron_block_bars_weathered",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_RUSTED = registerBlock("refined_wrought_iron_block_bars_rusted",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_WAXED = registerBlock("refined_wrought_iron_block_bars_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_bars_exposed_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_bars_weathered_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_bars_rusted_waxed",
            () -> new RustableBarsBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS = registerBlock("refined_wrought_iron_block_beams",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_EXPOSED = registerBlock("refined_wrought_iron_block_beams_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WEATHERED = registerBlock("refined_wrought_iron_block_beams_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_RUSTED = registerBlock("refined_wrought_iron_block_beams_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WAXED = registerBlock("refined_wrought_iron_block_beams_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_beams_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_beams_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_beams_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron CHISELED
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED = registerBlock("refined_wrought_iron_block_chiseled",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_EXPOSED = registerBlock("refined_wrought_iron_block_chiseled_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_WEATHERED = registerBlock("refined_wrought_iron_block_chiseled_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_RUSTED = registerBlock("refined_wrought_iron_block_chiseled_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron CHISELED Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_WAXED = registerBlock("refined_wrought_iron_block_chiseled_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_chiseled_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_chiseled_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELED_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_chiseled_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR = registerBlock("refined_wrought_iron_block_pillar",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_EXPOSED = registerBlock("refined_wrought_iron_block_pillar_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WEATHERED = registerBlock("refined_wrought_iron_block_pillar_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_RUSTED = registerBlock("refined_wrought_iron_block_pillar_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WAXED = registerBlock("refined_wrought_iron_block_pillar_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_pillar_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_pillar_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_pillar_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED = registerBlock("refined_wrought_iron_block_planted",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED = registerBlock("refined_wrought_iron_block_planted_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED = registerBlock("refined_wrought_iron_block_planted_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED = registerBlock("refined_wrought_iron_block_planted_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WAXED = registerBlock("refined_wrought_iron_block_planted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_planted_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_planted_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_planted_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Stairs
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS = registerBlock("refined_wrought_iron_block_planted_stairs",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED = registerBlock("refined_wrought_iron_block_planted_stairs_exposed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED = registerBlock("refined_wrought_iron_block_planted_stairs_weathered",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED = registerBlock("refined_wrought_iron_block_planted_stairs_rusted",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WAXED = registerBlock("refined_wrought_iron_block_planted_stairs_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_planted_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_planted_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_planted_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Slab
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB = registerBlock("refined_wrought_iron_block_planted_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED = registerBlock("refined_wrought_iron_block_planted_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED = registerBlock("refined_wrought_iron_block_planted_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED = registerBlock("refined_wrought_iron_block_planted_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WAXED = registerBlock("refined_wrought_iron_block_planted_slab_waxed",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_planted_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_planted_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_planted_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL = registerBlock("refined_wrought_iron_block_plated_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED = registerBlock("refined_wrought_iron_block_plated_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED = registerBlock("refined_wrought_iron_block_plated_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED = registerBlock("refined_wrought_iron_block_plated_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WAXED = registerBlock("refined_wrought_iron_block_plated_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_plated_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_plated_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_plated_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut block

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT = registerBlock("refined_wrought_iron_block_cut",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED = registerBlock("refined_wrought_iron_block_cut_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED = registerBlock("refined_wrought_iron_block_cut_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED = registerBlock("refined_wrought_iron_block_cut_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WAXED = registerBlock("refined_wrought_iron_block_cut_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_cut_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_cut_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_cut_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Stairs
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS = registerBlock("refined_wrought_iron_block_cut_stairs",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED = registerBlock("refined_wrought_iron_block_cut_stairs_exposed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED = registerBlock("refined_wrought_iron_block_cut_stairs_weathered",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED = registerBlock("refined_wrought_iron_block_cut_stairs_rusted",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WAXED = registerBlock("refined_wrought_iron_block_cut_stairs_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_cut_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_cut_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_cut_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Slab
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB = registerBlock("refined_wrought_iron_block_cut_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED = registerBlock("refined_wrought_iron_block_cut_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED = registerBlock("refined_wrought_iron_block_cut_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED = registerBlock("refined_wrought_iron_block_cut_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WAXED = registerBlock("refined_wrought_iron_block_cut_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_cut_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_cut_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_cut_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //wall
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL = registerBlock("refined_wrought_iron_block_cut_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED = registerBlock("refined_wrought_iron_block_cut_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED = registerBlock("refined_wrought_iron_block_cut_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED = registerBlock("refined_wrought_iron_block_cut_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WAXED = registerBlock("refined_wrought_iron_block_cut_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_cut_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_cut_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_cut_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //beam
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM = registerBlock("refined_wrought_iron_block_cut_beam",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED = registerBlock("refined_wrought_iron_block_cut_beam_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED = registerBlock("refined_wrought_iron_block_cut_beam_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED = registerBlock("refined_wrought_iron_block_cut_beam_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WAXED = registerBlock("refined_wrought_iron_block_cut_beam_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_cut_beam_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_cut_beam_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_cut_beam_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Refined wrought Iron hammered block
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED = registerBlock("refined_wrought_iron_block_hammered",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED = registerBlock("refined_wrought_iron_block_hammered_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED = registerBlock("refined_wrought_iron_block_hammered_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_RUSTED = registerBlock("refined_wrought_iron_block_hammered_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WAXED = registerBlock("refined_wrought_iron_block_hammered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_hammered_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_hammered_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_hammered_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron hammered Stairs
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS = registerBlock("refined_wrought_iron_block_hammered_stairs",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_EXPOSED = registerBlock("refined_wrought_iron_block_hammered_stairs_exposed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_WEATHERED = registerBlock("refined_wrought_iron_block_hammered_stairs_weathered",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_RUSTED = registerBlock("refined_wrought_iron_block_hammered_stairs_rusted",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_RUSTED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_WAXED = registerBlock("refined_wrought_iron_block_hammered_stairs_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_hammered_stairs_exposed_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_EXPOSED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_hammered_stairs_weathered_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WEATHERED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_hammered_stairs_rusted_waxed",
            () -> new RustableStairBlock(() -> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_RUSTED_WAXED.get().defaultBlockState(), Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));


    // Formed wrought Iron hammered Slab
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB = registerBlock("refined_wrought_iron_block_hammered_slab",
            () -> new RustableSlabBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_EXPOSED = registerBlock("refined_wrought_iron_block_hammered_slab_exposed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_WEATHERED = registerBlock("refined_wrought_iron_block_hammered_slab_weathered",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_RUSTED = registerBlock("refined_wrought_iron_block_hammered_slab_rusted",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_WAXED = registerBlock("refined_wrought_iron_block_hammered_slab_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_hammered_slab_exposed_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_hammered_slab_weathered_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_hammered_slab_rusted_waxed",
            () -> new RustableSlabBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //wall
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL = registerBlock("refined_wrought_iron_block_hammered_wall",
            () -> new RustableWallBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_EXPOSED = registerBlock("refined_wrought_iron_block_hammered_wall_exposed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_WEATHERED = registerBlock("refined_wrought_iron_block_hammered_wall_weathered",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_RUSTED = registerBlock("refined_wrought_iron_block_hammered_wall_rusted",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_WAXED = registerBlock("refined_wrought_iron_block_hammered_wall_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_hammered_wall_exposed_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_hammered_wall_weathered_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_hammered_wall_rusted_waxed",
            () -> new RustableWallBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //beam
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM = registerBlock("refined_wrought_iron_block_hammered_beam",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_EXPOSED = registerBlock("refined_wrought_iron_block_hammered_beam_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_WEATHERED = registerBlock("refined_wrought_iron_block_hammered_beam_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_RUSTED = registerBlock("refined_wrought_iron_block_hammered_beam_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_WAXED = registerBlock("refined_wrought_iron_block_hammered_beam_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_EXPOSED_WAXED = registerBlock("refined_wrought_iron_block_hammered_beam_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_WEATHERED_WAXED = registerBlock("refined_wrought_iron_block_hammered_beam_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM_RUSTED_WAXED = registerBlock("refined_wrought_iron_block_hammered_beam_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_HAMMERED_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));


    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR = registerBlock("refined_wrought_iron_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_EXPOSED = registerBlock("refined_wrought_iron_door_exposed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_WEATHERED = registerBlock("refined_wrought_iron_door_weathered",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_RUSTED = registerBlock("refined_wrought_iron_door_rusted",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_WAXED = registerBlock("refined_wrought_iron_door_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_EXPOSED_WAXED = registerBlock("refined_wrought_iron_door_exposed_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_WEATHERED_WAXED = registerBlock("refined_wrought_iron_door_weathered_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_DOOR_RUSTED_WAXED = registerBlock("refined_wrought_iron_door_rusted_waxed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);


    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR = registerBlock("refined_wrought_iron_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_EXPOSED = registerBlock("refined_wrought_iron_trapdoor_exposed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_WEATHERED = registerBlock("refined_wrought_iron_trapdoor_weathered",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_RUSTED = registerBlock("refined_wrought_iron_trapdoor_rusted",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_WAXED = registerBlock("refined_wrought_iron_trapdoor_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_EXPOSED_WAXED = registerBlock("refined_wrought_iron_trapdoor_exposed_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_WEATHERED_WAXED = registerBlock("refined_wrought_iron_trapdoor_weathered_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_TRAPDOOR_RUSTED_WAXED = registerBlock("refined_wrought_iron_trapdoor_rusted_waxed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);


    //endregion

    //region Painted Wrought Iron
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK = registerBlock("painted_wrought_iron_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_STAIRS = registerBlock("painted_wrought_iron_block_stairs",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_SLAB = registerBlock("painted_wrought_iron_block_slab",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_WALL = registerBlock("painted_wrought_iron_block_wall",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_BEAM = registerBlock("painted_wrought_iron_block_beam",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);


    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_TRIMMED = registerBlock("painted_wrought_iron_block_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_STAIRS_TRIMMED = registerBlock("painted_wrought_iron_block_stairs_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_SLAB_TRIMMED = registerBlock("painted_wrought_iron_block_slab_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_WALL_TRIMMED = registerBlock("painted_wrought_iron_block_wall_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_BEAM_TRIMMED = registerBlock("painted_wrought_iron_block_beam_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_DOOR = registerBlock("painted_wrought_iron_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_DOOR_TRIMMED = registerBlock("painted_wrought_iron_door_trimmed",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_TRAPDOOR = registerBlock("painted_wrought_iron_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_TRAPDOOR_TRIMMED = registerBlock("painted_wrought_iron_trapdoor_trimmed",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.GKIRON_TAB);


    //endregion

    //region Heated Blocks
    // Heated Wrought Iron Raw, Formed, Refined

    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WARM = registerBlock("raw_wrought_iron_block_warm",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WARM_TREATED = registerBlock("raw_wrought_iron_block_warm_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_HOT = registerBlock("raw_wrought_iron_block_hot",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_HOT_TREATED = registerBlock("raw_wrought_iron_block_hot_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_BURN = registerBlock("raw_wrought_iron_block_burn",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_BURN_TREATED = registerBlock("raw_wrought_iron_block_burn_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));


    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WARM = registerBlock("wrought_iron_block_warm",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WARM_TREATED = registerBlock("wrought_iron_block_warm_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HOT = registerBlock("wrought_iron_block_hot",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_HOT_TREATED = registerBlock("wrought_iron_block_hot_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BURN = registerBlock("wrought_iron_block_burn",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BURN_TREATED = registerBlock("wrought_iron_block_burn_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));


    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WARM = registerBlock("refined_wrought_iron_block_warm",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WARM_TREATED = registerBlock("refined_wrought_iron_block_warm_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HOT = registerBlock("refined_wrought_iron_block_hot",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_HOT_TREATED = registerBlock("refined_wrought_iron_block_hot_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BURN = registerBlock("refined_wrought_iron_block_burn",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BURN_TREATED = registerBlock("refined_wrought_iron_block_burn_treated",
            () -> new HeatableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.METAL).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    //endregion


    // DUZO TESTING REMOVE WHEN DONE @TODO
    public static final RegistryObject<Block> METAL_GRAVEL = registerBlock("metal_gravel", () -> new MetalGravelBlock(BlockBehaviour.Properties.of(Material.METAL)), ModCreativeModeTab.GKIRON_TAB);
    public static final RegistryObject<Block> WEIGHT_BLOCK = registerBlock("weight_block", () -> new WeightBlock(BlockBehaviour.Properties.of(Material.METAL)), ModCreativeModeTab.GKIRON_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, ModCreativeModeTab.GKIRON_TAB);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, @Nullable CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, @Nullable CreativeModeTab tab) {
        if (tab != null) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
        }
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
