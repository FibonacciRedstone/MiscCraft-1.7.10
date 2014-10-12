package com.fibonacci.MiscCraft.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class EnderDragonSpawnEgg extends Item{
	public EnderDragonSpawnEgg(int i)  {
		this.setCreativeTab(CreativeTabs.tabMisc);

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
                EntityDragon entityDragon = new EntityDragon(par3World);
                entityDragon.setLocationAndAngles(par4, par5, par6, 1f, 1f);
                par3World.spawnEntityInWorld(entityDragon);

                if (!par2EntityPlayer.capabilities.isCreativeMode)
                {
                    --par1ItemStack.stackSize;
                }
            }
            return true;
        }
    }

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal("item.EnderDragonSpawnEgg.desc");
    }
}
