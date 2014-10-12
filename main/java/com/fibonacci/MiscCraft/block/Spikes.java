package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Spikes extends Block {
	EntityItem item;
    public Spikes(Material m) {
        super(m);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setBlockBounds(0, 0, 0, 1, .00000000000000001F, 1);

    }

    public int getRenderType() {
        return 1;
    }

    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }


    public void onEntityCollidedWithBlock(World w, int x, int y, int z, Entity e) {


//            e.travelToDimension(-2)                                                                                                                                              );
//            System.out.println(e.dimension);





    if(!e.isEntityEqual(item)){
            e.attackEntityFrom(DamageSource.cactus, 2.5F);
    	}

        }
    }

