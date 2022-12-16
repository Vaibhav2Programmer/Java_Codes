@FunctionalInterface
interface StringFunc {
	String func(String str);
}

public class LamdaAsArguments1 {

	static String stringOp(StringFunc s, String str) {
		return s.func(str);
	}

	public static void main(String args[]) {
		String inStr = "Lamdas add power to java";
		String outStr;
		System.out.println("Here is input string = " + inStr);
		outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The String in Uppercase is = " + outStr);
	}
}