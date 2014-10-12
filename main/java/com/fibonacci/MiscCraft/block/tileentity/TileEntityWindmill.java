package com.fibonacci.MiscCraft.block.tileentity;

import ic2.api.energy.tile.IEnergySource;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityWindmill extends TileEntity implements ISidedInventory{
		public float rotation1 = 0; 
		public float rotation2 = 0;
    public ItemStack[] chestContents = new ItemStack[2];
		private ItemStack[] slots = new ItemStack[2];
		TileEntityWire wire;
		
		public float rotation;
		
		public int maxPower = 10000;
		public int power = 0;
		public float powerperrotation = 0.1F;
		private NBTTagCompound nbt;
		
		
		
		

		public int getPowerScaled(int scaled){
			return (int) (this.power * scaled / this.maxPower);
			
		}
		public void updateEntity(){
			rotation1++;
			rotation2++;
			powerperrotation = 10F;
			rotation = (rotation1*2F) + (rotation2*1.5F);
			
//			rotation++;
//			rotation++;
//			rotation++;
//			rotation++;
//			rotation++;
			power+=powerperrotation;
			if(power > maxPower)power=(int) maxPower;
			if(power < 500)power =500;
			
			if(!this.worldObj.isRemote){
				
			if(this.worldObj.getBlockMetadata(xCoord, yCoord-1, zCoord) != 5 && this.worldObj.getBlock(xCoord, yCoord-1, zCoord).equals(MiscCraft.WindmillFloor) && this.worldObj.getBlock(xCoord, yCoord, zCoord).equals(MiscCraft.WindmillBlock)){
				this.worldObj.setBlockToAir(xCoord, yCoord, zCoord);
				if(!this.worldObj.getClosestPlayer(xCoord, yCoord, zCoord, 7).capabilities.isCreativeMode){
				EntityItem entityitem = new EntityItem(this.worldObj, xCoord, yCoord, zCoord, new ItemStack(MiscCraft.WindmillItem, 1));
				
	            this.worldObj.spawnEntityInWorld(entityitem);
				}
			}
				
			}
			
		}
    public void writeToNBT(NBTTagCompound p_145841_1_)
    {
        super.writeToNBT(p_145841_1_);
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.chestContents.length; ++i)
        {
            if (this.chestContents[i] != null)
            {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.chestContents[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }

        p_145841_1_.setTag("Items", nbttaglist);


    }

    public void readFromNBT(NBTTagCompound p_145839_1_)
    {
        super.readFromNBT(p_145839_1_);
        NBTTagList nbttaglist = p_145839_1_.getTagList("Items", 10);
        this.chestContents = new ItemStack[this.getSizeInventory()];



        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 255;

            if (j >= 0 && j < this.chestContents.length)
            {
                this.chestContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }
		
		
		

		@Override
		public int getSizeInventory() {
			
			return this.slots.length;
		}


		@Override
		public ItemStack getStackInSlot(int i) {
			
			return this.slots[i];
		}


		@Override
		public ItemStack decrStackSize(int i, int j) {
			if(this.slots[i] != null){
				ItemStack item ;
				
				if(this.slots[i].stackSize <= j){
					item = this.slots[i];
					this.slots[i] = null;
					return item;
				}else{
					item = this.slots[i].splitStack(j);
					
					if(this.slots[i].stackSize == 0){
						this.slots[i] = null;
					}
					
				}
				return item;
			}
			return null;
		}


		@Override
		public ItemStack getStackInSlotOnClosing(int i) {
			if(this.slots[i] != null){
				ItemStack item = this.slots[i];
				this.slots[i] = null;
				return item;
			}else{
				return null;
			}
			
		}


		@Override
		public void setInventorySlotContents(int i, ItemStack item) {
			this.slots[i] = item;
			if(item != null && item.stackSize > this.getInventoryStackLimit()){
				item.stackSize = this.getInventoryStackLimit();
		}
			
			
			
		}


		@Override
		public String getInventoryName() {
			
			return null;
		}


		@Override
		public boolean hasCustomInventoryName() {
			
			return false;
		}


		@Override
		public int getInventoryStackLimit() {
			
			return 64;
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
			if(var2.equals(MiscCraft.Sapphire))return true;
			else return false;
		}


		@Override
		public int[] getAccessibleSlotsFromSide(int var1) {
			
			return null;
		}


		@Override
		public boolean canInsertItem(int var1, ItemStack var2, int var3) {
			
			return false;
		}


		@Override
		public boolean canExtractItem(int var1, ItemStack var2, int var3) {
			
			return false;
		}
		




}