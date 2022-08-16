package com.github.teamfusion.example;

import com.github.teamfusion.example.client.ExampleClient;
import dev.architectury.utils.EnvExecutor;
import net.fabricmc.api.EnvType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Example {
    String MOD_ID = "example";
    String MOD_NAME = "Example";
    Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    static void commonInitialize() {
        LOGGER.info("Initializing {}", MOD_NAME);
        EnvExecutor.runInEnv(EnvType.CLIENT, () -> ExampleClient::commonClientInitialize);
    }
}
