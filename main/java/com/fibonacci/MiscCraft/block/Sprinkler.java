package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/14/14.
 */
public class Sprinkler extends Block {
	
    public Sprinkler(Material p_i45394_1_) {
    	
        super(p_i45394_1_);
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    boolean Active;
	private IIcon blockTop;
    public void onNeighborBlockChange(World w, int x, int y, int z, Block b)
    {
        if (w.isBlockIndirectlyGettingPowered(x, y, z)){
            Active = true;
            }
        if(Active == true){
        		w.setBlockMetadataWithNotify(x+1, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x-1, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z+1, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z-1, -1, 2);

        		w.setBlockMetadataWithNotify(x+5, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x-5, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z+5, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z-5, -1, 2);

        		w.spawnParticle("splash", x, y+1, z, 10000.0D, 10000.0D, 10000.0D);


        		w.setBlockMetadataWithNotify(x+4, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x-4, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z+4, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z-4, -1, 2);

        		w.setBlockMetadataWithNotify(x+1, y-1, z-1, -1, 2);
        		w.setBlockMetadataWithNotify(x-1, y-1, z-1, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z+1, -1, 2);
        		w.setBlockMetadataWithNotify(x-1, y-1, z+1, -1, 2);

        		w.setBlockMetadataWithNotify(x+3, y-1, z-2, -1, 2);
        		w.setBlockMetadataWithNotify(x-3, y-1, z-2, -1, 2);
        		w.setBlockMetadataWithNotify(x+3, y-1, z+2, -1, 2);
        		w.setBlockMetadataWithNotify(x-3, y-1, z+2, -1, 2);

        		w.setBlockMetadataWithNotify(x+2, y-1, z-3, -1, 2);
        		w.setBlockMetadataWithNotify(x-2, y-1, z-3, -1, 2);
        		w.setBlockMetadataWithNotify(x+2, y-1, z+3, -1, 2);
        		w.setBlockMetadataWithNotify(x-2, y-1, z+3, -1, 2);

        		w.setBlockMetadataWithNotify(x+2, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x-2, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z+2, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z-2, -1, 2);

        		w.setBlockMetadataWithNotify(x-1, y-1, z-2, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z-2, -1, 2);

        		w.setBlockMetadataWithNotify(x-1, y-1, z+2, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z+2, -1, 2);

        		w.setBlockMetadataWithNotify(x-1, y-1, z-4, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z-4, -1, 2);

        		w.setBlockMetadataWithNotify(x-1, y-1, z+4, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z+4, -1, 2);

        		w.setBlockMetadataWithNotify(x-1, y-1, z-3, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z-3, -1, 2);

        		w.setBlockMetadataWithNotify(x-1, y-1, z+3, -1, 2);
        		w.setBlockMetadataWithNotify(x+1, y-1, z+3, -1, 2);

        		w.setBlockMetadataWithNotify(x-3, y-1, z-1, -1, 2);
        		w.setBlockMetadataWithNotify(x-3, y-1, z+1, -1, 2);

        		w.setBlockMetadataWithNotify(x+3, y-1, z+1, -1, 2);
        		w.setBlockMetadataWithNotify(x+3, y-1, z-1, -1, 2);

        		w.setBlockMetadataWithNotify(x-4, y-1, z-1, -1, 2);
        		w.setBlockMetadataWithNotify(x-4, y-1, z+1, -1, 2);

        		w.setBlockMetadataWithNotify(x+4, y-1, z+1, -1, 2);
        		w.setBlockMetadataWithNotify(x+4, y-1, z-1, -1, 2);

        		w.setBlockMetadataWithNotify(x+2, y-1, z-1, -1, 2);
        		w.setBlockMetadataWithNotify(x+2, y-1, z+1, -1, 2);

        		w.setBlockMetadataWithNotify(x-2, y-1, z-1, -1, 2);
        		w.setBlockMetadataWithNotify(x-2, y-1, z+1, -1, 2);

        		w.setBlockMetadataWithNotify(x+3, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x-3, y-1, z, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z+3, -1, 2);
        		w.setBlockMetadataWithNotify(x, y-1, z-3, -1, 2);

        		w.setBlockMetadataWithNotify(x-2, y-1, z-2, -1, 2);
        		w.setBlockMetadataWithNotify(x-2, y-1, z+2, -1, 2);
        		w.setBlockMetadataWithNotify(x+2, y-1, z+2, -1, 2);
        		w.setBlockMetadataWithNotify(x+2, y-1, z-2, -1, 2);
        		
        	}
        }
    public boolean renderAsNormalBlock() {
        return false;
    }
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("MiscCraft:sprinkler_sides");
        this.blockTop = p_149651_1_.registerIcon("MiscCraft:sprinkler_top");
        
    }
    
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
    	
    	if(p_149691_1_ != 1){
    		return blockIcon;
    		
    	}else{
        return blockTop;
    	}
    }
    public void setBlockBoundsForItemRender() {
    	this.setBlockBounds(0.2F , 0, 0.2F, .8F, 0.7F, .8F);
    }
    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_) {
    	this.setBlockBounds(0.4F , 0, 0.4F, .6F, 0.5F, .6F);

    }
   
    



    }

