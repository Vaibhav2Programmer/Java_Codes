import java.util.Scanner;

class Practice5 {

	public static void main(String args []) {
	float radius, area = 0, cir = 0;
	Scanner c = new Scanner(System.in);
	System.out.println("Enter Radius :" );
	radius = c.nextFloat();
//	area = 3.14f*radius*radius;
	area = (float) (Math.PI*Math.pow(radius,2));
	cir = 2*3.14f*radius;
	System.out.println("Area :" + area + "\nCircumference :" + cir);
	

	}
}