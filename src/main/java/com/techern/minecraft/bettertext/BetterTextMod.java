package com.techern.minecraft.bettertext;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A {@link net.minecraftforge.fml.common.Mod} to replace Minecraft's font rendering and, eventually, entire chat system
 *
 * @since 0.0.1
 */
@Mod(modid = "BetterText", version = BetterTextMod.VERSION)
public class BetterTextMod {

    /**
     * The current version of {@link BetterTextMod}
     *
     * @since 0.0.1
     */
    public static final String VERSION = "0.0.1-SNAPSHOT";

    /**
     * The {@link Logger} for {@link BetterTextMod}
     *
     * Is replaced in {@link BetterTextMod#handlePreInit(FMLPreInitializationEvent)}
     *
     * @since 0.0.1
     */
    public static Logger LOGGER = LogManager.getLogger(BetterTextMod.class);

    /**
     * Handles the {@link FMLPreInitializationEvent}
     *
     * @param event The {@link FMLPreInitializationEvent}
     * @since 0.0.1
     */
    @Mod.EventHandler
    public void handlePreInit(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog(); //Replace the logger
        LOGGER.info("Set correct logger for Better Text");
    }

}
