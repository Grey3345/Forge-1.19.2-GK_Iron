package net.grey3345.gkIronmod;

import com.mojang.logging.LogUtils;
import net.grey3345.gkIronmod.block.ModBlocks;
import net.grey3345.gkIronmod.data.BlockStateGenerator;
import net.grey3345.gkIronmod.data.SoundDataGeneration;
import net.grey3345.gkIronmod.data.client.LangGenEnglish;
import net.grey3345.gkIronmod.data.client.ModelProviderItem;
import net.grey3345.gkIronmod.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(GkIronMod.MOD_ID)
public class GkIronMod {
    public static final String MOD_ID = "gkironmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    /**
    public static final CreativeModeTab GKIRON_TAB = new CreativeModeTab("gkiron.item_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.COPPER_INGOT);
        }
    };**/

    // Very Important Comment
    public GkIronMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            //ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUEBERRY_CROP.get(), RenderType.cutout());
        }
    }
}
