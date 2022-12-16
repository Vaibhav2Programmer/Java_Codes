class Abc {

	public String showMessage(int a) {
		return "Hello world";
	}

	public Object showMessage() {
		return "Hello World";
	}

	public static void main(String args[]) {
		System.out.println("2021");
		
		Abc a = new Abc();
		a.showMessage();
		a.showMessage(2);

		System.out.println("Output is : " + a.showMessage());
		System.out.println("Output is : " + a.showMessage(2));
	}
}