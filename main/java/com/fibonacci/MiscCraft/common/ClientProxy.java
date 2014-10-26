package com.fibonacci.MiscCraft.common;

import com.fibonacci.MiscCraft.block.tileentity.*;
import com.fibonacci.MiscCraft.block.tileentity.render.*;
import com.fibonacci.MiscCraft.mob.*;
import com.fibonacci.MiscCraft.mob.entity.*;
import com.fibonacci.MiscCraft.mob.render.*;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Sphere;

public class ClientProxy extends CommonProxy{
    public static int sphereID;

	
	public void RenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderMoaner.class, new RenderEnderMoaner(new EnderMoaner(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoss.class, new RenderBoss(new Boss(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityCosmicBunny.class, new RenderCosmicBunny(new CosmicBunny(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityBullBoss.class, new RenderBullBoss(new BullBoss(), 0.3f));
		RenderingRegistry.registerEntityRenderingHandler(EntityTamableBull.class, new RenderTamableBull(new TamableBull(), 0.3f));
        RenderingRegistry.registerEntityRenderingHandler(Entitydeadmau5.class, new Renderdeadmau5(new deadmau5(), 0.3f));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class, new TileEntityRenderWindmill());
		        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySolarPanel.class, new TileEntityRenderSolarPanel());
        ClientRegistry.registerTileEntity(TileEntitySolarPanel.class, "TileEntitySolarPanel", new TileEntityRenderSolarPanel());
        ClientRegistry.registerTileEntity(TileEntityWire.class, "TileEntityWire", new TileEntityRenderWire());
        ClientRegistry.registerTileEntity(TileEntityDiamondRadar.class, "TileEntityRandomBlock", new TileEntityRenderDiamondRadar());
        ClientRegistry.registerTileEntity(TileEntityWindmillFloor.class, "TileEntityWindmillFloor", new TileEntityRenderWindmillFloor());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBeerStill.class, new TileEntityRenderBeerStill());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDiamondRadar.class, new TileEntityRenderDiamondRadar());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWire.class, new TileEntityRenderWire());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPipe.class, new TileEntityRenderPipe());
        ClientRegistry.registerTileEntity(TileEntityLights.class, "TileEntityLights", new TileEntityRenderLights());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLights.class, new TileEntityRenderLights());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBullSummonBlock.class, new TileEntityRenderBullSummonBlock());
        RenderingRegistry.registerEntityRenderingHandler(EntityBigBoomPrimed.class, new RenderBigBoom(new BigBoom(), 0.3f));
        ClientRegistry.registerTileEntity(TileEntityHydrant.class, "TileEnityHydrant", new TileEntityRenderHydrant());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityHydrant.class, new TileEntityRenderHydrant());
        ClientRegistry.registerTileEntity(TileEntityCraftingChest.class, "TileEntityCraftingChest", new TileEntityRenderCraftingChest());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCraftingChest.class, new TileEntityRenderCraftingChest());
        ClientRegistry.registerTileEntity(TileEntityMobSpawnBlocker.class, "TileEntityMobSpawnBlocker", new TileEntityRenderMobSpawnBlocker());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMobSpawnBlocker.class, new TileEntityRenderMobSpawnBlocker());
        renderSphere();
    }
    public void renderSphere() {
//GLU.Sphere
        Sphere sphere = new Sphere();
//GLU_POINT will render it as dots.
//GLU_LINE will render as wireframe
//GLU_SILHOUETTE will render as ?shadowed? wireframe
//GLU_FILL as a solid.
        sphere.setDrawStyle(GLU.GLU_FILL);
//GLU_SMOOTH will try to smoothly apply lighting
//GLU_FLAT will have a solid brightness per face, and will not shade.
//GLU_NONE will be completely solid, and probably will have no depth to it's appearance.
        sphere.setNormals(GLU.GLU_SMOOTH);
//GLU_INSIDE will render as if you are inside the sphere, making it appear inside out.(Similar to how ender portals are rendered)
        sphere.setOrientation(GLU.GLU_OUTSIDE);
        sphereID = GL11.glGenLists(1);
//Create a new list to hold our sphere data.
        GL11.glNewList(sphereID, GL11.GL_COMPILE);
//binds the texture
        Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation("modid:textures/entity/sphere.png"));
//The drawing the sphere is automattically doing is getting added to our list. Careful, the last 2 variables
//control the detail, but have a massive impact on performance. 32x32 is a good balance on my machine.s
        sphere.draw(0.5F, 32, 32);
        //Tell LWJGL that we are done creating our list.
        GL11.glEndList();

    }
}
