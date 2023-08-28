package net.grey3345.gkIronmod.data.client;

import net.grey3345.gkIronmod.GkIronMod;
import net.grey3345.gkIronmod.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

import static net.grey3345.gkIronmod.data.DataGenerationEvent.hasTexture;

public class ModelProviderItem extends ItemModelProvider {

    public ModelProviderItem(DataGenerator output, ExistingFileHelper existingFileHelper) {
        super(output, GkIronMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Item> entry : ModItems.ITEMS.getEntries()) {
            if (!hasTexture(this.existingFileHelper,entry.get())) continue;

            if (entry.get() instanceof BlockItem item) {
                blockItem(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(entry.get())));
                continue;
            }

            basicItem(entry.getId());
        }
    }


    public ItemModelBuilder blockItem(ResourceLocation item) {
        return getBuilder(item.toString())
                .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(item.getNamespace(), "block/" + item.getPath())));
    }
}
