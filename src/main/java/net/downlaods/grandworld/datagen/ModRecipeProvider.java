package net.downlaods.grandworld.datagen;

import net.downlaods.grandworld.block.ModBlocks;
import net.downlaods.grandworld.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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
        List<ItemConvertible> IMPERITE_SMELTABLES = List.of(ModBlocks.IMPERITE_DUST_BLOCK);

        offerSmelting(exporter, IMPERITE_SMELTABLES, RecipeCategory.MISC, ModItems.IMPERITE_INGOT, 0.25f, 200, "imperial");
        offerBlasting(exporter, IMPERITE_SMELTABLES, RecipeCategory.MISC, ModItems.IMPERITE_INGOT, 0.25f, 100, "imperial");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IMPERITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.IMPERITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.IMPERITE_DUST, RecipeCategory.DECORATIONS, ModBlocks.IMPERITE_DUST_BLOCK);

//        Imperite Tools
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.IMPERITE_SWORD)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', ModItems.IMPERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IMPERITE_INGOT), conditionsFromItem(ModItems.IMPERITE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IMPERITE_PICKAXE)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IMPERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IMPERITE_INGOT), conditionsFromItem(ModItems.IMPERITE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IMPERITE_SHOVEL)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IMPERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IMPERITE_INGOT), conditionsFromItem(ModItems.IMPERITE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IMPERITE_AXE)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I', ModItems.IMPERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IMPERITE_INGOT), conditionsFromItem(ModItems.IMPERITE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IMPERITE_HOE)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModItems.IMPERITE_INGOT)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.IMPERITE_INGOT), conditionsFromItem(ModItems.IMPERITE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.IMPERITE_HAMMER)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', ModBlocks.IMPERITE_BLOCK)
                .input('S', ModItems.IMPERITE_INGOT)
                .criterion(hasItem(ModItems.IMPERITE_INGOT), conditionsFromItem(ModItems.IMPERITE_INGOT))
                .offerTo(exporter);


    }
}
