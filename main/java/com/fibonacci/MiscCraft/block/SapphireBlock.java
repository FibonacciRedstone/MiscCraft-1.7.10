package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

/**
 * Created by Fibonacci on 6/7/14.
 */
public class SapphireBlock extends Block {

    public SapphireBlock(Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setHardness(4F);
        this.setResistance(5.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);



    }
    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ)
    {
        return true;
    }
}
