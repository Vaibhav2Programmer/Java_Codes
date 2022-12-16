import java.util.Scanner;

class Array2 {

	public static void main(String args[]) {

	//	int[] num, i, j   -     here all three are arrays or we can say multiple declaration

		int num[], i, j;      // here only num is array.
		
		for(i = 100, j = 1; i < 200; i += 5, j++);    // for loop is ended here
		num = new int[j];

		for(i = 100, j = 0; i < 200; i += 5, j++)
			num[j] = i;

		for(j = 0; j < num.length; j++)                                                      // for(int x : num)
			System.out.println(num[j]);                                      //               System.out.println(xs)
	}

}