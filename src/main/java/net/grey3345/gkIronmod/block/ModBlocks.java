package net.grey3345.gkIronmod.block;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.block.custom.RustableBlock;
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

import java.util.Map;
import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GkIronMod.MOD_ID);

    //region Raw Wrought Iron
    // Raw wrought Iron
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK = BLOCKS.register("raw_wrought_iron_block",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_EXPOSED = BLOCKS.register("raw_wrought_iron_block_exposed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WEATHERED = BLOCKS.register("raw_wrought_iron_block_weathered",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_RUSTED = BLOCKS.register("raw_wrought_iron_block_rusted",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Raw wrought Iron Waxed
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WAXED = BLOCKS.register("raw_wrought_iron_block_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = BLOCKS.register("raw_wrought_iron_block_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = BLOCKS.register("raw_wrought_iron_block_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> RAW_WROUGHT_IRON_BLOCK_RUSTED_WAXED = BLOCKS.register("raw_wrought_iron_block_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(RAW_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //endregion

    //region Formed Wrought Iron Blocks
    // Formed wrought Iron
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK = BLOCKS.register("wrought_iron_block",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_EXPOSED = BLOCKS.register("wrought_iron_block_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WEATHERED = BLOCKS.register("wrought_iron_block_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_RUSTED = BLOCKS.register("wrought_iron_block_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WAXED = BLOCKS.register("wrought_iron_block_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Various blocks
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS = BLOCKS.register("wrought_iron_block_stairs",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_EXPOSED = BLOCKS.register("wrought_iron_block_stairs_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_WEATHERED = BLOCKS.register("wrought_iron_block_stairs_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_RUSTED = BLOCKS.register("wrought_iron_block_stairs_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_WAXED = BLOCKS.register("wrought_iron_block_stairs_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_stairs_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_stairs_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_stairs_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB = BLOCKS.register("wrought_iron_block_slab",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_EXPOSED = BLOCKS.register("wrought_iron_block_slab_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_WEATHERED = BLOCKS.register("wrought_iron_block_slab_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_RUSTED = BLOCKS.register("wrought_iron_block_slab_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_WAXED = BLOCKS.register("wrought_iron_block_slab_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_slab_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_slab_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_slab_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL = BLOCKS.register("wrought_iron_block_wall",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_EXPOSED = BLOCKS.register("wrought_iron_block_wall_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_WEATHERED = BLOCKS.register("wrought_iron_block_wall_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_RUSTED = BLOCKS.register("wrought_iron_block_wall_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_WAXED = BLOCKS.register("wrought_iron_block_wall_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_wall_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_wall_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_wall_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS = BLOCKS.register("wrought_iron_block_bars",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_EXPOSED = BLOCKS.register("wrought_iron_block_bars_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_WEATHERED = BLOCKS.register("wrought_iron_block_bars_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_RUSTED = BLOCKS.register("wrought_iron_block_bars_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_WAXED = BLOCKS.register("wrought_iron_block_bars_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_bars_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_bars_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BARS_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_bars_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS = BLOCKS.register("wrought_iron_block_beams",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_EXPOSED = BLOCKS.register("wrought_iron_block_beams_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_WEATHERED = BLOCKS.register("wrought_iron_block_beams_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_RUSTED = BLOCKS.register("wrought_iron_block_beams_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_WAXED = BLOCKS.register("wrought_iron_block_beams_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_beams_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_beams_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_BEAMS_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_beams_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Chiselled
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED = BLOCKS.register("wrought_iron_block_chiselled",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED = BLOCKS.register("wrought_iron_block_chiselled_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED = BLOCKS.register("wrought_iron_block_chiselled_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_RUSTED = BLOCKS.register("wrought_iron_block_chiselled_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Chiselled Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_WAXED = BLOCKS.register("wrought_iron_block_chiselled_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_chiselled_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_chiselled_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CHISELLED_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_chiselled_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR = BLOCKS.register("wrought_iron_block_pillar",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_EXPOSED = BLOCKS.register("wrought_iron_block_pillar_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_WEATHERED = BLOCKS.register("wrought_iron_block_pillar_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_RUSTED = BLOCKS.register("wrought_iron_block_pillar_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_WAXED = BLOCKS.register("wrought_iron_block_pillar_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_pillar_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_pillar_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PILLAR_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_pillar_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED = BLOCKS.register("wrought_iron_block_planted",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_EXPOSED = BLOCKS.register("wrought_iron_block_planted_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WEATHERED = BLOCKS.register("wrought_iron_block_planted_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_RUSTED = BLOCKS.register("wrought_iron_block_planted_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Waxed
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WAXED = BLOCKS.register("wrought_iron_block_planted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_planted_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_planted_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_planted_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Stairs
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS = BLOCKS.register("wrought_iron_block_planted_stairs",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED = BLOCKS.register("wrought_iron_block_planted_stairs_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED = BLOCKS.register("wrought_iron_block_planted_stairs_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED = BLOCKS.register("wrought_iron_block_planted_stairs_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WAXED = BLOCKS.register("wrought_iron_block_planted_stairs_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_planted_stairs_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_planted_stairs_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_planted_stairs_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Slab
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB = BLOCKS.register("wrought_iron_block_planted_slab",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED = BLOCKS.register("wrought_iron_block_planted_slab_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED = BLOCKS.register("wrought_iron_block_planted_slab_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED = BLOCKS.register("wrought_iron_block_planted_slab_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_WAXED = BLOCKS.register("wrought_iron_block_planted_slab_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_planted_slab_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_planted_slab_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_planted_slab_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated wall
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL = BLOCKS.register("wrought_iron_block_planted_wall",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED = BLOCKS.register("wrought_iron_block_planted_wall_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED = BLOCKS.register("wrought_iron_block_planted_wall_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED = BLOCKS.register("wrought_iron_block_planted_wall_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_WAXED = BLOCKS.register("wrought_iron_block_planted_wall_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_planted_wall_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_planted_wall_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_planted_wall_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut block

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT = BLOCKS.register("wrought_iron_block_cut",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_EXPOSED = BLOCKS.register("wrought_iron_block_cut_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WEATHERED = BLOCKS.register("wrought_iron_block_cut_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_RUSTED = BLOCKS.register("wrought_iron_block_cut_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WAXED = BLOCKS.register("wrought_iron_block_cut_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_cut_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_cut_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_cut_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Stairs
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS = BLOCKS.register("wrought_iron_block_cut_stairs",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED = BLOCKS.register("wrought_iron_block_cut_stairs_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED = BLOCKS.register("wrought_iron_block_cut_stairs_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED = BLOCKS.register("wrought_iron_block_cut_stairs_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_WAXED = BLOCKS.register("wrought_iron_block_cut_stairs_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_cut_stairs_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_cut_stairs_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_cut_stairs_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Slab
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB = BLOCKS.register("wrought_iron_block_cut_slab",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED = BLOCKS.register("wrought_iron_block_cut_slab_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED = BLOCKS.register("wrought_iron_block_cut_slab_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED = BLOCKS.register("wrought_iron_block_cut_slab_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_WAXED = BLOCKS.register("wrought_iron_block_cut_slab_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_cut_slab_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_cut_slab_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_cut_slab_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));
//wall
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL = BLOCKS.register("wrought_iron_block_cut_wall",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED = BLOCKS.register("wrought_iron_block_cut_wall_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED = BLOCKS.register("wrought_iron_block_cut_wall_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED = BLOCKS.register("wrought_iron_block_cut_wall_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_WAXED = BLOCKS.register("wrought_iron_block_cut_wall_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_cut_wall_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_cut_wall_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_cut_wall_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));
//beam
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM = BLOCKS.register("wrought_iron_block_cut_beam",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED = BLOCKS.register("wrought_iron_block_cut_beam_exposed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED = BLOCKS.register("wrought_iron_block_cut_beam_weathered",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED = BLOCKS.register("wrought_iron_block_cut_beam_rusted",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_WAXED = BLOCKS.register("wrought_iron_block_cut_beam_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED_WAXED = BLOCKS.register("wrought_iron_block_cut_beam_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED_WAXED = BLOCKS.register("wrought_iron_block_cut_beam_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED_WAXED = BLOCKS.register("wrought_iron_block_cut_beam_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //endregion

    //region Refined Wrought Iron
    // Refined wrought Iron
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK = BLOCKS.register("refined_wrought_iron_block",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_EXPOSED = BLOCKS.register("refined_wrought_iron_block_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WEATHERED = BLOCKS.register("refined_wrought_iron_block_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_RUSTED = BLOCKS.register("refined_wrought_iron_block_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Refined wrought Iron Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WAXED = BLOCKS.register("refined_wrought_iron_block_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Various blocks
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS = BLOCKS.register("refined_wrought_iron_block_stairs",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_EXPOSED = BLOCKS.register("refined_wrought_iron_block_stairs_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WEATHERED = BLOCKS.register("refined_wrought_iron_block_stairs_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_RUSTED = BLOCKS.register("refined_wrought_iron_block_stairs_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WAXED = BLOCKS.register("refined_wrought_iron_block_stairs_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_stairs_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_stairs_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_stairs_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB = BLOCKS.register("refined_wrought_iron_block_slab",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_EXPOSED = BLOCKS.register("refined_wrought_iron_block_slab_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_WEATHERED = BLOCKS.register("refined_wrought_iron_block_slab_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_RUSTED = BLOCKS.register("refined_wrought_iron_block_slab_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_WAXED = BLOCKS.register("refined_wrought_iron_block_slab_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_slab_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_slab_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_slab_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL = BLOCKS.register("refined_wrought_iron_block_wall",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_EXPOSED = BLOCKS.register("refined_wrought_iron_block_wall_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_WEATHERED = BLOCKS.register("refined_wrought_iron_block_wall_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_RUSTED = BLOCKS.register("refined_wrought_iron_block_wall_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_WAXED = BLOCKS.register("refined_wrought_iron_block_wall_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_wall_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_wall_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_wall_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS = BLOCKS.register("refined_wrought_iron_block_bars",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_EXPOSED = BLOCKS.register("refined_wrought_iron_block_bars_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_WEATHERED = BLOCKS.register("refined_wrought_iron_block_bars_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_RUSTED = BLOCKS.register("refined_wrought_iron_block_bars_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_WAXED = BLOCKS.register("refined_wrought_iron_block_bars_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_bars_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_bars_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BARS_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_bars_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BARS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS = BLOCKS.register("refined_wrought_iron_block_beams",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_EXPOSED = BLOCKS.register("refined_wrought_iron_block_beams_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WEATHERED = BLOCKS.register("refined_wrought_iron_block_beams_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_RUSTED = BLOCKS.register("refined_wrought_iron_block_beams_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WAXED = BLOCKS.register("refined_wrought_iron_block_beams_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_beams_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_beams_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_BEAMS_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_beams_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_BEAMS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Chiselled
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED = BLOCKS.register("refined_wrought_iron_block_chiselled",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED = BLOCKS.register("refined_wrought_iron_block_chiselled_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED = BLOCKS.register("refined_wrought_iron_block_chiselled_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_RUSTED = BLOCKS.register("refined_wrought_iron_block_chiselled_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Chiselled Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_WAXED = BLOCKS.register("refined_wrought_iron_block_chiselled_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_chiselled_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_chiselled_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_chiselled_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CHISELLED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR = BLOCKS.register("refined_wrought_iron_block_pillar",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_EXPOSED = BLOCKS.register("refined_wrought_iron_block_pillar_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WEATHERED = BLOCKS.register("refined_wrought_iron_block_pillar_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_RUSTED = BLOCKS.register("refined_wrought_iron_block_pillar_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Pillar Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WAXED = BLOCKS.register("refined_wrought_iron_block_pillar_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_pillar_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_pillar_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PILLAR_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_pillar_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PILLAR.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED = BLOCKS.register("refined_wrought_iron_block_planted",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED = BLOCKS.register("refined_wrought_iron_block_planted_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED = BLOCKS.register("refined_wrought_iron_block_planted_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED = BLOCKS.register("refined_wrought_iron_block_planted_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Waxed
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Stairs
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS = BLOCKS.register("refined_wrought_iron_block_planted_stairs",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_stairs_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron Plated Slab
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB = BLOCKS.register("refined_wrought_iron_block_planted_slab",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED = BLOCKS.register("refined_wrought_iron_block_planted_slab_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED = BLOCKS.register("refined_wrought_iron_block_planted_slab_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED = BLOCKS.register("refined_wrought_iron_block_planted_slab_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL = BLOCKS.register("refined_wrought_iron_block_plated_wall",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED = BLOCKS.register("refined_wrought_iron_block_plated_wall_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED = BLOCKS.register("refined_wrought_iron_block_plated_wall_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED = BLOCKS.register("refined_wrought_iron_block_plated_wall_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WAXED = BLOCKS.register("refined_wrought_iron_block_plated_wall_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_plated_wall_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_plated_wall_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_plated_wall_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));


    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_slab_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_slab_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_slab_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_planted_slab_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut block

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT = BLOCKS.register("refined_wrought_iron_block_cut",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED = BLOCKS.register("refined_wrought_iron_block_cut_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED = BLOCKS.register("refined_wrought_iron_block_cut_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED = BLOCKS.register("refined_wrought_iron_block_cut_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Stairs
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS = BLOCKS.register("refined_wrought_iron_block_cut_stairs",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_stairs_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS.get()), WeatheringCopper.WeatherState.OXIDIZED));

    // Formed wrought Iron cut Slab
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB = BLOCKS.register("refined_wrought_iron_block_cut_slab",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED = BLOCKS.register("refined_wrought_iron_block_cut_slab_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED = BLOCKS.register("refined_wrought_iron_block_cut_slab_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED = BLOCKS.register("refined_wrought_iron_block_cut_slab_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_slab_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_slab_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_slab_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_slab_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //wall
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL = BLOCKS.register("refined_wrought_iron_block_cut_wall",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED = BLOCKS.register("refined_wrought_iron_block_cut_wall_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED = BLOCKS.register("refined_wrought_iron_block_cut_wall_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED = BLOCKS.register("refined_wrought_iron_block_cut_wall_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_wall_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_wall_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_wall_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_wall_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_WALL.get()), WeatheringCopper.WeatherState.OXIDIZED));
    //beam
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM = BLOCKS.register("refined_wrought_iron_block_cut_beam",
            () -> new RustableBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER).randomTicks(), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED = BLOCKS.register("refined_wrought_iron_block_cut_beam_exposed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED = BLOCKS.register("refined_wrought_iron_block_cut_beam_weathered",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED = BLOCKS.register("refined_wrought_iron_block_cut_beam_rusted",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));

    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_beam_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.UNAFFECTED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_beam_exposed_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.EXPOSED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_beam_weathered_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.WEATHERED));
    public static final RegistryObject<Block> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED_WAXED = BLOCKS.register("refined_wrought_iron_block_cut_beam_rusted_waxed",
            () -> new RustableBlock(Block.Properties.copy(REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM.get()), WeatheringCopper.WeatherState.OXIDIZED));
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

    //endregion

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
