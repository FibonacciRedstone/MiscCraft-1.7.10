package com.fibonacci.MiscCraft.block;


import com.fibonacci.MiscCraft.common.MiscCraft;
import com.fibonacci.MiscCraft.item.Sapphire;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import org.lwjgl.Sys;

import java.util.Random;

/**
 * Created by Fibonacci on 6/16/14.
 */
public class StillBase extends Block{
    public int timeticks;
    private boolean ready = false;
    boolean start = false;
    boolean done = false;
    int ticks;
    String texturename;
    public int customticks;
    Item dropItem;
    private IIcon blockSide;


    public StillBase() {
        super(Material.wood);
        this.setHardness(.5F);
        this.setBlockBounds(.15F, 0, .15F, .85F, .85F, .85F);
        this.lightOpacity = -15;
        this.needsRandomTick = true;
        this.texturename = "still";
        this.dropItem = MiscCraft.Beer;
    }
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
    	if(start){
    		--timeticks;
        	if(timeticks <= 0){
        		System.out.println("Done Ticking");
        		ready = true;
        		start = false;
        	}
        	}
    }
   
    public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int x2, float y2, float z2, float metadata)
    {
    	if(!w.isRemote){
    	start = true;
    	if(start){
    		System.out.println("Start");
    		
    		
    	}
    	
                if (ready) {
               done = true;
               System.out.println("Break Now");
               p.addChatComponentMessage(new ChatComponentTranslation("Ready to Break", new Object[0]));
               timeticks = ticks;
                    
                    
            }else{
            	p.addChatComponentMessage(new ChatComponentTranslation( (timeticks/20) +" Seconds Left", new Object[0]));
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
    public int onBlockPlaced(World w, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
    {	
    	this.timeticks = customticks;
        ticks = this.timeticks;
        done = false;
        ready = false;
        
		return 0;
    }

    


}
