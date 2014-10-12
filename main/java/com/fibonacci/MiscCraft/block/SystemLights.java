package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityLights;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SystemLights extends BlockContainer{
public int side1;
public int frenquency;
public boolean on;

	public SystemLights() {
		super(Material.rock);
		this.setCreativeTab(MiscCraft.WIPTab);
		
		
	}

	@Override
	public TileEntity createNewTileEntity(World w, int v) {
		
		return new TileEntityLights();
	}
	public int getRenderType(){
        return -1;
    }
    public boolean isOpaqueCube(){
        return false;
    }


    public boolean renderAsNormalBlock() {
        return false;
    }
    public int onBlockPlaced(World w, int x, int y, int z, int side, float hx, float hy, float hz, int meta)
    {
    	side1 = side;
    	
    	
        return -1;
    }
    public void onBlockAdded(World w, int x, int y, int z) {
    	w.setBlockMetadataWithNotify(x, y, z, side1, 1);
    	System.out.println(w.getBlockMetadata(x, y, z));
    }

    public void setBlockBoundsBasedOnState(IBlockAccess w, int x, int y, int z)
  {
    	if(w.getBlockMetadata(x, y, z) == 0)setBlockBounds(.25F, .75F, .25F, .75F, 1, .75F);
    	if(w.getBlockMetadata(x, y, z) == 1)setBlockBounds(.25F, 0, .25F, .75F, .25F, .75F);
    	if(w.getBlockMetadata(x, y, z) == 2)setBlockBounds(.25F, 0.25F, .75F, .75F, .75F, 1);
    	if(w.getBlockMetadata(x, y, z) == 3)setBlockBounds(.25F, 0.25F, 0, 0.75F, .75F, 0.25F);
    	if(w.getBlockMetadata(x, y, z) == 4)setBlockBounds(.75F, 0.25F, 0.25F, 1, .75F, 0.75F);
    	if(w.getBlockMetadata(x, y, z) == 5)setBlockBounds(0, 0.25F, 0.25F, 0.25F, .75F, 0.75F);
  	}
    public void onNeighborBlockChange(World w, int x, int y, int z, Block b){
    	EntityItem entityitem = new EntityItem(w, x, y, z, new ItemStack(MiscCraft.SystemLights, 1));
    	if(w.getBlockMetadata(x, y, z) == 0){
    		if(w.isAirBlock(x, y+1, z)){
    			w.setBlockToAir(x, y, z);
    			w.spawnEntityInWorld(entityitem);
    			entityitem.setLocationAndAngles(x, y, z, 0, 0);
    		}
    	}
    	if(w.getBlockMetadata(x, y, z) == 1){
    		if(w.isAirBlock(x, y-1, z)){
    			w.setBlockToAir(x, y, z);
    			w.spawnEntityInWorld(entityitem);
    			entityitem.setLocationAndAngles(x, y, z, 0, 0);
    		}
    	}
    	if(w.getBlockMetadata(x, y, z) == 2){
    		if(w.isAirBlock(x, y, z+1)){
    			w.setBlockToAir(x, y, z);
    			w.spawnEntityInWorld(entityitem);
    			entityitem.setLocationAndAngles(x, y, z, 0, 0);
    		}
    	}
    	if(w.getBlockMetadata(x, y, z) == 3){
    		if(w.isAirBlock(x, y, z-1)){
    			w.setBlockToAir(x, y, z);
    			w.spawnEntityInWorld(entityitem);
    			entityitem.setLocationAndAngles(x, y, z, 0, 0);
    		}
    	}
    	if(w.getBlockMetadata(x, y, z) == 4){
    		if(w.isAirBlock(x+1, y, z)){
    			w.setBlockToAir(x, y, z);
    			w.spawnEntityInWorld(entityitem);
    			entityitem.setLocationAndAngles(x, y, z, 0, 0);
    		}
    	}
    	if(w.getBlockMetadata(x, y, z) == 5){
    		if(w.isAirBlock(x-1, y, z)){
    			w.setBlockToAir(x, y, z);
    			w.spawnEntityInWorld(entityitem);
    			entityitem.setLocationAndAngles(x, y, z, 0, 0);
    		}
    	}
    	
    	
    	
    	
    	
    }
    }


