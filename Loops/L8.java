class L8 {

	public static void main(String args []) {
		int n = 5, i, j;
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= n-i; j++)
				System.out.print(" ");
			for(j = i; j >= 1; j--)
				System.out.print(i);
                        for(j = 1; j <= i-1; j++) {                      //  for(j = 2; j <= i; j++) // 
				if(i == n & j == n-1) 
					break;
				else
					System.out.print(i);
			}
		System.out.println();
		}
	}
}