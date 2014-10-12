package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Fibonacci on 6/7/14.
 */
public class GodHoe extends ItemHoe {

    public GodHoe(int i,ToolMaterial p_i45356_1_) {
        super(p_i45356_1_);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
    }
boolean enchant = false;

    public void onCreated(ItemStack i, World w, EntityPlayer p) {
        if (!i.isItemEnchanted()) {
            enchant = false;
        }

        if (!enchant) {
            i.addEnchantment(Enchantment.fortune, 10);
            i.addEnchantment(Enchantment.unbreaking, 10);
            i.addEnchantment(Enchantment.efficiency, 10);
            enchant = true;
        }
    }

    public ItemStack onItemRightClick(ItemStack i, World w, EntityPlayer p) {




        p.addPotionEffect(new PotionEffect(Potion.invisibility.id, 1750, 10));
        p.addPotionEffect(new PotionEffect(Potion.resistance.id, 1750, 10));
        p.addPotionEffect(new PotionEffect(Potion.nightVision.id, 1750, 10));

        i.damageItem(5, p);
         enchant = true;

        if (!w.isRemote) {
            if (p.isSneaking()) {
                EntityLargeFireball entityLargeFireball = new EntityLargeFireball(w);
                entityLargeFireball.setLocationAndAngles(p.posX, p.posY+1, p.posZ, p.rotationYaw, p.rotationPitch);
                entityLargeFireball.setPosition(p.posX, p.posY+1, p.posZ);



                entityLargeFireball.accelerationX = 0;
                entityLargeFireball.accelerationY = 0;
                entityLargeFireball.accelerationZ = 0;

                w.spawnEntityInWorld(entityLargeFireball);
                i.damageItem(10, p);
            }
        }

            return i;
        }

    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal("item.GodHoe.desc");
    }

}