package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityBullSummonBlock extends TileEntity {
	public static float centerrotate = 0;
	public static float centerrotate1 = 0;
	public static float centerrotate2 = 0;
	
	public void updateEntity(){
		centerrotate1++;
		centerrotate2++;
		centerrotate = (centerrotate1 + centerrotate2)*this.blockMetadata;
		
		
		int totalblocks = 0;
    	if(this.getWorldObj().getBlock(this.xCoord+1, this.yCoord, this.zCoord).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord-1, this.yCoord, this.zCoord).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord, this.yCoord, this.zCoord+1).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord, this.yCoord, this.zCoord-1).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord+1, this.yCoord, this.zCoord+1).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord-1, this.yCoord, this.zCoord-1).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord+1, this.yCoord, this.zCoord-1).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord-1, this.yCoord, this.zCoord+1).equals(Blocks.gold_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	
    	if(this.getWorldObj().getBlock(this.xCoord, this.yCoord-1, this.zCoord).equals(MiscCraft.PlatinumBlock)){
    		totalblocks = totalblocks  + 1;
    	}
    	
    	if(this.getWorldObj().getBlock(this.xCoord, this.yCoord-1, this.zCoord+1).equals(Blocks.diamond_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord, this.yCoord-1, this.zCoord-1).equals(Blocks.diamond_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord+1, this.yCoord-1, this.zCoord+1).equals(Blocks.diamond_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord-1, this.yCoord-1, this.zCoord-1).equals(Blocks.diamond_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord+1, this.yCoord-1, this.zCoord-1).equals(Blocks.diamond_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	if(this.getWorldObj().getBlock(this.xCoord-1, this.yCoord-1, this.zCoord+1).equals(Blocks.diamond_block)){
    		totalblocks = totalblocks  + 1;
    	}
    	
    	this.getWorldObj().setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, totalblocks, 2);
    }
		
	}


