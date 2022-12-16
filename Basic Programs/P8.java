import java.util.Scanner;

class P8 {

	public static void main(String args []) {
		float a, b, Sum, Difference, Product, Quotient;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The No.'s : " );
		a = in.nextFloat();
		b = in.nextFloat();
		Sum = a+b;
		Difference  = a-b;
		Product = a*b;
		Quotient = a/b;
		System.out.println("Sum is : " + Sum + "\nDifference is : " + Difference + "\nProduct is : " + Product + "\nQuotient is : " + Quotient); 
	}

}