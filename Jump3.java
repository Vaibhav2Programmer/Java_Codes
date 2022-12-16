// Continue - it kind of repeats the loop when required condition is satisfied or it skips the output of the loop.

class Jump3 {

	public static void main(String args []) {
		for( int i=2; i <= 10; i+=2) {     // i+=2 == i = i+2 
			if(i ==6) {
				continue;
			}
			System.out.println(i);
		}
	}

}