class L7 {

	public static void main(String args []) {
		int n = 5, i, j;
		for(i = 1; i <= n ; i++) {
			for(j = 1; j <= n-i; j++)
				System.out.print(" ");
			for(j = 1; j <= i; j++) {
				if( j % 2 == 0)
					System.out.print(0);
				else
					System.out.print(1);
				}				

			System.out.println();
			
			
		}
	}
}



