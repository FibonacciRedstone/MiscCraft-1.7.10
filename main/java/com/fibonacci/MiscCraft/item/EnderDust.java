package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnderDust extends Item{
	public EnderDust(int i)  {
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}

	public boolean onItemUse(ItemStack i ,EntityPlayer p, World world, int x, int y, int z, int side, float x2, float y2, float z2) {
		if(!world.isRemote){

			if(side == 1) 
				 world.spawnEntityInWorld(new EntityTNTPrimed(world, x, y-2, z, p));
			if (!p.capabilities.isCreativeMode)
            {
                --i.stackSize;
            }
}
		return true;
	}
}
