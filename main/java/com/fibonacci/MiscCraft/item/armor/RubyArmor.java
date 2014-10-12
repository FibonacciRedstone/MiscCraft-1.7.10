package com.fibonacci.MiscCraft.item.armor;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor{

	public RubyArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == MiscCraft.RubyHelmet || stack.getItem() == MiscCraft.RubyChestplate || stack.getItem() == MiscCraft.RubyBoots) {
			return "MiscCraft:textures/models/armor/rubyarmor_1.png";
		}
		
		
	
	if(stack.getItem() == MiscCraft.RubyLeggings) {
		return "MiscCraft:textures/models/armor/rubyarmor_2.png";
	}
		
	else return null;
		
		
		
	}
	
	
	
	
}
