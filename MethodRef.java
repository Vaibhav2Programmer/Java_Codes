import java.util.Scanner;

@FunctionalInterface 
interface MyInterface {

	String func(String s);
}

class MyStringOps {

	static String strReverse(String str) {
		String result = " ";
		int i;
		for(i = str.length()-1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	}
}

class MethodRef {
	
	static String stringOp(MyInterface st, String s) {
		return st.func(s);
	}

	public static void main(String args[]) {
		String instr = " ";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Input String = " );
		instr = in.nextLine();
		String outstr;
		
		outstr = stringOp(MyStringOps :: strReverse, instr);
		System.out.println("Original String: " + instr);
		System.out.println("String Reversed: " + outstr);
		
	}
}