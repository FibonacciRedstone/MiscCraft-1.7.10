package com.fibonacci.MiscCraft.common.events;

import com.fibonacci.MiscCraft.common.ClientProxy;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by Fibonacci on 11/7/14.
 */
public class KeyInputHandler {
    @SubscribeEvent(priority= EventPriority.NORMAL, receiveCanceled=true)
    public void onEvent(InputEvent.KeyInputEvent event)
    {

        // DEBUG
        System.out.println("Key Input Event");

        // make local copy of key binding array
        KeyBinding[] keyBindings = ClientProxy.keyBindings;

        // check each enumerated key binding type for pressed and take appropriate action
        if (keyBindings[0].isPressed())
        {
            // DEBUG
            System.out.println("Key binding ="+keyBindings[0].getKeyDescription());

            // do stuff for this key binding here
            // remember you may need to send packet to server
        }
        if (keyBindings[1].isPressed())
        {
            // DEBUG
            System.out.println("Key binding ="+keyBindings[1].getKeyDescription());

            // do stuff for this key binding here
            // remember you may need to send packet to server
        }
    }


}
