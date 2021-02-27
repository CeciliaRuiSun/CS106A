//hailstone problem

import acm.program.ConsoleProgram;

public class SrProb8 extends ConsoleProgram {
	public void run() {
		hailstone();	
	}
	
	public void hailstone() {
		int n = readInt("Enter an interger:");
		while (n == 0) {
			println("Please enter an interger greater than 0");
			n = readInt("Enter an interger:");
		}
		nextNum(n);
	}		
	
	public void nextNum(int n) {
		int i = 0;
		while (n!=1) {
			if (n % 2 == 1) {     //If n is odd, multiply it by three and add one				
				println(n + " is odd, so I make 3n + 1:" + (3 * n +1));
				n = 3 * n +1;
			} else {
				println(n + " is even, so I make n / 2:" + (n / 2));
				n = n/ 2;         //If n is even, divide it by two
			}
			i++;
		}
		
		println("The process takes " + i + " steps to reach 1");
	
}
	
}