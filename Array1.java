import java.util.Scanner;

class Array1 {

	public static void main(String args[]) {
		int a[] = new int[10];
		int i, Sum = 0, Avg = 0;
		Scanner in = new Scanner(System.in);
		for(i = 0; i < a.length; i++) {
			System.out.println("Enter Number " + (i + 1) + "=");
			a[i] = in.nextInt();
			Sum += a[i];
		} 
		
		Avg = Sum/a.length;
		System.out.println("Sum = " + Sum);
		System.out.println("Average = " + Avg);
	}
	
}