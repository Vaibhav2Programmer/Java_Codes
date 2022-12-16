class Opand {

	public static void main(String args []) {
		int a=6;
		int b=8;
		
		if((b == a) & (a > b++))
		System.out.println("Here");
		System.out.println("a :" + a + "\nb :" + b);
	}		
}


// Here a >b++ condition is wrong but the value of b will be 9 
// bcoz the increament is done.
// and the if condition here is not printout.
//here is not  printout nahi hua..but it will read whole condition.