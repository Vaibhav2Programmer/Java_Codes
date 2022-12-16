import java.util.Scanner;

@FunctionalInterface
interface MyInterface {

	String func(String s);
}

class MyObjectReference {

	static String strReverse(String str) {
		String result = " ";
		int i;
		for(i = str.length()-1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	}
}

class MethodRef2 {

	static string stringOp(MyInterface si, String s)
		return si.func(s);
}

	public static void main(String args[]) {
		Scanner in = new scanner(System.in);
		System.out.println("Enter the input String = ");
		String instr = in.nextLine();
		
		MyObjectRefernce ob = new MyObjectReference();
		outstr = stringOp(ob :: strReverse, instr);                               // Here we call function through the object we created of class in which the function is made not the class in which main is written.
		
		System.out.println("Input String is = " + instr);
		System.out.println("Input string Reversed is = " + outstr);
	}