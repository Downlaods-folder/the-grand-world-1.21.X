package net.downlaods.grandworld.item;

import net.downlaods.grandworld.TheGrandWorld;
import net.downlaods.grandworld.item.custom.HammerItem;
import net.downlaods.grandworld.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IMPERITE_DUST = registerItem("imperite_dust", new Item(new Item.Settings()));
    public static final Item IMPERITE_INGOT = registerItem("imperite_ingot", new Item(new Item.Settings()));

//    Tools
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

    public static final Item IMPERITE_HAMMER = registerItem("imperite_hammer",
            new HammerItem(ModToolMaterials.IMPERITE, new Item.Settings()
                    .fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IMPERITE, 7, -3.4f))));

//    Armor
    public static final Item IMPERITE_HELMET = registerItem("imperite_helmet",
        new ModArmorItem(ModArmorMaterials.IMPERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .fireproof()
                .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));

    public static final Item IMPERITE_CHESTPLATE = registerItem("imperite_chestplate",
            new ArmorItem(ModArmorMaterials.IMPERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40))));

    public static final Item IMPERITE_LEGGINGS = registerItem("imperite_leggings",
            new ArmorItem(ModArmorMaterials.IMPERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40))));

    public static final Item IMPERITE_BOOTS = registerItem("imperite_boots",
            new ArmorItem(ModArmorMaterials.IMPERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));

    public static final Item IMPERITE_HORSE_ARMOR = registerItem("imperite_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.IMPERITE_ARMOR_MATERIAL, AnimalArmorItem.Type.EQUESTRIAN, false, new Item.Settings().maxCount(1)));

    public static final Item EMPEROR_SMITHING_TEMPLATE = registerItem("emperor_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(TheGrandWorld.MOD_ID, "emperor"), FeatureFlags.VANILLA));

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
