import java.util.Scanner;

enum House {
	PALASH("Orange"), GULMOHAR("Red"), KACHNAR("Purple"), AMALTAS("Yellow");

	String color;

	public static House acceptHouse() {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(str.trim().equalsIgnoreCase(palash"))
			return PALASH;
		else if(str.trim().equalsIgnoreCase(palash"))
			return PALASH;
		else if(str.trim().equalsIgnoreCase(palash"))
			return PALASH;
		else
			return FEMALE;
	}

	House(String color) {
		this.color = color;
	}

	
	public String getColor() {
		return color;
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

} 

class Student1 {

	protected int Class;
	 protected int enrollmentNo;
	 String name;
	protected String section;
	protected Gender gender;
	protected String house;
	

	public Student1 () {

	name = new String();
	section = new String();
	house = new String();
	gender = Gender.MALE;

	}

	public Student1(String name, String setion, Gender gender, String house, int Class, int enrollmentNo) {
		this.name = name;
		this.section = section;
		this.gender = gender;
		this.house = house;
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
		House house = House.PALASH;
		System.out.println("Enter Your Class : ");
		Class = in.nextInt();
		System.out.println("Enter Your EnrollmentNo : ");
		enrollmentNo = in.nextInt();
	}

	public void showData() {

		System.out.println("Name is = " + name);
		System.out.println("Section is = " + section);
		System.out.println("Gender is = " + gender);
		System.out.println("House is = " + house);
		System.out.println("Class is = " + Class);
		System.out.println("Enrollment No. = " + enrollmentNo);
	}

	public static void main(String args[]) {
		Student1 s = new Student1();
		s.acceptData();
		s.showData();
	}
}