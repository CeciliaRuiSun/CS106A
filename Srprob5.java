//Assignment 2-problem5: 4 rectangle with text CS106A

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Srprob5 extends GraphicsProgram {
	public void run() {
		drawRect(250,150,50);
	}

	private int canvasCenterX() {
		// get canvas middle point X
		return getWidth()/2;
	}
	
	private int canvasCenterY() {
		// get canvas height
		return getHeight()/2;
	}
	
	public void drawRect(double width, double height, double space) {
		double rectStartX1 = canvasCenterX() - width - space/2;
		double rectStartY1 = canvasCenterY() - height - space/2;
		
		double rectStartX2 = rectStartX1 + width + space;
		double rectStartY2 =rectStartY1 + height + space;
		
		GLabel addLabel = new GLabel("CS106A");
		double labelHeight = addLabel.getHeight();
		double labelWidth = addLabel.getWidth();
		
		double labelStartX1 = rectStartX1 + (width - labelWidth)/2;
		double labelStartY1 = rectStartY1 + (height - labelHeight)/2;
		
		double labelStartX2 = rectStartX2 + (width - labelWidth)/2;
		double labelStartY2 = rectStartY2 + (height - labelHeight)/2;
		
		GRect rectTopLeft = new GRect(rectStartX1, rectStartY1,width,height);
		add(rectTopLeft);
		add(new GLabel("CS106A",labelStartX1,labelStartY1));
		
		GRect rectTopRight = new GRect(rectStartX2, rectStartY1,width,height);
		add(rectTopRight);
		add(new GLabel("CS106A",labelStartX2,labelStartY1));
		
		GRect rectBotLeft = new GRect(rectStartX1, rectStartY2,width,height);
		add(rectBotLeft);
		add(new GLabel("CS106A",labelStartX1,labelStartY2));
		
		GRect rectBotRight = new GRect(rectStartX2, rectStartY2,width,height);
		add(rectBotRight);
		add(new GLabel("CS106A",labelStartX2,labelStartY2));
		
	}
	
	
}