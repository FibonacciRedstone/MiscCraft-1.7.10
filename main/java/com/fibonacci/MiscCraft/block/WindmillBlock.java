package com.fibonacci.MiscCraft.block;

import java.util.Random;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import com.fibonacci.MiscCraft.common.MiscCraft;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 7/1/14.
 */
public class WindmillBlock extends BlockContainer{
    private final Random field_149955_b = new Random();
	
    public WindmillBlock(Material m) {
        super(m);
        
        
        
        
    }

    @SideOnly(Side.CLIENT)
    public String getItemIconName()
    {
        return "MiscCraft:WindmillItem";
    }
    public int getRenderType()
    {
        return -1;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
	
	public TileEntity createNewTileEntity(World w, int i) {
		
		return new TileEntityWindmill();
	}
	 public boolean renderAsNormalBlock()
	{
	        return false;
	}
	 public void setBlockBoundsBasedOnState(IBlockAccess b, int x, int y, int z){
		 if(b.getBlockMetadata(x, y, z) < 7)this.setBlockBounds(0.25F,0, 0.25F, 0.75F, 1, 0.75F);
		 else{
			 this.setBlockBounds(0, 0, 0, 1, 1, 1);
		 }
	 }
	 public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z)
	    {
		 if(w.getBlockMetadata(x, y, z) < 7)this.setBlockBounds(0.25F,0, 0.25F, 0.75F, 1, 0.75F);
		 else{
			 this.setBlockBounds(0, 0, 0, 1, 1, 1);
		 }
		 return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);

	    }
	 public void breakBlock(World w, int x, int y, int z, Block b, int meta)
	    {
            if(!w.isRemote) {
                TileEntityWindmill windmill = (TileEntityWindmill) w.getTileEntity(x, y, z);
                if (windmill != null)
                {
                    for (int i1 = 0; i1 < windmill.getSizeInventory(); ++i1)
                    {
                        ItemStack itemstack = windmill.getStackInSlot(i1);

                        if (itemstack != null)
                        {
                            float f = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
                            float f1 = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
                            EntityItem entityitem;

                            for (float f2 = this.field_149955_b.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; w.spawnEntityInWorld(entityitem))
                            {
                                int j1 = this.field_149955_b.nextInt(21) + 10;

                                if (j1 > itemstack.stackSize)
                                {
                                    j1 = itemstack.stackSize;
                                }

                                itemstack.stackSize -= j1;
                                entityitem = new EntityItem(w, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
                                float f3 = 0.05F;
                                entityitem.motionX = (double)((float)this.field_149955_b.nextGaussian() * f3);
                                entityitem.motionY = (double)((float)this.field_149955_b.nextGaussian() * f3 + 0.2F);
                                entityitem.motionZ = (double)((float)this.field_149955_b.nextGaussian() * f3);

                                if (itemstack.hasTagCompound())
                                {
                                    entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                                }
                            }
                        }
                    }

                    w.func_147453_f(x, y, z, b);
                }
                if (w.getBlock(x, y + 1, z).equals(MiscCraft.WindmillBlock)) {
                    w.setBlockToAir(x, y + 1, z);
                }
                if (w.getBlock(x, y - 1, z).equals(MiscCraft.WindmillBlock)) {
                    w.setBlockToAir(x, y - 1, z);
                }
            }
	    }
	 public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int side, float x2, float y2, float z2)
	    {
		 if(!w.isRemote){
			 FMLNetworkHandler.openGui(p, MiscCraft.instance, MiscCraft.guiIDWindmill, w, x, y, z);
		 }
		
	        return true;
	    }
	 public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return MiscCraft.WindmillItem;
	    }
	 public void onNeighborBlockChange(World w, int x, int y, int z, Block b) {
		 
			 if(w.isAirBlock(x, y-1, z)){
				 w.setBlockToAir(x, y, z);
		 
	 }

	 }
}
