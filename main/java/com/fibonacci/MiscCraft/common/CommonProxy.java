package com.fibonacci.MiscCraft.common;

import com.fibonacci.MiscCraft.common.events.KeyInputHandler;
import cpw.mods.fml.common.FMLCommonHandler;

public class CommonProxy {
	
	public void RenderInformation() {
		
	}

	public void registerRenderers() {
		
	}
    public void initTickHandlers()
    {
        KeyInputHandler tickHandlerServer = new KeyInputHandler();
        FMLCommonHandler.instance().bus().register(tickHandlerServer);
    }

}
