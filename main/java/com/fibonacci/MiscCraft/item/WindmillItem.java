package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 7/1/14.
 */
public class WindmillItem extends Item{
	public int d;
	public WindmillItem(){
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}
	
	public boolean onItemUse(ItemStack i, EntityPlayer p, World w, int x, int y, int z, int side, float x2, float y2, float z2)
    {
		
			if(side == 1 && w.getBlock(x, y, z).equals(MiscCraft.WindmillFloor)){
				boolean nospace = false;
				
				for(int x1 = -1; x1 < 1; x1++){
					for(int z1 = -1; z1 < 1; z1++){
						for(int y1 = 0; y1 < 7; y1++){
							if(!w.isAirBlock(x+x1, y+y1+1, z+z1)) nospace = true;
						}
					}
				}
				if(!nospace && w.canBlockSeeTheSky(x, y, z)){
					if(!w.isRemote){
					if(w.getBlockMetadata(x, y, z) == 5){
					
					for(int y1 = 0; y1 < 7; y1++){
						w.setBlock(x, y+y1+1, z, MiscCraft.WindmillBlock, (y1+1), 2);
						
					}
					}
//					if(w.getBlockMetadata(x, y, z) == 1){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x-1, y+y1+1, z-1, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 2){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x-1, y+y1+1, z, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 3){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x-1, y+y1+1, z+1, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 4){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x, y+y1+1, z-1, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 6){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x, y+y1+1, z+1, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 7){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x+1, y+y1+1, z-1, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 8){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x+1, y+y1+1, z, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}
//					if(w.getBlockMetadata(x, y, z) == 9){
//						
//						for(int y1 = 0; y1 < 7; y1++){
//							w.setBlock(x+1, y+y1+1, z+1, MiscCraft.WindmillBlock, (y1+1), 2);
//							
//						}
//						}


					}
					--i.stackSize;
			
			} else{
				p.addChatComponentMessage(new ChatComponentTranslation("Not Enough Space Or You are Not Outside", new Object[0]));

			}
				if(!w.isRemote){
					float direction = -(p.rotationYaw/90);
//					if(direction < 2)direction = -(direction);
					System.out.println(direction);
				
				if((direction >= 0.75 && direction <1.29) || (direction >= -3.95 && direction < -2.7)){
					w.setBlockMetadataWithNotify(x, y+7, z, 10, 2);
					
				}
				if((direction >= -0.26 && direction <0.25) || direction < -3.95){
					w.setBlockMetadataWithNotify(x, y+7, z, 8, 2);
					
				}
				if((direction >= 1.7 && direction <2.15) || (direction < -1.9 && direction >= -2.3)){
					w.setBlockMetadataWithNotify(x, y+7, z, 9, 2);
					
				}
				if((direction >= -1.3 && direction <-0.73) || (direction >= 2.82 && direction < 3.26)){
					w.setBlockMetadataWithNotify(x, y+7, z, 11, 2);
					
				}
				 
				

				 }
				 
				}
				
			
		
        return true;
    }
	public boolean isFull3D()
    {
        return false;
    }
	
	
}
