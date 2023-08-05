package net.grey3345.gkIronmod.data.client;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.item.ModCreativeModeTab;
import net.grey3345.gkIronmod.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class LangGenEnglish extends LanguageProvider {

    public LangGenEnglish(DataGenerator gen) {
        super(gen, GkIronMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Automated translation based off registry name
        for (RegistryObject<Item> obj : ModItems.ITEMS.getEntries()) {
            Item item = obj.get();

            add(item,itemToName(item));
        }

        add("itemGroup.gkironmodtab","GK Iron");
    }
    public static String itemToName(Item item) {
        String id = item.getDescriptionId(); // item.gkironmod.blah_blah_blah
        String sub = id.substring(id.lastIndexOf(".") + 1); // blah_blah_blah

        String spaced = sub.replace("_", " ");
        String[] words = spaced.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            output.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return output.toString().substring(0,output.toString().length() - 1);
    }
}
