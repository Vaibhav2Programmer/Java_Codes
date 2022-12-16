@FunctionalInterface
interface MyInterface<T> {

	T func(T t);
}

class GenericInterface {

	public static void main(String args[]) {
		// Here we pass String as a Datatype

		MyInterface<String> reverse = (str) -> {

			String output = " ";
			int i;
			for(i = str.length()-1; i >= 0; i--)
				output += str.charAt(i);
			return output;
		};

		System.out.println("Reverse Of Vaibhav is = " + reverse.func("VAIBHAV"));
		System.out.println("Lamda Reversed is = " + reverse.func("LaMda"));

		// Now we pass or use Integer as a datatype
		MyInterface<Integer> factorial = (n) -> {

			int result = 1;
			for(int i = 1; i <= n; i++)
				result = result * i;
			//	System.out.println(result + "*" + i + "=" + result * i);
			return result;
		};

		System.out.println("Factorial of 3 is = " + factorial.func(3));
		int i;
		for(i = 1; i <= 7; i++)
			System.out.println(i);
		
	}
}