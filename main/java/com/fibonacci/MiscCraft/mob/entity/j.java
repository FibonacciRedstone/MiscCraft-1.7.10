package com.fibonacci.MiscCraft.mob.entity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;

public class j {
	public void onPlayerDeathEvent(EntityPlayer p){
		if(p.isDead){
			 
             ChunkCoordinates chunkcoordinates = p.getPlayerCoordinates();
             p.setSpawnChunk(chunkcoordinates, true);
		}
		
		
	}

}
