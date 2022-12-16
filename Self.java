import java.util.Scanner;

class Self {

	public static void main(String args []) {
		char b;
		Scanner u = new Scanner(System.in);
		System.out.println("Enter the character : ");
		b = u.nextLine().charAt(0);
		switch(b) {
			case('c <= 65 ' && 'c >= 90'):System.out.println("Upper case");
				break;
			default:System.out.println("wrong character");			
		}
	}

}