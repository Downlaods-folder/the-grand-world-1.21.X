package net.downlaods.grandworld.block;

import net.downlaods.grandworld.TheGrandWorld;
import net.downlaods.grandworld.block.custom.CompactorBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block IMPERITE_DUST_BLOCK = registerBlock("imperite_dust_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(1.5f,1f)
                    .sounds(BlockSoundGroup.CHAIN)));

    public static final Block IMPERITE_BLOCK = registerBlock("imperite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(12f,5f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHAIN)));

    public static final Block IMPERITE_ORE = registerBlock("imperite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 8),
                    AbstractBlock.Settings.create()
                            .strength(4f,3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SOUL_SAND)));

    public static final Block IMPERITE_DEEPSLATE_ORE = registerBlock("imperite_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 8),
                    AbstractBlock.Settings.create()
                            .strength(4.5f,3f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SOUL_SAND)));

    public static final Block COMPACTOR_BLOCK = registerBlock("compactor_block",
            new CompactorBlock(AbstractBlock.Settings.create()
                    .strength(4f, 10f)
                    .sounds(BlockSoundGroup.ANVIL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TheGrandWorld.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TheGrandWorld.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlock() {
        TheGrandWorld.LOGGER.info("Registering Mod Blocks for " + TheGrandWorld.MOD_ID);


    }
}
