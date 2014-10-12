package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class QQQQ extends Item{
	public QQQQ(int i)  {
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        }
	 public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p) {
	        if (!w.isRemote) {
	        	
	          int v = w.rand.nextInt(6);
	          if(v == 1){
	        	  p.dropItem(MiscCraft.PlatinumIngot, 2);
	          }
	          if(v == 2){
	        	  p.addPotionEffect(new PotionEffect(Potion.blindness.id, 1000, 5));
	          }
	          if(v == 3){
	        	  p.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1000, 5));
	          }
	          if(v == 4){
	        	  p.heal(v);
	          }
	          if(v == 5){
	        	  p.travelToDimension(1);         
	        	  }
	          if(v == 6){
	        	  p.setCurrentItemOrArmor(1, new ItemStack(MiscCraft.RubyHelmet));
	          }

	        }
	            return i;
	        }
}


