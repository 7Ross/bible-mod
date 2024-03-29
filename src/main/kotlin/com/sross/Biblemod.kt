package com.sross

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Biblemod : ModInitializer {
    private val logger = LoggerFactory.getLogger("bible-mod")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Hello Fabric world!")
	}
}