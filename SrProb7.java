//This program ask user to put in a list of number until put in 0
//and find the largest and smallest value before 0


import acm.program.ConsoleProgram;

public class SrProb7 extends ConsoleProgram {
	public void run() {
		findValue();		
	}
	
	public void findValue() {
		println("This program finds largest and smallest numbers");
		int a = readInt("?");
		int smallest = a;
		int largest = a;
		if (a == 0) {
			println("0 is the only number in list");
		} else {
			int b = readInt("?");

			while(b!=0) {
				if (a > b) {
					smallest = b;
					largest = a;				
				}
				a = b;
				b = readInt("?");
			
			}
			
			println("smallest:" + smallest);
			println("largest:" + largest);
		}					

	}
	
}