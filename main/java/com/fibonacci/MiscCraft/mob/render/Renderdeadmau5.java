package com.fibonacci.MiscCraft.mob.render;

import com.fibonacci.MiscCraft.mob.deadmau5;
import com.fibonacci.MiscCraft.mob.entity.Entitydeadmau5;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;


public class Renderdeadmau5 extends RenderLiving{


    private static ResourceLocation EntityTexture = new ResourceLocation("MiscCraft:textures/mobs/deadmau5_default.png");
    protected deadmau5 model;
    public Renderdeadmau5(ModelBase par1ModelBase, float par2) {
        super(par1ModelBase, par2);
        model = ((deadmau5)mainModel);
    }





    public void renderMob(Entitydeadmau5 entity, double par2, double par4, double par6, float par8, float par9) {
        super.doRender(entity, par2, par4, par6, par8, par9);

    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMob((Entitydeadmau5)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    public void doRender(Entity par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
        renderMob((Entitydeadmau5)par1EntityLiving, par2, par4, par6, par8, par9);
    }


    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {

        return EntityTexture;
    }

}
