package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import com.fibonacci.MiscCraft.mob.entity.EntityBullBoss;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SpawnTamableBull extends Item{
	

	public SpawnTamableBull(int i)  {
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 == 0)
        {
            --par5;
        }

        if (par7 == 1)
        {
            ++par5;
        }

        if (par7 == 2)
        {
            --par6;
        }

        if (par7 == 3)
        {
            ++par6;
        }

        if (par7 == 4)
        {
            --par4;
        }

        if (par7 == 5)
        {
            ++par4;
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            if (!par3World.isRemote)
            {
                EntityBullBoss entitypigzombie = new EntityBullBoss(par3World);
                entitypigzombie.setLocationAndAngles(par4, par5, par6, 1 , 1);
                par3World.spawnEntityInWorld(entitypigzombie);

                if (!par2EntityPlayer.capabilities.isCreativeMode)
                {
                    --par1ItemStack.stackSize;
                }
            }
            return true;
        }
    }



}