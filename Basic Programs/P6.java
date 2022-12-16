// 6. Write a program that accepts width and height of a rectangle and give its perimeter.

import java.util.Scanner;

class P6 {

	public static void main(String args []) {
		float L, B, Area, Perimeter;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length : " );
		L = in.nextFloat();
		System.out.println("Enter the breadth : ");
		B = in.nextFloat();
		Area = (L*B);
		Perimeter = 2*(L+B);
		System.out.println("Area of Rectangle is : " + Area  + "\nPerimeter is : " + Perimeter);
	
	}

}