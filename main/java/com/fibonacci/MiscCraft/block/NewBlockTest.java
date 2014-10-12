package com.fibonacci.MiscCraft.block;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class NewBlockTest extends BlockOre{

	public NewBlockTest(int i) {

		this.setCreativeTab(MiscCraft.MiscCraftTab);
		this.setHardness(4F);
		this.setResistance(5.0F);
		
		this.setHarvestLevel("pickaxe", 2);

		
		
	}
    public Item getItemDropped(int i, Random random, int j)
    {

        return MiscCraft.RubyShard;
    }
    
    public int quantityDropped(Random rand){

        return rand.nextInt(1) + 1;
    }


    public void dropXpOnBlockBreak(World p_149657_1_, int p_149657_2_, int p_149657_3_, int p_149657_4_, int p_149657_5_)
    {
        if (!p_149657_1_.isRemote)
        {
            while (p_149657_5_ > 0)
            {
                int i1 = EntityXPOrb.getXPSplit(p_149657_5_);
                p_149657_5_ -= i1;
                p_149657_1_.spawnEntityInWorld(new EntityXPOrb(p_149657_1_, (double)p_149657_2_ + 0.5D, (double)p_149657_3_ + 0.5D, (double)p_149657_4_ + 0.5D, i1));
            }
        }
    }
//    @Override
//    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
//        if(!p_149727_1_.isRemote) {
//            if (this.getenergyprovider(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_6_)) {
//                if (p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_) > 0) {
//                    p_149727_1_.setBlock(p_149727_2_, p_149727_3_ + p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_), p_149727_4_, Blocks.diamond_block);
//                }
//            }System.out.println(p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_));
//        }
//        return true;
//    }
//    float metad;
//    public boolean getenergyprovider(World w, int x, int y, int z, int metadata){
//        metad = w.getBlockMetadata(x, y, z);
//        if(w.getBlock(x+1, y, z) == MiscCraft.PlatinumBlock ){
//            int meta = w.getBlockMetadata(x+1, y, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x-1, y, z) == MiscCraft.PlatinumBlock ){
//            int meta = w.getBlockMetadata(x-1, y, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x, y+1, z) == MiscCraft.PlatinumBlock ){
//            int meta = w.getBlockMetadata(x, y+1, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x, y-1, z) == MiscCraft.PlatinumBlock ){
//            int meta = w.getBlockMetadata(x, y-1, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x, y, z+1) == MiscCraft.PlatinumBlock ){
//            int meta = w.getBlockMetadata(x, y, z+1);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x, y, z-1) == MiscCraft.PlatinumBlock ){
//            int meta = w.getBlockMetadata(x, y, z-1);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x+1, y, z) == MiscCraft.Wire && w.getBlockMetadata(x+1, y, z) >= 1){
//            int meta = w.getBlockMetadata(x+1, y, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x-1, y, z) == MiscCraft.Wire && w.getBlockMetadata(x-1, y, z) >= 1){
//            int meta = w.getBlockMetadata(x-1, y, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//
//
//
//        if(w.getBlock(x, y+1, z) == MiscCraft.Wire && w.getBlockMetadata(x, y+1, z) >= 1){
//            int meta = w.getBlockMetadata(x, y, z+1);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x, y+1, z) == MiscCraft.Wire && w.getBlockMetadata(x, y-1, z) >= 1){
//            int meta = w.getBlockMetadata(x, y-1, z);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//
//        if(w.getBlock(x, y, z+1) == MiscCraft.Wire && w.getBlockMetadata(x, y, z+1) >= 1){
//            int meta = w.getBlockMetadata(x, y, z+1);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//        if(w.getBlock(x, y, z-1) == MiscCraft.Wire && w.getBlockMetadata(x, y, z-1) >= 1){
//            int meta = w.getBlockMetadata(x, y, z-1);
//            w.setBlockMetadataWithNotify(x, y, z, meta, 1);
//        }else{
//            w.setBlockMetadataWithNotify(x, y, z, 0, 1);
//        }
//
//
//        return true;
//    }

    
}
