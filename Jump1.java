// Jumping statements - break,continue and return are used to skip a loop  or terminate it.
// HERE Break - terminates the loop.
class Jump1 {

	public static void main(String args[]) {
		int j = 0;
		while(true) {
			j = j+2;
			if(j == 6) {
				break;    // it will break out of the while loop.
			}
			System.out.println(j);
		}
	}

}