package com.github.teamfusion.example.client;

import com.github.teamfusion.example.Example;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface ExampleClient extends Example {
    static void commonClientInitialize() {
        LOGGER.info("Initializing {}-CLIENT", MOD_NAME);
    }
}
