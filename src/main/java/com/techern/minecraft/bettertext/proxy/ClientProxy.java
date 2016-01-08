package com.techern.minecraft.bettertext.proxy;

import com.techern.minecraft.bettertext.BetterTextMod;
import net.minecraft.client.Minecraft;

/**
 * An implementation of {@link CommonProxy} for the client
 *
 * @since 0.0.1
 */
public class ClientProxy extends CommonProxy {

    /**
     * Replaces the font renderer when in client mode
     *
     * @since 0.0.1
     */
    @Override
    public void replaceFontRenderer() {
        BetterTextMod.LOGGER.info("Supposed to replace font renderer " + Minecraft.getMinecraft().fontRendererObj.hashCode());
    }
}
