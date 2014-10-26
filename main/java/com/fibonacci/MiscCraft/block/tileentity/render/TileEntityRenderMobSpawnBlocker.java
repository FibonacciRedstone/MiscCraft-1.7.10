package com.fibonacci.MiscCraft.block.tileentity.render;

import com.fibonacci.MiscCraft.common.ClientProxy;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

/**
 * Created by Fibonacci on 10/26/14.
 */
public class TileEntityRenderMobSpawnBlocker extends TileEntitySpecialRenderer {
    EntityLivingBase entity;
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float f) {

        GL11.glPushMatrix();

        GL11.glTranslated(x+0.5, y + 4 / 2, z+0.5);

        GL11.glScalef(10.0F, 10.0F, 10.0F);

        GL11.glEnable(GL11.GL_BLEND);

        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);

        GL11.glCallList(ClientProxy.sphereID);

        GL11.glPopMatrix();

    }

}
