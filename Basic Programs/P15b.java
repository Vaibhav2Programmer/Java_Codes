class P15b {

	public static void main(String args []) {
		int i, c, sum = 0, multi = 0, Average = 0;
                                     i = 500;
		while(i <= 600) {
			c = i % 5;
		 	if(c == 0) {
				multi = multi+1;
				sum = sum + i;
				Average = sum/multi;
			}
			i++;
		}
		System.out.println("Sum of Multiples is : " + sum);
		System.out.println("Average of multiples is : " + Average);
		System.out.println("No. of multiples : " + multi);
	}

}