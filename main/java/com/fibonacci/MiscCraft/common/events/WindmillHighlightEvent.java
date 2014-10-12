package com.fibonacci.MiscCraft.common.events;

import org.lwjgl.opengl.GL11;

import com.fibonacci.MiscCraft.block.WindmillFloor;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraftforge.client.event.DrawBlockHighlightEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class WindmillHighlightEvent {
	@SubscribeEvent
	public void onDrawHighlight(DrawBlockHighlightEvent e){
		if(e.target.typeOfHit.equals(MovingObjectType.BLOCK)){
			if(e.player.worldObj.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ).equals(MiscCraft.WindmillBlock) && e.player.worldObj.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ) < 7){        					
				highlightWindmill(e);	
			}
			if(e.player.worldObj.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ).equals(MiscCraft.SystemLights)){        					
				//System.out.println(e.player.worldObj.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ));
			}
			if(e.player.worldObj.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ).equals(MiscCraft.WindmillFloor)){   
				WindmillFloor floor = (WindmillFloor) e.player.worldObj.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ);
 //				System.out.println(floor.markedDirty(e.player.worldObj, e.target.blockX, e.target.blockY, e.target.blockZ));
				//System.out.println(e.player.worldObj.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ));
				if(e.player.worldObj.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ) > 0){
				highlightFloor(e);
				}
			}
		}
	}
	public void highlightWindmill(DrawBlockHighlightEvent e){
		
		
		
		e.setCanceled(true);
		Block b = e.player.worldObj.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ);
		b.setBlockBoundsBasedOnState(e.player.worldObj, e.target.blockX, e.target.blockY, e.target.blockZ);
		double x = e.player.lastTickPosX + (e.player.posX - e.player.lastTickPosX)*e.partialTicks;
		double y = e.player.lastTickPosY + (e.player.posY - e.player.lastTickPosY)*e.partialTicks;
		double z = e.player.lastTickPosZ + (e.player.posZ - e.player.lastTickPosZ)*e.partialTicks;
		float f = 0.002F;
		AxisAlignedBB bounds  = b.getSelectedBoundingBoxFromPool(e.player.worldObj, e.target.blockX, e.target.blockY, e.target.blockZ).expand(f, f, f).getOffsetBoundingBox(-x, -y, -z);
		int meta = e.player.worldObj.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ);
		
		
		GL11.glEnable(GL11.GL_BLEND);
		OpenGlHelper.glBlendFunc(770, 771, 1, 0);
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glColor4f(0, 0, 0, 0.4F);
		GL11.glLineWidth(2F);
		GL11.glDepthMask(false);
		
		Tessellator t = Tessellator.instance;
		t.startDrawing(GL11.GL_LINES);
		
		{
			t.addVertex(bounds.minX, bounds.minY+(7-meta), bounds.minZ);
			t.addVertex(bounds.minX, bounds.maxY-meta, bounds.minZ);
			
			t.addVertex(bounds.maxX, bounds.minY+(7-meta), bounds.minZ);
			t.addVertex(bounds.maxX, bounds.maxY-meta, bounds.minZ);
			
			t.addVertex(bounds.maxX, bounds.minY+(7-meta), bounds.maxZ);
			t.addVertex(bounds.maxX, bounds.maxY-meta, bounds.maxZ);
			
			t.addVertex(bounds.minX, bounds.minY+(7-meta), bounds.maxZ);
			t.addVertex(bounds.minX, bounds.maxY-meta, bounds.maxZ);
		}
		t.draw();
		GL11.glDepthMask(true);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glDisable(GL11.GL_BLEND);
	}
public void highlightFloor(DrawBlockHighlightEvent e){
		
		
		
		e.setCanceled(true);
//		Block b = e.player.worldObj.getBlock(e.target.blockX, e.target.blockY, e.target.blockZ);
//		b.setBlockBoundsBasedOnState(e.player.worldObj, e.target.blockX, e.target.blockY, e.target.blockZ);
//		double x = e.player.lastTickPosX + (e.player.posX - e.player.lastTickPosX)*e.partialTicks;
//		double y = e.player.lastTickPosY + (e.player.posY - e.player.lastTickPosY)*e.partialTicks;
//		double z = e.player.lastTickPosZ + (e.player.posZ - e.player.lastTickPosZ)*e.partialTicks;
//		float f = 0.002F;
//		AxisAlignedBB bounds  = b.getSelectedBoundingBoxFromPool(e.player.worldObj, e.target.blockX, e.target.blockY, e.target.blockZ).expand(f, f, f).getOffsetBoundingBox(-x, -y, -z);
//		int meta = e.player.worldObj.getBlockMetadata(e.target.blockX, e.target.blockY, e.target.blockZ);
//		
//		
//		GL11.glEnable(GL11.GL_BLEND);
//		OpenGlHelper.glBlendFunc(770, 771, 1, 0);
//		GL11.glDisable(GL11.GL_TEXTURE_2D);
//		GL11.glColor4f(0, 0, 0, 0.4F);
//		GL11.glLineWidth(2F);
//		GL11.glDepthMask(false);
//		
//		Tessellator t = Tessellator.instance;
//		t.startDrawing(GL11.GL_LINES);
//		
//		{
//			t.addVertex(bounds.minX, bounds.minY+(7-meta), bounds.minZ);
//			t.addVertex(bounds.minX, bounds.maxY-meta, bounds.minZ);
//			
//			t.addVertex(bounds.maxX, bounds.minY+(7-meta), bounds.minZ);
//			t.addVertex(bounds.maxX, bounds.maxY-meta, bounds.minZ);
//			
//			t.addVertex(bounds.maxX, bounds.minY+(7-meta), bounds.maxZ);
//			t.addVertex(bounds.maxX, bounds.maxY-meta, bounds.maxZ);
//			
//			t.addVertex(bounds.minX, bounds.minY+(7-meta), bounds.maxZ);
//			t.addVertex(bounds.minX, bounds.maxY-meta, bounds.maxZ);
//		}
//		t.draw();
//		GL11.glDepthMask(true);
//		GL11.glEnable(GL11.GL_TEXTURE_2D);
//		GL11.glDisable(GL11.GL_BLEND);
	}
	
	
}
