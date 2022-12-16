// display prime no from 100 to 200

import java.util.Scanner;

class P19 {

	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		int a, i, b, c;
		System.out.print("Enter Two No. : ");
		a = in.nextInt();
		b = in.nextInt();
		System.out.println("Prime Numbers Between Entered No. are : ");
		for(i = a; i <= b; i++) {
			c = i % 2;
			if(c == 1) {
				System.out.println( i + " ");
			}

		}
		
	}

}