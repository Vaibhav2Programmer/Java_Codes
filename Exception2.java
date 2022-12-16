class Exception2 {

	public static void main(String args[]) {
		int a = 10, b = 0, c = 0;
		try{
			c = a / b;
		}

		catch(ArithmeticException e) {
			System.out.println("Division by Zero");
			System.out.println(e.getMessage());
			e.printStackTrace();

		// In catch as argument we pass object of Exception or its derive class
		}
	}
}