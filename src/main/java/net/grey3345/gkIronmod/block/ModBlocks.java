package net.grey3345.gkIronmod.block;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.block.custom.RustableBlock;
import net.grey3345.gkIronmod.item.ModCreativeModeTab;
import net.grey3345.gkIronmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;



public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, GkIronMod.MOD_ID);

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

/**
    public static final RegistryObject<Block> ZIRCON_LAMP = registerBlock("zircon_lamp",
            () -> new ZirconLampBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops()
                    .lightLevel(state -> state.getValue(ZirconLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.GKIRON_TAB);
**/

    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK = registerBlock("painted_wrought_iron_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_TRIMMED = registerBlock("painted_wrought_iron_block_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
      /**

    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK = registerBlock("painted_wrought_iron_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);

    public static final RegistryObject<Block> PAINTED_WROUGHT_IRON_BLOCK_TRIMMED = registerBlock("painted_wrought_iron_block_trimmed",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.GKIRON_TAB);
    **/






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
