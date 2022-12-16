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
	};
}
	class ConstructorRefExp {

	public static void main(String args[]) {
		MyInterface obj = MethodRef3 :: new;
		MethodRef3 ob = obj.func(100);
		System.out.println("VAlue Passed in A is = " + ob.getVal());
	}
}