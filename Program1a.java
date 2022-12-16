// 1. Write a Program to accept your Name and address and display it on Screen.//

import java.util.Scanner;

class Program1a {
  	public static void main(String args [ ]) {
   
     String name,address;
      Scanner obj = new Scanner(System.in);
     System.out.println("Enter Your Name : ");
      name = obj.nextLine( );
     System.out.println("Enter Your Address : ");
       address = obj.nextLine( );

      System.out.println("Name : "+ name + "\n Address: " +address);
 }

}