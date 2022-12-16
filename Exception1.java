class Exception1 {

	public static void main(String args[]) {
		int n = 0;

		try{
		       n = Integer.parseInt(args[0]);
		}

		catch(NumberFormatException e) {
			System.out.println("Invalid Format");
		}

		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("invalid Index");
		}

		catch(Exception2 c) {
			System.out.println("Another Error");
		}
	
		System.out.println("SQUARE IS = " + n * n);
	}

}