package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityCraftingChest;
import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public class CraftingChest extends BlockContainer{
	private final Random field_149955_b = new Random();
	private IIcon blockTop;
	private IIcon blockBottom;
	public CraftingChest() {
		super(Material.wood);
		this.setCreativeTab(MiscCraft.WIPTab);
		this.setHardness(.6F);
		
	}
	public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        
        this.blockTop = p_149651_1_.registerIcon("MiscCraft:crafting_table_top");
        this.blockBottom = p_149651_1_.registerIcon("MiscCraft:bottom");
        
    }
    
    public IIcon getIcon(int side, int p_149691_2_)
    {
    	
    	if(side == 1){
    		return blockTop;
    		
    	}
    	else return blockBottom;
		
    	
    }
	public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        TileEntityCraftingChest tileentitychest = (TileEntityCraftingChest)p_149749_1_.getTileEntity(p_149749_2_, p_149749_3_, p_149749_4_);

        if (tileentitychest != null)
        {
            for (int i1 = 0; i1 < tileentitychest.getSizeInventory(); ++i1)
            {
                ItemStack itemstack = tileentitychest.getStackInSlot(i1);

                if (itemstack != null)
                {
                    float f = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.field_149955_b.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityitem;

                    for (float f2 = this.field_149955_b.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; p_149749_1_.spawnEntityInWorld(entityitem))
                    {
                        int j1 = this.field_149955_b.nextInt(21) + 10;

                        if (j1 > itemstack.stackSize)
                        {
                            j1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= j1;
                        entityitem = new EntityItem(p_149749_1_, (double)((float)p_149749_2_ + f), (double)((float)p_149749_3_ + f1), (double)((float)p_149749_4_ + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
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

            p_149749_1_.func_147453_f(p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_);
        }

        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
    }

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityCraftingChest();
	}
	public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int side, float x2, float y2, float z2)
    {
	 if(!w.isRemote){
		 FMLNetworkHandler.openGui(p, MiscCraft.instance, MiscCraft.guiIDCraftingChest, w, x, y, z);
	 }
	
        return true;
    }

}
