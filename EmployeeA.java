import java.util.Scanner;

class EmployeeA implements EmpInterface {

	protected String name;
	protected String department;

	public EmployeeA() {
		name = new String();
		department = new String();
	}

	public EmployeeA(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBoth() {
		return ("Vaibhav_It");
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name = ");
		name = in.nextLine();
	}
	
	public void showData() {

		System.out.println("Name is = " + name);
	}

	public static void main(String args []) {
		EmployeeA obj = new EmployeeA();
		obj.acceptData();
		obj.showData();

		EmpInterface a = new EmployeeA("Rohit", "IT");                            
		a.showData();                                                                                  
		System.out.println("Both is = " + obj.getBoth());
//                                a.getBoth(); would give error as it is not a method/function of EmpInterFace


 // We can never write new for the interface or create its object but here employeeA has implemented Empinterface
 // and we can get only or can invoke EmpInterface methods not EmployeeA methods as it would generate Error.

	}

}