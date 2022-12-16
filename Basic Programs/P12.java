import java.util.Scanner;

class P9 {

	public static void main(String args[]) {
		char a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Character : ");
		a = in.next().charAt(0);
		switch(a) {
			case 'A':
			case 'a':System.out.println("It is a Vowel");
				break;
			case 'E':
			case 'e':System.out.println("It is a Vowel");
				break;
			case 'I':
			case 'i':System.out.println("It is a Vowel");
				break;
			case 'O':
			case 'o':System.out.println("It is a Vowel");
				break;
			case 'U':
			case 'u':System.out.println("It is a Vowel");
				break;
			default : System.out.println("It is a Consonant");				

		}

	}

}