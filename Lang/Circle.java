import java.util.Scanner;

class Circle extends Point {

	protected float radius;

	public Circle() {
		x = 10;
		y = 10;
		radius = 10f;
	}

//	public Circle() {
//		super(10,10);
//		radius = 10f;
//	}

	public Circle(float radius) {
		super(10, 10);
		this.radius = radius;
	}

	public Circle(int x, int y) {
		super(x, y);
		radius = 10f;
	}

	public Circle(int x, int y, float radius) {
		super(x, y);
		this.radius = radius;
	}

	public Circle(Point p) {                                            // we can also pass refrence as an argument
		super(p.getX(), p.getY());
		radius = 10f;
	}

	public Circle(Point p, float radius) {
		super(p.getX(), p.getY());
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius; 
	}

	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Radius = ");
		radius = in.nextFloat();
	}

	public void showData() {
		super.showData();
		System.out.println("Radius = " + radius);
	}

	public float getArea() {
		return (float) (Math.PI * Math.pow(radius,2));
	}

	public float getPerimeter() {
		return (float) (Math.PI * 2 * radius);
	}

	public Point getCenter() {
		int x = getX();
		int y = getY();
		Point p = new Point(x, y);
		return p;

		// return new Point(getX(), getY());             anonymous
	}

	public static void main(String args[]) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(10, 40, 25f);
		Circle c3 = new Circle(12f);

		Point p1 = new Point(12, 24);
		Circle c4 = new Circle(p1, 15f);
		
//		c1.acceptData();
		c1.showData();
		c2.showData();
		c3.showData();

		c4.showData();

		Point p = new Point(12, 14);
		Circle c5 = new Circle(p, 4.5f);
		c5.showData();


		Point p2 = c2.getCenter();
		p2.showData();
		c1.getCenter().showData();      // Second way to fetch values of x and y
		
	}
}