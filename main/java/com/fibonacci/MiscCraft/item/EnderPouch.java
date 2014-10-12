package com.fibonacci.MiscCraft.item;


import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/1/14.
 */
public class EnderPouch extends Item{
    public EnderPouch(int i)  {
        this.setCreativeTab(MiscCraft.MiscCraftTab);
    }
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {   InventoryEnderChest inventoryenderchest = par3EntityPlayer.getInventoryEnderChest();
        par3EntityPlayer.displayGUIChest(inventoryenderchest);
        return par1ItemStack;
    }
}
