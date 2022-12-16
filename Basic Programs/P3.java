// 3. Write a Program to display name,mob no. and address.

import java.util.Scanner;

class P3 {
	public static void main(String args []) {
		String name, address;
		long mobNo;
		Scanner my = new Scanner(System.in);
		System.out.println("Enter Your Name: "  );
		name = my.nextLine();
		System.out.println("Your Address: "  );
		address = my.nextLine();
		System.out.println("Your Mobile No. : " );
	 	mobNo = my.nextLong();
	
		System.out.println("Name: " + name + "\nAddress: " + address + "\nMob no. :" + mobNo);
 
	}


}