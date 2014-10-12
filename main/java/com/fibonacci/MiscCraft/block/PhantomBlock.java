package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.Random;

import static com.fibonacci.MiscCraft.common.MiscCraft.WIPTab;

/**
 * Created by Fibonacci on 6/5/14.
 */
public class PhantomBlock extends Block
{
    @SideOnly(Side.CLIENT)


    private static final String __OBFID = "CL_00000190";

    public PhantomBlock()
    {
        super(Material.glass);
        this.setCreativeTab(WIPTab);
        this.setLightOpacity(0);
    }


    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     *
     */








    public boolean canCollideCheck(int p_149678_1_, boolean p_149678_2_) {

        return true;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }


boolean Active = false;

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public Block getBlockDropped(int i, Random random, int j)
    {
        return MiscCraft.PhantomBlock;
    }
    public void onNeighborBlockChange(World w, int x, int y, int z, Block b)
    {
        if (w.isBlockIndirectlyGettingPowered(x, y, z)){
            Active = true;
            w.setBlockToAir(x, y, z);

            System.out.println("Hi");

            }




    }
    

}
