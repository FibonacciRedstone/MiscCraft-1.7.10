package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class NetherStarBlock extends Block{

	public NetherStarBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setCreativeTab(MiscCraft.MiscCraftTab);
		this.setHardness(4F);
		this.setResistance(5.0F);
		this.setLightLevel(1.0F);
		this.setHarvestLevel("pickaxe", 3);

		
	}



    public EnumRarity getRarity(ItemStack par1ItemStack)
    {
        return EnumRarity.epic;
    }
	public boolean canProvidePower()
    {
        return true;
    }

}
