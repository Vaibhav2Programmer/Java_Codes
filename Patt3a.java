class Patt3a {

	public static void main(String args[]) {
		int i, n = 5, j;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n-i; j++) 
				System.out.print(" ");
			for(j = i; j >= 1; j--) 
				System.out.print(j);
			 for(j = 2; j <= i; j++)                             
				System.out.print(i);	
		System.out.println();
			
		}
	}

}



//