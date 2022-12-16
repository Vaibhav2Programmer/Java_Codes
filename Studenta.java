import java.util.Scanner;

enum House {
	PALASH("Orange"), GULMOHAR("Red"), KACHNAR("Purple"), AMALTAS("Yellow");

	String house;

	House(String house) {
		this.house = house;
	}

	public String getHouse(String house) {
		return house;
	}

}

enum Gender {

	MALE, FEMALE;
	public static Gender acceptGender() {
		Scanner in = System.in();
		String str = in.nextLine();
		if(str.trim().equalsIgnoreCase("male"))
			return MALE;
		else
			return FEMALE;
	}
}

class Student1 {

	protected int class;
	protected int enrollmentNo;
	protected String name;
	protected String section;
	protected Gender gender;
	protected String house;
	

	public Student1 () {

	name = new String();
	section = new String();
	house = new String();
	gender = Gender.MALE();

	}

	public Student1(String name, String setion, Gender gender, String house, int class, int enrollmentNo) {
		this.name = name;
		this.section = section;
		this.gender = gender;
		this.house = house;
		this.class = class;
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
		class = in.nextInt();
		Systemout.println("Enter Your EnrollmentNo : ");
		enrollmentNo = in.nextInt();
	}

	public void showData() {

		System.out.println("Name is = " + name);
		System.out.println("Section is = " + section);
		System.out.println("Gender is = " + gender);
		System.out.println("House is = " + (house.getHouse));
		System.out.println("Class is = " + class);
		System.out.println("Enrollment No. = " + enrollmentNo);
	}

	public static void main(String args[]) {
		Student1 s = new Student1();
		s.acceptData();
		s.showData();
	}

}