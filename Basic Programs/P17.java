// 17. enter a no. and print its reverse multiplication table .

import java.util.Scanner;

class P17 {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int a, T, i;
		System.out.println("Enter a No. : ");
		a = in.nextInt();
		System.out.println("Reverse table of given no. is : ");
		for(i = 10; i >=1; i--) {
			T = a*i;
			System.out.println(T + " ");
		}
	}

}