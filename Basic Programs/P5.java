// 5. Write a program that accepts principle,rate and displays interest.

import java.util.Scanner;

class P5 {
	public static void main(String args []) {
		double P, r, t, SI, CI;
		Scanner c = new Scanner(System.in);
		System.out.println("Enter Principal Amount: " );
		P = c.nextDouble();
		System.out.println("Rate of Interest :" );
		r = c.nextDouble();
		System.out.println("Time Of loan : ");      // In Years
	                  t= c.nextDouble();
	
		SI = P*(r/100)*t;
		CI = (P*(Math.pow((1+r/100),t))) - P;
		System.out.println("Simple Interest is :" + SI);
		System.out.println("Compound Interest is :" +CI);
	}

}