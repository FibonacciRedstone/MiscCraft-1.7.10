package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityWire;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;



public class Wire extends BlockContainer {


        public Wire() {

            super(Material.ground);
            float pixel = 1F/16F;
            this.useNeighborBrightness = true;
            this.setBlockBounds(11*pixel/2, 11*pixel/2, 11*pixel/2, 1-11*pixel/2, 1-11*pixel/2, 1-11*pixel/2);
        }
    @SideOnly(Side.CLIENT)
    public String getItemIconName()
    {
        return "MiscCraft:WirePNG";
    }

        public TileEntity createNewTileEntity(World w, int i) {
            return new TileEntityWire();
        }
        public int getRenderType(){
            return -1;
        }
        public boolean isOpaqueCube(){
            return false;
        }


        public boolean renderAsNormalBlock() {
            return false;
        }
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z)
        {

            TileEntityWire p = (TileEntityWire) w.getTileEntity(x, y, z);
                if (p != null) {
                    float pixel = 1F / 16F;
                    float minZ = 11 * pixel / 2 - (p.connections[2] != null ? (11 * pixel / 2) : 0);
                    float minX = 11 * pixel / 2 - (p.connections[5] != null ? (11 * pixel / 2) : 0);
                    float minY = 11 * pixel / 2 - (p.connections[1] != null ? (11 * pixel / 2) : 0);
                    float maxZ = 1 - 11 * pixel / 2 + (p.connections[4] != null ? (11 * pixel / 2) : 0);
                    float maxX = 1 - 11 * pixel / 2 + (p.connections[3] != null ? (11 * pixel / 2) : 0);
                    float maxY = 1 - 11 * pixel / 2 + (p.connections[0] != null ? (11 * pixel / 2) : 0);
                    this.setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);


                }
            return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);

        }

        public AxisAlignedBB getSelectedBoundingBoxFromPool(World w, int x, int y, int z)
        {
            TileEntityWire p = (TileEntityWire)w.getTileEntity(x, y, z);
            if(p != null) {
                float pixel = 1F / 16F;
                float minZ = 11 * pixel / 2 - (p.connections[2] != null ? (11 * pixel / 2) : 0);
                float minX = 11 * pixel / 2 - (p.connections[5] != null ? (11 * pixel / 2) : 0);
                float minY = 11 * pixel / 2 - (p.connections[1] != null ? (11 * pixel / 2) : 0);
                float maxZ = 1 - 11 * pixel / 2 + (p.connections[4] != null ? (11 * pixel / 2) : 0);
                float maxX = 1 - 11 * pixel / 2 + (p.connections[3] != null ? (11 * pixel / 2) : 0);
                float maxY = 1 - 11 * pixel / 2 + (p.connections[0] != null ? (11 * pixel / 2) : 0);
                this.setBlockBounds(minX, minY, minZ, maxX, maxY, maxZ);


            }
            return AxisAlignedBB.getBoundingBox(x + this.minX, y + this.minY, z + this.minZ, x + this.maxX, y + this.maxY, z + this.maxZ);
        }
    }
