package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.block.SolarPanel;
import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by Fibonacci on 6/4/14.
 */
public class TileEntitySolarPanel extends TileEntity implements IInventory{
	
	public int maxPower = 10000;
	public float power = 0;
	public float powerpertick = 0.1F;

	public void updateEntity(){
		for(int y = 0; y < 256; y++){
			
		
		
		if(this.worldObj.isDaytime() && !this.worldObj.isRaining() && this.worldObj.getWorldTime() > 0 && this.worldObj.getWorldTime() < 13000){
                powerpertick = 10F;
                
               
            }else{
            	powerpertick = -10F;
            }
        
		}
		
		
		power+=powerpertick;
		
		if(power < 6750)power =6750;
		if(power > maxPower)power=(int) maxPower;
	}
	public int getPowerScaled(int scaled){
		return (int) (this.power * scaled / this.maxPower);
		
	}
		
		
	
    public int getSizeInventory() {
        return 1;
    }

    @Override
    public ItemStack getStackInSlot(int var1) {
        return new ItemStack(MiscCraft.Ruby);
    }

    @Override
    public ItemStack decrStackSize(int var1, int var2) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int var1) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int var1, ItemStack var2) {

    }

    @Override
    public String getInventoryName() {
        return "Solar Panel";
    }

    @Override
    public boolean hasCustomInventoryName() {
        return true;
    }

    @Override
    public int getInventoryStackLimit() {
        return 1;
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer var1) {
        return true;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int var1, ItemStack var2) {
        return true;
    }
}
