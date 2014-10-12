/**
 * Created By Fibonacci on Aug 10, 2014
 */
package com.fibonacci.MiscCraft.block.tileentity.render;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityHydrant;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

/**
 * @author Fibonacci
 *
 */
public class TileEntityRenderHydrant extends TileEntitySpecialRenderer {
	private final ResourceLocation texturefire = new ResourceLocation("misccraft", "textures/model/fire.png");
	
	@Override
	public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f) {
		TileEntityHydrant hydrant = (TileEntityHydrant)te;
		
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef((float)x, (float)y, (float)z);
		
		Tessellator t = Tessellator.instance;
		this.bindTexture(texturefire);
		t.startDrawingQuads();
		
		{
			//Begin Center Pole
			t.addVertexWithUV(.25, 0, .25, 0, 0);
			t.addVertexWithUV(.25, 0, .75, 0, 0);
			t.addVertexWithUV(.25, 1, .75, 0, 0);
			t.addVertexWithUV(.25, 1, .25, 0, 0);
			
			t.addVertexWithUV(.75, 1, .25, 0, 0);
			t.addVertexWithUV(.75, 1, .75, 0, 0);
			t.addVertexWithUV(.75, 0, .75, 0, 0);
			t.addVertexWithUV(.75, 0, .25, 0, 0);
			
			t.addVertexWithUV(.25, 1, .25, 0, 0);
			t.addVertexWithUV(.75, 1, .25, 0, 0);
			t.addVertexWithUV(.75, 0, .25, 0, 0);
			t.addVertexWithUV(.25, 0, .25, 0, 0);
			
			t.addVertexWithUV(.25, 0, .75, 0, 0);
			t.addVertexWithUV(.75, 0, .75, 0, 0);
			t.addVertexWithUV(.75, 1, .75, 0, 0);
			t.addVertexWithUV(.25, 1, .75, 0, 0);
			
			t.addVertexWithUV(.75, 1, .75, 0, 0);
			t.addVertexWithUV(.75, 1, .25, 0, 0);
			t.addVertexWithUV(.25, 1, .25, 0, 0);
			t.addVertexWithUV(.25, 1, .75, 0, 0);
			
			t.addVertexWithUV(.25, 0.05, .75, 0, 0);
			t.addVertexWithUV(.25, 0.05, .25, 0, 0);
			t.addVertexWithUV(.75, 0.05, .25, 0, 0);
			t.addVertexWithUV(.75, 0.05, .75, 0, 0);
			//End Center Pole
			//Start Prong West
			t.addVertexWithUV(0.1, 0.75, .40, 1, 0);
			t.addVertexWithUV(0.1, 0.75, .60,  59F/64, 0);
			t.addVertexWithUV(0.1, 0.95, .60,59F/64, 5F/64);
			t.addVertexWithUV(0.1, 0.95, .40, 1, 5F/64);
			
			t.addVertexWithUV(0.25, 0.75, .40, 1, 1);
			t.addVertexWithUV(0.1, 0.75, .40, 1, 63F/64);
			t.addVertexWithUV(0.1, 0.95, .40, 63F/64, 63F/64);
			t.addVertexWithUV(0.25, 0.95, .40, 63F/64, 1);
			
			t.addVertexWithUV(0.25, 0.95, .60, 63F/64, 1);
			t.addVertexWithUV(0.1, 0.95, .60, 63F/64, 63F/64);
			t.addVertexWithUV(0.1, 0.75, .60, 1, 63F/64);
			t.addVertexWithUV(0.25, 0.75, .60, 1, 1);
			
			t.addVertexWithUV(0.1, 0.95, .40, 63F/64, 1);
			t.addVertexWithUV(0.1, 0.95, .60, 63F/64, 63F/64);
			t.addVertexWithUV(0.25, 0.95, .60, 1, 63F/64);
			t.addVertexWithUV(0.25, 0.95, .40, 1, 1);
			
			t.addVertexWithUV(0.25, 0.75, .40, 1, 1);
			t.addVertexWithUV(0.25, 0.75, .60, 1, 63F/64);
			t.addVertexWithUV(0.1, 0.75, .60, 63F/64, 63F/64);
			t.addVertexWithUV(0.1, 0.75, .40, 63F/64, 1);
			//End Prong West
			//Start Prong East
			t.addVertexWithUV(0.9, 0.95, .40, 1, 0);
			t.addVertexWithUV(0.9, 0.95, .60,59F/64, 0);
			t.addVertexWithUV(0.9, 0.75, .60, 59F/64, 5F/64);
			t.addVertexWithUV(0.9, 0.75, .40, 1, 5F/64);
			
			
			
			t.addVertexWithUV(0.75, 0.95, .40, 63F/64, 1);
			t.addVertexWithUV(0.9, 0.95, .40, 63F/64, 63F/64);
			t.addVertexWithUV(0.9, 0.75, .40, 1, 63F/64);
			t.addVertexWithUV(0.75, 0.75, .40, 1, 1);
			
			
			
			t.addVertexWithUV(0.75, 0.75, .60, 1, 1);
			t.addVertexWithUV(0.9, 0.75, .60, 1, 63F/64);
			t.addVertexWithUV(0.9, 0.95, .60, 63F/64, 63F/64);
			t.addVertexWithUV(0.75, 0.95, .60, 63F/64, 1);
			
			
			
			t.addVertexWithUV(0.75, 0.95, .40, 1, 1);
			t.addVertexWithUV(0.75, 0.95, .60, 1, 63F/64);
			t.addVertexWithUV(0.9, 0.95, .60, 63F/64, 63F/64);
			t.addVertexWithUV(0.9, 0.95, .40, 63F/64, 1);
			
			
			
			t.addVertexWithUV(0.9, 0.75, .40, 63F/64, 1);
			t.addVertexWithUV(0.9, 0.75, .60, 63F/64, 63F/64);
			t.addVertexWithUV(0.75, 0.75, .60, 1, 63F/64);
			t.addVertexWithUV(0.75, 0.75, .40, 1, 1);
			//End Prong East
			//Start Prong North
			t.addVertexWithUV(0.6, 0.75, .1, 1, 0);
			t.addVertexWithUV(0.4, 0.75, .1,59F/64, 0);
			t.addVertexWithUV(0.4, 0.95, .1, 59F/64, 5F/64);
			t.addVertexWithUV(0.6, 0.95, .1, 1, 5F/64);
			
			t.addVertexWithUV(0.4, 0.75, .1, 63F/64, 1);
			t.addVertexWithUV(0.4, 0.75, .25,63F/64, 63F/64);
			t.addVertexWithUV(0.4, 0.95, .25, 1, 63F/64);
			t.addVertexWithUV(0.4, 0.95, .1, 1, 1);
			
			t.addVertexWithUV(0.6, 0.95, .1, 1, 1);
			t.addVertexWithUV(0.6, 0.95, .25, 1, 63F/64);
			t.addVertexWithUV(0.6, 0.75, .25,63F/64, 63F/64);
			t.addVertexWithUV(0.6, 0.75, .1, 63F/64, 1);
			
			t.addVertexWithUV(0.4, 0.95, .1, 1, 1);
			t.addVertexWithUV(0.4, 0.95, .25, 1, 63F/64);
			t.addVertexWithUV(0.6, 0.95, .25,63F/64, 63F/64);
			t.addVertexWithUV(0.6, 0.95, .1, 63F/64, 1);
			
			t.addVertexWithUV(0.6, 0.75, .1, 63F/64, 1);
			t.addVertexWithUV(0.6, 0.75, .25,63F/64, 63F/64);
			t.addVertexWithUV(0.4, 0.75, .25, 1, 63F/64);
			t.addVertexWithUV(0.4, 0.75, .1, 1, 1);
			//End Prong North
			//Start Prong South
			t.addVertexWithUV(0.6, 0.95, .9, 1, 0);
			t.addVertexWithUV(0.4, 0.95, .9, 59F/64, 0);
			t.addVertexWithUV(0.4, 0.75, .9,59F/64, 5F/64);
			t.addVertexWithUV(0.6, 0.75, .9, 1, 5F/64);
			
			
			t.addVertexWithUV(0.4, 0.95, .9, 1, 1);		
			t.addVertexWithUV(0.4, 0.95, .75, 1, 63F/64);
			t.addVertexWithUV(0.4, 0.75, .75,63F/64, 63F/64);
			t.addVertexWithUV(0.4, 0.75, .9, 63F/64, 1);
			
			t.addVertexWithUV(0.6, 0.75, .9, 63F/64, 1);
			t.addVertexWithUV(0.6, 0.75, .75,63F/64, 63F/64);
			t.addVertexWithUV(0.6, 0.95, .75, 1, 63F/64);
			t.addVertexWithUV(0.6, 0.95, .9, 1, 1);
			
			
			
			t.addVertexWithUV(0.6, 0.95, .9, 63F/64, 1);
			t.addVertexWithUV(0.6, 0.95, .75,63F/64, 63F/64);
			t.addVertexWithUV(0.4, 0.95, .75, 1, 63F/64);
			t.addVertexWithUV(0.4, 0.95, .9, 1, 1);
			
			
			
			t.addVertexWithUV(0.4, 0.75, .9, 1, 1);
			t.addVertexWithUV(0.4, 0.75, .75, 1, 63F/64);
			t.addVertexWithUV(0.6, 0.75, .75,63F/64, 63F/64);
			t.addVertexWithUV(0.6, 0.75, .9, 63F/64, 1);
			//End Prong South
			//Start Top
			t.addVertexWithUV(.35, 1.1, .35, 1, 0);
			t.addVertexWithUV(.35, 1.1, .65, 59F/64, 0);
			t.addVertexWithUV(.65, 1.1, .65, 59F/64, 5F/64);
			t.addVertexWithUV(.65, 1.1, .35, 1, 5F/64);
			
			t.addVertexWithUV(.65, 1, .65, 1, 1);
			t.addVertexWithUV(.65, 1, .35, 1, 63F/64);
			t.addVertexWithUV(.65, 1.1, .35, 63F/64, 63F/64);
			t.addVertexWithUV(.65, 1.1, .65, 63F/64, 1);
			
			t.addVertexWithUV(.35, 1.1, .65, 63F/64, 1);
			t.addVertexWithUV(.35, 1.1, .35, 63F/64, 63F/64);
			t.addVertexWithUV(.35, 1, .35, 1, 63F/64);
			t.addVertexWithUV(.35, 1, .65, 1, 1);
			
			t.addVertexWithUV(.35, 1, .65, 63F/64, 1);
			t.addVertexWithUV(.65, 1, .65, 63F/64, 63F/64);
			t.addVertexWithUV(.65, 1.1, .65, 1, 63F/64);
			t.addVertexWithUV(.35, 1.1, .65, 1, 1);
			
			t.addVertexWithUV(.35, 1.1, .35, 1, 1);
			t.addVertexWithUV(.65, 1.1, .35, 1, 63F/64);
			t.addVertexWithUV(.65, 1, .35, 63F/64, 63F/64);
			t.addVertexWithUV(.35, 1, .35, 63F/64, 1);
			//END Top
			//Start base
			t.addVertexWithUV(.1, .1, .1, 1, 0);
			t.addVertexWithUV(.1, .1, .9, 63F/64, 0);
			t.addVertexWithUV(.25, .1, .9, 63F/64, 1F/64);
			t.addVertexWithUV(.25, .1, .1, 1, 1F/64);
			
			t.addVertexWithUV(.75, .1, .1, 1, 0);
			t.addVertexWithUV(.75, .1, .9, 63F/64, 0);
			t.addVertexWithUV(.9, .1, .9, 63F/64, 1F/64);
			t.addVertexWithUV(.9, .1, .1, 1, 1F/64);
			
			t.addVertexWithUV(.75, .1, .1, 1, 0);
			t.addVertexWithUV(.25, .1, .1, 63F/64, 0);
			t.addVertexWithUV(.25, .1, .25, 63F/64, 1F/64);
			t.addVertexWithUV(.75, .1, .25, 1, 1F/64);
			
			t.addVertexWithUV(.75, .1, .75, 1, 0);
			t.addVertexWithUV(.25, .1, .75, 63F/64, 0);
			t.addVertexWithUV(.25, .1, .9, 63F/64, 1F/64);
			t.addVertexWithUV(.75, .1, .9, 1, 1F/64);


			t.addVertexWithUV(.1, 0, .1, 1, 0);
			t.addVertexWithUV(.1, 0, .9, 63F/64, 0);
			t.addVertexWithUV(.1, .1, .9, 63F/64, 1F/64);
			t.addVertexWithUV(.1, .1, .1, 1, 1F/64);

            t.addVertexWithUV(.9, .1, .1, 1, 1F/64);
            t.addVertexWithUV(.9, .1, .9, 63F/64, 1F/64);
            t.addVertexWithUV(.9, 0, .9, 63F/64, 0);
            t.addVertexWithUV(.9, 0, .1, 1, 0);



			
			t.addVertexWithUV(.1, .1, .1, 1, 1F/64);
			t.addVertexWithUV(.9, .1, .1, 63F/64, 1F/64);
			t.addVertexWithUV(.9, 0, .1, 63F/64, 0);
			t.addVertexWithUV(.1, 0, .1, 1, 0);
			
			t.addVertexWithUV(.1, 0, .9, 1, 0);
			t.addVertexWithUV(.9, 0, .9, 63F/64, 0);
			t.addVertexWithUV(.9, .1, .9, 63F/64, 1F/64);
			t.addVertexWithUV(.1, .1, .9, 1, 1F/64);
			
			t.addVertexWithUV(.9, 0, .1, 1, 1F/64);
			t.addVertexWithUV(.9, 0, .9, 63F/64, 1F/64);
			t.addVertexWithUV(.1, 0, .9, 63F/64, 0);
			t.addVertexWithUV(.1, 0, .1, 1, 0);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		t.draw();
		GL11.glPopMatrix();
		

	}

}
