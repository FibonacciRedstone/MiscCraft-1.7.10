package com.fibonacci.MiscCraft.block.gui.container;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityCraftingChest;
import com.fibonacci.MiscCraft.block.tileentity.TileEntitySolarPanel;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import com.fibonacci.MiscCraft.common.MiscCraft;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MiscCraftGUIHandler implements IGuiHandler {

	
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		
TileEntity te = world.getTileEntity(x, y, z);
		
		switch(ID){
		case MiscCraft.guiIDWindmill:
			while(te instanceof TileEntityWindmill && world.getBlockMetadata(x, y, z) < 7){
				y++;
			}
			System.out.println(world.getBlockMetadata(x, y, z));
				return new ContainerWindmill(player.inventory, (TileEntityWindmill)world.getTileEntity(x, y, z));
		case MiscCraft.guiIDSolarPanel:
			
			return new ContainerSolarPanel(player.inventory, (TileEntitySolarPanel)world.getTileEntity(x, y, z));
			
		case MiscCraft.guiIDCraftingChest:
			return new ContainerCraftingChest(player.inventory, (TileEntityCraftingChest)world.getTileEntity(x, y, z), world, x, y, z);

		}
		return null;
		
	}
	

	
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,int x, int y, int z) {
		TileEntity te = world.getTileEntity(x, y, z);
		
		switch(ID){
		case MiscCraft.guiIDWindmill:
			
			while(te instanceof TileEntityWindmill && world.getBlockMetadata(x, y, z) < 7){
				y++;
			}
			System.out.println(world.getBlockMetadata(x, y, z));
				return new GUIWindmill(player.inventory, (TileEntityWindmill)world.getTileEntity(x, y, z));
		case MiscCraft.guiIDSolarPanel:
			
			return new GUISolarPanel(player.inventory, (TileEntitySolarPanel)world.getTileEntity(x, y, z));
		case MiscCraft.guiIDCraftingChest:
			return new GUICraftingChest(player.inventory, (TileEntityCraftingChest)world.getTileEntity(x, y, z), world, x, y, z);
		
		}
		return null;
	}

}
