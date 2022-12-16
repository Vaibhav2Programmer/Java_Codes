class Testd {

	public static void main(String args[]) {
		
		Float a = 123.67f;
		String s1 = a.toString();                 // tostring() - Converts Wrapper Class Objects into String.
		System.out.println(s1);
		
		String s2 = Integer.toString(1478);
		System.out.println(s2);

		String s3 = Integer.toString(7896, 16);
		System.out.println(s3);

		String s4 = Integer.toOctalString(90087);   
		System.out.println(s4);

		Double d = 1234.0007;
		String s5 = d.toString();
		System.out.println(s1);
	}
}