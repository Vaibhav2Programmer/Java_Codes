import java.util.Scanner;                                               // 1. Member data  2. Constructors(atleast 2 one with argument and one with without argument) 3. getter & setter 4. operations(functions)
class Point1 {
	                                                                                               
	protected int x;
	protected int y;

	public Point1() {
	}

	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Value of X : " );
		x = in.nextInt();
		System.out.println("Enter Value of Y : ");
		y = in.nextInt();
	}

	public void showData() {
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}

	public static void main(String args[]) {
		Point1 p = new Point1();
		Point1 q = new Point1(30,78);
		p.acceptData();
		p.showData();
		q.showData();
	}

}