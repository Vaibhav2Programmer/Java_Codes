@FunctionalInterface
interface MyInterface {
	double func();
}

class LamdaExp {

	public static void main(String args[]) {
		MyInterface my;
		my = () -> 123.45;
		System.out.println("Output of above Example is = " + my.func()); 

		my = () -> Math.random() * 100;                                                                 // Math.random a static function returns the random value from (0.00 to 0.99)
		System.out.println("The random Value is = " + my.func());                      // we can call static function by 3 ways (1. through class 2. through static  3. directly(if of same class))

		System.out.println("another random value = " + my.func());

		// my = () -> 12 (integer) it would return a error as return value is double.

	} 
}
