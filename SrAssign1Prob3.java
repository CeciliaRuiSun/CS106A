import stanford.karel.*;

public class SrAssign1Prob3 extends SuperKarel{
	public void run() {
	
	repairOneArch();
	while(frontIsClear()){
	toNextArch();
	repairOneArch();
	}
}	
	public void repairOneArch() {
		turnLeft();
		for (int i = 0; i<10; i++){
		if (!beepersPresent()){
		putBeeper();
		} else{
		if (frontIsClear()){
		move();
		} else{
		break;
		}
		}
		}
		turnLeft();
		turnLeft();
		while(frontIsClear()){
		move();
		}
		turnLeft();
	}
	
	public void toNextArch(){
		for (int i = 0; i<4; i++){
		move();
		}
	}
}