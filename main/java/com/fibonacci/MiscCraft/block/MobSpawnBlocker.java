package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityMobSpawnBlocker;
import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 10/26/14.
 */
public class MobSpawnBlocker extends BlockContainer {
    public MobSpawnBlocker(Material m) {
        super(m);
        this.setCreativeTab(MiscCraft.WIPTab);
    }

    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
        return new TileEntityMobSpawnBlocker();
    }
}
