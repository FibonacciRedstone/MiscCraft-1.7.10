package com.fibonacci.MiscCraft.block.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityBeerStill extends TileEntity {
	public double ticks;
	 public void updateEntity() {
		 --ticks;
		 
		 
	 }
	 public void writeToNBT(NBTTagCompound nbt){
			super.writeToNBT(nbt);
			
			

			nbt.setDouble("Ticks", this.ticks);

			
		}
		
		public void readFromNBT(NBTTagCompound nbt){
			super.readFromNBT(nbt);
			
			
			this.ticks = nbt.getDouble("Ticks");
			System.out.println("Reading");
		}
}
