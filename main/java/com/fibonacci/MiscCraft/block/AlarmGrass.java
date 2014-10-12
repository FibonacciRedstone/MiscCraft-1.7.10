package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class AlarmGrass extends Block{

    public AlarmGrass(Material i) {
        super(i);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setBlockBounds(0, 0, 0, 1, 0.00000000000000000000001F, 1);
        this.setLightLevel(1F);


    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    protected Random rand;

    boolean BOOM = false;



    public boolean renderAsNormalBlock(){
        return true;
    }

    public void onEntityCollidedWithBlock(World w, int x, int y, int z, Entity e) {
        if(w.isRemote){

            BOOM = true;
            w.spawnParticle("reddust", 10, 10, 13, 14, 15, 16);
        }
        if(BOOM=true){

            w.playSoundAtEntity(e, "mob.ghast.moan", 1F, 1F);
            if(w.getBlock(x, y, z).equals(MiscCraft.AlarmGrass)){
                w.setBlock(x, y-1, z, Blocks.obsidian);
                w.setBlock(x, y+2, z, Blocks.obsidian);
                w.setBlockToAir(x, y, z);
                w.setBlock(x+1, y, z, Blocks.obsidian);
                w.setBlock(x-1, y, z, Blocks.obsidian);
                w.setBlock(x, y, z+1, Blocks.obsidian);
                w.setBlock(x, y, z-1, Blocks.obsidian);
                w.setBlock(x+2, y, z, Blocks.obsidian);
                w.setBlock(x-2, y, z, Blocks.obsidian);
                w.setBlock(x, y, z+2, Blocks.obsidian);
                w.setBlock(x, y, z-2, Blocks.obsidian);
                //
                w.setBlock(x+1, y, z+1, Blocks.obsidian);
                w.setBlock(x+1, y, z-1, Blocks.obsidian);
                w.setBlock(x-1, y, z-1, Blocks.obsidian);
                w.setBlock(x-1, y, z+1, Blocks.obsidian);

                w.setBlock(x+1, y+2, z, Blocks.obsidian);
                w.setBlock(x-1, y+2, z, Blocks.obsidian);
                w.setBlock(x, y+2, z-1, Blocks.obsidian);
                w.setBlock(x, y+2, z+1, Blocks.obsidian);
            }




        }
    }
    public boolean onBlockActivated(World w, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {if(!w.isRemote){
        if(p.getCurrentEquippedItem().getItem() == MiscCraft.Disabler){
            w.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
            p.getCurrentEquippedItem().damageItem(1, p);


        }
    }
        return true;


    }
    public boolean canProvidePower()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = 0.5D;
        double d1 = 1.0D;
        return ColorizerGrass.getGrassColor(d0, d1);
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return this.getBlockColor();
    }
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        int l = 0;
        int i1 = 0;
        int j1 = 0;

        for (int k1 = -1; k1 <= 1; ++k1)
        {
            for (int l1 = -1; l1 <= 1; ++l1)
            {
                int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l1, p_149720_4_ + k1).getBiomeGrassColor(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
                l += (i2 & 16711680) >> 16;
                i1 += (i2 & 65280) >> 8;
                j1 += i2 & 255;
            }
        }

        return (l / 9 & 255) << 16 | (i1 / 9 & 255) << 8 | j1 / 9 & 255;
    }

}





