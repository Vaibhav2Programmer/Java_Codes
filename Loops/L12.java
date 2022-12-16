class L12 {

	public static void main(String args []) {
		int n = 5, i, j, k = 5;
		for( i = 1; i <= n; i++) {
			for( j = i; j <= n; j++) 
				System.out.print(k);
				
			for( j =1; j <= 2*( i - 1)-1; j++)
				System.out.print(" ");

			for(j = i; j < n; j++)
				if(j != 1) {
					System.out.print(k);
			}
		k = k-1;
		System.out.println();		
			
		}
	}

}