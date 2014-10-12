package com.fibonacci.MiscCraft.item.armor;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SapphireArmor extends ItemArmor{

	public SapphireArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == MiscCraft.SapphireHelmet || stack.getItem() == MiscCraft.SapphireChestplate || stack.getItem() == MiscCraft.SapphireBoots) {
			return "MiscCraft:textures/models/armor/sapphirearmor_1.png";
		}
		
		
	
	if(stack.getItem() == MiscCraft.SapphireLeggings) {
		return "MiscCraft:textures/models/armor/sapphirearmor_2.png";
	}
		
	else return null;
		
		
		
	}
	
	
	
	
}
