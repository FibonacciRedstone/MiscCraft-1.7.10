package com.fibonacci.MiscCraft.mob.entity;


import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World; 

public class EntityEnderMoaner extends EntityMob{

	public EntityEnderMoaner(World par1World) {
		super(par1World);
		this.setSize(1.0F, 1.0F);
		this.experienceValue(10);
		
		
	}


	private void experienceValue(int i) {
		
		
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
		protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) 
		{
			this.playSound("mob.ghast.moan", 0.15f, 1.0f);
		}
		
	protected Entity findPlayerToAttack() {
		EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity(this, 16.0D);
		return entityplayer != null && this.canEntityBeSeen(entityplayer) ? entityplayer : null;
		
	}
	   protected void applyEntityAttributes()
	    {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.35000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);

	    }
	
	public int dropchance = rand.nextInt(5);
	
	protected Item getDropItem()
    {
        return MiscCraft.EnderDust;
    }

    protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(2 + par2);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(MiscCraft.RawAntiMetal, 1);
        }

        j = this.rand.nextInt(2 + par2);

        for (k = 0; k < j; ++k)
        {
            this.dropItem(MiscCraft.AntiMetalNugget, 1);
        }
    }
	 

}
