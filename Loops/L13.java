class L13 {

	public static void main(String args []) {
		int n = 5, i, j;
		for(i = 1; i <= n; i++) {
			for( j = n; j >= i; j--)
				System.out.print(j);

			for(j = 1; j <= 2 * (i-1)-1; j++)
				System.out.print(" ");
	
			for(j = i; j < n; j++)
				if(j != 1) {
					System.out.print(j);
				}

		System.out.println();
		} 

		for(i = n; i >= 1; i--) {
			for(j = n; j >= i; j--)
				System.out.print(j);
			
			for(j = 1; j <= 2 * (i-1)-1; j++)
				System.out.print(" ");

			for(j = i; j <= n-1; j++)
				if( j != 1) {
					System.out.print(j);
				}
		System.out.println();
		}		

	}

}