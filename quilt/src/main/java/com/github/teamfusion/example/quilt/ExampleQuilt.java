package com.github.teamfusion.example.quilt;

import com.github.teamfusion.example.Example;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public final class ExampleQuilt implements Example, ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        Example.commonInitialize();
    }
}
