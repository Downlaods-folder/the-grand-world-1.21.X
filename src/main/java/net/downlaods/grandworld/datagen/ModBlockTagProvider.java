package net.downlaods.grandworld.datagen;

import net.downlaods.grandworld.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.IMPERITE_DUST_BLOCK)
                .add(ModBlocks.IMPERITE_BLOCK)
                .add(ModBlocks.IMPERITE_ORE)
                .add(ModBlocks.IMPERITE_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.IMPERITE_ORE)
                .add(ModBlocks.IMPERITE_DEEPSLATE_ORE)
                .add(ModBlocks.IMPERITE_BLOCK);

    }
}
