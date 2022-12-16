package mypack;

import mypack.mysubpack1.*;                                                   // General Import
// import mypack.mysubpack1.mysubsubpack1.Abc;                  // Specific Import   Here Specific Import will supress all other import
import mypack.mysubpack1.mysubsubpack2.*;
import mypack.mysubpack2.*; 
import mypack.mysubpack1.mysubsubpack1.*;

public class MainProg {

	public static void main(String args[]) {
		Abc obj = new Abc();
		
		mypack.mysubpack1.Abc obj1 = new mypack.mysubpack1.Abc();                      // Inline import to call the class when name is same

		mypack.Abc Obj3 = new mypack.Abc();

		mypack.mysubpack1.mysubsubpack1.Abc obj4 = new mypack.mysubpack1.mysubsubpack1.Abc();

		mypack.mysubpack1.mysubsubpack2.Abc obj5 = new mypack.mysubpack1.mysubsubpack2.Abc();

		Efg obj6 = new Efg();
		Xyz obj7 = new Xyz();
		Pqr obj8 = new Pqr();
		Lmn obj9 = new Lmn();

	}
}


