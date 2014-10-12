package com.fibonacci.MiscCraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Beer extends ItemFood{

	private EnumAction drink;
	public Beer(int arg0, boolean arg1) {
		super(arg0, arg1);
		this.setMaxDamage(60);
		this.setMaxStackSize(1);
		
		
	}
	
	public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p)
    {
		 i.damageItem(5, p);
		 int drunkiness = 100;
		 drunkiness = drunkiness*i.getItemDamage()/25;
		 
		 p.addPotionEffect(new PotionEffect(Potion.confusion.id, drunkiness, drunkiness));
		 p.addPotionEffect(new PotionEffect(Potion.blindness.id, drunkiness, drunkiness));
		 p.addPotionEffect(new PotionEffect(Potion.damageBoost.id, drunkiness, drunkiness));
        return i;
    }
	

}
