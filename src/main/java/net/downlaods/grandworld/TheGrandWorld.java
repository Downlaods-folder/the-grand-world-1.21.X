package net.downlaods.grandworld;

import net.downlaods.grandworld.block.ModBlocks;
import net.downlaods.grandworld.item.ModItemGroups;
import net.downlaods.grandworld.item.ModItems;
import net.fabricmc.api.ModInitializer;

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




		LOGGER.info("Hello Fabric world!");
	}
}