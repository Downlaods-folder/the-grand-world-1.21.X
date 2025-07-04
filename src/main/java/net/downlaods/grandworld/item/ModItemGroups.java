package net.downlaods.grandworld.item;

import net.downlaods.grandworld.TheGrandWorld;
import net.downlaods.grandworld.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup IMPERIAL_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheGrandWorld.MOD_ID, "imperial_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IMPERITE_INGOT))
                    .displayName(Text.translatable("itemGroup.grandworld.imperial_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.IMPERITE_DUST);
                        entries.add(ModItems.IMPERITE_INGOT);
                        entries.add(ModItems.IMPERITE_SWORD);
                        entries.add(ModItems.IMPERITE_PICKAXE);
                        entries.add(ModItems.IMPERITE_SHOVEL);
                        entries.add(ModItems.IMPERITE_AXE);
                        entries.add(ModItems.IMPERITE_HOE);

                        entries.add(ModItems.IMPERITE_HAMMER);

                        entries.add(ModItems.IMPERITE_HELMET);
                        entries.add(ModItems.IMPERITE_CHESTPLATE);
                        entries.add(ModItems.IMPERITE_LEGGINGS);
                        entries.add(ModItems.IMPERITE_BOOTS);

                        entries.add(ModItems.IMPERITE_HORSE_ARMOR);

                        entries.add(ModItems.EMPEROR_SMITHING_TEMPLATE);
                    }).build());

    public static final ItemGroup IMPERIAL_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TheGrandWorld.MOD_ID, "imperial_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.IMPERITE_BLOCK))
                    .displayName(Text.translatable("itemGroup.grandworld.imperial_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.IMPERITE_DUST_BLOCK);
                        entries.add(ModBlocks.IMPERITE_BLOCK);
                        entries.add(ModBlocks.IMPERITE_ORE);
                        entries.add(ModBlocks.IMPERITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.COMPACTOR_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TheGrandWorld.LOGGER.info("Registering Item Groups for " + TheGrandWorld.MOD_ID);
    }
}
