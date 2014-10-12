package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import mcp.mobius.waila.api.IWailaBlockDecorator;
import mcp.mobius.waila.api.IWailaDataProvider;
import mcp.mobius.waila.api.IWailaRegistrar;
import mcp.mobius.waila.api.IWailaSummaryProvider;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Fibonacci on 6/6/14.
 */
public class PlatinumOre extends BlockOre{

    public PlatinumOre(int i) {

        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.setHardness(4F);
        this.setResistance(5.0F);
        this.setLightLevel(0F);
        this.setHarvestLevel("pickaxe", 8);



    }
    public Item getItemDropped(int i, Random random, int j)
    {
        return MiscCraft.PlatinumNugget;
    }

    public int quantityDropped(Random rand){
        return rand.nextInt(1) + 1;
    }

    public void dropXpOnBlockBreak(World p_149657_1_, int p_149657_2_, int p_149657_3_, int p_149657_4_, int p_149657_5_)
    {
        if (!p_149657_1_.isRemote)
        {
            while (p_149657_5_ > 0)
            {
                int i1 = EntityXPOrb.getXPSplit(p_149657_5_);
                p_149657_5_ -= i1;
                p_149657_1_.spawnEntityInWorld(new EntityXPOrb(p_149657_1_, (double)p_149657_2_ + 0.5D, (double)p_149657_3_ + 0.5D, (double)p_149657_4_ + 0.5D, i1));
            }
        }
    }


}

