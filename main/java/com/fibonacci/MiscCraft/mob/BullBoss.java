package com.fibonacci.MiscCraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class BullBoss extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer HornL1;
    ModelRenderer HornR1;
    ModelRenderer HornL2;
    ModelRenderer HornR2;
    ModelRenderer HornL3;
    ModelRenderer HornR3;
    ModelRenderer HornL4;
    ModelRenderer HornR4;
    ModelRenderer Leg1;
    ModelRenderer Leg2;
    ModelRenderer Leg3;
    ModelRenderer Leg4;

  
  public BullBoss()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 14, 14, 39);
      Body.setRotationPoint(2F, -10F, -7F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(0F, 0F, 0F, 18, 18, 8);
      Head.setRotationPoint(0F, -12F, -15F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      HornL1 = new ModelRenderer(this, 0, 0);
      HornL1.addBox(0F, 0F, 0F, 8, 5, 5);
      HornL1.setRotationPoint(18F, -11F, -14F);
      HornL1.setTextureSize(64, 32);
      HornL1.mirror = true;
      setRotation(HornL1, 0F, 0F, 0F);
      HornR1 = new ModelRenderer(this, 0, 0);
      HornR1.addBox(0F, 0F, 0F, 8, 5, 5);
      HornR1.setRotationPoint(-8F, -11F, -14F);
      HornR1.setTextureSize(64, 32);
      HornR1.mirror = true;
      setRotation(HornR1, 0F, 0F, 0F);
      HornL2 = new ModelRenderer(this, 0, 0);
      HornL2.addBox(0F, 0F, 0F, 8, 5, 5);
      HornL2.setRotationPoint(23F, -10F, -14F);
      HornL2.setTextureSize(64, 32);
      HornL2.mirror = true;
      setRotation(HornL2, 0F, 0F, -0.7435801F);
      HornR2 = new ModelRenderer(this, 0, 0);
      HornR2.addBox(0F, 0F, 0F, 8, 5, 5);
      HornR2.setRotationPoint(-10F, -15F, -14F);
      HornR2.setTextureSize(64, 32);
      HornR2.mirror = true;
      setRotation(HornR2, 0F, 0F, 0.7435722F);
      HornL3 = new ModelRenderer(this, 0, 0);
      HornL3.addBox(0F, 0F, 0F, 8, 5, 5);
      HornL3.setRotationPoint(28F, -14F, -14F);
      HornL3.setTextureSize(64, 32);
      HornL3.mirror = true;
      setRotation(HornL3, 0F, 0F, -1.115353F);
      HornR3 = new ModelRenderer(this, 0, 0);
      HornR3.addBox(0F, 0F, 0F, 8, 5, 5);
      HornR3.setRotationPoint(-12F, -20F, -14F);
      HornR3.setTextureSize(64, 32);
      HornR3.mirror = true;
      setRotation(HornR3, 0F, 0F, 1.115358F);
      HornL4 = new ModelRenderer(this, 0, 0);
      HornL4.addBox(0F, 0F, 0F, 8, 3, 3);
      HornL4.setRotationPoint(32F, -19F, -13F);
      HornL4.setTextureSize(64, 32);
      HornL4.mirror = true;
      setRotation(HornL4, 0F, 0F, -1.233878F);
      HornR4 = new ModelRenderer(this, 0, 0);
      HornR4.addBox(0F, 0F, 0F, 8, 3, 3);
      HornR4.setRotationPoint(-15F, -25F, -13F);
      HornR4.setTextureSize(64, 32);
      HornR4.mirror = true;
      setRotation(HornR4, 0F, 0F, 1.226894F);
      Leg1 = new ModelRenderer(this, 0, 0);
      Leg1.addBox(0F, 0F, 0F, 4, 19, 4);
      Leg1.setRotationPoint(3F, 4F, -6F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 0, 0);
      Leg2.addBox(0F, 0F, 0F, 4, 19, 4);
      Leg2.setRotationPoint(3F, 4F, 24F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Leg3 = new ModelRenderer(this, 0, 0);
      Leg3.addBox(0F, 0F, 0F, 4, 19, 4);
      Leg3.setRotationPoint(11F, 4F, 24F);
      Leg3.setTextureSize(64, 32);
      Leg3.mirror = true;
      setRotation(Leg3, 0F, 0F, 0F);
      Leg4 = new ModelRenderer(this, 0, 0);
      Leg4.addBox(0F, 0F, 0F, 4, 19, 4);
      Leg4.setRotationPoint(11F, 4F, -6F);
      Leg4.setTextureSize(64, 32);
      Leg4.mirror = true;
      setRotation(Leg4, 0F, 0F, 0F);

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Head.render(f5);
    HornL1.render(f5);
    HornR1.render(f5);
    HornL2.render(f5);
    HornR2.render(f5);
    HornL3.render(f5);
    HornR3.render(f5);
    HornL4.render(f5);
    HornR4.render(f5);
    Leg1.render(f5);
    Leg2.render(f5);
    Leg3.render(f5);
    Leg4.render(f5);

  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float f2, float f3, float f4, float f5)
  {
      this.Leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
      this.Leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.Leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
      this.Leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;




  }

}
