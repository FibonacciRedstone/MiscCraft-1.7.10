package com.fibonacci.MiscCraft.fluid;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Fibonacci on 10/26/14.
 */
public class BlockPoison extends BlockFluidClassic{
    protected IIcon stillIcon;

    protected IIcon flowingIcon;
    public BlockPoison(Fluid fluid, Material material) {
        super(fluid, material);
        this.setCreativeTab(MiscCraft.WIPTab);
    }
    public IIcon getIcon(int side, int meta) {
        return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }


    @Override
    public void registerBlockIcons(IIconRegister register) {
        stillIcon = register.registerIcon("MiscCraft:poisonStill");
        flowingIcon = register.registerIcon("MiscCraft:poisonFlowing");
    }

    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {
        if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
        return super.canDisplace(world, x, y, z);
    }

    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
        if (world.getBlock(x,  y,  z).getMaterial().isLiquid()) return false;
        return super.displaceIfPossible(world, x, y, z);
    }
}
