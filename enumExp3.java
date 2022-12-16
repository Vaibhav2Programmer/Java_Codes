enum Colors {RED, GREEN, BLUE};

class enumExp3 {

	public static void main(String []args) {
		for(Colors c : Colors.values())
			System.out.println(c + " = " + c.ordinal());

		System.out.println(Colors.valueOf("RED"));
		System.out.println(Colors.valueOf("BLUE"));

// Here Ordinal gives the index of the values stored in the enum and values() returns the values stored in the enum.	
	}
}