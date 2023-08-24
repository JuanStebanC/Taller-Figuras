package edu.uptc.logic;

import java.awt.geom.*;

import edu.uptc.presenter.Canvas;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Circle extends Figure
{
    private int diameter;

    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        diameter = 30;
        xPosition = 20;
        yPosition = 60;
        color = "blue";
        isVisible = false;
    }

    @Override
    public void changeSize(int newDiameter) {
        
        erase();
        diameter = newDiameter;
        draw();
        
    }
    @Override
    public void changeSize(int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void draw() {
        
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                    diameter, diameter));
            canvas.wait(10);
        }
        
    }

        

}

