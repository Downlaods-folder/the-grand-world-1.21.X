package net.downlaods.grandworld.datagen;

import net.downlaods.grandworld.block.ModBlocks;
import net.downlaods.grandworld.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IMPERITE_DUST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IMPERITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IMPERITE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.IMPERITE_BLOCK);

        blockStateModelGenerator.registerSingleton(ModBlocks.COMPACTOR_BLOCK, TexturedModel.CUBE_BOTTOM_TOP);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.IMPERITE_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.IMPERITE_INGOT, Models.GENERATED);
    }
}
