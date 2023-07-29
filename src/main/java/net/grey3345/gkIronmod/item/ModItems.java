package net.grey3345.gkIronmod.item;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.block.ModBlocks;
import net.grey3345.gkIronmod.item.custom.ModBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GkIronMod.MOD_ID);

    // Define your wrought iron block names here

    //region RAW WROUGHT IRON
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK = ITEMS.register("raw_wrought_iron_block", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_EXPOSED = ITEMS.register("raw_wrought_iron_block_exposed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_WEATHERED = ITEMS.register("raw_wrought_iron_block_weathered", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_RUSTED = ITEMS.register("raw_wrought_iron_block_rusted", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_WAXED = ITEMS.register("raw_wrought_iron_block_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = ITEMS.register("raw_wrought_iron_block_exposed_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = ITEMS.register("raw_wrought_iron_block_weathered_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_RUSTED_WAXED = ITEMS.register("raw_wrought_iron_block_rusted_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_RUSTED_WAXED.get(), new Item.Properties()));
    //endregion


    //region Wrought Iron

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK = ITEMS.register("wrought_iron_block", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_EXPOSED = ITEMS.register("wrought_iron_block_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WEATHERED = ITEMS.register("wrought_iron_block_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_RUSTED = ITEMS.register("wrought_iron_block_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WAXED = ITEMS.register("wrought_iron_block_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_RUSTED_WAXED = ITEMS.register("wrought_iron_block_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS = ITEMS.register("wrought_iron_block_stairs", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_EXPOSED = ITEMS.register("wrought_iron_block_stairs_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_WEATHERED = ITEMS.register("wrought_iron_block_stairs_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_RUSTED = ITEMS.register("wrought_iron_block_stairs_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_WAXED = ITEMS.register("wrought_iron_block_stairs_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_stairs_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_stairs_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED = ITEMS.register("wrought_iron_block_stairs_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB = ITEMS.register("wrought_iron_block_slab", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_EXPOSED = ITEMS.register("wrought_iron_block_slab_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_WEATHERED = ITEMS.register("wrought_iron_block_slab_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_RUSTED = ITEMS.register("wrought_iron_block_slab_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_WAXED = ITEMS.register("wrought_iron_block_slab_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_slab_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_slab_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED = ITEMS.register("wrought_iron_block_slab_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL = ITEMS.register("wrought_iron_block_wall", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_EXPOSED = ITEMS.register("wrought_iron_block_wall_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_WEATHERED = ITEMS.register("wrought_iron_block_wall_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_RUSTED = ITEMS.register("wrought_iron_block_wall_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_WAXED = ITEMS.register("wrought_iron_block_wall_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_wall_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_wall_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED = ITEMS.register("wrought_iron_block_wall_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS = ITEMS.register("wrought_iron_block_bars", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_EXPOSED = ITEMS.register("wrought_iron_block_bars_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_WEATHERED = ITEMS.register("wrought_iron_block_bars_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_RUSTED = ITEMS.register("wrought_iron_block_bars_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_WAXED = ITEMS.register("wrought_iron_block_bars_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_bars_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_bars_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BARS_RUSTED_WAXED = ITEMS.register("wrought_iron_block_bars_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS = ITEMS.register("wrought_iron_block_beams", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_EXPOSED = ITEMS.register("wrought_iron_block_beams_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_WEATHERED = ITEMS.register("wrought_iron_block_beams_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_RUSTED = ITEMS.register("wrought_iron_block_beams_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_WAXED = ITEMS.register("wrought_iron_block_beams_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_beams_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_beams_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_BEAMS_RUSTED_WAXED = ITEMS.register("wrought_iron_block_beams_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED = ITEMS.register("wrought_iron_block_chiselled", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED = ITEMS.register("wrought_iron_block_chiselled_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED = ITEMS.register("wrought_iron_block_chiselled_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_RUSTED = ITEMS.register("wrought_iron_block_chiselled_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_WAXED = ITEMS.register("wrought_iron_block_chiselled_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_chiselled_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_chiselled_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CHISELLED_RUSTED_WAXED = ITEMS.register("wrought_iron_block_chiselled_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR = ITEMS.register("wrought_iron_block_pillar", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_EXPOSED = ITEMS.register("wrought_iron_block_pillar_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_WEATHERED = ITEMS.register("wrought_iron_block_pillar_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_RUSTED = ITEMS.register("wrought_iron_block_pillar_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_WAXED = ITEMS.register("wrought_iron_block_pillar_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_pillar_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_pillar_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PILLAR_RUSTED_WAXED = ITEMS.register("wrought_iron_block_pillar_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED = ITEMS.register("wrought_iron_block_plated", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_EXPOSED = ITEMS.register("wrought_iron_block_plated_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WEATHERED = ITEMS.register("wrought_iron_block_plated_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_RUSTED = ITEMS.register("wrought_iron_block_plated_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WAXED = ITEMS.register("wrought_iron_block_plated_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_plated_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_plated_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED = ITEMS.register("wrought_iron_block_plated_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS = ITEMS.register("wrought_iron_block_plated_stairs", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED = ITEMS.register("wrought_iron_block_plated_stairs_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED = ITEMS.register("wrought_iron_block_plated_stairs_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED = ITEMS.register("wrought_iron_block_plated_stairs_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WAXED = ITEMS.register("wrought_iron_block_plated_stairs_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_plated_stairs_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_plated_stairs_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED_WAXED = ITEMS.register("wrought_iron_block_plated_stairs_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB = ITEMS.register("wrought_iron_block_plated_slab", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED = ITEMS.register("wrought_iron_block_plated_slab_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED = ITEMS.register("wrought_iron_block_plated_slab_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED = ITEMS.register("wrought_iron_block_plated_slab_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_WAXED = ITEMS.register("wrought_iron_block_plated_slab_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_plated_slab_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_plated_slab_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED_WAXED = ITEMS.register("wrought_iron_block_plated_slab_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL = ITEMS.register("wrought_iron_block_plated_wall", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED = ITEMS.register("wrought_iron_block_plated_wall_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED = ITEMS.register("wrought_iron_block_plated_wall_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED = ITEMS.register("wrought_iron_block_plated_wall_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_WAXED = ITEMS.register("wrought_iron_block_plated_wall_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_plated_wall_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_plated_wall_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED_WAXED = ITEMS.register("wrought_iron_block_plated_wall_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT = ITEMS.register("wrought_iron_block_cut", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_EXPOSED = ITEMS.register("wrought_iron_block_cut_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WEATHERED = ITEMS.register("wrought_iron_block_cut_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_RUSTED = ITEMS.register("wrought_iron_block_cut_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WAXED = ITEMS.register("wrought_iron_block_cut_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_cut_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_cut_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED = ITEMS.register("wrought_iron_block_cut_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS = ITEMS.register("wrought_iron_block_cut_stairs", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED = ITEMS.register("wrought_iron_block_cut_stairs_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED = ITEMS.register("wrought_iron_block_cut_stairs_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED = ITEMS.register("wrought_iron_block_cut_stairs_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_WAXED = ITEMS.register("wrought_iron_block_cut_stairs_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_cut_stairs_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_cut_stairs_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED_WAXED = ITEMS.register("wrought_iron_block_cut_stairs_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB = ITEMS.register("wrought_iron_block_cut_slab", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED = ITEMS.register("wrought_iron_block_cut_slab_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED = ITEMS.register("wrought_iron_block_cut_slab_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED = ITEMS.register("wrought_iron_block_cut_slab_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_WAXED = ITEMS.register("wrought_iron_block_cut_slab_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_cut_slab_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_cut_slab_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED_WAXED = ITEMS.register("wrought_iron_block_cut_slab_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL = ITEMS.register("wrought_iron_block_cut_wall", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED = ITEMS.register("wrought_iron_block_cut_wall_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED = ITEMS.register("wrought_iron_block_cut_wall_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED = ITEMS.register("wrought_iron_block_cut_wall_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_WAXED = ITEMS.register("wrought_iron_block_cut_wall_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_cut_wall_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_cut_wall_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED_WAXED = ITEMS.register("wrought_iron_block_cut_wall_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM = ITEMS.register("wrought_iron_block_cut_beam", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED = ITEMS.register("wrought_iron_block_cut_beam_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED = ITEMS.register("wrought_iron_block_cut_beam_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED = ITEMS.register("wrought_iron_block_cut_beam_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_WAXED = ITEMS.register("wrought_iron_block_cut_beam_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_cut_beam_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_cut_beam_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED_WAXED = ITEMS.register("wrought_iron_block_cut_beam_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));
    //endregion


    //region REFINED WROUGHT IRON
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK = ITEMS.register("refined_wrought_iron_block", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_EXPOSED = ITEMS.register("refined_wrought_iron_block_exposed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WEATHERED = ITEMS.register("refined_wrought_iron_block_weathered", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_RUSTED = ITEMS.register("refined_wrought_iron_block_rusted", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WAXED = ITEMS.register("refined_wrought_iron_block_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_exposed_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_weathered_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_rusted_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS = ITEMS.register("refined_wrought_iron_block_stairs", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_EXPOSED = ITEMS.register("refined_wrought_iron_block_stairs_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WEATHERED = ITEMS.register("refined_wrought_iron_block_stairs_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_RUSTED = ITEMS.register("refined_wrought_iron_block_stairs_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WAXED = ITEMS.register("refined_wrought_iron_block_stairs_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_stairs_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_stairs_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_stairs_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_STAIRS_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB = ITEMS.register("refined_wrought_iron_block_slab", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_EXPOSED = ITEMS.register("refined_wrought_iron_block_slab_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_WEATHERED = ITEMS.register("refined_wrought_iron_block_slab_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_RUSTED = ITEMS.register("refined_wrought_iron_block_slab_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_WAXED = ITEMS.register("refined_wrought_iron_block_slab_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_slab_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_slab_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_slab_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL = ITEMS.register("refined_wrought_iron_block_wall", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_EXPOSED = ITEMS.register("refined_wrought_iron_block_wall_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_WEATHERED = ITEMS.register("refined_wrought_iron_block_wall_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_RUSTED = ITEMS.register("refined_wrought_iron_block_wall_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_WAXED = ITEMS.register("refined_wrought_iron_block_wall_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_wall_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_wall_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_wall_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS = ITEMS.register("refined_wrought_iron_block_bars", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_EXPOSED = ITEMS.register("refined_wrought_iron_block_bars_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_WEATHERED = ITEMS.register("refined_wrought_iron_block_bars_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_RUSTED = ITEMS.register("refined_wrought_iron_block_bars_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_WAXED = ITEMS.register("refined_wrought_iron_block_bars_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_bars_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_bars_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BARS_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_bars_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS = ITEMS.register("refined_wrought_iron_block_beams", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_EXPOSED = ITEMS.register("refined_wrought_iron_block_beams_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WEATHERED = ITEMS.register("refined_wrought_iron_block_beams_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_RUSTED = ITEMS.register("refined_wrought_iron_block_beams_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WAXED = ITEMS.register("refined_wrought_iron_block_beams_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_beams_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_beams_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_BEAMS_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_beams_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED = ITEMS.register("refined_wrought_iron_block_chiselled", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED = ITEMS.register("refined_wrought_iron_block_chiselled_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED = ITEMS.register("refined_wrought_iron_block_chiselled_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_RUSTED = ITEMS.register("refined_wrought_iron_block_chiselled_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_WAXED = ITEMS.register("refined_wrought_iron_block_chiselled_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_chiselled_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_chiselled_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CHISELLED_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_chiselled_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR = ITEMS.register("refined_wrought_iron_block_pillar", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_EXPOSED = ITEMS.register("refined_wrought_iron_block_pillar_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WEATHERED = ITEMS.register("refined_wrought_iron_block_pillar_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_RUSTED = ITEMS.register("refined_wrought_iron_block_pillar_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WAXED = ITEMS.register("refined_wrought_iron_block_pillar_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_pillar_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_pillar_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PILLAR_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_pillar_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED = ITEMS.register("refined_wrought_iron_block_plated", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED = ITEMS.register("refined_wrought_iron_block_plated_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED = ITEMS.register("refined_wrought_iron_block_plated_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED = ITEMS.register("refined_wrought_iron_block_plated_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS = ITEMS.register("refined_wrought_iron_block_plated_stairs", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED = ITEMS.register("refined_wrought_iron_block_plated_stairs_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED = ITEMS.register("refined_wrought_iron_block_plated_stairs_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED = ITEMS.register("refined_wrought_iron_block_plated_stairs_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WAXED = ITEMS.register("refined_wrought_iron_block_plated_stairs_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_stairs_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_stairs_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_STAIRS_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_stairs_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB = ITEMS.register("refined_wrought_iron_block_plated_slab", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED = ITEMS.register("refined_wrought_iron_block_plated_slab_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED = ITEMS.register("refined_wrought_iron_block_plated_slab_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED = ITEMS.register("refined_wrought_iron_block_plated_slab_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WAXED = ITEMS.register("refined_wrought_iron_block_plated_slab_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_slab_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_slab_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_SLAB_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_slab_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_SLAB_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL = ITEMS.register("refined_wrought_iron_block_plated_wall", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED = ITEMS.register("refined_wrought_iron_block_plated_wall_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED = ITEMS.register("refined_wrought_iron_block_plated_wall_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED = ITEMS.register("refined_wrought_iron_block_plated_wall_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WAXED = ITEMS.register("refined_wrought_iron_block_plated_wall_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_wall_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_wall_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_PLATED_WALL_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_plated_wall_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WALL_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT = ITEMS.register("refined_wrought_iron_block_cut", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED = ITEMS.register("refined_wrought_iron_block_cut_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED = ITEMS.register("refined_wrought_iron_block_cut_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED = ITEMS.register("refined_wrought_iron_block_cut_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WAXED = ITEMS.register("refined_wrought_iron_block_cut_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS = ITEMS.register("refined_wrought_iron_block_cut_stairs", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED = ITEMS.register("refined_wrought_iron_block_cut_stairs_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED = ITEMS.register("refined_wrought_iron_block_cut_stairs_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED = ITEMS.register("refined_wrought_iron_block_cut_stairs_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WAXED = ITEMS.register("refined_wrought_iron_block_cut_stairs_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_stairs_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_stairs_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_STAIRS_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_stairs_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB = ITEMS.register("refined_wrought_iron_block_cut_slab", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED = ITEMS.register("refined_wrought_iron_block_cut_slab_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED = ITEMS.register("refined_wrought_iron_block_cut_slab_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED = ITEMS.register("refined_wrought_iron_block_cut_slab_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WAXED = ITEMS.register("refined_wrought_iron_block_cut_slab_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_slab_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_slab_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_SLAB_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_slab_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL = ITEMS.register("refined_wrought_iron_block_cut_wall", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED = ITEMS.register("refined_wrought_iron_block_cut_wall_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED = ITEMS.register("refined_wrought_iron_block_cut_wall_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED = ITEMS.register("refined_wrought_iron_block_cut_wall_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WAXED = ITEMS.register("refined_wrought_iron_block_cut_wall_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_wall_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_wall_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_WALL_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_wall_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM = ITEMS.register("refined_wrought_iron_block_cut_beam", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED = ITEMS.register("refined_wrought_iron_block_cut_beam_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED = ITEMS.register("refined_wrought_iron_block_cut_beam_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED = ITEMS.register("refined_wrought_iron_block_cut_beam_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WAXED = ITEMS.register("refined_wrought_iron_block_cut_beam_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_beam_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_beam_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_CUT_BEAM_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_cut_beam_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_CUT_RUSTED_WAXED.get(), new Item.Properties()));
    //endregion

    //public static final RegistryObject<Item> PAINTED_WROUGHT_IRON_BLOCK = ITEMS.register("painted_wrought_iron_block", () -> new ModBlockItem(ModBlocks.PAINTED_WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    //public static final RegistryObject<Item> PAINTED_WROUGHT_IRON_BLOCK_TRIMMED = ITEMS.register("painted_wrought_iron_block_trimmed", () -> new ModBlockItem(ModBlocks.PAINTED_WROUGHT_IRON_BLOCK_TRIMMED.get(), new Item.Properties()));

    //public static final RegistryObject<Item> BOOMERANG = ITEMS.register("boomerang",
    //        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> RAW_WROUGHT_IRON_CHUNK = ITEMS.register("raw_wrought_iron_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));
    public static final RegistryObject<Item> WROUGHT_IRON_INGOT = ITEMS.register("wrought_iron_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> WROUGHT_IRON_NUGGET = ITEMS.register("wrought_iron_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> WROUGHT_IRON_HORSESHOE = ITEMS.register("wrought_iron_horseshoe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_INGOT = ITEMS.register("refined_wrought_iron_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_NUGGET = ITEMS.register("refined_wrought_iron_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_NAILS = ITEMS.register("refined_wrought_iron_nails",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_NUTS = ITEMS.register("refined_wrought_iron_nuts",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BOLTS = ITEMS.register("refined_wrought_iron_bolts",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_GEARS = ITEMS.register("refined_wrought_iron_gears",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_RODS = ITEMS.register("refined_wrought_iron_rods",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_PLATES = ITEMS.register("refined_wrought_iron_plates",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_RIVETS = ITEMS.register("refined_wrought_iron_rivets",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_CHAIN = ITEMS.register("refined_wrought_iron_chain",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_WIRE = ITEMS.register("refined_wrought_iron_wire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));


    public static final RegistryObject<Item> SAND_PAPER = ITEMS.register("sand_paper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public ModItems(Block block, Item.Properties properties) {

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
