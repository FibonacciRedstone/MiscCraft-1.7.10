package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

/**
 * Created by Fibonacci on 6/30/14.
 */
public class Fertilizer extends Block{
    public Fertilizer() {
        super(Material.ground);
        this.setCreativeTab(MiscCraft.WIPTab);
        this.setBlockBounds(0, 0 ,0, 1, 0.3F, 1);



    }
    public int onBlockPlaced(World w, int x, int y, int z, int d, float x2, float y2, float z2, int meta)
    {
        if(!w.isRemote) {
            w.setBlock(x, y-1, z, Blocks.farmland);
            w.setBlockMetadataWithNotify(x, y-1, z, 7, 2);
            System.out.println("Placed");
        }
        return 0;
    }


}
