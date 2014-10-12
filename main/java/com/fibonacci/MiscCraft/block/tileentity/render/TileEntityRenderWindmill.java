package com.fibonacci.MiscCraft.block.tileentity.render;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.WindmillBlock;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityPipe;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import com.fibonacci.MiscCraft.common.MiscCraft;
import com.fibonacci.MiscCraft.item.WindmillItem;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityRenderWindmill extends TileEntitySpecialRenderer{

	private final ResourceLocation textureWindmill = new ResourceLocation("misccraft", "textures/model/windmill.png");
	private final ResourceLocation textureRotor = new ResourceLocation("misccraft", "textures/model/windmillrotor.png");
	private final ResourceLocation textureDowel = new ResourceLocation("misccraft", "textures/model/windmilldowl.png");
	
	
	private int twidth = 64;
	private int theight = 32;
	private int pixal = (int) ((1F/64)*16);
	
		
		
	
	public void renderTileEntityAt(TileEntity te, double dx, double dy,double dz, float f) {
		int x1 = te.xCoord;
		int y1 = te.yCoord;
		int z1 = te.zCoord;
		TileEntityWindmill windmill = (TileEntityWindmill)te;
		
		while(te.getWorldObj().getBlockMetadata(x1, y1, z1) < 7 && te.getWorldObj().getBlock(x1, y1, z1).equals(MiscCraft.WindmillBlock)){
			y1++;
		}
		
		
		
		
		GL11.glPushMatrix();
		GL11.glTranslatef((float)dx, (float)dy, (float)dz);
		
		
		Tessellator t = Tessellator.instance;
		this.bindTexture(textureWindmill);
		t.startDrawingQuads();
		
		{
			
			if(te.getBlockMetadata() == 1){
				t.addVertexWithUV(0, 0, 1, 0, 0);
				t.addVertexWithUV(0, 0.2, 1, 0, 0);
				t.addVertexWithUV(0, 0.2, 0, 0, 0);
				t.addVertexWithUV(0, 0, 0, 0, 0);
				
				t.addVertexWithUV(1, 0, 0, 0, 0);
				t.addVertexWithUV(1, 0.2, 0, 0, 0);
				t.addVertexWithUV(1, 0.2, 1, 0, 0);
				t.addVertexWithUV(1, 0, 1, 0, 0);
				
				t.addVertexWithUV(1, 0, 1, 0, 0);
				t.addVertexWithUV(1, 0.2,1, 0, 0);
				t.addVertexWithUV(0, 0.2, 1, 0, 0);
				t.addVertexWithUV(0, 0, 1, 0, 0);
				
				t.addVertexWithUV(0, 0, 0, 0, 0);
				t.addVertexWithUV(0, 0.2, 0, 0, 0);
				t.addVertexWithUV(1, 0.2,0, 0, 0);
				t.addVertexWithUV(1, 0, 0, 0, 0);
				
				t.addVertexWithUV(1, 0.2, 1, 0, 0);
				t.addVertexWithUV(1, 0.2, 0.75, 0, 0);
				t.addVertexWithUV(0, 0.2,0.75, 0, 0);
				t.addVertexWithUV(0, 0.2, 1, 0, 0);
				
				t.addVertexWithUV(0, 0.2, 0, 0, 0);
				t.addVertexWithUV(0, 0.2, 0.25, 0, 0);
				t.addVertexWithUV(1, 0.2,0.25, 0, 0);
				t.addVertexWithUV(1, 0.2, 0, 0, 0);
				
				t.addVertexWithUV(1, 0.2, 0.25, 0, 0);
				t.addVertexWithUV(0, 0.2, 0.25, 0, 0);
				t.addVertexWithUV(0, 0.2, 0.75, 0, 0);
				t.addVertexWithUV(1, 0.2, 0.75, 0, 0);
				
				
				
				
				
				
			}
			
			GL11.glColor3d(1,1, 1);
			if(te.getBlockMetadata() < 7){
			t.addVertexWithUV(0.25F, 0, 0.75F, (1F/64)*10, 1);
			t.addVertexWithUV(0.25F, 1, 0.75F, (1F/64)*10, 1);
			t.addVertexWithUV(0.25F, 1, 0.25F, 0, 0);
			t.addVertexWithUV(0.25F, 0, 0.25F, 0, 1);
			
			t.addVertexWithUV(0.25F, 0, 0.25F, (1F/64)*10, 1);
			t.addVertexWithUV(0.25F, 1, 0.25F, (1F/64)*10, 1);
			t.addVertexWithUV(0.75F, 1, 0.25F, 0, 0);
			t.addVertexWithUV(0.75F, 0, 0.25F, 0, 1);
			
			t.addVertexWithUV(0.75F, 0, 0.25F, (1F/64)*10, 1);
			t.addVertexWithUV(0.75F, 1, 0.25F, (1F/64)*10, 1);
			t.addVertexWithUV(0.75F, 1, 0.75F, 0, 0);
			t.addVertexWithUV(0.75F, 0, 0.75F, 0, 1);
			
			t.addVertexWithUV(0.75F, 0, 0.75F, (1F/64)*10, 1);
			t.addVertexWithUV(0.75F, 1, 0.75F, (1F/64)*10, 1);
			t.addVertexWithUV(0.25F, 1, 0.75F, 0, 0);
			t.addVertexWithUV(0.25F, 0, 0.75F, 0, (1F/64)*10);

			}
			if(te.blockMetadata >= 7){
				GL11.glColor3d(.5, .5, .5);
				t.addVertexWithUV(1, 0, 1, 0, 0);
				t.addVertexWithUV(1, 1, 1, 0, 0);
				t.addVertexWithUV(0, 1, 1, 0, 0);
				t.addVertexWithUV(0, 0, 1, 0, 0);
				
				t.addVertexWithUV(0, 0, 0, 0, 0);
				t.addVertexWithUV(0, 1, 0, 0, 0);
				t.addVertexWithUV(1, 1, 0, 0, 0);
				t.addVertexWithUV(1, 0, 0, 0, 0);
				
				t.addVertexWithUV(1, 0, 0, 0, 0);
				t.addVertexWithUV(1, 1, 0, 0, 0);
				t.addVertexWithUV(1, 1, 1, 0, 0);
				t.addVertexWithUV(1, 0, 1, 0, 0);
				
				t.addVertexWithUV(0, 0, 1, 0, 0);
				t.addVertexWithUV(0, 1, 1, 0, 0);
				t.addVertexWithUV(0, 1, 0, 0, 0);
				t.addVertexWithUV(0, 0, 0, 0, 0);
				
				t.addVertexWithUV(0, 1, 1, 0, 0);
				t.addVertexWithUV(1, 1, 1, 0, 0);
				t.addVertexWithUV(1, 1, 0, 0, 0);
				t.addVertexWithUV(0, 1, 0, 0, 0);
				
				t.addVertexWithUV(1, 0, 1, 0, 0);
				t.addVertexWithUV(0, 0, 1, 0, 0);
				t.addVertexWithUV(00, 0, 0, 0, 0);
				t.addVertexWithUV(1, 0, 0, 0, 0);
				if(te.getBlockMetadata() == 12){
					GL11.glDisable(GL11.GL_LIGHTING);
					GL11.glTranslated(0.5, 0, .5);
					GL11.glRotated(windmill.rotation2, 0, 1, 0);
					GL11.glTranslated(-0.5, 0, -.5);
					t.addVertexWithUV(.9, 0, .9, 0, 0);
					t.addVertexWithUV(.9, 1, .9, 0, 0);
					t.addVertexWithUV(.1, 1, .9, 0, 0);
					t.addVertexWithUV(.1, 0, .9, 0, 0);
					
					t.addVertexWithUV(.1, 0, .1, 0, 0);
					t.addVertexWithUV(.1, 1, .1, 0, 0);
					t.addVertexWithUV(.9, 1, .1, 0, 0);
					t.addVertexWithUV(.9, 0, .1, 0, 0);
					
					t.addVertexWithUV(.9, 0, .1, 0, 0);
					t.addVertexWithUV(.9, 1, .1, 0, 0);
					t.addVertexWithUV(.9, 1, .9, 0, 0);
					t.addVertexWithUV(.9, 0, .9, 0, 0);
					
					t.addVertexWithUV(.1, 0, .9, 0, 0);
					t.addVertexWithUV(.1, 1, .9, 0, 0);
					t.addVertexWithUV(.1, 1, .1, 0, 0);
					t.addVertexWithUV(.1, 0, .1, 0, 0);
					
					t.addVertexWithUV(.1, 1, .9, 0, 0);
					t.addVertexWithUV(.9, 1, .9, 0, 0);
					t.addVertexWithUV(.9, 1, .1, 0, 0);
					t.addVertexWithUV(.1, 1, .1, 0, 0);
					
					t.addVertexWithUV(.9, 0, .9, 0, 0);
					t.addVertexWithUV(.1, 0, .9, 0, 0);
					t.addVertexWithUV(0.1, 0, .1, 0, 0);
					t.addVertexWithUV(.9, 0, .1, 0, 0);
				}
				
			}
			
		}
		
		t.draw();
		
		if(te.blockMetadata >= 7){
			GL11.glDisable(GL11.GL_LIGHTING);
			drawRotor(te);	
			GL11.glEnable(GL11.GL_LIGHTING);
		}
		
		GL11.glPopMatrix();
		GL11.glEnable(GL11.GL_LIGHTING);
		
	}
	private void drawRotor(TileEntity tile){
 		TileEntityWindmill windmill = (TileEntityWindmill) tile.getWorldObj().getTileEntity(tile.xCoord, tile.yCoord, tile.zCoord);
 		
		
		if(tile.getBlockMetadata() == 8){
			GL11.glTranslatef(0.55F,0.55F, 0);
		GL11.glRotatef(windmill.rotation, 0, 0, 1);
		GL11.glTranslatef(-0.55F, -0.55F, 0);
		}
		if(tile.getBlockMetadata() == 9){
			GL11.glTranslatef(0.55F,0.55F, 0);
			GL11.glRotatef(windmill.rotation, 0, 0, 1);
			GL11.glTranslatef(-0.55F, -0.55F, 0);
			}
		if(tile.getBlockMetadata() == 10){
			GL11.glTranslatef(0,0.55F, 0.55F);
			GL11.glRotatef(windmill.rotation, 1, 0, 0);
			GL11.glTranslatef(0,-0.55F, -0.55F);
			}
			if(tile.getBlockMetadata() == 11){
				GL11.glTranslatef(0,0.55F, 0.55F);
				GL11.glRotatef(windmill.rotation, 1, 0, 0);
				GL11.glTranslatef(0,-0.55F,-0.55F);
				}
			if(tile.getBlockMetadata() == 12){
				GL11.glTranslated(0.55, 0, .55);
				GL11.glRotated(windmill.rotation1, 0, 1, 0);
				GL11.glTranslated(-0.55, 0, -.55);
			}
			
		
		
		
		
		GL11.glColor3f(1, 1, 1);
		Tessellator t = Tessellator.instance;
		this.bindTexture(textureRotor);
		t.startDrawingQuads();{
			
			if(tile.getBlockMetadata() == 9){
				
			t.addVertexWithUV(0.45F, 0.45F, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(0.45F, 0.65F, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(-2, 0.65F, 1.2,(1F/64)*58 , 0);
			t.addVertexWithUV(-2, 0.45F, 1.2,(1F/64)*58 , 1);
			
			t.addVertexWithUV(0.65F, 0.65, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(0.65F, 3, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(0.45F, 3, 1.2,(1F/64)*58 , 0);
			t.addVertexWithUV(0.45, 0.65, 1.2,(1F/64)*58 , 1);
			
			
			t.addVertexWithUV(3, 0.45F, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(3, 0.65F, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(0.65F, 0.65F, 1.2,(1F/64)*58 , 0);
			t.addVertexWithUV(0.65F, 0.45F, 1.2,(1F/64)*58 , 1);
			
			t.addVertexWithUV(0.65F, -2, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(0.65F, 0.45, 1.2,(1F/64)*58 , 1);
			t.addVertexWithUV(0.45, 0.45, 1.2,(1F/64)*58 , 0);
			t.addVertexWithUV(0.45F, -2, 1.2,(1F/64)*58 , 0);


			/*
			 * 
			 */
            t.addVertexWithUV(0.45F, 0.65F, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(0.45F, 0.45F, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(-2, 0.45F, 1.2,(1F/64)*58 , 0);
            t.addVertexWithUV(-2, 0.65F, 1.2,(1F/64)*58 , 1);

            t.addVertexWithUV(0.45F, 0.65, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(0.45F, 3, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(0.65F, 3, 1.2,(1F/64)*58 , 0);
            t.addVertexWithUV(0.65, 0.65, 1.2,(1F/64)*58 , 1);

            t.addVertexWithUV(3, 0.65F, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(3, 0.45F, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(0.65F, 0.45F, 1.2,(1F/64)*58 , 0);
            t.addVertexWithUV(0.65F, 0.65F, 1.2,(1F/64)*58 , 1);

            t.addVertexWithUV(0.45F, -2, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(0.45F, 0.45, 1.2,(1F/64)*58 , 1);
            t.addVertexWithUV(0.65, 0.45, 1.2,(1F/64)*58 , 0);
            t.addVertexWithUV(0.65F, -2, 1.2,(1F/64)*58 , 0);
            
            /*
             * Draw Shaft
             */
            
            t.addVertexWithUV(0.65, .45, 1.25,0, 0);
			t.addVertexWithUV(0.65, .65, 1.25, 0, 0);
			t.addVertexWithUV(.45, .65, 1.25, 0, 0);
			t.addVertexWithUV(.45, .45, 1.25, 0, 0);
			
			t.addVertexWithUV(.65, .45, 1,0, 0);
			t.addVertexWithUV(.65, .65, 1, 0, 0);
			t.addVertexWithUV(.65, .65, 1.25, 0, 0);
			t.addVertexWithUV(.65, .45, 1.25, 0, 0);
			
			
			t.addVertexWithUV(.45, .45, 1.25, 0, 0);
			t.addVertexWithUV(.45, .65, 1.25, 0, 0);
			t.addVertexWithUV(.45, .65, 1, 0, 0);
			t.addVertexWithUV(.45, .45, 1,0, 0);
			
			t.addVertexWithUV(.65, .65, 1.25, 0, 0);
			t.addVertexWithUV(.65, .65, 1, 0, 0);
			t.addVertexWithUV(.45, .65, 1, 0, 0);
			t.addVertexWithUV(.45, .65, 1.25,0, 0);
			
			t.addVertexWithUV(.45, .45, 1.25,0, 0);
			t.addVertexWithUV(.45, .45, 1, 0, 0);
			t.addVertexWithUV(.65, .45, 1, 0, 0);
			t.addVertexWithUV(.65, .45, 1.25, 0, 0);
			
			/*
			 * Number 2
			 */
			t.addVertexWithUV(0.45, .45, -.25,0, 0);
			t.addVertexWithUV(0.45, .65, -.25, 0, 0);
			t.addVertexWithUV(.65, .65, -.25, 0, 0);
			t.addVertexWithUV(.65, .45, -.25, 0, 0);
			
			t.addVertexWithUV(.45, .45, 0,0, 0);
			t.addVertexWithUV(.45, .65, 0, 0, 0);
			t.addVertexWithUV(.45, .65, -.25, 0, 0);
			t.addVertexWithUV(.45, .45, -.25, 0, 0);
			
			
			t.addVertexWithUV(.65, .45, -.25, 0, 0);
			t.addVertexWithUV(.65, .65, -.25, 0, 0);
			t.addVertexWithUV(.65, .65, 0, 0, 0);
			t.addVertexWithUV(.65, .45, 0,0, 0);
			
			t.addVertexWithUV(.45, .65, -.25, 0, 0);
			t.addVertexWithUV(.45, .65, 0, 0, 0);
			t.addVertexWithUV(.65, .65, 0, 0, 0);
			t.addVertexWithUV(.65, .65, -.25,0, 0);
			
			t.addVertexWithUV(.65, .45, -.25,0, 0);
			t.addVertexWithUV(.65, .45, 0, 0, 0);
			t.addVertexWithUV(.45, .45, 0, 0, 0);
			t.addVertexWithUV(.45, .45, -.25, 0, 0);
			}
			if(tile.getBlockMetadata() == 12){
				GL11.glTranslated(.8, 0.5, .8);
				
				GL11.glRotated(windmill.rotation, 0, 0, 1);
				GL11.glTranslated(-.8, -0.5, -.8);
				t.addVertexWithUV(0.45F, 0.45F, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(0.45F, 0.65F, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(-2, 0.65F, 1.25,(1F/64)*58 , 0);
				t.addVertexWithUV(-2, 0.45F, 1.25,(1F/64)*58 , 1);
				
				t.addVertexWithUV(0.65F, 0.65, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(0.65F, 3, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(0.45F, 3, 1.25,(1F/64)*58 , 0);
				t.addVertexWithUV(0.45, 0.65, 1.25,(1F/64)*58 , 1);
				
				
				t.addVertexWithUV(3, 0.45F, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(3, 0.65F, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(0.65F, 0.65F, 1.25,(1F/64)*58 , 0);
				t.addVertexWithUV(0.65F, 0.45F, 1.25,(1F/64)*58 , 1);
				
				t.addVertexWithUV(0.65F, -2, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(0.65F, 0.45, 1.25,(1F/64)*58 , 1);
				t.addVertexWithUV(0.45, 0.45, 1.25,(1F/64)*58 , 0);
				t.addVertexWithUV(0.45F, -2, 1.25,(1F/64)*58 , 0);


				/*
				 * 
				 */
	            t.addVertexWithUV(0.45F, 0.65F, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.45F, 0.45F, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(-2, 0.45F, 1.25,(1F/64)*58 , 0);
	            t.addVertexWithUV(-2, 0.65F, 1.25,(1F/64)*58 , 1);

	            t.addVertexWithUV(0.45F, 0.65, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.45F, 3, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.65F, 3, 1.25,(1F/64)*58 , 0);
	            t.addVertexWithUV(0.65, 0.65, 1.25,(1F/64)*58 , 1);

	            t.addVertexWithUV(3, 0.65F, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(3, 0.45F, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.65F, 0.45F, 1.25,(1F/64)*58 , 0);
	            t.addVertexWithUV(0.65F, 0.65F, 1.25,(1F/64)*58 , 1);

	            t.addVertexWithUV(0.45F, -2, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.45F, 0.45, 1.25,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.65, 0.45, 1.25,(1F/64)*58 , 0);
	            t.addVertexWithUV(0.65F, -2, 1.25,(1F/64)*58 , 0);
				}
			
			if(tile.getBlockMetadata() == 8){
				t.addVertexWithUV(0.45F, 0.45F, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(0.45F, 0.65F, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(-2, 0.65F, -.2,(1F/64)*58 , 0);
				t.addVertexWithUV(-2, 0.45F, -.2,(1F/64)*58 , 1);
				
				t.addVertexWithUV(0.65F, 0.65, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(0.65F, 3, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(0.45F, 3, -.2,(1F/64)*58 , 0);
				t.addVertexWithUV(0.45, 0.65, -.2,(1F/64)*58 , 1);
				
				t.addVertexWithUV(3, 0.45F, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(3, 0.65F, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(0.65F, 0.65F, -.2,(1F/64)*58 , 0);
				t.addVertexWithUV(0.65F, 0.45F, -.2,(1F/64)*58 , 1);
				
				t.addVertexWithUV(0.65F, -2, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(0.65F, 0.45, -.2,(1F/64)*58 , 1);
				t.addVertexWithUV(0.45, 0.45, -.2,(1F/64)*58 , 0);
				t.addVertexWithUV(0.45F, -2, -.2,(1F/64)*58 , 0);


				/*
				 * 
				 */
	            t.addVertexWithUV(0.45F, 0.65F, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.45F, 0.45F, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(-2, 0.45F, -.2,(1F/64)*58 , 0);
	            t.addVertexWithUV(-2, 0.65F, -.2,(1F/64)*58 , 1);

	            t.addVertexWithUV(0.45F, 0.65, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.45F, 3, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.65F, 3, -.2,(1F/64)*58 , 0);
	            t.addVertexWithUV(0.65, 0.65,-.2,(1F/64)*58 , 1);

	            t.addVertexWithUV(3, 0.65F, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(3, 0.45F, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.65F, 0.45F, -.2,(1F/64)*58 , 0);
	            t.addVertexWithUV(0.65F, 0.65F, -.2,(1F/64)*58 , 1);

	            t.addVertexWithUV(0.45F, -2, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.45F, 0.45, -.2,(1F/64)*58 , 1);
	            t.addVertexWithUV(0.65, 0.45, -.2,(1F/64)*58 , 0);
	            t.addVertexWithUV(0.65F, -2, -.2,(1F/64)*58 , 0);
	            
	            /*
				 * Draw Shaft
				 */
				
	            
				t.addVertexWithUV(0.45, .45, -.25,0, 0);
				t.addVertexWithUV(0.45, .65, -.25, 0, 0);
				t.addVertexWithUV(.65, .65, -.25, 0, 0);
				t.addVertexWithUV(.65, .45, -.25, 0, 0);
				
				t.addVertexWithUV(.45, .45, 0,0, 0);
				t.addVertexWithUV(.45, .65, 0, 0, 0);
				t.addVertexWithUV(.45, .65, -.25, 0, 0);
				t.addVertexWithUV(.45, .45, -.25, 0, 0);
				
				
				t.addVertexWithUV(.65, .45, -.25, 0, 0);
				t.addVertexWithUV(.65, .65, -.25, 0, 0);
				t.addVertexWithUV(.65, .65, 0, 0, 0);
				t.addVertexWithUV(.65, .45, 0,0, 0);
				
				t.addVertexWithUV(.45, .65, -.25, 0, 0);
				t.addVertexWithUV(.45, .65, 0, 0, 0);
				t.addVertexWithUV(.65, .65, 0, 0, 0);
				t.addVertexWithUV(.65, .65, -.25,0, 0);
				
				t.addVertexWithUV(.65, .45, -.25,0, 0);
				t.addVertexWithUV(.65, .45, 0, 0, 0);
				t.addVertexWithUV(.45, .45, 0, 0, 0);
				t.addVertexWithUV(.45, .45, -.25, 0, 0);
				
				/*
				 * Number 2
				 */
				
				 t.addVertexWithUV(0.65, .45, 1.25,0, 0);
					t.addVertexWithUV(0.65, .65, 1.25, 0, 0);
					t.addVertexWithUV(.45, .65, 1.25, 0, 0);
					t.addVertexWithUV(.45, .45, 1.25, 0, 0);
					
					t.addVertexWithUV(.65, .45, 1,0, 0);
					t.addVertexWithUV(.65, .65, 1, 0, 0);
					t.addVertexWithUV(.65, .65, 1.25, 0, 0);
					t.addVertexWithUV(.65, .45, 1.25, 0, 0);
					
					
					t.addVertexWithUV(.45, .45, 1.25, 0, 0);
					t.addVertexWithUV(.45, .65, 1.25, 0, 0);
					t.addVertexWithUV(.45, .65, 1, 0, 0);
					t.addVertexWithUV(.45, .45, 1,0, 0);
					
					t.addVertexWithUV(.65, .65, 1.25, 0, 0);
					t.addVertexWithUV(.65, .65, 1, 0, 0);
					t.addVertexWithUV(.45, .65, 1, 0, 0);
					t.addVertexWithUV(.45, .65, 1.25,0, 0);
					
					t.addVertexWithUV(.45, .45, 1.25,0, 0);
					t.addVertexWithUV(.45, .45, 1, 0, 0);
					t.addVertexWithUV(.65, .45, 1, 0, 0);
					t.addVertexWithUV(.65, .45, 1.25, 0, 0);
			}
	            if(tile.getBlockMetadata() == 10){
	            	t.addVertexWithUV(-.2, 0.45F, 0.45F,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.65F, 0.45F,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2F, 0.65F, -2,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2F, 0.45F, -2,(1F/64)*58 , 1);
					
					t.addVertexWithUV(-.2, 0.65, 0.65,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 3,  0.65,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 3, 0.45,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2, 0.65, 0.45,(1F/64)*58 , 1);
					
					t.addVertexWithUV(-.2, 0.45F, 3,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.65F, 3,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.65F, 0.65F,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2, 0.45F, 0.65,(1F/64)*58 , 1);
					
					t.addVertexWithUV(-.2, -2, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.45, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.45, 0.45,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2, -2, 0.45,(1F/64)*58 , 0);


					/*
					 * 
					 */
					t.addVertexWithUV(-.2, 0.45F, -2,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.65F, -2,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2F, 0.65F, 0.45F,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2F, 0.45F, 0.45F,(1F/64)*58 , 1);
					
					t.addVertexWithUV(-.2, 0.65, 0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 3,  0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 3, 0.65,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2, 0.65, 0.65,(1F/64)*58 , 1);
					
					t.addVertexWithUV(-.2, 0.45F, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.65F, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.65F, 3,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2, 0.45F, 3,(1F/64)*58 , 1);
					
					t.addVertexWithUV(-.2, -2, 0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.45, 0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(-.2, 0.45, 0.65F,(1F/64)*58 , 0);
					t.addVertexWithUV(-.2, -2, 0.65F,(1F/64)*58 , 0);
					
					
					
					/*
					 * Draw Dowel
					 */
					{
					
					t.addVertexWithUV(-.25, .45, .65,0, 0);
					t.addVertexWithUV(-.25, .65, .65, 0, 0);
					t.addVertexWithUV(-.25, .65, .45, 0, 0);
					t.addVertexWithUV(-.25, .45, .45, 0, 0);
					
					t.addVertexWithUV(0, .45, .65,0, 0);
					t.addVertexWithUV(0, .65, .65, 0, 0);
					t.addVertexWithUV(-0.25, .65, .65, 0, 0);
					t.addVertexWithUV(-0.25, .45, .65, 0, 0);
					
					
					t.addVertexWithUV(-0.25, .45, .45, 0, 0);
					t.addVertexWithUV(-0.25, .65, .45, 0, 0);
					t.addVertexWithUV(0, .65, .45, 0, 0);
					t.addVertexWithUV(0, .45, .45,0, 0);
					
					t.addVertexWithUV(-0.25, .65, .65, 0, 0);
					t.addVertexWithUV(0, .65, .65, 0, 0);
					t.addVertexWithUV(0, .65, .45, 0, 0);
					t.addVertexWithUV(-0.25, .65, .45,0, 0);
					
					t.addVertexWithUV(-0.25, .45, .45,0, 0);
					t.addVertexWithUV(0, .45, .45, 0, 0);
					t.addVertexWithUV(0, .45, .65, 0, 0);
					t.addVertexWithUV(-0.25, .45, .65, 0, 0);
					
					/*
					 * Number 2
					 */
					
					t.addVertexWithUV(1.25, .45, .45,0, 0);
					t.addVertexWithUV(1.25, .65, .45, 0, 0);
					t.addVertexWithUV(1.25, .65, .65, 0, 0);
					t.addVertexWithUV(1.25, .45, .65, 0, 0);
					
					t.addVertexWithUV(1, .45, .45,0, 0);
					t.addVertexWithUV(1, .65, .45, 0, 0);
					t.addVertexWithUV(1.25, .65, .45, 0, 0);
					t.addVertexWithUV(1.25, .45, .45, 0, 0);
					
					
					t.addVertexWithUV(1.25, .45, .65, 0, 0);
					t.addVertexWithUV(1.25, .65, .65, 0, 0);
					t.addVertexWithUV(1, .65, .65, 0, 0);
					t.addVertexWithUV(1, .45, .65,0, 0);
					
					t.addVertexWithUV(1.25, .65, .45, 0, 0);
					t.addVertexWithUV(1, .65, .45, 0, 0);
					t.addVertexWithUV(1, .65, .65, 0, 0);
					t.addVertexWithUV(1.25, .65, .65,0, 0);
					
					t.addVertexWithUV(1.25, .45, .65,0, 0);
					t.addVertexWithUV(1, .45, .65, 0, 0);
					t.addVertexWithUV(1, .45, .45, 0, 0);
					t.addVertexWithUV(1.25, .45, .45, 0, 0);
					
					}
					
					
					
	            }
	            if(tile.getBlockMetadata() == 11){
	            	t.addVertexWithUV(1.2, 0.45F, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.65F, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2F, 0.65F, 3,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2F, 0.45F, 3,(1F/64)*58 , 1);
					
					t.addVertexWithUV(1.2, 0.65, 0.65,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 3,  0.65,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 3, 0.45,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2, 0.65, 0.45,(1F/64)*58 , 1);
					
					t.addVertexWithUV(1.2, 0.45F, -2,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.65F, -2,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.65F, 0.45F,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2, 0.45F, 0.45,(1F/64)*58 , 1);
					
					t.addVertexWithUV(1.2, -2, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.45, 0.65F,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.45, 0.45,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2, -2, 0.45,(1F/64)*58 , 0);


					/*
					 * 
					 */
					t.addVertexWithUV(1.2, 0.45F, 0.45F,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.65F, 0.45F,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2F, 0.65F, -2,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2F, 0.45F, -2,(1F/64)*58 , 1);
					
					t.addVertexWithUV(1.2, 0.65, 0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 3,  0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 3, 0.65,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2, 0.65, 0.65,(1F/64)*58 , 1);
				
					t.addVertexWithUV(1.2, 0.45F, 3,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.65F, 3,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.65F, 0.65F,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2, 0.45F, 0.65F,(1F/64)*58 , 1);
					
					t.addVertexWithUV(1.2, -2, 0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.45, 0.45,(1F/64)*58 , 1);
					t.addVertexWithUV(1.2, 0.45, 0.65F,(1F/64)*58 , 0);
					t.addVertexWithUV(1.2, -2, 0.65F,(1F/64)*58 , 0);
					
					/*
					 * Draw Shaft
					 */
					
					t.addVertexWithUV(1.25, .45, .45,0, 0);
					t.addVertexWithUV(1.25, .65, .45, 0, 0);
					t.addVertexWithUV(1.25, .65, .65, 0, 0);
					t.addVertexWithUV(1.25, .45, .65, 0, 0);
					
					t.addVertexWithUV(1, .45, .45,0, 0);
					t.addVertexWithUV(1, .65, .45, 0, 0);
					t.addVertexWithUV(1.25, .65, .45, 0, 0);
					t.addVertexWithUV(1.25, .45, .45, 0, 0);
					
					
					t.addVertexWithUV(1.25, .45, .65, 0, 0);
					t.addVertexWithUV(1.25, .65, .65, 0, 0);
					t.addVertexWithUV(1, .65, .65, 0, 0);
					t.addVertexWithUV(1, .45, .65,0, 0);
					
					t.addVertexWithUV(1.25, .65, .45, 0, 0);
					t.addVertexWithUV(1, .65, .45, 0, 0);
					t.addVertexWithUV(1, .65, .65, 0, 0);
					t.addVertexWithUV(1.25, .65, .65,0, 0);
					
					t.addVertexWithUV(1.25, .45, .65,0, 0);
					t.addVertexWithUV(1, .45, .65, 0, 0);
					t.addVertexWithUV(1, .45, .45, 0, 0);
					t.addVertexWithUV(1.25, .45, .45, 0, 0);
					
					/*
					 * Number 2
					 */
					t.addVertexWithUV(-.25, .45, .65,0, 0);
					t.addVertexWithUV(-.25, .65, .65, 0, 0);
					t.addVertexWithUV(-.25, .65, .45, 0, 0);
					t.addVertexWithUV(-.25, .45, .45, 0, 0);
					
					t.addVertexWithUV(0, .45, .65,0, 0);
					t.addVertexWithUV(0, .65, .65, 0, 0);
					t.addVertexWithUV(-0.25, .65, .65, 0, 0);
					t.addVertexWithUV(-0.25, .45, .65, 0, 0);
					
					
					t.addVertexWithUV(-0.25, .45, .45, 0, 0);
					t.addVertexWithUV(-0.25, .65, .45, 0, 0);
					t.addVertexWithUV(0, .65, .45, 0, 0);
					t.addVertexWithUV(0, .45, .45,0, 0);
					
					t.addVertexWithUV(-0.25, .65, .65, 0, 0);
					t.addVertexWithUV(0, .65, .65, 0, 0);
					t.addVertexWithUV(0, .65, .45, 0, 0);
					t.addVertexWithUV(-0.25, .65, .45,0, 0);
					
					t.addVertexWithUV(-0.25, .45, .45,0, 0);
					t.addVertexWithUV(0, .45, .45, 0, 0);
					t.addVertexWithUV(0, .45, .65, 0, 0);
					t.addVertexWithUV(-0.25, .45, .65, 0, 0);
					
					
	            }
				
				t.draw();
	           
		}
	}
		public void drawDowel(TileEntity te){
			Tessellator t = Tessellator.instance;
			this.bindTexture(textureDowel);
			
				GL11.glTranslated(0, 0, -1);
				t.addVertexWithUV(-.25, .45, .65,1, 0);
				t.addVertexWithUV(-.25, .65, .65, 1, 0);
				t.addVertexWithUV(-.25, .65, .45, 1, 0);
				t.addVertexWithUV(-.25, .45, .45, 1, 0);
				
				t.addVertexWithUV(0, .45, .65,1, 0);
				t.addVertexWithUV(0, .65, .65, 1, 0);
				t.addVertexWithUV(-0.25, .65, .65, 1, 0);
				t.addVertexWithUV(-0.25, .45, .65, 1, 0);
				
				
				t.addVertexWithUV(-0.25, .45, .45, 1, 0);
				t.addVertexWithUV(-0.25, .65, .45, 1, 0);
				t.addVertexWithUV(0, .65, .45, 1, 0);
				t.addVertexWithUV(0, .45, .45,1, 0);
				
				t.addVertexWithUV(-0.25, .65, .65, 1, 0);
				t.addVertexWithUV(0, .65, .65, 1, 0);
				t.addVertexWithUV(0, .65, .45, 1, 0);
				t.addVertexWithUV(-0.25, .65, .45,1, 0);
				
				t.addVertexWithUV(-0.25, .45, .45,1, 0);
				t.addVertexWithUV(0, .45, .45, 1, 0);
				t.addVertexWithUV(0, .45, .65, 1, 0);
				t.addVertexWithUV(-0.25, .45, .65, 1, 0);
			}
			
		
		
		
	}
	
	


