package com.fibonacci.MiscCraft.mob.entity;

import com.fibonacci.MiscCraft.common.MiscCraft;
import net.minecraft.block.Block;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityTamableBull extends EntityMob
{

	





	


	public EntityTamableBull(World par1World) {
		super(par1World);
		this.setSize(1.1F, 2.2F);
		this.experienceValue(10);
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
		        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.63000000417232513D);
		        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
		        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15000.0D);
		    }
		   
	
		  
		   
		   protected void dropFewItems(boolean par1, int par2)
		    {
		        this.dropItem(MiscCraft.Sapphire, 1);
		    }

    
}