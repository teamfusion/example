package com.github.teamfusion.example.fabric;

import com.github.teamfusion.example.Example;
import net.fabricmc.api.ModInitializer;

public final class ExampleFabric implements Example, ModInitializer {
    @Override
    public void onInitialize() {
        Example.commonInitialize();
    }
}
