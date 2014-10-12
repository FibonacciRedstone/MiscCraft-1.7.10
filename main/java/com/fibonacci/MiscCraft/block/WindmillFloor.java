package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmillFloor;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class WindmillFloor extends BlockContainer {

	public boolean isitdone = false;
	public WindmillFloor(Material m) {
		super(m);
		this.setBlockBounds(0, 0, 0, 1, 0.3F, 1);
		this.setCreativeTab(MiscCraft.MiscCraftTab);
			}
	
	public boolean isOpaqueCube(){
		return false;
		
	}
	public boolean renderAsNormalBlock(){
		return false;
	}
	public void onNeighborBlockChange(World w, int x, int y, int z, Block b) {
		
		updateMultiBlock(w, x, y, z);
		
	}
	
	public boolean markedDirty(World w, int x, int y, int z){
		if(w.getBlockMetadata(x, y, z) > 0)return true;
		
		return false;
			
	}
	
	public void onBlockAdded(World w, int x1, int y1, int z1) {
		boolean ismultiblock = false;
		Block b = null;
		
		updateMultiBlock(w, x1, y1, z1);
		int meta = w.getBlockMetadata(x1, y1, z1);
		
		
		
		
//		if((!(markedDirty(w, x1+1, y1, z1)) || !(markedDirty(w, x1-1, y1, z1)) || !(markedDirty(w, x1, y1, z1+1)) || !(markedDirty(w, x1, y1, z1-1)))){
//			isitdone = true;
//			
//		}else{
//			isitdone = false;
//			
//		}
		
		
		if(isMulti(w, x1, y1, z1)){
			System.out.println("Is Multi");
			
			
				

							}
					
				}
				
				
		
				
			
		
		
	
	
	public void updateMultiBlock(World w, int x, int y, int z){
		isMulti(w, x, y, z);
	}
	
	



	public boolean isMulti(World w, int x1, int y1, int z1){
		boolean ismultis = false;
		boolean ccs = true;
	//if(!(markedDirty(w, x1+2, y1, z1) || markedDirty(w, x1-2, y1, z1) || markedDirty(w, x1, y1, z1+2) || markedDirty(w, x1, y1, z1-2))){
		
		
		
		for(int x2 =0; x2 < 3; x2++){
			for(int z2 = 0; z2 <3; z2++){
				if(!ismultis){
					ccs = true;
				
					for(int x3 = 0; x3 <3; x3++){
						for(int z3 = 0; z3 <3; z3++){
							if(ccs && !w.getBlock(x1+x2-x3, y1, z1+z2-z3).equals(MiscCraft.WindmillFloor)){
								
								ccs = false;
							}
						}
					}
					
					
					
					if(ccs/* && !isitdone*/){
						for(int x3 = 0; x3 <3; x3++){
							for(int z3 = 0; z3 <3; z3++){
								w.setBlockMetadataWithNotify(x1+x2-x3, y1, z1+z2-z3, (x3*3+z3)+1, 2);
								markedDirty(w, x1, y1, z1);
							}
						}
					}
				}
				ismultis  = ccs;
			}
		}
		
	//w }
		if(ismultis) return true;
		if(w.getBlockMetadata(x1, y1, z1) > 0)w.setBlockMetadataWithNotify(x1, y1, z1, 0, 3);
		
		return false;
		
		
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2){
		
		return new TileEntityWindmillFloor();
	}
//	public void setBlockBoundsBasedOnState(IBlockAccess w, int x, int y, int z)
//    {
//		float pixel = (1F/16);
//		if(w.getBlockMetadata(x, y, z) == 0)setBlockBounds(0, 0, 0, 1, 0.3F, 1);
//		if(w.getBlockMetadata(x, y, z) == 1)setBlockBounds(0, 0, 0, 0.7F, 1, 0.7F);
//		if(w.getBlockMetadata(x, y, z) == 2)setBlockBounds(0, 0, 0, 0.7F, 1, 1);
//		if(w.getBlockMetadata(x, y, z) == 3)setBlockBounds(0, 0, 0.3F, 0.7F, 1, 1);
//		if(w.getBlockMetadata(x, y, z) == 4)setBlockBounds(0, 0, 0, 1, 1, 0.7F);
//		if(w.getBlockMetadata(x, y, z) == 5)setBlockBounds(0, 0, 0, 1, 1, 1);
//		if(w.getBlockMetadata(x, y, z) == 6)setBlockBounds(0, 0, 0.3F, 1, 1, 1);
//		if(w.getBlockMetadata(x, y, z) ==7)setBlockBounds(0.3F, 0, 0, 1, 1, 0.7F);
//		if(w.getBlockMetadata(x, y, z) == 8)setBlockBounds(0.3F, 0, 0, 1, 1, 1);
//		if(w.getBlockMetadata(x, y, z) == 9)setBlockBounds(0.3F, 0, 0.3F, 1, 1, 1);
//     }
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z)
    {
		if(w.getBlockMetadata(x, y, z) == 0)setBlockBounds(0, 0, 0, 1, 0.3F, 1);
		if(w.getBlockMetadata(x, y, z) == 1)setBlockBounds(0, 0, 0, 0.7F, 1, 0.7F);
		if(w.getBlockMetadata(x, y, z) == 2)setBlockBounds(0, 0, 0, 0.7F, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 3)setBlockBounds(0, 0, 0.3F, 0.7F, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 4)setBlockBounds(0, 0, 0, 1, 1, 0.7F);
		if(w.getBlockMetadata(x, y, z) == 5)setBlockBounds(0, 0, 0, 1, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 6)setBlockBounds(0, 0, 0.3F, 1, 1, 1);
		if(w.getBlockMetadata(x, y, z) ==7)setBlockBounds(0.3F, 0, 0, 1, 1, 0.7F);
		if(w.getBlockMetadata(x, y, z) == 8)setBlockBounds(0.3F, 0, 0, 1, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 9)setBlockBounds(0.3F, 0, 0.3F, 1, 1, 1);
		
        return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
    }
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World w, int x, int y, int z)
    {
		if(w.getBlockMetadata(x, y, z) == 0)setBlockBounds(0, 0, 0, 1, 0.3F, 1);
		if(w.getBlockMetadata(x, y, z) == 1)setBlockBounds(0, 0, 0, 0.7F, 1, 0.7F);
		if(w.getBlockMetadata(x, y, z) == 2)setBlockBounds(0, 0, 0, 0.7F, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 3)setBlockBounds(0, 0, 0.3F, 0.7F, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 4)setBlockBounds(0, 0, 0, 1, 1, 0.7F);
		if(w.getBlockMetadata(x, y, z) == 5)setBlockBounds(0, 0, 0, 1, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 6)setBlockBounds(0, 0, 0.3F, 1, 1, 1);
		if(w.getBlockMetadata(x, y, z) ==7)setBlockBounds(0.3F, 0, 0, 1, 1, 0.7F);
		if(w.getBlockMetadata(x, y, z) == 8)setBlockBounds(0.3F, 0, 0, 1, 1, 1);
		if(w.getBlockMetadata(x, y, z) == 9)setBlockBounds(0.3F, 0, 0.3F, 1, 1, 1);
		
		return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
    }
	public int getRenderType()
    {
        return -1;
    }
    
}
	
