package com.fibonacci.MiscCraft.block.tileentity.render;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityLights;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderLights extends TileEntitySpecialRenderer{

	private final ResourceLocation lightsTexture = new ResourceLocation("misccraft", "textures/blocks/tileentity/lights.png");


	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y,double z, float f) {
		TileEntityLights lights = (TileEntityLights)te;
		
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef((float)x, (float)y, (float)z);
		Tessellator t = Tessellator.instance;
		this.bindTexture(lightsTexture);
		t.startDrawingQuads();
		{
			if(te.blockMetadata ==  0){
				t.addVertexWithUV(.75, .75, .75, 0, 0);
				t.addVertexWithUV(.75, 0.75, .25, 0, 0);
				t.addVertexWithUV(.75, 1, .25, 0, 0);
				t.addVertexWithUV(.75, 1, .75, 0, 0);
				
				t.addVertexWithUV(.25, 1, .75, 0, 0);
				t.addVertexWithUV(.25, 1, .25, 0, 0);
				t.addVertexWithUV(.25, .75, .25, 0, 0);
				t.addVertexWithUV(.25, 0.75, .75, 0, 0);
				
				t.addVertexWithUV(.25, 0.75, .75, 0, 0);
				t.addVertexWithUV(.75, 0.75, .75, 0, 0);
				t.addVertexWithUV(.75, 1, .75, 0, 0);
				t.addVertexWithUV(.25, 1, .75, 0, 0);
				
				t.addVertexWithUV(.25, 1, .25, 0, 0);
				t.addVertexWithUV(.75, 1, .25, 0, 0);
				t.addVertexWithUV(.75, 0.75, .25, 0, 0);
				t.addVertexWithUV(.25, 0.75, .25, 0, 0);
				
				t.addVertexWithUV(.25, .75, .75, 0, 0);
				t.addVertexWithUV(.25, .75, .25, 0, 0);
				t.addVertexWithUV(.75, .75, .25, 0, 0);
				t.addVertexWithUV(.75, .75, .75, 0, 0);
				
				
				
				
				
				
			}
			if(te.blockMetadata ==  1){
				t.addVertexWithUV(.75, 0, .75, 0, 0);
				t.addVertexWithUV(.75, 0, .25, 0, 0);
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				t.addVertexWithUV(.25, 0, .25, 0, 0);
				t.addVertexWithUV(.25, 0, .75, 0, 0);
				
				t.addVertexWithUV(.25, 0, .75, 0, 0);
				t.addVertexWithUV(.75, 0, .75, 0, 0);
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				t.addVertexWithUV(.75, 0, .25, 0, 0);
				t.addVertexWithUV(.25, 0, .25, 0, 0);
				
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				
				
				
				
				
				
				
				
				
				
				
			}
			if(te.blockMetadata ==  2){
				t.addVertexWithUV(.75, .25, 1, 0, 0);
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				t.addVertexWithUV(.75, 0.75, .75, 0, 0);
				t.addVertexWithUV(.75, .75, 1, 0, 0);
				
				t.addVertexWithUV(.25, .75, 1, 0, 0);
				t.addVertexWithUV(.25, 0.75, .75, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .25, 1, 0, 0);
				
				t.addVertexWithUV(.75, .75, 1, 0, 0);
				t.addVertexWithUV(.75, 0.75, .75, 0, 0);
				t.addVertexWithUV(.25, .75, .75, 0, 0);
				t.addVertexWithUV(.25, .75, 1, 0, 0);
				
				t.addVertexWithUV(.25, .25, 1, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				t.addVertexWithUV(.75, .25, 1, 0, 0);
				
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .75, .75, 0, 0);
				t.addVertexWithUV(.75, .75, .75, 0, 0);
				
				
				
			
				
				
			}
			if(te.blockMetadata ==  3){
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				t.addVertexWithUV(.75, .25, 0, 0, 0);
				t.addVertexWithUV(.75, 0.75, 0, 0, 0);
				t.addVertexWithUV(.75, .75, .25, 0, 0);
				
				t.addVertexWithUV(.25, .75, .25, 0, 0);
				t.addVertexWithUV(.25, 0.75, 0, 0, 0);
				t.addVertexWithUV(.25, .25, 0, 0, 0);
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				
				t.addVertexWithUV(.75, .75, .25, 0, 0);
				t.addVertexWithUV(.75, 0.75, 0, 0, 0);
				t.addVertexWithUV(.25, .75, 0, 0, 0);
				t.addVertexWithUV(.25, .75, .25, 0, 0);
				
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				t.addVertexWithUV(.25, .25, 0, 0, 0);
				t.addVertexWithUV(.75, .25, 0, 0, 0);
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				
				t.addVertexWithUV(.75, .75, 0.25, 0, 0);
				t.addVertexWithUV(.25, .75, 0.25, 0, 0);
				t.addVertexWithUV(.25, .25, 0.25, 0, 0);
				t.addVertexWithUV(.75, .25, 0.25, 0, 0);
				
				
				
				
				
				
			}
			if(te.blockMetadata == 4){
				
				
				t.addVertexWithUV(.75, .75, .25, 0, 0);
				t.addVertexWithUV(1, .75, .25, 0, 0);
				t.addVertexWithUV(1, .25, .25, 0, 0);
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				
				t.addVertexWithUV(.75, .75, .25, 0, 0);
				t.addVertexWithUV(0.75, .75, .75, 0, 0);
				t.addVertexWithUV(1, .75, .75, 0, 0);
				t.addVertexWithUV(1, .75, .25, 0, 0);
				
				t.addVertexWithUV(1, .25, .25, 0, 0);
				t.addVertexWithUV(1, .25, .75, 0, 0);
				t.addVertexWithUV(0.75, .25, .75, 0, 0);
				t.addVertexWithUV(.75, .25, .25, 0, 0);
				
				
				
				
				
				t.addVertexWithUV(.75, .25, .75, 0, 0);
				t.addVertexWithUV(1, .25, .75, 0, 0);
				t.addVertexWithUV(1, .75, .75, 0, 0);
				t.addVertexWithUV(.75, .75, .75, 0, 0);
				
				t.addVertexWithUV(.75, .75, 0.75, 0, 0);
				t.addVertexWithUV(.75, .75, 0.25, 0, 0);
				t.addVertexWithUV(.75, .25, 0.25, 0, 0);
				t.addVertexWithUV(.75, .25, 0.75, 0, 0);
			}
			if(te.blockMetadata == 5){
				t.addVertexWithUV(0, .75, .25, 0, 0);
				t.addVertexWithUV(.25, .75, .25, 0, 0);
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				t.addVertexWithUV(0, .25, .25, 0, 0);
				
				t.addVertexWithUV(0, .75, .25, 0, 0);
				t.addVertexWithUV(0, .75, .75, 0, 0);
				t.addVertexWithUV(.25, .75, .75, 0, 0);
				t.addVertexWithUV(.25, .75, .25, 0, 0);
				
				t.addVertexWithUV(.25, .25, .25, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				t.addVertexWithUV(0, .25, .75, 0, 0);
				t.addVertexWithUV(0, .25, .25, 0, 0);
				
				t.addVertexWithUV(0, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .25, .75, 0, 0);
				t.addVertexWithUV(.25, .75, .75, 0, 0);
				t.addVertexWithUV(0, .75, .75, 0, 0);
				
				t.addVertexWithUV(.25, .25, 0.75, 0, 0);
				t.addVertexWithUV(.25, .25, 0.25, 0, 0);
				t.addVertexWithUV(.25, .75, 0.25, 0, 0);
				t.addVertexWithUV(.25, .75, 0.75, 0, 0);
				
				
				
			}
			
			
			
			
			
			
			
			
			
		}
		
		t.draw();
		GL11.glPopMatrix();
	}

}
