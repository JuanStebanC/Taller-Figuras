package edu.uptc.logic;

import edu.uptc.presenter.Canvas;
import java.awt.*;

public class Octagon extends Figure{
	
	private int size;

    /**
     * Create a new octagon at default position with default color.
     */
    public Octagon()
    {
        size = 30;
        xPosition = 120;
        yPosition = 70;
        color = "yellow";
        isVisible = false;
    }

	@Override
	public void draw() {
	    if (isVisible) {
	        Canvas canvas = Canvas.getCanvas();

	        Polygon octagonShape = new Polygon();
	        for (int i = 0; i < 8; i++) {
	            double angle = Math.PI / 4 * i;
	            int endX = xPosition + (int) (size * Math.cos(angle));
	            int endY = yPosition + (int) (size * Math.sin(angle));
	            octagonShape.addPoint(endX, endY);
	        }

	        canvas.draw(this, color, octagonShape);
	        canvas.wait(10);
	    }
	}


	@Override
	public void changeSize(int newSize) {
		erase();
        size = newSize;
        draw();
	}

	@Override
	public void changeSize(int newWidth, int newHeight) {
		// TODO Auto-generated method stub
		
	}

}
