package com.fibonacci.MiscCraft.block.worldgeneration;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class AntiOreWG implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId){
		case -1 : generateNether(world, random, chunkX*16, chunkZ*16);
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		
		}
		
	}

	public void generateSurface(World world, Random random, int x, int z) {
		
		for(int i = 0; i < 7; i++){
			int Xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(30);
			int Zcoords = z + random.nextInt(16);
			new WorldGenMinable(MiscCraft.AntiOre, 4).generate(world, random, Xcoords, Ycoords, Zcoords);
			
			
		}
		
	}

	public void generateNether(World world, Random random, int i, int j) {
		
		
	}

}