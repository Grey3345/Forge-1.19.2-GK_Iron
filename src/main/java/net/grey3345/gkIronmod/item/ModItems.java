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

    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK = ITEMS.register("raw_wrought_iron_block", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_EXPOSED = ITEMS.register("raw_wrought_iron_block_exposed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_WEATHERED = ITEMS.register("raw_wrought_iron_block_weathered", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_RUSTED = ITEMS.register("raw_wrought_iron_block_rusted", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_WAXED = ITEMS.register("raw_wrought_iron_block_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = ITEMS.register("raw_wrought_iron_block_exposed_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = ITEMS.register("raw_wrought_iron_block_weathered_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAW_WROUGHT_IRON_BLOCK_RUSTED_WAXED = ITEMS.register("raw_wrought_iron_block_rusted_waxed", () -> new ModBlockItem(ModBlocks.RAW_WROUGHT_IRON_BLOCK_RUSTED_WAXED.get(), new Item.Properties()));


    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK = ITEMS.register("wrought_iron_block", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_EXPOSED = ITEMS.register("wrought_iron_block_exposed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WEATHERED = ITEMS.register("wrought_iron_block_weathered", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_RUSTED = ITEMS.register("wrought_iron_block_rusted", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WAXED = ITEMS.register("wrought_iron_block_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_EXPOSED_WAXED = ITEMS.register("wrought_iron_block_exposed_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_WEATHERED_WAXED = ITEMS.register("wrought_iron_block_weathered_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> WROUGHT_IRON_BLOCK_RUSTED_WAXED = ITEMS.register("wrought_iron_block_rusted_waxed", () -> new ModBlockItem(ModBlocks.WROUGHT_IRON_BLOCK_RUSTED_WAXED.get(), new Item.Properties()));


    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK = ITEMS.register("refined_wrought_iron_block", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_EXPOSED = ITEMS.register("refined_wrought_iron_block_exposed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_EXPOSED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WEATHERED = ITEMS.register("refined_wrought_iron_block_weathered", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_WEATHERED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_RUSTED = ITEMS.register("refined_wrought_iron_block_rusted", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_RUSTED.get(), new Item.Properties()));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WAXED = ITEMS.register("refined_wrought_iron_block_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED = ITEMS.register("refined_wrought_iron_block_exposed_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_EXPOSED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED = ITEMS.register("refined_wrought_iron_block_weathered_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_WEATHERED_WAXED.get(), new Item.Properties()));
    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED = ITEMS.register("refined_wrought_iron_block_rusted_waxed", () -> new ModBlockItem(ModBlocks.REFINED_WROUGHT_IRON_BLOCK_RUSTED_WAXED.get(), new Item.Properties()));

    //public static final RegistryObject<Item> PAINTED_WROUGHT_IRON_BLOCK = ITEMS.register("painted_wrought_iron_block", () -> new ModBlockItem(ModBlocks.PAINTED_WROUGHT_IRON_BLOCK.get(), new Item.Properties()));
    //public static final RegistryObject<Item> PAINTED_WROUGHT_IRON_BLOCK_TRIMMED = ITEMS.register("painted_wrought_iron_block_trimmed", () -> new ModBlockItem(ModBlocks.PAINTED_WROUGHT_IRON_BLOCK_TRIMMED.get(), new Item.Properties()));


    public static final RegistryObject<Item> WROUGHT_IRON_INGOT = ITEMS.register("wrought_iron_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> WROUGHT_IRON_NUGGET = ITEMS.register("wrought_iron_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_INGOT = ITEMS.register("refined_wrought_iron_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> REFINED_WROUGHT_IRON_NUGGET = ITEMS.register("refined_wrought_iron_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public static final RegistryObject<Item> RAW_WROUGHT_IRON_CHUNK = ITEMS.register("raw_wrought_iron_chunk",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    //public static final RegistryObject<Item> RAW_WROUGHT_IRON_NUGGET = ITEMS.register("raw_wrought_iron_nugget",
    //        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));



    public static final RegistryObject<Item> SAND_PAPER = ITEMS.register("sand_paper",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GKIRON_TAB)));

    public ModItems(Block block, Item.Properties properties) {

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
