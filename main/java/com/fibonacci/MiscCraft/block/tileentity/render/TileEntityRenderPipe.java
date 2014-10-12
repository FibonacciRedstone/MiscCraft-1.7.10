package com.fibonacci.MiscCraft.block.tileentity.render;

import com.fibonacci.MiscCraft.block.tileentity.TileEntityPipe;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

/**
 * Created by Fibonacci on 6/15/14.
 */
public class TileEntityRenderPipe extends TileEntitySpecialRenderer{

    ResourceLocation texture = new ResourceLocation("misccraft", "textures/blocks/pipe.png");
    boolean drawInside = true;
    float pixel = 1F/16F;
    float texturePixel = 1F/32F;
    @Override
    public void renderTileEntityAt(TileEntity ti, double tx, double ty, double tz, float f) {

        GL11.glTranslated(tx, ty, tz);
        GL11.glDisable(GL11.GL_LIGHTING);
        this.bindTexture(texture);
        {
            TileEntityPipe pipe = (TileEntityPipe)ti;
            if(!pipe.oneopisite(pipe.connections)){
            	drawCore(ti);
            	
            	for(int i = 0; i < pipe.connections.length; i++){
                    if(pipe.connections[i] != null){
                        drawConnection(pipe.connections[i]);
                    }
                }
            }else{
            	for(int i = 0; i < pipe.connections.length; i++){
                    if(pipe.connections[i] != null){
                        drawStraight(pipe.connections[i]);
                        break;
                    }
                }
            }


            


        }

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glTranslated(-tx, -ty, -tz);

    }
    public void drawStraight(ForgeDirection d){
    	Tessellator t = Tessellator.instance;
        t.startDrawingQuads();
        {
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            
             if(d.equals(ForgeDirection.SOUTH) || (d.equals(ForgeDirection.NORTH))){
           GL11.glRotated(90, 1, 0, 0);
            }
            
            else if(d.equals(ForgeDirection.WEST) || d.equals(ForgeDirection.EAST)){
                GL11.glRotated(90, 0, 0, 1);
            }
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);


            t.addVertexWithUV(1 - 11 * pixel / 2,0, 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1 , 1-11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 1-11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 0, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);


            t.addVertexWithUV(11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);

            t.addVertexWithUV(1-11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1,11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 1-11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 0, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);

            t.addVertexWithUV(11 * pixel / 2, 0, 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,1-11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);

        if(drawInside){
            
        	t.addVertexWithUV(11 * pixel / 2, 0, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
        	t.addVertexWithUV(11 * pixel / 2,1, 1-11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
        	 t.addVertexWithUV(1 - 11 * pixel / 2,1 , 1-11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
        	t.addVertexWithUV(1 - 11 * pixel / 2,0, 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
           
            
            

        	 t.addVertexWithUV(1 - 11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
        	 t.addVertexWithUV(1 - 11 * pixel / 2,1, 11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
        	 t.addVertexWithUV(11 * pixel / 2, 1,11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            
            
           
            t.addVertexWithUV(1 - 11 * pixel / 2, 0, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 1-11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1,11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            
           
            
            t.addVertexWithUV(11 * pixel / 2, 0, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 11 * pixel / 2, 26 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,1-11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 0, 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,1-11 * pixel / 2, 26 * texturePixel, 5 * texturePixel);
            
            



        }


        }
        t.draw();
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
         if(d.equals(ForgeDirection.SOUTH) || (d.equals(ForgeDirection.NORTH))){
            GL11.glRotated(-90, 1, 0, 0);
             }
        else if(d.equals(ForgeDirection.WEST) || d.equals(ForgeDirection.EAST)){
            GL11.glRotated(-90, 0, 0, 1);
        }
        
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
    	
    }
    
    public void drawConnection(ForgeDirection d){

        Tessellator t = Tessellator.instance;
        t.startDrawingQuads();
        {
            GL11.glTranslatef(0.5F, 0.5F, 0.5F);
            if(d.equals(ForgeDirection.UP)){
                //ROTATE
            }else if(d.equals(ForgeDirection.DOWN)){
                GL11.glRotated(180, 1, 0, 0);
            }
            else if(d.equals(ForgeDirection.SOUTH)){
            GL11.glRotated(90, 1, 0, 0);
            }
            else if(d.equals(ForgeDirection.NORTH)){
                GL11.glRotated(270, 1, 0, 0);
            }
            else if(d.equals(ForgeDirection.WEST)){
                GL11.glRotated(90, 0, 0, 1);
            }
            else if(d.equals(ForgeDirection.EAST)){
                GL11.glRotated(270, 0, 0, 1);
            }
            GL11.glTranslatef(-0.5F, -0.5F, -0.5F);


            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1 , 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);


            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);

            t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1,11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);

            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);

        if(drawInside){
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1 , 1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);




            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);



            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2,1, 1-11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1,11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);



            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2,1, 11 * pixel / 2, 10 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1,1-11 * pixel / 2, 10 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);




        }


        }
        t.draw();
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        if(d.equals(ForgeDirection.UP)){
            //ROTATE
        }else if(d.equals(ForgeDirection.DOWN)){
            GL11.glRotated(-180, 1, 0, 0);
        }
        else if(d.equals(ForgeDirection.SOUTH)){
            GL11.glRotated(-90, 1, 0, 0);
        }
        else if(d.equals(ForgeDirection.NORTH)){
            GL11.glRotated(-270, 1, 0, 0);
        }
        else if(d.equals(ForgeDirection.WEST)){
            GL11.glRotated(-90, 0, 0, 1);
        }
        else if(d.equals(ForgeDirection.EAST)){
            GL11.glRotated(-270, 0, 0, 1);
        }
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);

    }
    public void drawCore(TileEntity ti) {

        Tessellator t = Tessellator.instance;
        t.startDrawingQuads();
        {

            t.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            t.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
            t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);

            if(drawInside){
                t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);


                t.addVertexWithUV(1 - 11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(1 - 11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);


                t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);

                t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);

                t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 0 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 1-11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);

                t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 0 * texturePixel, 5 * texturePixel);
                t.addVertexWithUV(1-11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 0 *texturePixel, 0 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 11 * pixel / 2, 5 * texturePixel, 0 * texturePixel);
                t.addVertexWithUV(11 * pixel / 2, 11 * pixel / 2, 1-11 * pixel / 2, 5 * texturePixel, 5 * texturePixel);
            }

        }
        t.draw();

    }
}
