package com.fibonacci.MiscCraft.item;

import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.StatCollector;

import java.util.List;

public class OP_Sword extends ItemSword{

	public OP_Sword(int i,ToolMaterial tm) {
		super(tm);
		this.setCreativeTab(MiscCraft.MiscCraftTab);
	}
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal("item.OpSword.desc");
    }
}
