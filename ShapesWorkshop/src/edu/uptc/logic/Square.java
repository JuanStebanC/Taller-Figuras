package edu.uptc.logic;
import java.awt.*;

import edu.uptc.presenter.Canvas;

/**
 * A square that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Square extends Figure
{
    private int size;    
    

    /**
     * Create a new square at default position with default color.
     */
    public Square()
    {
        size = 30;
        xPosition = 60;
        yPosition = 50;
        color = "red";
        isVisible = false;
    }

    @Override
    public void changeSize(int newSize) {
        
        erase();
        size = newSize;
        draw();
        
    }

    @Override
    public void changeSize(int newWidth, int newHeight) {
        
        
    }

    @Override
    public void draw() {
        
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, size, size));
            canvas.wait(10);
        }
        
    }


    
}
