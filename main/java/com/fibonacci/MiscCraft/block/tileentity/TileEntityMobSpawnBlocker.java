package com.fibonacci.MiscCraft.block.tileentity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

/**
 * Created by Fibonacci on 10/26/14.
 */
public class TileEntityMobSpawnBlocker extends TileEntity {
    private AxisAlignedBB boundingbox;
    private EntityMob entity;
    public TileEntityMobSpawnBlocker() {
        this.boundingbox = AxisAlignedBB.getBoundingBox(-3.0D, 0.0D, -3.0D, 3.0D, 3.0D, 3.0D);
        entity = (EntityMob) worldObj.getEntitiesWithinAABB(EntityMob.class, boundingbox);
    }

    public void updateEntity(){
        if(worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord)){
            System.out.println(entity);
        }
    }
}
