import java.util.Scanner;

class TestCircle {
	
	protected float radius;
	public static final float PI = 3.14f;
	
	public TestCircle() {
	}
	public TestCircle(float radius) {
		this.radius = radius;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void acceptData() {
		Scanner my = new Scanner(System.in);
		System.out.println("Enter the radius : " );
		radius = my.nextFloat();
	}
	public void showData() {
		System.out.println("Radius is : " + radius);
	}
	public  float getArea() {
		return (float)(PI * radius * radius);
	}
	public  float getPerimeter() {
		return (float)(2 * PI * radius);
	}
	public static void main(String args[]) {
		TestCircle c1 = new TestCircle();
		
		c1.acceptData();
		c1.showData();
		
		
		System.out.println("Area is : " + c1.getArea());
		System.out.println("Perimeter is : " + c1.getPerimeter());
	}
}