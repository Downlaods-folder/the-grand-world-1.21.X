package net.downlaods.grandworld.trim;

import net.downlaods.grandworld.TheGrandWorld;
import net.downlaods.grandworld.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {

    public static final RegistryKey<ArmorTrimMaterial> IMPERITE = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TheGrandWorld.MOD_ID, "imperite"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, IMPERITE, Registries.ITEM.getEntry(ModItems.IMPERITE_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#135C55").getOrThrow()), 0.8f);

    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex) {
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
