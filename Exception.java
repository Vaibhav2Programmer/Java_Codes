class Exception1 {

	public static void main(String args[]) {
		int n = 0;

		try{
		       n = Integer.parseInt(args[0]);
		}

		catch(NumberFormatException n) {
			System.out.pritnln("Invalid Format");
		}

		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("invalid Index");
		}
	
		
	}

}