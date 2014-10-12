package com.fibonacci.MiscCraft.common;

import com.fibonacci.MiscCraft.block.tileentity.*;
import com.fibonacci.MiscCraft.block.tileentity.render.*;
import com.fibonacci.MiscCraft.mob.*;
import com.fibonacci.MiscCraft.mob.entity.*;
import com.fibonacci.MiscCraft.mob.render.*;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	
	
	public void RenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderMoaner.class, new RenderEnderMoaner(new EnderMoaner(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoss.class, new RenderBoss(new Boss(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityCosmicBunny.class, new RenderCosmicBunny(new CosmicBunny(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBullBoss.class, new RenderBullBoss(new BullBoss(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityTamableBull.class, new RenderTamableBull(new TamableBull(), 0.3f));
        RenderingRegistry.registerEntityRenderingHandler(Entitydeadmau5.class, new Renderdeadmau5(new deadmau5(), 0.3f));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new TileEntityRenderWindmill());
		        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySolarPanel.class, new TileEntityRenderSolarPanel());
        ClientRegistry.registerTileEntity(TileEntitySolarPanel.class, "TileEntitySolarPanel", new TileEntityRenderSolarPanel());
        ClientRegistry.registerTileEntity(TileEntityWire.class, "TileEntityWire", new TileEntityRenderWire());
        ClientRegistry.registerTileEntity(TileEntityDiamondRadar.class, "TileEntityRandomBlock", new TileEntityRenderDiamondRadar());
        ClientRegistry.registerTileEntity(TileEntityWindmillFloor.class, "TileEntityWindmillFloor", new TileEntityRenderWindmillFloor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBeerStill.class, new TileEntityRenderBeerStill());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiamondRadar.class, new TileEntityRenderDiamondRadar());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWire.class, new TileEntityRenderWire());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
        ClientRegistry.registerTileEntity(TileEntityLights.class, "TileEntityLights", new TileEntityRenderLights());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLights.class, new TileEntityRenderLights());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBullSummonBlock.class, new TileEntityRenderBullSummonBlock());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigBoomPrimed.class, new RenderBigBoom(new BigBoom(), 0.3f));
        ClientRegistry.registerTileEntity(TileEntityHydrant.class, "TileEnityHydrant", new TileEntityRenderHydrant());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHydrant.class, new TileEntityRenderHydrant());
        ClientRegistry.registerTileEntity(TileEntityCraftingChest.class, "TileEntityCraftingChest", new TileEntityRenderCraftingChest());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCraftingChest.class, new TileEntityRenderCraftingChest());
        
    }

	

}
