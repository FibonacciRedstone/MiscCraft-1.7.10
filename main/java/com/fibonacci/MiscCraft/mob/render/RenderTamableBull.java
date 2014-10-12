package com.fibonacci.MiscCraft.mob.render;

import com.fibonacci.MiscCraft.mob.TamableBull;
import com.fibonacci.MiscCraft.mob.entity.EntityTamableBull;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderTamableBull extends RenderLiving{
private static final ResourceLocation EntityTexture = new ResourceLocation("MiscCraft:textures/mobs/tamablebull.png");
protected TamableBull model;
	public RenderTamableBull(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((TamableBull)mainModel);
	}
	
	public void renderMob(EntityTamableBull entity, double par2, double par4, double par6, float par8, float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}
	
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		renderMob((EntityTamableBull)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	public void doRender(Entity par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		renderMob((EntityTamableBull)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		
		return EntityTexture;
	}

}

