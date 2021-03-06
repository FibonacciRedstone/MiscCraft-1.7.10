package com.fibonacci.MiscCraft.mob;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class BigBoom extends ModelBase{

    ModelRenderer Cube;

    public BigBoom()
    {
        textureWidth = 16;
        textureHeight = 16;

        Cube = new ModelRenderer(this, 0, 0);
        Cube.addBox(0F, 0F, 0F, 16, 16, 16);
        Cube.setRotationPoint(0F, 0, 0F);
        Cube.setTextureSize(16, 16);
        Cube.mirror = true;
        setRotation(Cube, 0,0,0);
    }
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Cube.render(f5);

    }
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {

    }
    }