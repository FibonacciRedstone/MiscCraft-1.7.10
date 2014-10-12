package com.fibonacci.MiscCraft.common.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Fibonacci on 8/10/14.
 */
public class MiscCraftConfig {
	public static boolean despawn;
    public static void initProps(File location){
        File mainfile = new File(location + "/MiscCraft.cfg");
        Configuration config = new Configuration(mainfile);
        despawn = config.get("Mob", "Does Fire Bull Despawn", false).getBoolean(false);
        
        if(config.hasChanged()){
            config.save();
        }
    }
}
