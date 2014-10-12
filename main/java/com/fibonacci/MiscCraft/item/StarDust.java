package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class StarDust extends Item{
	
	public StarDust(int i) {
		this.setCreativeTab(MiscCraft.MiscCraftTab);
		
	}
	public boolean onItemUse(ItemStack i, EntityPlayer p, World world, int x, int y, int z, int side, float x2, float y2, float z2) {
		if(!world.isRemote){

			if(side == 1) 
				
				 world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z));
			world.spawnParticle("hugeexplosion", 0.0D, 0.0D, 0.0D, x, y, z);
			
			if (!p.capabilities.isCreativeMode)
            {
                --i.stackSize;
            }
}
		return true;
	}


}


