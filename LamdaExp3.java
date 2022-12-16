@FunctionalInterface
interface StringFunc {
	String func(String s);
}

class LamdaExp3 {

	public static void main(String args[]) {
		StringFunc reverse = (s) -> {
			String output = " ";
			int i;
			for(i = s.length() - 1; i >= 0; i--)
				output += s.charAt(i);      // or result = result + str.charAt(i)
				return output;
		};

		System.out.println("Lamda Reversed is = " + reverse.func("Lamda"));
		System.out.println("Expressions Reversed is = " + reverse.func("Expressions"));
	}
}