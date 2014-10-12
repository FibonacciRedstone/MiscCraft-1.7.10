package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.item.Item;

public class SapphireShard extends Item{
	public SapphireShard(int i)  {
		this.setCreativeTab(MiscCraft.MiscCraftTab);
		this.shouldRotateAroundWhenRendering();
	}
public boolean shouldRotateAroundWhenRendering(){
	return false;
}

	}
