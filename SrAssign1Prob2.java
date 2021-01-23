
import stanford.karel.*;

public class SrAssign1Prob2 extends SuperKarel{
	public void run(){
		for (int i = 0; i<3; i++){
			pickOnebeeper();
		}
}

 public void pickOnebeeper(){
		turnLeft();
		turnLeft();
		move();
		move();
		turnLeft();
		move();
		pickBeeper();
		turnLeft();
}

}