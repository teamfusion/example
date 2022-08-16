package com.github.teamfusion.example.forge;

import com.github.teamfusion.example.Example;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Example.MOD_ID)
public final class ExampleForge implements Example {
    public ExampleForge() {
        EventBuses.registerModEventBus(MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Example.commonInitialize();
    }
}
