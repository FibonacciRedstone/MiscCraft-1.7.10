package com.fibonacci.MiscCraft.item;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

/**
 * Created by Fibonacci on 6/16/14.
 */
public class RubyFuel implements IFuelHandler{

    public int getBurnTime(ItemStack fuel) {
        return 100000;
    }
}
