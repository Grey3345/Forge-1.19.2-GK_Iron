package net.grey3345.gkIronmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GKIRON_TAB = new CreativeModeTab("gkironmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.WROUGHT_IRON_INGOT.get());
      }
    };
    // Duplicate CreativeModTab method to create a new tab.
}
