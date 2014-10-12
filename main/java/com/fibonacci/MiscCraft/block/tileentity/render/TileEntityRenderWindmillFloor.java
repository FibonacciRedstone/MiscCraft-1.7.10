package com.fibonacci.MiscCraft.block.tileentity.render;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.WindmillFloor;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmillFloor;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityRenderWindmillFloor extends TileEntitySpecialRenderer {

	private ResourceLocation textureWindmillFloor = new ResourceLocation("misccraft", "textures/blocks/tileentity/windmillfloorrender.png");

	@Override
	public void renderTileEntityAt(TileEntity te, double dx, double dy,double dz, float f) {
		int x1 = te.xCoord;
		int y1 = te.yCoord;
		int z1 = te.zCoord;
		TileEntityWindmillFloor windmill = (TileEntityWindmillFloor)te;
		WindmillFloor floor = (WindmillFloor)te.getWorldObj().getBlock(x1, y1, z1);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glPushMatrix();
		GL11.glTranslatef((float)dx, (float)dy, (float)dz);
		
		
		Tessellator t = Tessellator.instance;
		this.bindTexture(textureWindmillFloor);
		t.startDrawingQuads();
		{
			if(te.getBlockMetadata() == 0){
				t.addVertexWithUV(0, .3, 0, 1, 2F/8);
				t.addVertexWithUV(0, .3, 1, 1, 3F/8);
				t.addVertexWithUV(1, .3, 1, 7F/8, 3F/8);
				t.addVertexWithUV(1, .3, 0, 7F/8, 2F/8);
				
				t.addVertexWithUV(1, 0, 0, 1, 2F/8);
				t.addVertexWithUV(1, 0, 1, 1, 3F/8);
				t.addVertexWithUV(0, 0, 1, 7F/8, 3F/8);
				t.addVertexWithUV(0, 0, 0, 7F/8, 2F/8);
				
				t.addVertexWithUV(1, 0, 0, 1, 2F/8);
				t.addVertexWithUV(1, .3, 0, 1, 3F/8);
				t.addVertexWithUV(1, .3, 1, 7F/8, 3F/8);
				t.addVertexWithUV(1, 0, 1, 7F/8, 2F/8);
				
				t.addVertexWithUV(1, 0, 1, 1, 2F/8);
				t.addVertexWithUV(1, 0.3, 1, 1, 3F/8);
				t.addVertexWithUV(0, 0.3, 1, 7F/8, 3F/8);
				t.addVertexWithUV(0, 0, 1, 7F/8, 2F/8);
				
				t.addVertexWithUV(0, 0, 0, 1, 2F/8);
				t.addVertexWithUV(0, 0.3, 0, 1, 3F/8);
				t.addVertexWithUV(1, 0.3, 0, 7F/8, 3F/8);
				t.addVertexWithUV(1, 0, 0, 7F/8, 2F/8);
				
				t.addVertexWithUV(0, 0, 1, 1, 2F/8);
				t.addVertexWithUV(0, .3, 1, 1, 3F/8);
				t.addVertexWithUV(0, .3, 0, 7F/8, 3F/8);
				t.addVertexWithUV(0, 0, 0, 7F/8, 2F/8);
				
				
				
				
				
				
			}
			if(floor.isMulti(te.getWorldObj(), x1, y1, z1)){
				
			if(te.getBlockMetadata() == 1){
				t.addVertexWithUV(0, 1, 0, (1F/8), 0);
				t.addVertexWithUV(0, 1, 0.7, 0, 0);
				t.addVertexWithUV(0.7, 1, 0.7, 0, (1F/8));
				t.addVertexWithUV(0.7, 1, 0, (1F/8), (1F/8));
				
				t.addVertexWithUV(0.7, 0, 0, 0, 0);
				t.addVertexWithUV(0.7, 0, 0.7, 0, 1F/8);
				t.addVertexWithUV(0, 0, 0.7, 1F/8, 1F/8);
				t.addVertexWithUV(0, 0, 0, 1F/8, 0);
				
				t.addVertexWithUV(.7, 0, 0, 1F/8, 1);
				t.addVertexWithUV(.7, 1, 0, 1F/8, 7F/8);
				t.addVertexWithUV(.7, 1, 0.7, 0, 7F/8);
				t.addVertexWithUV(.7, 0, 0.7, 0, 1);
				
				t.addVertexWithUV(.7, 0, 0.7, 0, 1);
				t.addVertexWithUV(.7, 1, 0.7, 0, 7F/8);
				t.addVertexWithUV(0, 1, 0.7, 1F/8, 7F/8);
				t.addVertexWithUV(0, 0, 0.7, 1F/8, 1);
				
				
			}
			if(te.getBlockMetadata() == 2){
				t.addVertexWithUV(0, 1, 0, 1, 0);
				t.addVertexWithUV(0, 1, 1, 1, 1F/8);
				t.addVertexWithUV(0.7, 1, 1, 7F/8, 1F/8);
				t.addVertexWithUV(0.7, 1, 0, 7F/8, 0);
				
				t.addVertexWithUV(0.7, 0, 0, 7F/8, 0);
				t.addVertexWithUV(0.7, 0, 1, 7F/8, 1F/8);
				t.addVertexWithUV(0, 0, 1, 1, 1F/8);
				t.addVertexWithUV(0, 0, 0, 1, 0);
				
				t.addVertexWithUV(.7, 0, 0, 1, 1);
				t.addVertexWithUV(.7, 1, 0, 1, 7F/8);
				t.addVertexWithUV(.7, 1, 1, 7F/8, 7F/8);
				t.addVertexWithUV(.7, 0, 1, 7F/8, 1);
				
				
				
			}
			if(te.getBlockMetadata() == 3){
				t.addVertexWithUV(0, 1, 0.3, 1F/8, 1F/8);
				t.addVertexWithUV(0, 1, 1, 1F/8, 0);
				t.addVertexWithUV(00.7, 1, 1, 0, 0);
				t.addVertexWithUV(00.7, 1, 0.3, 0, 1F/8);
				
				t.addVertexWithUV(00.7, 0, 0.3, 0, 1F/8);
				t.addVertexWithUV(00.7, 0, 1, 1F/8, 1F/8);
				t.addVertexWithUV(0, 0, 1, 1F/8, 0);
				t.addVertexWithUV(0, 0, 0.3, 0, 0);
				
				t.addVertexWithUV(.7, 0, 0.3, 0, 1);
				t.addVertexWithUV(.7, 1, 0.3, 0, 7F/8);
				t.addVertexWithUV(.7, 1, 1, 1F/8, 7F/8);
				t.addVertexWithUV(.7, 0, 1, 1F/8, 1);
				
				t.addVertexWithUV(0, 0, 0.3, 1F/8, 1);
				t.addVertexWithUV(0, 1, 0.3, 1F/8, 7F/8);
				t.addVertexWithUV(.7, 1, 0.3, 0, 7F/8);
				t.addVertexWithUV(.7, 0, 0.3, 0, 1);
				
				
				
				
			}
			if(te.getBlockMetadata() == 4){
				t.addVertexWithUV(0, 1, 0, 1, 0);
				t.addVertexWithUV(0, 1, 0.7, 7F/8, 0);
				t.addVertexWithUV(1, 1, 0.7,7F/8, 1F/8);
				t.addVertexWithUV(1, 1, 0, 1, 1F/8);
				
				t.addVertexWithUV(1, 0, 0, 1, 0);
				t.addVertexWithUV(1, 0, 0.7, 7F/8, 0);
				t.addVertexWithUV(0, 0, 0.7, 7F/8, 1F/8);
				t.addVertexWithUV(0, 0, 0, 1, 1F/8);
			
				t.addVertexWithUV(1, 0, 0.7, 1, 1);
				t.addVertexWithUV(1, 1, 0.7, 1, 7F/8);
				t.addVertexWithUV(0, 1, 0.7, 7F/8, 7F/8);
				t.addVertexWithUV(0, 0, 0.7, 7F/8, 1);
				
			}
			if(te.getBlockMetadata() == 5){
				t.addVertexWithUV(0, 1, 0, 2F/8, 0);
				t.addVertexWithUV(0, 1, 1, 1F/8, 0);
				t.addVertexWithUV(1, 1, 1, 1F/8, 1F/8);
				t.addVertexWithUV(1, 1, 0, 2F/8, 1F/8);
				
				t.addVertexWithUV(1, 0, 0, 2F/8, 0);
				t.addVertexWithUV(1, 0, 1, 1F/8, 0);
				t.addVertexWithUV(0, 0, 1, 1F/8, 1F/8);
				t.addVertexWithUV(0, 0, 0, 2F/8, 1F/8);
				
				
				
			}
			if(te.getBlockMetadata() == 6){
				t.addVertexWithUV(0, 1, 0.3, 7F/8, 1F/8);
				t.addVertexWithUV(0, 1, 1, 1, 1F/8);
				t.addVertexWithUV(1, 1, 1, 1, 0);
				t.addVertexWithUV(1, 1, 0.3, 7F/8, 0);
				
				t.addVertexWithUV(1, 0, 0.3, 7F/8, 1F/8);
				t.addVertexWithUV(1, 0, 1, 1, 1F/8);
				t.addVertexWithUV(0, 0, 1, 1, 0);
				t.addVertexWithUV(0, 0, 0.3, 7F/8, 0);
				
				t.addVertexWithUV(0, 0, 0.3, 1, 1);
				t.addVertexWithUV(0, 1, 0.3, 1, 7F/8);
				t.addVertexWithUV(1, 1, 0.3, 7F/8, 7F/8);
				t.addVertexWithUV(1, 0, 0.3, 7F/8, 1);
				
				
				
				
				
				
			}
			if(te.getBlockMetadata() == 7){
				t.addVertexWithUV(0.3, 1, 0, 0, 0);
				t.addVertexWithUV(0.3, 1, 0.7, 0, 1F/8);
				t.addVertexWithUV(1, 1, 0.7, 1F/8, 1F/8);
				t.addVertexWithUV(1, 1, 0, 1F/8, 0);
				
				t.addVertexWithUV(1, 0, 0, 1F/8, 0);
				t.addVertexWithUV(1, 0, 0.7, 1F/8, 1F/8);
				t.addVertexWithUV(0.3, 0, 0.7, 0, 1F/8);
				t.addVertexWithUV(0.3, 0, 0, 0, 0);
				
				t.addVertexWithUV(1, 0, 0.7, 1F/8, 1);
				t.addVertexWithUV(1, 1, 0.7, 1F/8, 7F/8);
				t.addVertexWithUV(0.3, 1, 0.7, 0, 7F/8);
				t.addVertexWithUV(0.3, 0, 0.7, 0, 1);
				
				t.addVertexWithUV(.3, 0, 0.7, 0, 7F/8);
				t.addVertexWithUV(.3, 1, 0.7, 0, 1);
				t.addVertexWithUV(.3, 1, 0, 1F/8, 1);
				t.addVertexWithUV(.3, 0, 0, 1F/8, 7F/8);
				
				
				
				
			}
			if(te.getBlockMetadata() == 8){
				t.addVertexWithUV(0.3, 1, 0, 7F/8, 0);
				t.addVertexWithUV(0.3, 1, 1, 7F/8, 1F/8);
				t.addVertexWithUV(1, 1, 1, 1, 1F/8);
				t.addVertexWithUV(1, 1, 0, 1, 1F/8);
				
				t.addVertexWithUV(1, 0, 0, 1, 1F/8);
				t.addVertexWithUV(1, 0, 1, 1, 0);
				t.addVertexWithUV(0.3, 0, 1, 7F/8, 0);
				t.addVertexWithUV(0.3, 0, 0, 7F/8, 1F/8);
				
				t.addVertexWithUV(.3, 0, 1, 1, 1);
				t.addVertexWithUV(.3, 1, 1, 1, 7F/8);
				t.addVertexWithUV(.3, 1, 0, 7F/8, 7F/8);
				t.addVertexWithUV(.3, 0, 0, 7F/8, 1);
				
				
				
				
			}
			if(te.getBlockMetadata() == 9){
				t.addVertexWithUV(0.3, 1, 0.3, 0, 1F/8);
				t.addVertexWithUV(0.3, 1, 1, 1F/8, 1F/8);
				t.addVertexWithUV(1, 1, 1, 1F/8, 0);
				t.addVertexWithUV(1, 1, 0.3, 0, 0);
				
				t.addVertexWithUV(1, 0, 0.3, 0, 0);
				t.addVertexWithUV(1, 0, 1, 1F/8, 0);
				t.addVertexWithUV(0.3, 0, 1, 1F/8, 1F/8);
				t.addVertexWithUV(0.3, 0, 0.3, 0, 1F/8);
				
				t.addVertexWithUV(.3, 0, 1, 1F/8, 1);
				t.addVertexWithUV(.3, 1, 1, 1F/8, 7F/8);
				t.addVertexWithUV(.3, 1, 0.3, 0, 7F/8);
				t.addVertexWithUV(.3, 0, 0.3, 0, 1);
				
				
				t.addVertexWithUV(0.3, 0, 0.3, 0, 7F/8);
				t.addVertexWithUV(0.3, 1, 0.3, 0, 1);
				t.addVertexWithUV(1, 1, 0.3, 1F/8, 1);
				t.addVertexWithUV(1, 0, 0.3, 1F/8, 7F/8);
				
			}
		}
		}
		t.draw();
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();

	}

}
