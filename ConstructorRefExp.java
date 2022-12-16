@FunctionalInterface
interface MyInterface {

	MethodRef3 func(int n);
	
}

class MethodRef3 {

	private int a;

	 MethodRef3 () {
		a = 0;
	}

	 MethodRef3(int a) {
		this.a = a;
	}
	
	 int getA() {
		return a;
	}
}
	class ConstructorRefExp {

	public static void main(String args[]) {
		MyInterface obj = MethodRef3 :: new;             // First make interface reference and write new for class in which constructor is written

		MethodRef3 ob = obj.func(100);                      // Then make object of the class and through interface refrence pass the value to the function written in interface

		MethodRef3 ob1 = obj.func(115);

		System.out.println("VAlue Passed in A is = " + ob.getA());   // Then through the Class reference(Object) in which Constructor is written call get function to print the value
		System.out.println("Another value Passed In A is = " + ob1.getA()); 
	}
}