package com.fibonacci.MiscCraft.common.world.biome;

/**
 * Created by Fibonacci on 6/24/14.
 */
import java.util.Random;

import com.fibonacci.MiscCraft.common.MiscCraft;
import com.fibonacci.MiscCraft.mob.entity.Entitydeadmau5;

import net.minecraft.block.BlockFlower;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;


public class BiomePlatinumOre extends BiomeGenBase
{


    public BiomePlatinumOre(int par1)
    {
        super(par1);

        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(Entitydeadmau5.class, 5, 2, 6));
        this.topBlock = Blocks.dirt;
        this.fillerBlock = Blocks.stonebrick;
        this.setColor(16711680);
        this.theBiomeDecorator.bigMushroomsPerChunk = 10;
        this.theBiomeDecorator.treesPerChunk = 10;
        this.theBiomeDecorator.grassPerChunk = 100;
        this.setTemperatureRainfall(0, 1);
        this.getSkyColorByTemp(0.35F);
        this.waterColorMultiplier = 16711680;
        




    }



}
