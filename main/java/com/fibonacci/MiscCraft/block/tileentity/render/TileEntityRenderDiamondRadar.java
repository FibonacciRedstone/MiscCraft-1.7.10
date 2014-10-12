package com.fibonacci.MiscCraft.block.tileentity.render;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityDiamondRadar;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderDiamondRadar extends TileEntitySpecialRenderer {
	private final ResourceLocation textureBullBlock = new ResourceLocation("misccraft", "textures/blocks/tileentity/randomblock.png");
	private int twidth = 64;
	private int theight = 64;

	@Override
	public void renderTileEntityAt(TileEntity te, double dx, double dy,double dz, float f) {
		int x1 = te.xCoord;
		int y1 = te.yCoord;
		int z1 = te.zCoord;
		TileEntityDiamondRadar randomblock = (TileEntityDiamondRadar)te;
		
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef((float)dx, (float)dy, (float)dz);
		Tessellator t = Tessellator.instance;
		this.bindTexture(textureBullBlock);
		t.startDrawingQuads();
		
		
		{
			
			t.addVertexWithUV(0.65, 0, 0.45, 0, 0);
			t.addVertexWithUV(0.65, 0, 0.65, 0, 0);
			t.addVertexWithUV(0.45, 0, 0.65, 0, 0);
			t.addVertexWithUV(0.45, 0, 0.45, 0, 0);
			
			
			
			
			t.addVertexWithUV(0.45, 0.7, 0.45, 0, 0);
			t.addVertexWithUV(0.45, 0.7, 0.65, 0, 0);
			t.addVertexWithUV(0.65, 0.7, 0.65, 0, 0);
			t.addVertexWithUV(0.65, 0.7, 0.45, 0, 0);
			
			
			t.addVertexWithUV(0.65, 0, 0.65, 0, 0);
			t.addVertexWithUV(0.65, 0.7, 0.65, 0, 0);
			t.addVertexWithUV(0.45, 0.7, 0.65, 0, 0);
			t.addVertexWithUV(0.45, 0, 0.65, 0, 0);
			
			t.addVertexWithUV(0.45, 0, 0.45, 0, 0);
			t.addVertexWithUV(0.45, 0.7, 0.45, 0, 0);
			t.addVertexWithUV(0.65, 0.7, 0.45, 0, 0);
			t.addVertexWithUV(0.65, 0, 0.45, 0, 0);
			
			t.addVertexWithUV(0.65, 0, 0.45, 0, 0);
			t.addVertexWithUV(0.65, 0.7, 0.45, 0, 0);
			t.addVertexWithUV(0.65, 0.7, 0.65, 0, 0);
			t.addVertexWithUV(0.65, 0, 0.65, 0, 0);
			
			t.addVertexWithUV(0.45, 0, 0.65, 0, 0);
			t.addVertexWithUV(0.45, 0.7, 0.65, 0, 0);
			t.addVertexWithUV(0.45, 0.7, 0.45, 0, 0);
			t.addVertexWithUV(0.45, 0, 0.45, 0, 0);
			
			
			
			
			
			
			
			
			
			
			
//			GL11.glTranslated(0, -2, 0);
			
			
			
		}
		
		t.draw();
		drawcube(te);
		
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);


	}
	public void drawcube(TileEntity te){
TileEntityDiamondRadar randomblock = (TileEntityDiamondRadar)te;
		
		
		Tessellator t = Tessellator.instance;
		this.bindTexture(textureBullBlock);
		{
			t.startDrawingQuads();
			if(randomblock.orefound >= 1){
			GL11.glTranslated(0.55, 0, 0.55);
			GL11.glRotated((double)randomblock.rotation+randomblock.orefound, 0, 1, 0);
			GL11.glTranslated(-0.55, 0, -0.55);
			}
			
			t.addVertexWithUV(0.65, 1, 0.65, 59F/64, 5F/64);
			t.addVertexWithUV(0.65, 1, 0.45, 1, 5F/64);
			t.addVertexWithUV(0.45, 1, 0.45, 1, 0);
			t.addVertexWithUV(0.45, 1, 0.65,59F/64, 0);
			
			t.addVertexWithUV(0.45, 0.8, 0.65, 59F/64, 5F/64);
			t.addVertexWithUV(0.45, 0.8, 0.45, 1, 5F/64);
			t.addVertexWithUV(0.65, 0.8, 0.45, 1, 0);
			t.addVertexWithUV(0.65, 0.8, 0.65, 59F/64, 0);
			
			t.addVertexWithUV(0.65, 0.8, 0.65, 59F/64, 5F/64);
			t.addVertexWithUV(0.65, 1, 0.65, 1, 5F/64);
			t.addVertexWithUV(0.45, 1, 0.65, 1, 0);
			t.addVertexWithUV(0.45, 0.8, 0.65, 59F/64, 0);
			
			t.addVertexWithUV(0.45, 0.8, 0.45, 59F/64, 5F/64);
			t.addVertexWithUV(0.45, 1, 0.45, 1, 5F/64);
			t.addVertexWithUV(0.65, 1, 0.45, 1, 0);
			t.addVertexWithUV(0.65, 0.8, 0.45, 59F/64, 0);
			
			t.addVertexWithUV(0.45, 0.8, 0.65, 59F/64, 5F/64);
			t.addVertexWithUV(0.45, 1, 0.65, 1, 5F/64);
			t.addVertexWithUV(0.45, 1, 0.45, 1, 0);
			t.addVertexWithUV(0.45, 0.8, 0.45, 59F/64, 0);
			
			t.addVertexWithUV(0.65, 0.8, 0.45, 59F/64, 5F/64);
			t.addVertexWithUV(0.65, 1, 0.45, 1, 5F/64);
			t.addVertexWithUV(0.65, 1, 0.65, 1, 0);
			t.addVertexWithUV(0.65, 0.8, 0.65, 59F/64, 0);
			
			
			t.draw();
			
			
			
			
			
			
		}

	}

}
