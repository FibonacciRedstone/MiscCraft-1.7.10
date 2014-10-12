package com.fibonacci.MiscCraft.block;

import net.minecraft.block.BlockStone;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fibonacci on 6/18/14.
 */
public class CustomBlockDrops extends BlockStone {
    private static final String __OBFID = "CL_00000317";

    public CustomBlockDrops()
    {
        super();
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.cobblestone);
    }
}
