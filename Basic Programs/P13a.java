import java.util.Scanner;

class P13a {

	public static void main(String args []) {
		Scanner in = new Scanner(System.in);
		int a, b;
		System.out.println("Enter two Integer No. : ");
		a = in.nextInt();
		b = in.nextInt(); 
		for(; a<= b; a++) {
			if(a % 2 == 0) {
				System.out.print(a + " ");
			}
			else{
				System.out.print("Not a even No.");
			}
			
			
		}
	}
}	