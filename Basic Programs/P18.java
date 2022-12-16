// 18. enter a no. and check whether it is prime or composite

import java.util.Scanner;

class P18 {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int a, i, b;
		System.out.println("Enter a no. : ");
		a = in.nextInt();
		for( i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) 
				break;
		}		
		if(i == (int) (Math.sqrt(a) + 1))
			System.out.println("Prime");
	}
}
