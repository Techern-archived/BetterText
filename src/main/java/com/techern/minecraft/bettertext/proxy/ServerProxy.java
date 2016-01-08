package com.techern.minecraft.bettertext.proxy;

/**
 * An implementation of {@link CommonProxy} for the server
 *
 * @since 0.0.1
 */
public class ServerProxy extends CommonProxy {

    /**
     * Replaces the font renderer when in client mode
     *
     * @since 0.0.1
     */
    @Override
    public void replaceFontRenderer() {
        //Do nothing, we're a server
    }
}
