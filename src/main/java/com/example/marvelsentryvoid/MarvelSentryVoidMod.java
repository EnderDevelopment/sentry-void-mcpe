package com.example.marvelsentryvoid;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarvelSentryVoidMod implements ModInitializer {
    public static final String MOD_ID = "marvel_sentry_void";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Marvel Sentry + Void Mod");
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}