package net.downlaods.grandworld.item;

import net.downlaods.grandworld.TheGrandWorld;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IMPERITE_DUST = registerItem("imperite_dust", new Item(new Item.Settings()));
    public static final Item IMPERITE_INGOT = registerItem("imperite_ingot", new Item(new Item.Settings()));

    public static final Item IMPERITE_SWORD = registerItem("imperite_sword", new SwordItem(ModToolMaterials.IMPERITE, new Item.Settings()
            .fireproof()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IMPERITE, 3, -2.4f))));

    public static final Item IMPERITE_PICKAXE = registerItem("imperite_pickaxe", new PickaxeItem(ModToolMaterials.IMPERITE, new Item.Settings()
            .fireproof()
            .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IMPERITE, 1, -2.8f))));

    public static final Item IMPERITE_SHOVEL = registerItem("imperite_shovel", new ShovelItem(ModToolMaterials.IMPERITE, new Item.Settings()
            .fireproof()
            .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IMPERITE, 1.5f, -3.0f))));

    public static final Item IMPERITE_AXE = registerItem("imperite_axe", new AxeItem(ModToolMaterials.IMPERITE, new Item.Settings()
            .fireproof()
            .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IMPERITE, 6, -3.2f))));

    public static final Item IMPERITE_HOE = registerItem("imperite_hoe", new HoeItem(ModToolMaterials.IMPERITE, new Item.Settings()
            .fireproof()
            .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IMPERITE, -5.0f, -3f))));


//    Items Above, Registry code below

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheGrandWorld.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheGrandWorld.LOGGER.info("Registering Mod Item For " + TheGrandWorld.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(IMPERITE_DUST);
            entries.add(IMPERITE_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(IMPERITE_PICKAXE);
            entries.add(IMPERITE_SHOVEL);
            entries.add(IMPERITE_AXE);
            entries.add(IMPERITE_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(IMPERITE_SWORD);
            entries.add(IMPERITE_AXE);
        });
    }
}
