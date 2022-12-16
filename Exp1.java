class Mango extends Fruits {

	public void show() {
		System.out.println("show from mango.");
	}

	public static void display() {
		System.out.println("display (static) from mango.");
	}
}

class Exp {

	public static void main(String args[]) {
		Fruit o1 = new Fruit();
		o1.show();
		o1.display();
	}
}
