package com.fibonacci.MiscCraft.common.events;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

/**
 * Created by Fibonacci on 6/3/14.
 */
public class OnSmeltEvent {
    @SubscribeEvent
    public void whensmelted(PlayerEvent.ItemSmeltedEvent e) {
        if(e.smelting.getItem().equals(MiscCraft.AntiMetalIngot)){
            e.player.triggerAchievement(MiscCraft.AntiMetalIngotAchievement);

        }

    }
}
