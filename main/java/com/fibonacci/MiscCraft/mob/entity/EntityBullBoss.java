package com.fibonacci.MiscCraft.mob.entity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

import com.fibonacci.MiscCraft.common.config.MiscCraftConfig;

public class EntityBullBoss extends EntityMob implements IBossDisplayData{
	MiscCraftConfig cfg;
    public Random rand;
    public int getHealth = 1000;
    public int getMaxHealth = 1000;


    public EntityBullBoss(World par1World) {
        super(par1World);
        this.setSize(2.1F, 3.2F);
        this.preventEntitySpawning = true;

        this.isImmuneToFire = true;


    }
    protected boolean canDespawn()
    {
        return cfg.despawn;
    }


    private int experienceValue() {

        return 999999;

    }


    protected String getLivingSound() {
        return "mob.ghast.moan";
    }

    protected String getDeathSound() {
        return "mob.ghast.moan";
    }

    protected String getHurtSound() {
        return "mob.ghast.moan";
    }

    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {
        this.playSound("mob.ghast.moan", 0.15f, 1.0f);
    }


    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.60000001192092896D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15000);

    }

    public void onLivingUpdate() {
        super.onLivingUpdate();

        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posY);
        int k = MathHelper.floor_double(this.posZ);
        EntityPlayer entityplayer = this.worldObj.getClosestPlayer((double)((float)this.posX + 10.5F), (double)((float)this.posY + 10.5F), (double)((float)this.posZ + 10.5F), 10.0D);
                for (int l = 0; l < 4; ++l) {
            i = MathHelper.floor_double(this.posX + (double) ((float) (l % 2 * 2 - 1) * 0.25F));
            j = MathHelper.floor_double(this.posY);
            k = MathHelper.floor_double(this.posZ + (double) ((float) (l / 2 % 2 * 2 - 1) * 0.25F));

            if (this.worldObj.getBlock(i, j, k).getMaterial() == Material.air && Blocks.fire.canPlaceBlockAt(this.worldObj, i, j, k)) {
                this.worldObj.setBlock(i, j, k, Blocks.fire);
            }
        }
        if(entityplayer != null){
            entityplayer.addPotionEffect(new PotionEffect(Potion.hunger.id, 1000, 10));
        }


    }




    protected EntityTamableBull createInstance1() {
        return new EntityTamableBull(this.worldObj);
    }

    public void setDead() {


        if (!this.worldObj.isRemote && this.getHealth() <= 0.0F) {

            this.worldObj.spawnParticle("heart", this.posX, this.posY+5, this.posZ, 100.0D, 100.0D, 100.0D);
            EntityTamableBull entityslime = this.createInstance1();

            entityslime.setLocationAndAngles(this.posX, this.posY, this.posZ, 1f, 1.0F);
            this.worldObj.spawnEntityInWorld(entityslime);


        }


        super.setDead();
    }


    protected EntityBoss createInstance() {
        return new EntityBoss(this.worldObj);
    }

    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) {
    	
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posY);
        int k = MathHelper.floor_double(this.posZ);
        
        EntityBoss entityslime = this.createInstance();
        entityslime.setLocationAndAngles(this.posX, this.posY, this.posZ, 1F, 1.0F);
        this.worldObj.spawnEntityInWorld(entityslime);

        this.worldObj.newExplosion(this, i + 2, j, k + 2, 1.0F, false, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
        this.worldObj.newExplosion(this, i - 2, j, k - 2, 1.0F, false, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
        this.worldObj.newExplosion(this, i + 2, j, k - 2, 1.0F, false, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
        this.worldObj.newExplosion(this, i - 2, j, k + 2, 1.0F, false, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));

    	
    }




        }

	    
	    




	 


