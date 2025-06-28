package net.downlaods.grandworld.block;

import net.downlaods.grandworld.TheGrandWorld;
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
                    .strength(1f)
                    .sounds(BlockSoundGroup.CHAIN)));

    public static final Block IMPERITE_BLOCK = registerBlock("imperite_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.CHAIN)));

    public static final Block IMPERITE_DUST_ORE = registerBlock("imperite_dust_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(5, 8),
                    AbstractBlock.Settings.create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(BlockSoundGroup.SOUL_SAND)));

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
