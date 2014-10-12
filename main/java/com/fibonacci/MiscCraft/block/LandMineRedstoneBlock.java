package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class LandMineRedstoneBlock extends Block {

    public LandMineRedstoneBlock(Material m) {
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


        }
    }
        return true;


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




