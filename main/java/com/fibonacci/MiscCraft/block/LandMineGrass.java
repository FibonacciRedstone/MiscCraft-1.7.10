package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class LandMineGrass extends Block{

    public LandMineGrass(Material m) {
        super(m);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setBlockBounds(0, 0, 0, 1, 0.00000000000000000000001F, 1);
        this.setHardness(-1F);
        this.setLightLevel(1F);


    }
    public boolean isOpaqueCube()
    {
        return false;
    }


    boolean BOOM = false;

    boolean Disabled = false;



    public boolean renderAsNormalBlock(){
        return false;
    }
    public int getRenderType(){
        return 0;
    }


    public boolean onBlockActivated(World w, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {if(!w.isRemote){
        if(p.getCurrentEquippedItem().getItem() == MiscCraft.Disabler){
            w.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
            p.getCurrentEquippedItem().damageItem(1, p);
            Disabled = true;


        }
    }
        return true;


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






    public void onEntityCollidedWithBlock(World w, int x, int y, int z, Entity e) {
        if(w.isRemote){

            w.createExplosion(e, e.posX, e.posY+1, e.posZ, 100.0F, false);
            BOOM = true;
            w.spawnParticle("reddust", 10, 10, 13, 14, 15, 16);
        }
        if(BOOM=true){

            e.attackEntityFrom(DamageSource.outOfWorld, 100.0F);
            if(w.getBlock(x, y, z).equals(MiscCraft.LandMine)){

                w.setBlockToAir(x, y, z);
            }


        }
    }
    public boolean canProvidePower()
    {
        return true;
    }

}




