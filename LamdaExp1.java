@FunctionalInterface
interface MyInterface {
	double func();
}

class LamdaExp {

	public static void main(String args[]) {
		MyInterface my;
		my = () -> 123.45;
		System.out.println("Output of above Example is = " + my.func()); 
	}
}
