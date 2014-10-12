package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityDiamondRadar;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class DiamondRadar extends BlockContainer{

	public DiamondRadar() {
		super(Material.wood);
		this.setCreativeTab(MiscCraft.MiscCraftTab);
		this.setBlockBounds(0.45F, 0, 0.45F, 0.65F, 0.7F, 0.65F);
		
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityDiamondRadar();
	}
	 public boolean renderAsNormalBlock()
		{
		        return false;
		}
	 public int getRenderType()
	    {
	        return -1;
	    }
	 public boolean isOpaqueCube()
	    {
	        return false;
	    }
	 public String getItemIconName()
	    {
	        return "MiscCraft:DiamondRadar";
	    }
	 

}
