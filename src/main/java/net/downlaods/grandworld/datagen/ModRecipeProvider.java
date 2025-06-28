package net.downlaods.grandworld.datagen;

import net.downlaods.grandworld.block.ModBlocks;
import net.downlaods.grandworld.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> IMPERITE_SMELTABLES =List.of(ModBlocks.IMPERITE_DUST_BLOCK);

        offerSmelting(exporter, IMPERITE_SMELTABLES, RecipeCategory.MISC, ModItems.IMPERITE_INGOT, 0.25f, 200, "imperial");
        offerBlasting(exporter, IMPERITE_SMELTABLES, RecipeCategory.MISC, ModItems.IMPERITE_INGOT, 0.25f, 100, "imperial");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IMPERITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.IMPERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IMPERITE_DUST, RecipeCategory.DECORATIONS, ModBlocks.IMPERITE_DUST_BLOCK);

    }
}
