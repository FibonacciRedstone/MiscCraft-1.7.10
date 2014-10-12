package com.fibonacci.MiscCraft.block.tileentity.render;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderBullSummonBlock extends TileEntitySpecialRenderer {
	private final ResourceLocation textureBullBlock = new ResourceLocation("misccraft", "textures/model/bullblock.png");
	private int twidth = 64;
	private int theight = 32;
	
	@Override
	public void renderTileEntityAt(TileEntity te, double dx, double dy,double dz, float f) {
		int x1 = te.xCoord;
		int y1 = te.yCoord;
		int z1 = te.zCoord;
		TileEntityBullSummonBlock bullblock = (TileEntityBullSummonBlock)te;
		
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef((float)dx, (float)dy, (float)dz);
		
		Tessellator t = Tessellator.instance;
		this.bindTexture(textureBullBlock);
		t.startDrawingQuads();
		{
			t.addVertexWithUV(0, 0, 0, 0, (1F/32)*12);
			t.addVertexWithUV(0, 0.65, 0,  0, (1F/32)*12);
			t.addVertexWithUV(1, 0.65, 0, 0, (1F/32)*12);
			t.addVertexWithUV(1, 0, 0,  0, (1F/32)*12);
			
			t.addVertexWithUV(1, 0, 1, 0, (1F/32)*12);
			t.addVertexWithUV(1, 0.65, 1,  0, (1F/32)*12);
			t.addVertexWithUV(0, 0.65, 1, 0, (1F/32)*12);
			t.addVertexWithUV(0, 0, 1,  0, (1F/32)*12);
			
			t.addVertexWithUV(0, 0, 1, 0, (1F/32)*12);
			t.addVertexWithUV(0, 0.65, 1,  0, (1F/32)*12);
			t.addVertexWithUV(0, 0.65, 0, 0, (1F/32)*12);
			t.addVertexWithUV(0, 0, 0,  0, (1F/32)*12);
			
			t.addVertexWithUV(1, 0, 0, 0, (1F/32)*12);
			t.addVertexWithUV(1, 0.65, 0,  0, (1F/32)*12);
			t.addVertexWithUV(1, 0.65, 1, 0, (1F/32)*12);
			t.addVertexWithUV(1, 0, 1,  0, (1F/32)*12);
			
			t.addVertexWithUV(1, 0.65, 0, 0, (1F/32)*12);
			t.addVertexWithUV(0, 0.65, 0,  0, (1F/32)*12);
			t.addVertexWithUV(0, 0.65, 1, 0, (1F/32)*12);
			t.addVertexWithUV(1, 0.65, 1,  0, (1F/32)*12);
		}
		t.draw();
		
		drawsmallbox(te);
		
		GL11.glEnable(GL11.GL_LIGHTING);	
		GL11.glPopMatrix();
	}
	public void drawsmallbox(TileEntity te){
		
		
		TileEntityBullSummonBlock bullblock = (TileEntityBullSummonBlock) te.getWorldObj().getTileEntity(te.xCoord, te.yCoord, te.zCoord);

//			GL11.glColor3d(1, 0, 0);
		
			Tessellator t = Tessellator.instance;
			this.bindTexture(textureBullBlock);
			t.startDrawingQuads();
			if(te.getBlockMetadata() <= 15 && te.getBlockMetadata() >= 1){
				
				
				
				
				
				//GL11.glTranslated(0, yaxis, 0);
				
				//GL11.glTranslated(0, -yaxis, 0);
			}
			if(te.getBlockMetadata() <= 15){
			GL11.glTranslated(0.5, 0, 0.5);
			GL11.glRotated(bullblock.centerrotate, 0, 1, 0);
			GL11.glTranslated(-0.5, 0, -0.5);
			}
			t.addVertexWithUV(0.6, 0.9, 0.6, 0, 0);
			t.addVertexWithUV(0.6, 1.1, 0.6, 0, 0);
			t.addVertexWithUV(0.4, 1.1, 0.6, 0, 0);
			t.addVertexWithUV(0.4,  0.9, 0.6, 0, 0);
			
			t.addVertexWithUV(0.4,  0.9, 0.4, 0, 0);
			t.addVertexWithUV(0.4, 1.1, 0.4, 0, 0);
			t.addVertexWithUV(0.6, 1.1, 0.4, 0, 0);
			t.addVertexWithUV(0.6,  0.9, 0.4, 0, 0);
			
			t.addVertexWithUV(0.6,  0.9, 0.4, 0, 0);
			t.addVertexWithUV(0.6, 1.1, 0.4, 0, 0);
			t.addVertexWithUV(0.6, 1.1, 0.6, 0, 0);
			t.addVertexWithUV(0.6,  0.9, 0.6, 0, 0);
			
			t.addVertexWithUV(0.4,  0.9, 0.6, 0, 0);
			t.addVertexWithUV(0.4, 1.1, 0.6, 0, 0);
			t.addVertexWithUV(0.4, 1.1, 0.4, 0, 0);
			t.addVertexWithUV(0.4,  0.9, 0.4, 0, 0);
			
			t.addVertexWithUV(0.4, 1.1, 0.6, 0, 0);
			t.addVertexWithUV(0.6, 1.1, 0.6, 0, 0);
			t.addVertexWithUV(0.6, 1.1, 0.4, 0, 0);
			t.addVertexWithUV(0.4, 1.1, 0.4, 0, 0);
			
			t.addVertexWithUV(0.6,  0.9, 0.6, 0, 0);
			t.addVertexWithUV(0.4,  0.9, 0.6, 0, 0);
			t.addVertexWithUV(0.4,  0.9, 0.4, 0, 0);
			t.addVertexWithUV(0.6,  0.9, 0.4, 0, 0);
		
		
		t.draw();
	
}
	
}


