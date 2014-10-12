package com.fibonacci.MiscCraft.mob;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class CosmicBunny extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer horn21;
    ModelRenderer horn11;
    ModelRenderer horn22;
    ModelRenderer horn12;
    ModelRenderer eye1;
    ModelRenderer horn23;
    ModelRenderer horn13;
    ModelRenderer eye2;
    ModelRenderer arm;
    ModelRenderer arm1;
    ModelRenderer arm2;
    ModelRenderer hand1;
    ModelRenderer hand2;
    ModelRenderer leg2;
    ModelRenderer leg1;
    ModelRenderer foot2;
    ModelRenderer foot1;
    ModelRenderer toe1;
    ModelRenderer toe2;
  
  public CosmicBunny()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4F, -8F, -4F, 9, 8, 9);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 11, 17, 11);
      body.setRotationPoint(-1F, 0F, -3F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      horn21 = new ModelRenderer(this, 40, 16);
      horn21.addBox(-3F, -2F, -2F, 5, 12, 5);
      horn21.setRotationPoint(-9F, -12F, 0F);
      horn21.setTextureSize(64, 64);
      horn21.mirror = true;
      setRotation(horn21, 0F, 0F, -0.8901179F);
      horn11 = new ModelRenderer(this, 40, 16);
      horn11.addBox(-1F, -2F, -2F, 5, 12, 5);
      horn11.setRotationPoint(9F, -12F, 0F);
      horn11.setTextureSize(64, 64);
      horn11.mirror = true;
      setRotation(horn11, 0F, 0F, 0.8922867F);
      horn22 = new ModelRenderer(this, 0, 16);
      horn22.addBox(-2F, 0F, -2F, 5, 9, 5);
      horn22.setRotationPoint(-14F, -20F, 0F);
      horn22.setTextureSize(64, 64);
      horn22.mirror = true;
      setRotation(horn22, 0F, 0F, -0.4363323F);
      horn12 = new ModelRenderer(this, 0, 16);
      horn12.addBox(-2F, 0F, -2F, 5, 9, 5);
      horn12.setRotationPoint(14F, -19F, 0F);
      horn12.setTextureSize(64, 64);
      horn12.mirror = true;
      setRotation(horn12, 0F, 0F, 0.4461433F);
      eye1 = new ModelRenderer(this, 0, 0);
      eye1.addBox(0F, 0F, 0F, 2, 2, 1);
      eye1.setRotationPoint(2F, -6F, -5F);
      eye1.setTextureSize(64, 64);
      eye1.mirror = true;
      setRotation(eye1, 0F, 0F, 0F);
      horn23 = new ModelRenderer(this, 0, 0);
      horn23.addBox(0F, 0F, 0F, 3, 9, 3);
      horn23.setRotationPoint(-18F, -28F, -1F);
      horn23.setTextureSize(64, 64);
      horn23.mirror = true;
      setRotation(horn23, 0F, 0F, -0.3346075F);
      horn13 = new ModelRenderer(this, 0, 0);
      horn13.addBox(0F, 0F, 0F, 3, 9, 3);
      horn13.setRotationPoint(16F, -27F, -1F);
      horn13.setTextureSize(64, 64);
      horn13.mirror = true;
      setRotation(horn13, 0F, 0.0174533F, 0.3346669F);
      eye2 = new ModelRenderer(this, 0, 0);
      eye2.addBox(0F, 0F, 0F, 2, 2, 1);
      eye2.setRotationPoint(-3F, -6F, -5F);
      eye2.setTextureSize(64, 64);
      eye2.mirror = true;
      setRotation(eye2, 0F, 0F, 0F);
      arm = new ModelRenderer(this, 0, 0);
      arm.addBox(0F, 0F, 0F, 21, 3, 3);
      arm.setRotationPoint(-10F, 4F, -1F);
      arm.setTextureSize(64, 64);
      arm.mirror = true;
      setRotation(arm, 0F, 0F, 0F);
      arm1 = new ModelRenderer(this, 0, 0);
      arm1.addBox(0F, 0F, 0F, 3, 10, 3);
      arm1.setRotationPoint(15.66667F, -2F, -1F);
      arm1.setTextureSize(64, 64);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, 0.8179294F);
      arm2 = new ModelRenderer(this, 0, 0);
      arm2.addBox(0F, 0F, 0F, 3, 9, 3);
      arm2.setRotationPoint(-17F, 1F, -1F);
      arm2.setTextureSize(64, 64);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, -0.8175122F);
      hand1 = new ModelRenderer(this, 0, 0);
      hand1.addBox(0F, 0F, 0F, 3, 3, 3);
      hand1.setRotationPoint(15F, -3F, -1F);
      hand1.setTextureSize(64, 64);
      hand1.mirror = true;
      setRotation(hand1, 0F, 0F, 0F);
      hand2 = new ModelRenderer(this, 0, 0);
      hand2.addBox(0F, 0F, 0F, 3, 3, 3);
      hand2.setRotationPoint(-17F, -2F, -1F);
      hand2.setTextureSize(64, 64);
      hand2.mirror = true;
      setRotation(hand2, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(-1F, 0F, 0F, 3, 8, 3);
      leg2.setRotationPoint(-3F, 15F, -1F);
      leg2.setTextureSize(64, 64);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 0);
      leg1.addBox(0F, 0F, 0F, 3, 9, 3);
      leg1.setRotationPoint(2F, 14F, -1F);
      leg1.setTextureSize(64, 64);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      foot2 = new ModelRenderer(this, 0, 0);
      foot2.addBox(0F, 0F, 0F, 5, 1, 5);
      foot2.setRotationPoint(-5F, 23F, -2F);
      foot2.setTextureSize(64, 64);
      foot2.mirror = true;
      setRotation(foot2, 0F, 0F, 0F);
      foot1 = new ModelRenderer(this, 0, 0);
      foot1.addBox(0F, 0F, 0F, 5, 1, 5);
      foot1.setRotationPoint(1F, 23F, -2F);
      foot1.setTextureSize(64, 64);
      foot1.mirror = true;
      setRotation(foot1, 0F, 0F, 0F);
      toe1 = new ModelRenderer(this, 0, 0);
      toe1.addBox(0F, 0F, 0F, 3, 1, 2);
      toe1.setRotationPoint(-4F, 23F, -4F);
      toe1.setTextureSize(64, 64);
      toe1.mirror = true;
      setRotation(toe1, 0F, 0F, 0F);
      toe2 = new ModelRenderer(this, 0, 0);
      toe2.addBox(0F, 0F, 0F, 3, 1, 2);
      toe2.setRotationPoint(2F, 23F, -4F);
      toe2.setTextureSize(64, 64);
      toe2.mirror = true;
      setRotation(toe2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    horn21.render(f5);
    horn11.render(f5);
    horn22.render(f5);
    horn12.render(f5);
    eye1.render(f5);
    horn23.render(f5);
    horn13.render(f5);
    eye2.render(f5);
    arm.render(f5);
    arm1.render(f5);
    arm2.render(f5);
    hand1.render(f5);
    hand2.render(f5);
    leg2.render(f5);
    leg1.render(f5);
    foot2.render(f5);
    foot1.render(f5);
    toe1.render(f5);
    toe2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
   
	 
	  
	  this.foot1.rotateAngleX = MathHelper.cos(f1 * .6662F) * 1.4F * f2;
	  this.foot1.rotateAngleY = 0.0F;
	  
	  this.foot2.rotateAngleX = MathHelper.cos(f1 * .6662F +(float)Math.PI) * 1.4F * f2;
	  
	  this.toe1.rotateAngleX = MathHelper.cos(f1 * .6662F) * 1.4F * f2;
	  this.toe1.rotateAngleY = 0.0F;
	  
	  this.toe2.rotateAngleX = MathHelper.cos(f1 * .6662F +(float)Math.PI) * 1.4F * f2;
	  
	  
  }

}

