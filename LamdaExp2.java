@FunctionalInterface
interface NumericTest {
	boolean number(int n);
}

class LamdaExp2 {

	public static void main(String args[]) {
		NumericTest isEven = (n) -> (n % 2) == 0;                                        // Declaration of reference  and we will always store coding in reference of interface
		if(isEven.number(10))
			System.out.println("10 is Even");
		if(!(isEven.number(11)))
			System.out.println("9 is Odd or Not Even");

		NumericTest isNonNeg = (n) -> n >= 0;
		if(isNonNeg.number(5))
			System.out.println("5 is non negative");
		if(!isNonNeg.number(-2))
			System.out.println("-2 is Negative");
		 
		
	}
}