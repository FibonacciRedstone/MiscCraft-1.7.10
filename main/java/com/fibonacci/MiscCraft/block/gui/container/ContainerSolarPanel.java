package com.fibonacci.MiscCraft.block.gui.container;

import com.fibonacci.MiscCraft.block.tileentity.TileEntitySolarPanel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

/**
 * Created by Fibonacci on 6/5/14.
 */
public class ContainerSolarPanel extends Container {
   

    public ContainerSolarPanel(InventoryPlayer p, TileEntitySolarPanel solarpanel) {
    	for(int i = 0; i < 9; i++){
			this.addSlotToContainer(new Slot(p, i, 8 + i*18, 142));
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 9; j++){
				this.addSlotToContainer(new Slot(p, 9+j+i*9, 8+18*j, 84+i*18));
			}
		}
    }



    public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
        return true;
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer par1EntityPlayer, int par2) {
        ItemStack itemstack = null;
        Slot slot = (Slot) this.inventorySlots.get(par2);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (par2 < 9) {
                if (!this.mergeItemStack(itemstack1, 9, 45, true)) {
                    return null;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, 9, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack) null);
            } else {
                slot.onSlotChanged();
            }

            if (itemstack1.stackSize == itemstack.stackSize) {
                return null;
            }

            slot.onPickupFromSlot(par1EntityPlayer, itemstack1);
        }

        return itemstack;
    }
}

