//Assignment 2-problem1: write a centered rectangle

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SrProb1 extends GraphicsProgram {
	public void run() {
		drawRect(350,270);
	}
	
	private int canvasCenterX() {
		// get middle point X
		return getWidth() / 2;
	}
	
	private int canvasCenterY() {
		// get middle point Y
		return getHeight() / 2;
	}
	
	public void drawRect(int width, int height) {
		GRect myRectangle = new GRect(canvasCenterX()-width/2, canvasCenterY()-height/2,width,height);
		myRectangle.setFilled(true);
		myRectangle.setFillColor(Color.BLUE);	
		add(myRectangle);
	}
	
}