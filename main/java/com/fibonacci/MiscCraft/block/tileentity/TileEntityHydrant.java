package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.block.FireHydrant;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityHydrant extends TileEntity {
	
	
	public void updateEntity(){
		if(!worldObj.isRemote){
			FireHydrant fire = (FireHydrant) worldObj.getBlock(xCoord, yCoord, zCoord);
			
		if(worldObj.getBlock(xCoord, yCoord-1, zCoord).equals(Blocks.water)){
			fire.haswater = true;
		}else{
			fire.haswater = false;
		}
		
	}
	}
	public void readFromNBT(NBTTagCompound nbt)
    {
		if(!worldObj.isRemote){
			FireHydrant fire = (FireHydrant) worldObj.getBlock(xCoord, yCoord, zCoord);
		
		super.readFromNBT(nbt);
		fire.haswater = nbt.getBoolean("HasWater");
		}
    }

    public void writeToNBT(NBTTagCompound nbt)
    {
    	if(!worldObj.isRemote){
    	FireHydrant fire = (FireHydrant) worldObj.getBlock(xCoord, yCoord, zCoord);
    	super.writeToNBT(nbt);
    	nbt.setBoolean("HasWater", fire.haswater);
    	}
    }

}
