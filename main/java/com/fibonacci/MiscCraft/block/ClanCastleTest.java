package com.fibonacci.MiscCraft.block;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ClanCastleTest extends BlockContainer{

	public ClanCastleTest(Material arg0) {
		super(arg0);
		this.setBlockBounds(-2, 0, -2, 2, 2, 2);
	}
	
	public int getRenderType(){
		return -1;
	}
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	
	public boolean isOpaqueCubed() {
		return true;
	}

	@Override
	public TileEntity createNewTileEntity(World arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
