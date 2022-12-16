class Stringa {

	public static void main(String []args) {
		String s1 = new String("Welcome");
		String str = new String(" oh   wow   ");
		char c[]= {'W', 'e', 'l', 'c', 'o', 'm', 'e'};
		String s3 = new String(c,3,4);
		System.out.println(s3);
	
		int a = s1.indexOf("m");
		int b = s1.indexOf("c", a+1);
		int g = s1.lastIndexOf("e");
		int d = s1.lastIndexOf("e", g-1);

		System.out.println(a);
		System.out.println(b);
		System.out.println(g);
		System.out.println(d);

		String s2 = s1.toUpperCase();
		String s4 = s1.toLowerCase();

		System.out.println(s2);
		System.out.println(s4);

		String s5 = str.trim();
		System.out.println(s5);

		String s[] = "Welcome".split(" ");       // We can also write String s[] = s1.split(" ")
		System.out.println(s);


	}

}