class Testb {

	public static void main(String args[]) {
		
//		Byte b = new Byte(10);          Here We are passing integer into byte without typecasting so it would generate a Error
	//	System.out.println(b);

	//	byte b = 10;
	//	Byte b1 = new Byte(b);
	//	System.out.println(b1);

	//	Byte b2 = new Byte("127");   - Older Syntax(Deprecated) We can pass Value into Wrapper classes Without Writing New
		Byte b2 = -128;
		System.out.println(b2);

		Character c = 97;
		System.out.println(c);
	}	
}