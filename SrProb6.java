//calculate Pythagorean Theorem

import acm.program.ConsoleProgram;

public class SrProb6 extends ConsoleProgram {
	public void run() {
		calPT();		
	}
	
	public void calPT() {
		println("Enter values to compute Pythagorean Theorem");
		int a  = readInt("a:");
		int b  = readInt("b:");
		if (a > 0 && b > 0) {
			double c = Math.sqrt(a*a + b*b);
			println("Pythagorean Theorem is" + c);
		} else {
			println("Enter a positive number");
		};
		
	}
	
}