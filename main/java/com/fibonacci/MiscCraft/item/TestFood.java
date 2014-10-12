package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class TestFood extends ItemFood
{
	private static final String __OBFID = "CL_00000037";

    public TestFood(int p_i45341_1_, float p_i45341_2_, boolean p_i45341_3_)
    {
        super(p_i45341_1_, p_i45341_2_, p_i45341_3_);
        this.setHasSubtypes(true);
        this.setAlwaysEdible();
        this.setCreativeTab(MiscCraft.MiscCraftTab);
    }


    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return par1ItemStack.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
    }

    protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 2400, 10));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2400, 10));
        }

        if (par1ItemStack.getItemDamage() > 0)
        {
            if (!par2World.isRemote)
            {
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 600, 10));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 6000, 10));
                par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 6000, 10));
            }
        }
        else
        {
            super.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        }
    }

    /**
     * returns a list of items with the same ID, but different meta (eg: dye returns 16 items)
     */
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item p_150895_1_, CreativeTabs p_150895_2_, List p_150895_3_)
    {
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 0));
        p_150895_3_.add(new ItemStack(p_150895_1_, 1, 1));
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal("item.TestFood.desc");
    }
}