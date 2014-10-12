package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/7/14.
 */
public class PlatinumBlock extends Block {

    public PlatinumBlock(Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setHardness(4F);
        this.setResistance(5.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 3);


    }

    public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
        return true;
    }

    //    int damage;
//    public boolean isProvidingEnergy(World w, Block b, int x, int y, int z) {
//        if (!w.isRemote) {
//            damage = b.getDamageValue(w, x, y, z);
//            if (w.getBlockMetadata(x, y, z) <=  1) {
//                w.setBlockMetadataWithNotify(x, y, z, damage, 1);
//
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//    public int damageDropped(int p_149692_1_)
//    {
//
//        return 200;
//    }
//
//
    public void onEntityCollidedWithBlock(World w, int x, int y, int z, Entity e) {


    }
}


