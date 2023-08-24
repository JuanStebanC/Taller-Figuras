package edu.uptc.logic;
import java.awt.*;

import edu.uptc.presenter.Canvas;

/**
 * A triangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Triangle extends Figure
{
    private int height;
    private int width; 
    

    /**
     * Create a new triangle at default position with default color.
     */
    public Triangle()
    {
        height = 30;
        width = 40;
        xPosition = 50;
        yPosition = 15;
        color = "green";
        isVisible = false;
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    @Override
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
        draw();
    }

    @Override
    public void draw() {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { xPosition, xPosition + (width/2), xPosition - (width/2) };
            int[] ypoints = { yPosition, yPosition + height, yPosition + height };
            canvas.draw(this, color, new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
        
    }

    @Override
    public void changeSize(int size) {
        // TODO Auto-generated method stub
        
    }


   


    
}

