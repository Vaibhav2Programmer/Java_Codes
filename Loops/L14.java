class L14 {

	public static void main(String args []) {
		int n = 5, i, j, k = 5;
		for(i = 1; i <= n; i++) {
			for(j = n; j >= i; j--)
				System.out.print(k);

			for( j = 1; j <= 2 * ( i-1)-1; j++)
				System.out.print(" ");
		
			for(j = i; j <= n; j++)
				if(j != 1) {
				System.out.print(k);
			}
		k = k - 1;
		System.out.println();
		}

		for(i = 1; i <= n; i++) {
			for( j = 1; j <= i; j++)
				System.out.print(i);

			for(j = 1; j <= 2 * (n-i)-1; j++)
				System.out.print(" ");

			for(j = 1; j <= i; j++)
				if (j != n) {
				System.out.print(i);
				}
		System.out.println();
		}
	}

}