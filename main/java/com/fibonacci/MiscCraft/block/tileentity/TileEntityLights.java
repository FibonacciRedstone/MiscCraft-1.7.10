package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.block.SystemLights;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class TileEntityLights extends TileEntity {
	
	public void updateEntity() {
		if(!worldObj.isRemote){
		SystemLights light = (SystemLights) this.worldObj.getBlock(xCoord, yCoord, zCoord);
		Block b = worldObj.getBlock(xCoord, yCoord+1, zCoord);
		if(worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord)){
			
    		//worldObj.setBlock(xCoord, yCoord+1, zCoord, b);
			light.on = true;
			//System.out.println(light.on);
			worldObj.setBlock(xCoord, yCoord+1, zCoord, Blocks.cobblestone);
			
		}else{
			light.on = false;
			//worldObj.setBlock(xCoord, yCoord+1, zCoord, Blocks.cobblestone);
//    		worldObj.setBlock(xCoord, yCoord+1, zCoord, b);
		}
		if(light.on){
    		light.setLightLevel(1);
    		
    		
    	}else{
    		light.setLightLevel(0);
    		
    	}
//		System.out.println(light.on);
		}
}
}
