import java.util.Scanner;

class Command2 {

	public static void main(String args[]) {
		int num;
		if(args.length != 1) {
			System.out.println("Invalid arguments");
			System.exit(0);             // Break;
		}
		
		num = Integer.parseInt(args[0]);              // Converts string into integer
		for(int i = 1; i <= 10; i++)
			System.out.println(num + " * " + i + " = " + num * i);
	}
}