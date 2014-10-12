package com.fibonacci.MiscCraft.block.tileentity;

import buildcraft.api.transport.IExtractionHandler;
import buildcraft.api.transport.IPipeConnection;
import buildcraft.api.transport.IPipeTile;
import buildcraft.api.transport.PipeWire;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Fibonacci on 6/15/14.
 */
public class TileEntityPipe extends TileEntity implements IExtractionHandler,IPipeTile, IPipeConnection{
    public ForgeDirection[] connections = new ForgeDirection[6];

    public TileEntityPipe(){

    }

    public void updateEntity(){
        this.updateConnections();

    }

    public  void updateConnections(){
        if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof TileEntityPipe) connections[0] = ForgeDirection.UP;
        else connections[0] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntityPipe) connections[1] = ForgeDirection.DOWN;
        else connections[1] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof TileEntityPipe) connections[2] = ForgeDirection.NORTH;
        else connections[2] = null;
        if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof TileEntityPipe) connections[3] = ForgeDirection.EAST;
        else connections[3] = null;
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof TileEntityPipe) connections[4] = ForgeDirection.SOUTH;
        else connections[4] = null;
        if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntityPipe) connections[5] = ForgeDirection.WEST;
        else connections[5] = null;
    }
    public boolean oneopisite(ForgeDirection[] directions){
        ForgeDirection mainDirection = null;
        boolean isOppisite = false;

        for(int i = 0; i < directions.length; i++){
            if(mainDirection == null && directions[i] != null){
                mainDirection = directions[i];
            }

            if(directions[i] != null && mainDirection != directions[i]){
               if(!isOppisite(mainDirection, directions[i]))return  false;
                else isOppisite = true;
            }
        }

        return  isOppisite;
    }
    public boolean isOppisite(ForgeDirection fd, ForgeDirection sd){
        if(fd.equals(ForgeDirection.NORTH) && sd.equals(ForgeDirection.SOUTH) || (fd.equals(ForgeDirection.SOUTH) && sd.equals(ForgeDirection.NORTH))) return  true;
        if(fd.equals(ForgeDirection.EAST) && sd.equals(ForgeDirection.WEST) || (fd.equals(ForgeDirection.WEST) && sd.equals(ForgeDirection.EAST))) return  true;
        if(fd.equals(ForgeDirection.UP) && sd.equals(ForgeDirection.DOWN) || (fd.equals(ForgeDirection.DOWN) && sd.equals(ForgeDirection.UP))) return  true;



        return false;
    }

    @Override
    public boolean canExtractItems(Object extractor, World world, int i, int j, int k) {

        return true;
    }

    @Override
    public boolean canExtractFluids(Object extractor, World world, int i, int j, int k) {
        return false;
    }

    @Override
    public PipeType getPipeType() {
        return PipeType.ITEM;
    }

    @Override
    public int injectItem(ItemStack stack, boolean doAdd, ForgeDirection from) {
        return 3;
    }

    @Override
    public boolean isPipeConnected(ForgeDirection with) {
        return true;
    }

    @Override
    public boolean isWireActive(PipeWire wire) {
        return false;
    }

    @Override
    public ConnectOverride overridePipeConnection(PipeType type, ForgeDirection with) {
        return ConnectOverride.CONNECT;
    }
}
