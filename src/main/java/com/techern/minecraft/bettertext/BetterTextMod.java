package com.techern.minecraft.bettertext;

import com.techern.minecraft.bettertext.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
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

    @SidedProxy(clientSide = "com.techern.minecraft.bettertext.proxy.ClientProxy",
                serverSide = "com.techern.minecraft.bettertext.proxy.ServerProxy")
    public static CommonProxy PROXY;

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

    /**
     * Handles the {@link FMLPostInitializationEvent}
     *
     * @param event The {@link FMLPostInitializationEvent}
     * @since 0.0.1
     */
    @Mod.EventHandler
    public void handlePostInit(FMLPostInitializationEvent event) {
        LOGGER.info("Post init");
        PROXY.replaceFontRenderer();
    }

}
