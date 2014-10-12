package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.tileentity.TileEntity;

public class TileEntityWindmillFloor extends TileEntity {
	
	

	public void updateEntity(){
		int meta = worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
		int plusx = worldObj.getBlockMetadata(xCoord+1, yCoord, zCoord);
		int minusx = worldObj.getBlockMetadata(xCoord-1, yCoord, zCoord);
		int plusz = worldObj.getBlockMetadata(xCoord, yCoord, zCoord+1);
		int minusz = worldObj.getBlockMetadata(xCoord+1, yCoord, zCoord-1);
		int plusplus = worldObj.getBlockMetadata(xCoord+1, yCoord, zCoord+1);
		int minusminus = worldObj.getBlockMetadata(xCoord-1, yCoord, zCoord-1);
		int plusminus = worldObj.getBlockMetadata(xCoord+1, yCoord, zCoord-1);
		int minusplus = worldObj.getBlockMetadata(xCoord-1, yCoord, zCoord+1);
		
		
		if(meta == 1 && !(minusminus == 5))metazero();
		if(meta == 2 && !(minusx == 5 && minusminus == 6 && minusplus == 4))metazero();
		if(meta == 3 && !(minusplus == 5))metazero();
		if(meta == 4 && !(plusminus == 2 && minusminus == 8))metazero();
		if(meta == 5 && !(minusminus == 9 && plusplus == 1 && plusminus == 3 && minusplus == 7))metazero();
		if(meta == 6 && !(minusplus == 8 && plusplus == 2))metazero();
		if(meta == 7 && !(plusminus == 5))metazero();
		if(meta == 8 && !(plusplus == 4 && plusminus == 6))metazero();
		if(meta == 9 && !(plusplus == 5))metazero();
		
		
		
		
		
		
		
	}
	public void metazero(){
		worldObj.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, 0, 2);
	}
}
