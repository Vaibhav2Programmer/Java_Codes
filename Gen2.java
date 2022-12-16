class Gen2<T, V> {

	T a;
	V b;

	public Gen2() {
	}
	
	public Gen2(T a, V b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public V getB() {
		return b;
	}

	public void setB(V b) {
		this.b = b;
	}

	public void showData() {
		System.out.println("Type of T is : " + a.getClass().getName());
		System.out.println("Type of V is : " + b.getClass().getName());
	}

	public static void main(String args[]) {
		Gen2<Integer, String> o1 = new Gen2<Integer, String>();
		o1.setA(15);
		o1.setB("IPL 2021");
		System.out.println("Value : " + o1.getA());
		System.out.println("Value : " + o1.getB());
		o1.showData();
	}
}