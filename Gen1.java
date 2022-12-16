class Gen1<T> {

	T a;                                // Here a is an argument and T is our own Datatype like int

	public Gen1() {
	}

	public Gen1(T a) {
		this.a = a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}

	public void showData() {
		System.out.println("Type of T is : " + a.getClass());              // we can also use .getClass().getName()
	}

	public static void main(String args[]) {
		Gen1<Integer> obj = new Gen1<Integer>();
		obj.setA(10);
		System.out.println("Value : " + obj.getA());
		obj.showData();

		Gen1<String> obj1 = new Gen1<String>();
		obj1.setA("Hello");
		System.out.println("Value is : " + obj1.getA());
		obj1.showData();

		Gen1<Float> o3 = new Gen1<Float>();
		o3.setA(44.789f);
		System.out.println("Value is : " + o3.getA());
	}
}