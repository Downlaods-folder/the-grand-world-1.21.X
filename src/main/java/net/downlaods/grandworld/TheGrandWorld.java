package net.downlaods.grandworld;

import net.downlaods.grandworld.block.ModBlocks;
import net.downlaods.grandworld.item.ModItemGroups;
import net.downlaods.grandworld.item.ModItems;
import net.downlaods.grandworld.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheGrandWorld implements ModInitializer {

	public static final String MOD_ID = "grandworld";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		LOGGER.info("Hello Fabric world!");
	}
}