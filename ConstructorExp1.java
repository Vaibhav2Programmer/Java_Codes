class Abc1 {

	public Abc1() {
		System.out.println("This is Default Constructor of Abc1");
	}

	public Abc1(int a) {
		this();                                 // Here This is Used To call Constructor of same class in this case default constructor
		System.out.println("This is parameterized Constructor of Abc1");
	}

	public static void main(String args[]) {
		System.out.println(" ");
	}

}

class Xyz extends Abc1 {

	public Xyz() {
		super(10);
		System.out.println("Default Constructor Xyz");
	}

	public Xyz(int a) {
		this();
		System.out.println("Parameterized Constructor of Xyz");
	}

	public static void main(String args[]) {
		Xyz a = new Xyz();
	}

}