// Labeled Break - Imp - label should be written before the loop.

class Jump2 {

	public static void main(String args []) {
		int j, k;
		abc:     // it can be named anything also like def or vai.
		for(j = 0; j < 5; j++) {
			System.out.println("J = " + j);
			for(k = 2; k < 5; k++) {
				System.out.println("K = " + k);
				if(j == k) {
				break abc; }
			}	
		}
		
	}	

}