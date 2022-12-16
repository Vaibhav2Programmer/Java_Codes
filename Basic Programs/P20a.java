// 20.  Print fibonocci series upto 20 elements.

import java.util.Scanner;

class P20a {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int no_, f1 = 0, f2 =1, sum, i;
		System.out.print("Enter the no. upto which series is needed : " );
		no_ = in.nextInt();
		i = 1;
		while(i <= no_) {
			System.out.print(f1 + " ");
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
			i++;
		}
		
	}
}