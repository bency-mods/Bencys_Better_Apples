package net.bency.betterapple;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BencysBetterApples implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("betterapple");

	@Override
	public void onInitialize() {
		BetterApple.BetterAppleInitialize();
		LOGGER.info("Apples Initialized");
	}
}