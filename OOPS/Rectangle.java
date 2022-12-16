import java.util.Scanner;

class Rectangle extends Point {

	protected float width;
	protected float height;

	public Rectangle() {
		super(10, 10);
		height = 10f;
		width = 10f;
	}


	public Rectangle(float width, float height) {
		super(15, 25);
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, float width, float height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p, float width, float height) {
		super(p.getX(), p.getY());
		this.width = width;
		this.height = height;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	} 

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Width = ");
		width = in.nextFloat();
		System.out.println("Enter Height = ");
		height = in.nextFloat();
	} 

	public void showData() {
		super.showData();
		System.out.println("Width is = " + width);
		System.out.println("Height is = " + height);
	}

	public float getArea() {
		return (float) (width * height);
	}
	
	public float getPerimeter() {
		return (float) (2 * (width + height));
	}
	
	public static void main(String args[]) {
		Rectangle r = new Rectangle(45.5f, 35);
		r.showData();
		System.out.println("Area is = " + r.getArea());
		System.out.println("Perimeter is = " + r.getPerimeter());

		Point a = new Point(23, 45);
		Rectangle r1 = new Rectangle(a, 56.43f, 67.76f);
		r1.showData();
		System.out.println("Area is = "+ r1.getArea());
		System.out.println("Perimeter is = " + r1.getPerimeter());
	}
}