class L6 {

	public static void main(String args []) {
		int n = 5, i, j, a = 1, b = 0;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(( i + j ) % 2);
			}
		System.out.println();
		}	
	}
}