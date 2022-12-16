class Test1 {
 	String a[];
	public Test1() {
		a = new String[10];
			for(int i = 0 ; i < a.length ; i++)
			a[i] = new String();
			}
		public static void main(String args[]) {
		Test1 t = new Test1();
		System.out.println(t.a.length);
		System.out.println(t.a[0]);
		System.out.println(t.a[0].length());
		}
}
