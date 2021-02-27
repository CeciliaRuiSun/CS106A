//Assignment 2-problem4: write a centered Target oval

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SrProb4 extends GraphicsProgram {
	public void run() {
		GOval outOval = drawOval(72/2);
		outOval.setFilled(true);
		outOval.setFillColor(Color.RED);
		
		GOval middleOval = drawOval(0.65*72/2);
		middleOval.setFilled(true);
		middleOval.setFillColor(Color.WHITE);
		
		GOval innerOval = drawOval(0.3*72/2);
		innerOval.setFilled(true);
		innerOval.setFillColor(Color.RED);
	}
	
	private int canvasCenterX() {
		// get canvas middle point X
		return getWidth()/2;
	}
	
	private int canvasCenterY() {
		// get canvas height
		return getHeight()/2;
	}
	
	public GOval drawOval(double r) {
		//draw a centered oval with radius r
		GOval myOval = new GOval(canvasCenterX()-r, canvasCenterY()-r, 2*r, 2*r);
		add(myOval);
		return myOval;
	}
	
}