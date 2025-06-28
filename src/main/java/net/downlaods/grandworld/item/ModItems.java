package net.downlaods.grandworld.item;

import net.downlaods.grandworld.TheGrandWorld;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item IMPERITE_DUST = registerItem("imperite_dust", new Item(new Item.Settings()));
    public static final Item IMPERITE_INGOT = registerItem("imperite_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TheGrandWorld.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheGrandWorld.LOGGER.info("Registering Mod Item For " + TheGrandWorld.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(IMPERITE_DUST);
            entries.add(IMPERITE_INGOT);
        });
    }
}
