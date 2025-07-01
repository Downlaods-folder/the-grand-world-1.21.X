package net.downlaods.grandworld.effect;

import net.downlaods.grandworld.TheGrandWorld;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {

    public static final RegistryEntry<StatusEffect> ENERGISED = registerStatusEffect("energised",
            new EnergisedEffect(StatusEffectCategory.NEUTRAL, 0x00d6ae)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of(TheGrandWorld.MOD_ID, "energised"), 0.1f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(TheGrandWorld.MOD_ID, "energised"), 0.25f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(TheGrandWorld.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        TheGrandWorld.LOGGER.info("Registering Mod Effects for" + TheGrandWorld.MOD_ID);
    }
}
