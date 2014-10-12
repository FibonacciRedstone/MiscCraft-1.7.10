package com.fibonacci.MiscCraft.block;


import com.fibonacci.MiscCraft.block.tileentity.TileEntityBeerStill;
import com.fibonacci.MiscCraft.common.MiscCraft;
import com.fibonacci.MiscCraft.item.Sapphire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import org.lwjgl.Sys;

import java.util.Random;

/**
 * Created by Fibonacci on 6/16/14.
 */
public class BeerStill extends BlockContainer{
    public int timeticks;
    private boolean ready = false;
    boolean start = false;
    boolean done = false;
    int ticks;
    String texturename;
    public int customticks;
    Item dropItem;
    private IIcon blockSide;


    public BeerStill() {
        super(Material.wood);
        this.setHardness(.5F);
        this.setBlockBounds(.15F, 0, .15F, .85F, .85F, .85F);
        this.lightOpacity = -15;
        this.setCreativeTab(MiscCraft.MiscCraftTab);
        this.texturename = "still";
        this.dropItem = MiscCraft.Beer;
    }
    
   
    public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int x2, float y2, float z2, float metadata)
    {
    	TileEntityBeerStill still = (TileEntityBeerStill) w.getTileEntity(x, y, z);
    	System.out.println(still.ticks);
    	if(!w.isRemote){
    	start = true;
    	if(start){
    		System.out.println("Start");
    		if(still.ticks <= 0){
    			ready = true;
    			still.ticks = 0;
    		}
    		
    	}
    	
                if (ready) {
               done = true;
               System.out.println("Break Now");
               p.addChatComponentMessage(new ChatComponentTranslation("Ready to Break", new Object[0]));
               timeticks = ticks;
                    
                    
            }else{
            	if(!p.isSneaking()){
            	p.addChatComponentMessage(new ChatComponentTranslation( (still.ticks/20)/60 +" Minutes Left", new Object[0]));
            	}
            	if(p.isSneaking()){
            		p.addChatComponentMessage(new ChatComponentTranslation( (still.ticks/20) +" Seconds Left", new Object[0]));
            	}
            }
                
                
    	}
        return true;
    }
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        if(done){
        	done = false;
        	return dropItem;
        	
        
        }
        return null;
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("MiscCraft:" + texturename +"_top");
        this.blockSide = p_149651_1_.registerIcon("MiscCraft:" + texturename + "_side");


    }public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_) {
        if (p_149673_5_ == 1) {
            return this.blockIcon;
        } else {
            return this.blockSide;
        }
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    public int onBlockPlaced(World w, int x, int y, int z, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
    {	
    	TileEntityBeerStill still = (TileEntityBeerStill) w.getTileEntity(x, y, z);
    	still.ticks = 100000;
        done = false;
        ready = false;
        
		return 0;
    }
    public String getItemIconName()
    {
        return "MiscCraft:still_icon";
    }
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityBeerStill();
	}
    


}
