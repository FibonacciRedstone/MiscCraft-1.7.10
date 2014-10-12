package com.fibonacci.MiscCraft.item.armor;

/**
 * Created by Fibonacci on 6/6/14.
 */

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class EmeraldArmor extends ItemArmor{

    public EmeraldArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
                     int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(stack.getItem() == MiscCraft.EmeraldHelmet || stack.getItem() == MiscCraft.EmeraldChestplate || stack.getItem() == MiscCraft.EmeraldBoots) {
            return "MiscCraft:textures/models/armor/emeraldarmor_1.png";
        }



        if(stack.getItem() == MiscCraft.EmeraldLeggings) {
            return "MiscCraft:textures/models/armor/emeraldarmor_2.png";
        }

        else return null;



    }




}

