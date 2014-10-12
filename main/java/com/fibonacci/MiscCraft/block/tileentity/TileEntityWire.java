package com.fibonacci.MiscCraft.block.tileentity;

import com.fibonacci.MiscCraft.block.SolarPanel;

import ic2.api.energy.IEnergyNet;
import ic2.api.energy.event.EnergyTileLoadEvent;
import ic2.api.energy.event.EnergyTileUnloadEvent;
import ic2.api.energy.tile.IEnergyConductor;
import ic2.api.energy.tile.IEnergySink;
import ic2.api.energy.tile.IEnergySource;
import ic2.api.energy.tile.IEnergyTile;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * Created by Fibonacci on 6/15/14.
 */
public class TileEntityWire extends TileEntity implements IEnergyConductor,IEnergyTile,IEnergyNet {
    public ForgeDirection[] connections = new ForgeDirection[6];
    
    
    
    public TileEntityWire(){

    }

    public void validate()
    {
        MinecraftForge.EVENT_BUS.post(new EnergyTileLoadEvent(this));
    }


    public void invalidate()
    {
        MinecraftForge.EVENT_BUS.post(new EnergyTileUnloadEvent(this));
    }
    public void onChunkUnload()
    {
        MinecraftForge.EVENT_BUS.post(new EnergyTileUnloadEvent(this));
    }

    public  void updateConnections(){


        if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof IEnergySource ) connections[0] = ForgeDirection.UP;
        else connections[0] = null;
        if(connections[0] == null){
        if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof TileEntityWindmill ) connections[0] = ForgeDirection.UP;
        else connections[0] = null;
        if(connections[0] == null){
    	if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof TileEntitySolarPanel ) connections[0] = ForgeDirection.UP;
        else connections[0] = null;
        
        
        if(connections[0] == null){
        	
            if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof IEnergySink) connections[0] = ForgeDirection.UP;
            else connections[0] = null;
            if(connections[0] == null){
                if(this.worldObj.getTileEntity(xCoord, yCoord+1, zCoord) instanceof TileEntityWire) connections[0] = ForgeDirection.UP;
                else connections[0] = null;
            }
        }

            }

        }
        if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof IEnergySource) connections[1] = ForgeDirection.DOWN;
        else connections[1] = null;
        if(connections[1] == null){
        if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntityWindmill) connections[1] = ForgeDirection.DOWN;
        else connections[1] = null;
        if(connections[1] == null){
        	if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntitySolarPanel) connections[1] = ForgeDirection.DOWN;
            else connections[1] = null;
        	if(connections[1] == null){
            if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof IEnergySink) connections[1] = ForgeDirection.DOWN;
            else connections[1] = null;
            if(connections[1] == null){
                if(this.worldObj.getTileEntity(xCoord, yCoord-1, zCoord) instanceof TileEntityWire) connections[1] = ForgeDirection.DOWN;
                else connections[1] = null;

            }
        	}

            }

        }
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof IEnergySource) connections[2] = ForgeDirection.NORTH;
        else connections[2] = null;
        if(connections[2] == null){
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof TileEntitySolarPanel) connections[2] = ForgeDirection.NORTH;
        else connections[2] = null;
        if(connections[2] == null){
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof TileEntityWindmill) connections[2] = ForgeDirection.NORTH;
        else connections[2] = null;

        if(connections[2] == null){
            if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof IEnergySink) connections[2] = ForgeDirection.NORTH;
            else connections[2] = null;
            if(connections[2] == null){
                if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord-1) instanceof TileEntityWire) connections[2] = ForgeDirection.NORTH;
                else connections[2] = null;

            }
        }

            }

        }


        if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof IEnergySource) connections[3] = ForgeDirection.EAST;
        else connections[3] = null;
        if(connections[3] == null){
        if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof TileEntitySolarPanel) connections[3] = ForgeDirection.EAST;
        else connections[3] = null;
        if(connections[3] == null){
        if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof TileEntityWindmill) connections[3] = ForgeDirection.EAST;
        else connections[3] = null;

        if(connections[3] == null){
            if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof IEnergySink) connections[3] = ForgeDirection.EAST;
            else connections[3] = null;
            if(connections[3] == null){
                if(this.worldObj.getTileEntity(xCoord+1, yCoord, zCoord) instanceof TileEntityWire) connections[3] = ForgeDirection.EAST;
                else connections[3] = null;
            }
        }


            }

        }

        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof IEnergySource) connections[4] = ForgeDirection.SOUTH;
        else connections[4] = null;
        if(connections[4] == null){
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof TileEntitySolarPanel) connections[4] = ForgeDirection.SOUTH;
        else connections[4] = null;
        if(connections[4] == null){
        if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof TileEntityWindmill) connections[4] = ForgeDirection.SOUTH;
        else connections[4] = null;

        if(connections[4] == null){
            if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof IEnergySink) connections[4] = ForgeDirection.SOUTH;
            else connections[4] = null;
            if(connections[4] == null){
                if(this.worldObj.getTileEntity(xCoord, yCoord, zCoord+1) instanceof TileEntityWire) connections[4] = ForgeDirection.SOUTH;
                else connections[4] = null;

            }
        }

            }

        }

        if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof IEnergySource) connections[5] = ForgeDirection.WEST;
        else connections[5] = null;
        if(connections[5] == null){
        if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntitySolarPanel) connections[5] = ForgeDirection.WEST;
        else connections[5] = null;
        if(connections[5] == null){
        if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntityWindmill) connections[5] = ForgeDirection.WEST;
        else connections[5] = null;

        if(connections[5] == null){
            if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof IEnergySink) connections[5] = ForgeDirection.WEST;
            else connections[5] = null;
            if(connections[5] == null){
                if(this.worldObj.getTileEntity(xCoord-1, yCoord, zCoord) instanceof TileEntityWire) connections[5] = ForgeDirection.WEST;
                else connections[5] = null;

            }
        }

            }

        }

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
    public double getConductionLoss() {
        return 2;
    }

    @Override
    public int getInsulationEnergyAbsorption() {
        return 100000;
    }

    @Override
    public int getInsulationBreakdownEnergy() {
        return 200000;
    }

    @Override
    public int getConductorBreakdownEnergy() {
        return 100000;
    }

    @Override
    public void removeInsulation() {

    }

    @Override
    public void removeConductor() {

    }
    public void updateEntity() {
        this.updateConnections();
        int power = this.getWorldObj().getBlockMetadata(xCoord, yCoord, zCoord);
        
        
    }


    @Override
    public boolean acceptsEnergyFrom(TileEntity emitter, ForgeDirection direction) {
        return true;
    }

    @Override
    public boolean emitsEnergyTo(TileEntity receiver, ForgeDirection direction) {
        return true;
    }

    @Override
    public TileEntity getTileEntity(World world, int x, int y, int z) {
        return null;
    }

    @Override
    public TileEntity getNeighbor(TileEntity te, ForgeDirection dir) {
        return null;
    }

    @Override
    public long getTotalEnergyEmitted(TileEntity tileEntity) {
        return 100;
    }

    @Override
    public long getTotalEnergySunken(TileEntity tileEntity) {
        return 0;
    }

    @Override
    public int getPowerFromTier(int tier) {
        return 2;
    }
}
