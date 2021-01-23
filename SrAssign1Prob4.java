import stanford.karel.*;

public class SrAssign1Prob4 extends SuperKarel{
	public void run() {		
		oddColUp();
		moveDown();
		while(frontIsClear()) {
			toNextCol();
			evenColUp();
			moveDown();
			if(frontIsClear()) {
				toNextCol();
				oddColUp();
				moveDown();
			}
		}
		
	}
	
	public void oddColUp() {
		turnLeft();
		putBeeper();
		while(frontIsClear()){
			nextBeeper();
		}
	}
	
	public void moveDown() {
		turnAround();
		while(frontIsClear()) {
			move();
		}
		turnLeft();
		
	}
	
	public void evenColUp() {
		turnLeft();
		if(frontIsClear()) {
			move();
			putBeeper();
			while(frontIsClear()){
				nextBeeper();
			}
		}
	}
	
	
	public void nextBeeper() {
		move();
		if (frontIsClear()){
			move();
			putBeeper();
		}
	}
	
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	public void toNextCol() {
		if(frontIsClear()){
			move();
		}
	}
}