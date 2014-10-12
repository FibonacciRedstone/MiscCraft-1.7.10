package com.fibonacci.MiscCraft.item.armor;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/7/14.
 */
public class GodArmor extends ItemArmor {

    public GodArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
                    int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);

        this.setCreativeTab(MiscCraft.MiscCraftTab);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (stack.getItem() == MiscCraft.GodHelmet || stack.getItem() == MiscCraft.GodChestplate || stack.getItem() == MiscCraft.GodBoots) {
            return "MiscCraft:textures/models/armor/godarmor_1.png";
        }
        if (stack.getItem() == MiscCraft.GodLeggings) {
            return "MiscCraft:textures/models/armor/godarmor_2.png";
        } else return null;


    }


    boolean enchant = false;



        public void onCreated(ItemStack i, World w, EntityPlayer p) {
            if (!i.isItemEnchanted() == true) {
                enchant = false;
            }

            if (enchant == false) {
                i.addEnchantment(Enchantment.aquaAffinity, 10);
                i.addEnchantment(Enchantment.blastProtection, 10);
                i.addEnchantment(Enchantment.featherFalling, 10);
                i.addEnchantment(Enchantment.projectileProtection, 10);
                i.addEnchantment(Enchantment.protection, 10);
                i.addEnchantment(Enchantment.respiration, 3);
                i.addEnchantment(Enchantment.unbreaking, 10);
                enchant = true;
            }
        }


}