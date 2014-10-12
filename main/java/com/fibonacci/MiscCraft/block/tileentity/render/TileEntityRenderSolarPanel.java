package com.fibonacci.MiscCraft.block.tileentity.render;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;
import com.fibonacci.MiscCraft.block.tileentity.TileEntitySolarPanel;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Fibonacci on 6/4/14.
 */
public class TileEntityRenderSolarPanel extends TileEntitySpecialRenderer {
    private static final ResourceLocation solorpaneltexture = new ResourceLocation("misccraft", "textures/blocks/tileentity/solorpanel.png");


     
    public void renderTileEntityAt(TileEntity te, double dx, double dy, double dz, float f) {
    	int x1 = te.xCoord;
		int y1 = te.yCoord;
		int z1 = te.zCoord;
		TileEntitySolarPanel bullblock = (TileEntitySolarPanel)te;
		
    }
}




