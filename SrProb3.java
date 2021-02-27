//Assignment 2-problem3: write a centered pyramid

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class SrProb3 extends GraphicsProgram {
	public void run() {
		drawPyramid(14,30,12);
	}
	
	private int canvasCenterX() {
		// get canvas middle point X
		return getWidth() / 2;
	}
	
	private int canvasHeight() {
		// get canvas height
		return getHeight();
	}
	
	public void drawPyramid(int n, int width, int height) {
		int num = n;
		for(int j=0;j<num;j++) {
			//loop height
			int startX = canvasCenterX()-width*n/2;  //start X of a row
			int startY = canvasHeight()-height*(j+1);      //start Y of a row
			for(int i=0;i<n;i++) {
				//draw one row of rectangle
				GRect myRectangle = new GRect(startX+i*width, startY,width,height);
				add(myRectangle);
			}
			n--;
		}
	}
	
}