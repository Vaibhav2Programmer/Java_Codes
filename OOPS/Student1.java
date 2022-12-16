import java.util.Scanner;

enum House {
	PALASH("Orange"), GULMOHAR("Red"), KACHNAR("Purple"), AMALTAS("Yellow");

	String color;

	House(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public static House acceptColor() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();

		if(str.trim().equalsIgnoreCase("palash"))
			return PALASH;
		else if(str.trim().equalsIgnoreCase("gulmohar"))
			return GULMOHAR;
		else if(str.trim().equalsIgnoreCase("kachnar"))
			return KACHNAR;
		else 
			return AMALTAS;
	}
};

enum Gender {

	MALE, FEMALE;
	public static Gender acceptGender() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().equalsIgnoreCase("male"))
			return MALE;
		else
			return FEMALE;
	}

} ;

class Student1 {

	protected int Class;
	 protected int enrollmentNo;
	 protected String name;
	protected String section;
	protected Gender gender;
	protected House color;
	

	public Student1 () {

	name = new String();
	section = new String();
	gender = Gender.MALE;
	color = House.PALASH;

	}

	public Student1(String name, String setion, Gender gender, House color, int Class, int enrollmentNo) {
		this.name = name;
		this.section = section;
		this.gender = gender;
		this.color = color;
		this.Class = Class;
		this.enrollmentNo = enrollmentNo;
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		name = in.nextLine();
		System.out.println("Enter Your Section : ");
		section = in.nextLine();
		System.out.println("Enter Your Gender : ");
		gender = Gender.acceptGender();
		System.out.println("Enter Your House : ");
		color = House.acceptColor();
		System.out.println("Enter Your Class : ");
		Class = in.nextInt();
		System.out.println("Enter Your EnrollmentNo : ");
		enrollmentNo = in.nextInt();
	}

	public void showData() {

		System.out.println("Name is = " + name);
		System.out.println("Section is = " + section);
		System.out.println("Gender is = " + gender);
		System.out.println("House is = " + color + "\nColor Of House is = " + color.getColor());
		System.out.println("Class is = " + Class);
		System.out.println("Enrollment No. = " + enrollmentNo);
	}

	public static void main(String args[]) {
		Student1 s = new Student1();
		s.acceptData();
		s.showData();
	}
}