import stanford.karel.*;

public class SrAssign1Prob1 extends SuperKarel{
	public void run() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnLeft();
		turnLeft();
		move();
		move();
		move();
		turnRight();
		move();
		turnRight();
		
	}
	
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}