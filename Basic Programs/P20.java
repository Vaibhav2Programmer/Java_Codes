// 20.  Print fibonocci series upto 20 elements.

import java.util.Scanner;

class P20 {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int f1 = 0, f2 = 1, ans, b;
	//	System.out.println("Enter The No. : " );
	//	a = in.nextInt();
		System.out.println("No. upto which series is needed : ");
		b = in.nextInt();
		while(f1<= b) {
			System.out.print(f1 +   " " );
			ans = f1 + f2;
			f1 = f2;
			f2 = ans;
			
		}
	
	}

}