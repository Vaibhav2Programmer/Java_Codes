import java.util.Scanner;

class MyObj {

	protected int a;
	protected static int ctr;

	public MyObj() {
		ctr++;
	}

	public MyObj(int a) {
		this.a = a;
		ctr++;
	}

	public static int getCtr() {
		return ctr;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Value of A = ");
		a = in.nextInt();
	}

	public void showData() {
		System.out.println("Value Of A is = " + a);
			if(ctr == 5) 
				System.out.println("Will do");
				
			else if(ctr < 5) 
				System.out.println("Too Less");
				
			else 
				System.out.println("Exceeding the limits");
					
	}
	
	public static void main(String args []) {
		MyObj p = new MyObj();
		MyObj q = new MyObj(15);
		p.acceptData();
		p.showData();
		q.showData();
	}

	
}