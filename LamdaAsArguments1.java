@FunctionalInterface
interface MyInterface {
	String fun(String s);
}

public class LamdaAsArguments1 {

	static String stringOp(MyInterface st, String s) {                         // here it is necessary to pass interface reference as we pass code to the refernce(interface)
		return st.fun(s);
	}

	public static void main(String args[]) {

		String inStr = "Lamdas add power to java";
		String outStr;
		System.out.println("Here is input string = " + inStr);
		outStr = stringOp((s) -> s.toUpperCase(), inStr);
		System.out.println("The String in Uppercase is = " + outStr);

		outStr = stringOp((s) -> {
			String output = " ";
			int i;
			for(i = 0; i < s.length(); i++)
				if(s.charAt(i) != ' ')
					output += s.charAt(i);
					return output;
		},inStr);
		
		System.out.println("The String wihout Spaces = " + outStr);
		MyInterface st = (s) -> {
			String output =" ";
			int i;
			for(i = s.length()-1; i >= 0; i--)
				output += s.charAt(i);
			return output;
		};
		System.out.println("The Reversed String is = " + stringOp(st,inStr));            // Here st is the reference of interface we can also create our reference like reverse and pass it to stringOp function
	}
}