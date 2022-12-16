//16. write a program that accepts a  no. and print its table.

import java.util.Scanner;

class P16 {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int a, T = 0, i;
		System.out.println("Enter a No. : ");
		a = in.nextInt();
		System.out.println("Table of Given No. is :");
		for(i = 1; i <=10 ; i++) {
			T = a*i;
			System.out.println(T + " ");
			
				
		}
		
	}

}