import java.util.Scanner;

class DerivedA extends AbstractA {

	protected int a;

	public DerivedA() {
	}

	public DerivedA(int a) {
		this.a  = a;
	} 

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a  = a;
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of A : ");
		a = in.nextInt();
	}

	public void showData() {
		System.out.println("A = " + a);
	}
	
	public static void main(String args[]) {
		AbstractA a = new DerivedA(10);
		DerivedA b = new DerivedA(20);

// (wrong forming of object)     AbstractA c = new AbstractA();


			DerivedA d = new DerivedA();
			d.acceptData();
			d.showData();		
			a.showData();
			b.showData();
	}
}