package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.BlockOre;
import net.minecraft.item.Item;

import java.util.Random;

public class AntiOre extends BlockOre {

	public AntiOre(int i) {

		this.setCreativeTab(MiscCraft.MiscCraftTab);
		this.setHardness(4F);
		this.setResistance(5.0F);
		this.setLightLevel(0F);
		this.setHarvestLevel("pickaxe", 7);
		
		
	}
    public Item getItemDropped(int i, Random random, int j)
    {
        return MiscCraft.AntiMetalNugget;
    }
    
    public int quantityDropped(Random rand){
    	return rand.nextInt(1) + 1;
    }



}
