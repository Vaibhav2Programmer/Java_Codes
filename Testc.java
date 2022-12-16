class Testc {

	public static void main(String args[]) {
		Float f = Float.valueOf("123.456");       // valueOf() - Converts String into Corresponding Wrapper Objects

		float f1 = Float.parseFloat("123.78");  // parseX() - Converts String into primitive datatype Here X can be any primitive datatype

		Integer n = Integer.valueOf("245");

		int num = Integer.parseInt("201");
	
		Integer n2 = Integer.valueOf("10101111",2);     // Converts it into Binary Format
		Integer n3 = Integer.valueOf("122",8);           // Into Octal Format
		Integer n4 = Integer.valueOf("459876",16);

		System.out.println(f);
		System.out.println(f1);
		System.out.println(n);
		System.out.println(num);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}