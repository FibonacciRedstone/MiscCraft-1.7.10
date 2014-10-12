package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/8/14.
 */
public class FlightGiver extends Item {
    public FlightGiver(int i)  {
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setMaxDamage(50);
        this.setMaxStackSize(10);
    }



    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {

        par3EntityPlayer.capabilities.allowFlying = true;
        par1ItemStack.damageItem(2, par3EntityPlayer);




        return par1ItemStack;

    }
}
