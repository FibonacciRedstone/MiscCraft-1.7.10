package com.fibonacci.MiscCraft.block.tileentity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;

import java.util.List;

/**
 * Created by Fibonacci on 10/26/14.
 */
public class TileEntityMobSpawnBlocker extends TileEntity {
    private AxisAlignedBB boundingbox = AxisAlignedBB.getBoundingBox(-3.0D, 0.0D, -3.0D, 3.0D, 3.0D, 3.0D);
    ;

    //private EntityMob mob;
//    private double differenceX = mob.posX - this.xCoord;
//    private double differenceY = mob.posY - this.yCoord;
//    private double differenceZ = mob.posZ - this.zCoord;


    public TileEntityMobSpawnBlocker() {

    }

    public void updateEntity(){
        if(worldObj.isBlockIndirectlyGettingPowered(xCoord, yCoord, zCoord)){
//            if(differenceX <= 3 || differenceX >= -3){
//                worldObj.removeEntity(mob);
//            }
//            if(differenceY <= 3 || differenceX >= -3){
//                worldObj.removeEntity(mob);
//            }
//            if(differenceZ <= 3 || differenceX >= -3){
//                worldObj.removeEntity(mob);
//            }
            //System.out.println(getEntity());

        }
    }
    public List<EntityMob> getEntity(){
        return worldObj.getEntitiesWithinAABB(EntityMob.class, boundingbox);
    }
}
