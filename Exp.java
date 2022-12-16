class Exp {

	public static void main(String args[]) {
		

		Fruit o1 = new Fruit();
		o1.show();
		o1.display();

		Applee o2 = new Applee();
		o2.show();
		o2.display();

		Fruit o3 = new Applee();
		o3.show();
		o3.display();

		Applee o4 = new Applee();
		Fruit o5 = o4;
		o5.show();
		o5.display();

		Applee o6 = new Applee();
		Fruit o7 = o6;
		if (o7 instanceof Mango) { 
	   		Mango obj8 = (Mango) o7;
				obj8.show();
				bj8.display();
		
		}	
	}
}
