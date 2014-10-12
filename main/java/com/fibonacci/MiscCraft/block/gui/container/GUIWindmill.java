package com.fibonacci.MiscCraft.block.gui.container;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GUIWindmill extends GuiContainer{
public final ResourceLocation texture = new ResourceLocation("misccraft", "textures/blocks/tileentity/gui/windmillgui.png");
private TileEntityWindmill	windmill;


	public GUIWindmill(InventoryPlayer p, TileEntityWindmill windmill) {
		super(new ContainerWindmill(p, windmill));
		
		this.windmill = windmill;
		this.xSize = 176;
		this.ySize = 166;
		
		
	}
	
	
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,int var3) {
		 Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		 drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		 
		 
		 int i = this.windmill.getPowerScaled(45);
		 drawTexturedModalRect(guiLeft+74, guiTop+15+45-i, 176, 45-i, 23, i);
	}

}
