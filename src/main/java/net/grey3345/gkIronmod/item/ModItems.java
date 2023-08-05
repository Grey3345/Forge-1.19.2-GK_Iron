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
