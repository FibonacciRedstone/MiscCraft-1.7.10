package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntitySolarPanel;
import com.fibonacci.MiscCraft.common.MiscCraft;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;

/**
 * Created by Fibonacci on 6/4/14.
 */
public class SolarPanel extends BlockContainer{

    private IIcon blockTop;

	public SolarPanel(Material p_i45386_1_) {
        super(p_i45386_1_);
        this.setCreativeTab(MiscCraft.WIPTab);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
       return new TileEntitySolarPanel();
    }
    public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int hitx, float hity, float hitz, float meta)
    {
    	if(!w.isRemote){
			 FMLNetworkHandler.openGui(p, MiscCraft.instance, MiscCraft.guiIDSolarPanel, w, x, y, z);
		 }
		
	        return true;
        }
    
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("MiscCraft:solarpanel_sides");
        this.blockTop = p_149651_1_.registerIcon("MiscCraft:solarpanel_top");
        
    }
    public IIcon getIcon(int side, int i)
    {
    	
    	if(side != 1){
    		return blockIcon;
    		
    	}else{
        return blockTop;
    	}
    }
    
    }


