package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;
import com.fibonacci.MiscCraft.common.MiscCraft;
import com.fibonacci.MiscCraft.mob.entity.EntityBullBoss;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class BullSummonBlock extends BlockContainer{

	public BullSummonBlock() {
		super(Material.iron);
		this.setBlockBounds(0, 0, 0, 1, 0.65F, 1);
		this.lightOpacity = 0;
		this.setCreativeTab(MiscCraft.MiscCraftTab);
		
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		
		return new TileEntityBullSummonBlock();
	}
	public int getRenderType()
    {
        return -1;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean onBlockActivated(World w, int x, int y, int z, EntityPlayer p, int side, float hitX, float hitY, float hitZ)
    {
    	if(w.getBlockMetadata(x, y, z) >= 15){
    		if(!w.isRemote){
    		EntityBullBoss entityDragon = new EntityBullBoss(w);
            entityDragon.setLocationAndAngles(x, y, z, 1f, 1f);
            w.spawnEntityInWorld(entityDragon);
            w.setBlockToAir(x, y, z);
            w.setBlockToAir(x+1, y, z);
            w.setBlockToAir(x-1, y, z);
            w.setBlockToAir(x, y, z+1);
            w.setBlockToAir(x, y, z-1);
            w.setBlockToAir(x+1, y, z+1);
            w.setBlockToAir(x-1, y, z-1);
            w.setBlockToAir(x+1, y, z-1);
            w.setBlockToAir(x-1, y, z+1);
            
            
            w.setBlockToAir(x, y-1, z);
            w.setBlockToAir(x+1, y-1, z);
            w.setBlockToAir(x-1, y-1, z);
            w.setBlockToAir(x, y-1, z+1);
            w.setBlockToAir(x, y-1, z-1);
            w.setBlockToAir(x+1, y-1, z+1);
            w.setBlockToAir(x-1, y-1, z-1);
            w.setBlockToAir(x+1, y-1, z-1);
            w.setBlockToAir(x-1, y-1, z+1);
    		}
    	}else{
    		if(!w.isRemote){
    		p.addChatComponentMessage(new ChatComponentTranslation("I MUST HAVE MORE TREASURE", new Object[0]));
    		}
    	}
        return true;
    }
   
    public String getItemIconName()
    {
        return "MiscCraft:SpawnTamableBullPNG";
    }
    


   

}
