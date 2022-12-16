/* class Loop {
*	public static void main(String args[]) {
*		int i;
*		for(i = 1; i <= 10; i++) {
*			System.out.println(i); - we are writing println for every new line
*			System.out.print("\t"+i);
*		}
*	}
}*/

class Loop {
	public static void main(String args[]) {
		int i = 1 ;
		while(i <= 10) {
			System.out.println(i + " ");
			++i;
		}
	}
}