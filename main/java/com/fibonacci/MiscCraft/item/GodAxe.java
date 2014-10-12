package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Fibonacci on 6/7/14.
 */
public class GodAxe extends ItemAxe {

    public GodAxe(int i,ToolMaterial arg0) {
        super(arg0);
        this.setCreativeTab(MiscCraft.MiscCraftTab);

    }
    boolean enchant = false;

    public void onCreated(ItemStack i, World w, EntityPlayer p) {
        if (!i.isItemEnchanted()) {
            enchant = false;
        }

        if (!enchant) {
            i.addEnchantment(Enchantment.looting, 10);
            i.addEnchantment(Enchantment.unbreaking, 10);
            i.addEnchantment(Enchantment.efficiency, 10);
            enchant = true;
        }
    }
    public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p)
    {


        p.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 1750, 10));
        p.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1750, 10));
        p.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1750, 10));

        i.damageItem(5, p);

        return i;
    }
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal("item.GodAxe.desc");
    }



}
