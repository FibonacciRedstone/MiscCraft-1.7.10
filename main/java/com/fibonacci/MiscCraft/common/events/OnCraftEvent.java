package com.fibonacci.MiscCraft.common.events;


import com.fibonacci.MiscCraft.common.MiscCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.enchantment.Enchantment;

/**
 * Created by Fibonacci on 6/1/14.
 */
public class OnCraftEvent {
    @SubscribeEvent
    public void whencrafted(PlayerEvent.ItemCraftedEvent e){
        if(e.crafting.getItem() == MiscCraft.PlatinumIngot){
            e.player.triggerAchievement(MiscCraft.PlatinumIngotAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.GodSword){
            e.player.triggerAchievement(MiscCraft.GodSwordAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.GodPickaxe){
            e.player.triggerAchievement(MiscCraft.GodPickaxeAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.GodAxe){
            e.player.triggerAchievement(MiscCraft.GodAxeAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.GodShovel){
            e.player.triggerAchievement(MiscCraft.GodShovelAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.GodHoe){
            e.player.triggerAchievement(MiscCraft.GodHoeAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.FlightGiver){
            e.player.triggerAchievement(MiscCraft.FlightAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.GodChestplate){
            e.player.triggerAchievement(MiscCraft.GodChestplateAchievement);

            e.crafting.addEnchantment(Enchantment.aquaAffinity, 10);
            e.crafting.addEnchantment(Enchantment.blastProtection, 10);
            e.crafting.addEnchantment(Enchantment.featherFalling, 10);
            e.crafting.addEnchantment(Enchantment.projectileProtection, 10);
            e.crafting.addEnchantment(Enchantment.protection, 10);
            e.crafting.addEnchantment(Enchantment.respiration, 3);
            e.crafting.addEnchantment(Enchantment.unbreaking, 10);
        }
        if(e.crafting.getItem() == MiscCraft.GodLeggings){
            e.player.triggerAchievement(MiscCraft.GodLeggingsAchievement);

            e.crafting.addEnchantment(Enchantment.aquaAffinity, 10);
            e.crafting.addEnchantment(Enchantment.blastProtection, 10);
            e.crafting.addEnchantment(Enchantment.featherFalling, 10);
            e.crafting.addEnchantment(Enchantment.projectileProtection, 10);
            e.crafting.addEnchantment(Enchantment.protection, 10);
            e.crafting.addEnchantment(Enchantment.respiration, 3);
            e.crafting.addEnchantment(Enchantment.unbreaking, 10);
        }
        if(e.crafting.getItem() == MiscCraft.GodHelmet){
            e.player.triggerAchievement(MiscCraft.GodHelmetAchievement);

            e.crafting.addEnchantment(Enchantment.aquaAffinity, 10);
            e.crafting.addEnchantment(Enchantment.blastProtection, 10);
            e.crafting.addEnchantment(Enchantment.featherFalling, 10);
            e.crafting.addEnchantment(Enchantment.projectileProtection, 10);
            e.crafting.addEnchantment(Enchantment.protection, 10);
            e.crafting.addEnchantment(Enchantment.respiration, 3);
            e.crafting.addEnchantment(Enchantment.unbreaking, 10);
        }
        if(e.crafting.getItem() == MiscCraft.GodBoots){
            e.player.triggerAchievement(MiscCraft.GodBootsAchievement);
            e.crafting.addEnchantment(Enchantment.aquaAffinity, 10);
            e.crafting.addEnchantment(Enchantment.blastProtection, 10);
            e.crafting.addEnchantment(Enchantment.featherFalling, 10);
            e.crafting.addEnchantment(Enchantment.projectileProtection, 10);
            e.crafting.addEnchantment(Enchantment.protection, 10);
            e.crafting.addEnchantment(Enchantment.respiration, 3);
            e.crafting.addEnchantment(Enchantment.unbreaking, 10);
        }
        if(e.crafting.getItem() == MiscCraft.GodBow){
            e.player.triggerAchievement(MiscCraft.GodBowAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.Sapphire){
            e.player.triggerAchievement(MiscCraft.SapphireAchievement);
        }
        if(e.crafting.getItem() == MiscCraft.Ruby){
            e.player.triggerAchievement(MiscCraft.RubyAchievement);
        }

    }
}
