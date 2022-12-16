class Patt2a {

	public static void main(String args[]) {


	int num = 5, i, j;
	for ( i = 1 ; i <= num; i ++) {
		for ( j = 1 ; j <= num - i; j++) 
			System.out.print(" ");
		for ( j = i ; j >= 1; j--) 
			System.out.print(j);
	System.out.println(); }
	
	}
}