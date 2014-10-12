package com.fibonacci.MiscCraft.mob.render;

import com.fibonacci.MiscCraft.mob.CosmicBunny;
import com.fibonacci.MiscCraft.mob.entity.EntityCosmicBunny;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderCosmicBunny extends RenderLiving{
private static final ResourceLocation EntityTexture = new ResourceLocation("MiscCraft:textures/mobs/RoamingRam.png");
protected CosmicBunny model;
	public RenderCosmicBunny(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((CosmicBunny)mainModel);
	}
	
	public void renderMob(EntityCosmicBunny entity, double par2, double par4, double par6, float par8, float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}
	
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		renderMob((EntityCosmicBunny)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	public void doRender(Entity par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		renderMob((EntityCosmicBunny)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return EntityTexture;
	}

}
