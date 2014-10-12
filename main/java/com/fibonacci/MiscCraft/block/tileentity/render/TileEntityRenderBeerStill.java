package com.fibonacci.MiscCraft.block.tileentity.render;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityBeerStill;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRenderBeerStill extends TileEntitySpecialRenderer {

	@Override
	public void renderTileEntityAt(TileEntity te, double dx, double dy,double dz, float f) {
		int x1 = te.xCoord;
		int y1 = te.yCoord;
		int z1 = te.zCoord;
		TileEntityBeerStill bullblock = (TileEntityBeerStill)te;

	}

}
