import java.util.Scanner;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface What {

	String description() default " Description about What Annotation" ;
}

@What(description = "Gives info. about which student belons to which House")
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

@What(description = "Tells about the Gender of the Student")
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

@What(description = "A Class With Annotation And Enums")
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

	@What(description = "An annotation Test Function")
	public static void myMeth() {
		Student1 ob = new Student1();

		try {
			Annotation anno[] = ob.getClass().getAnnotations();

			System.out.println("Annotation for Student1 Class = ");
				for(Annotation a: anno)
					System.out.print(a);

			System.out.println();

			Class <?> c1 = House.AMALTAS.getClass();
			Class <?> c = ob.getClass();

		//	Method m = c.getMethod("myMeth", "acceptData", "showData");

System.out.println("--------------------------------");		
	Method methods[] = c.getDeclaredMethods();
	for(Method m : methods) {
		if(m.isAnnotationPresent(What.class)) {
			What w = m.getAnnotation(What.class);
			System.out.println(w);
		}
			
			
	}

System.out.println("--------------------------------");
			Method  m = c.getMethod("myMeth");

			  m = c.getMethod("acceptData");

			  m = c.getMethod("showData");

			anno = m.getAnnotations();

			System.out.println("Annotations for Functions : ");
				for(Annotation a: anno)
					System.out.println(a);	
		}
		catch(NoSuchMethodException ce) {
			System.out.println("No such Method");
		}
	}

	@What(description = "Accepts Data From the students")
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

	@What(description = "Shows Data Of the Students")
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
		myMeth();
	}
}