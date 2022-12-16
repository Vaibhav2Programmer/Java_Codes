
class ExceptionP1 {

	public static void main(String args[]) {
		int num;

		try {
			num = Integer.parseInt(args[0]);

			if(num > 25) {

				ExceptionP1 be = new ExceptionP1();
				throw be;
			}

			for(int i = 0; i <= 10; i++)
				System.out.println(num + "*" + i + "=" + num*i);
		}

		catch(NumberFormatException ne) {
			System.out.println("Invalid Format");
			System.out.println(ne.getMessage());
		}

		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Invalid ArguMents");
			System.out.println(ae.getMessage());
			
		}

		catch(ExceptionP1 be) {
			System.out.println("Number too big");
		}
	}
}