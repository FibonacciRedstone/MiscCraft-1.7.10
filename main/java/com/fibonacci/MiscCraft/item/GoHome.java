package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/1/14.
 */
public class GoHome extends Item{
    public GoHome (int i) {
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setMaxStackSize(1);
        this.setMaxDamage(100);
    }
    ChunkCoordinates bed;

    boolean safe = true;

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if (!par2World.isRemote) {
            bed = par3EntityPlayer.getBedLocation(par3EntityPlayer.dimension);

            Object cord = null;
            if (bed == cord) {
            par3EntityPlayer.addChatComponentMessage(new ChatComponentTranslation("gohome.message", new Object[0]));
            }
            if (bed != cord) {
                EntityPlayerMP e = (EntityPlayerMP) par3EntityPlayer;
                e.setPositionAndUpdate(bed.posX, bed.posY, bed.posZ);
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 150, 100));
                par1ItemStack.damageItem(1, par3EntityPlayer);
            }
        }


            return par1ItemStack;
        }

}
