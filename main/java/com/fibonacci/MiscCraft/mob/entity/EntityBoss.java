package com.fibonacci.MiscCraft.mob.entity;

import com.fibonacci.MiscCraft.common.MiscCraft;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityFlying;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.IMob;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityBoss extends EntityMob{

	public EntityBoss(World par1World) {
		super(par1World);
		this.setSize(1.0F, 1.0F);
		this.experienceValue(100);
        this.preventEntitySpawning = true;
        this.isImmuneToFire = true;
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
		
	
		
		   protected void applyEntityAttributes()
		    {
		        super.applyEntityAttributes();
		        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.43000000417232513D);
		        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);

		    }

		   
		   
	protected Item getDropItem()
    {
        return MiscCraft.StarDust;
    }




	 

}
