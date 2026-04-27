package com.sophiecheese.bettertables;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = BetterTables.MOD_ID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = BetterTables.MOD_ID, value = Dist.CLIENT)
public class BetterTablesClient {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        BetterTables.LOGGER.info("I'm inside your walls {}.", Minecraft.getInstance().getUser().getName());
    }
}
