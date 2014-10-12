/**
 * 
 */
package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityHydrant;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * @author Fibonacci
 * 
 */
		
public class FireHydrant extends BlockContainer{
public boolean haswater;

	public FireHydrant() {
		super(Material.rock);
		this.setCreativeTab(MiscCraft.WIPTab);
		this.setBlockBounds(.25F, 0, .25F, .75F, 1, .75F);
		
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityHydrant();
	}
	

	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int p_149727_6_, float param1, float meta, float param)
    {
		ItemStack i = p.inventory.getCurrentItem();
		
		if(!w.isRemote){
			System.out.println(i);
		if(haswater){
			//System.out.println("Bucket");
			if (p.getCurrentEquippedItem() != null && p.getCurrentEquippedItem().getItem() == Items.bucket){
				
					
				--i.stackSize;
				p.dropItem(Items.water_bucket, 1);
				System.out.println(p.getDisplayName());
				
				
			}
		}
		}
		
		if(haswater)return true;
        return false;
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
    public String getItemIconName()
    {
        return "MiscCraft:HydrantPNG";
    }
}
