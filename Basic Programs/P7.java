// 7. Write a program to take input in celsius and the output in farenheit.

import java.util.Scanner;

class P7 {

	public static void main(String args []) {
		float C, F;
		char f;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Temperature value : " );  // In celsius
		C = in.nextFloat();
		F = (C*9f/5 + 32);
		System.out.println("Temperature in farenheit is : " + F + "F");
	}

}