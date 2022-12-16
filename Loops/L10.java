class L10 {

	public static void main(String args []) {
		int n = 5, i, j;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n-i; j++)
				System.out.print(" ");
			for(j = 1; j <= i; j++) {
				if(j % 2 == 0)
					System.out.print(0);                                    
				else
					System.out.print(1);
				}
			for(j = 1; j <= i-1; j++) {
					if((i + j) % 2 == 0) {
						System.out.print(0);
					}
					else if(  i == n & j == n-1 ) {
						break;
					}
					else {
						System.out.print(1);
					}
				}
			
		System.out.println();
		}
	}

}