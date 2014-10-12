package com.fibonacci.MiscCraft.block.gui.container;

import com.fibonacci.MiscCraft.block.tileentity.TileEntitySolarPanel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GUISolarPanel extends GuiContainer{
	TileEntitySolarPanel solarpanel;
	private ResourceLocation texture = new ResourceLocation("misccraft", "textures/blocks/tileentity/gui/solarpanelgui.png");

	public GUISolarPanel(InventoryPlayer p, TileEntitySolarPanel solarpanel) {
		super(new ContainerSolarPanel(p, solarpanel));
		
		this.solarpanel = solarpanel;
		this.xSize = 176;
		this.ySize = 166;
		
	}

	
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,int var3) {
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture );
		 drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		 
		 int i = this.solarpanel.getPowerScaled(45);
		 drawTexturedModalRect(guiLeft+79, guiTop+28+45-i, 176, 45-i, 23, i);
		 

		
	}

}
