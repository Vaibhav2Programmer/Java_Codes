class enumExp4 {

	enum Colors{RED, GREEN, BLUE};
	public static void main(String args[]) {

	Colors color = Colors.RED;
	if(color == Colors.RED) 
		System.out.println("This is Red Color");
	else
		System.out.println("This is not Red Color");

	if(color.equals(Colors.RED)) 
		System.out.println("This is Red Color");
	else
		System.out.println("This is not red Color");

	switch(color) {

		case RED : System.out.println("This is Red Color");
			break;
		case GREEN : System.out.println("THis is Green Color");
			break;
		case BLUE : System.out.println("this is Blue Color");
			break;
		}	
	}
}