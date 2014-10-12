package com.fibonacci.MiscCraft.block.gui.container;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerWindmill extends Container {


	private TileEntityWindmill windmill;
	public ContainerWindmill(InventoryPlayer p, TileEntityWindmill windmill){
		this.addSlotToContainer(new Slot(windmill, 0, 50, 37));
        this.addSlotToContainer(new Slot(windmill, 1, 106, 37));


		for(int i = 0; i < 9; i++){
			this.addSlotToContainer(new Slot(p, i, 8 + i*18, 142));
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				this.addSlotToContainer(new Slot(p, 9+j+i*9, 8+18*j, 84+i*18));
			}
		}
	}
	
	public boolean canInteractWith(EntityPlayer var1) {
		
		return true;
	}
    



	

	

}
