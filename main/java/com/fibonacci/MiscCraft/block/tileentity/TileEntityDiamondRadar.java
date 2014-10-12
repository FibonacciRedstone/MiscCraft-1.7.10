package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

public class TileEntityDiamondRadar extends TileEntity {
	
	public int rotation;
	public double rotation1;
	public double rotation2;
	public int orefound;
	
	public void updateEntity(){
		
		rotation1++;
		rotation2++;
		rotation = (int) ((rotation1*2F) + (rotation2*1.5F));
		//System.out.println(rotation);
		
		for(int y1 = 0; y1 < 256; y1++){
			
			for(int x2 =0; x2 < 3; x2++){
				for(int z2 = 0; z2 <3; z2++){
					
					
				
			
			for(int x3 = 0; x3 <3; x3++){
				for(int z3 = 0; z3 <3; z3++){
					
					
								
					
				
			
				if(this.worldObj.getBlock(xCoord+x2-x3, y1, zCoord+z2-z3).equals(Blocks.diamond_ore)){
				orefound = orefound+1;
				
				}
				
				
				
			
				 //this.worldObj.setBlockToAir(xCoord+x2-x3, y1, zCoord+z2-z3);
		}
			}
				}
			}
		}
		
		
		
		
	}
}
