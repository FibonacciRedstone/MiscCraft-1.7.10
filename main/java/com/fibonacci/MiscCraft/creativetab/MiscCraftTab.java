package com.fibonacci.MiscCraft.creativetab;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MiscCraftTab extends CreativeTabs{

	

	public MiscCraftTab(int par1, String par2Str) {
		super(par1, par2Str);
		
	}

	@Override
	public Item getTabIconItem() {

		return MiscCraft.MiscCraftTabIcon;
	}

}
