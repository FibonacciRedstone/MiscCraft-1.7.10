package com.fibonacci.MiscCraft.item.armor;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AntiMetalArmor extends ItemArmor{

	public AntiMetalArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == MiscCraft.AntiMetalHelmet || stack.getItem() == MiscCraft.AntiMetalChestplate || stack.getItem() == MiscCraft.AntiMetalBoots) {
            return "MiscCraft:textures/models/armor/antimetalarmor_1.png";
        }
        if (stack.getItem() == MiscCraft.AntiMetalLeggings) {
            return "MiscCraft:textures/models/armor/antimetalarmor_2.png";
        } else return null;
    }
			
			

		
		

	}


