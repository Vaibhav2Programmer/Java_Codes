import java.util.Scanner;

class Employee {

	protected String name;
	protected String department;
	protected String designation;
	protected float basicSalary;
	protected float hra;
	protected float da;
	protected float ca;
	

	public Employee() {
		name = new String();
		department = new String();
		designation = new String();
	}

	public Employee(String name, String department, String designation) {
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
		
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

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getHra() {
		return basicSalary * 0.2f;
	}

	public float getCa() {
		return basicSalary * 0.3f;
	}
	

	public float getDa() {
		return basicSalary * 0.1f;
	}

	public float getTotalSalary() {
		return  (basicSalary + getCa() + getDa() + getHra());
	}

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		name = in.nextLine();
		System.out.println("Enter Your department : ");
		department  = in.nextLine();
		System.out.println("Enter Your designation : ");
		designation = in.nextLine();
		System.out.println("Enter your basic salary : ");
		basicSalary = in.nextInt();
		
	} 

	public void showData() {
		System.out.println("Enter your Name: " + name);
		System.out.println("Enter your Department: " + department);
		System.out.println("Enter your Designation: " + designation);
		System.out.println("Enter your BasicSalary: " + basicSalary);
		
	}
	
	public static void main(String args []) {
		Employee mY = new Employee();
		mY.acceptData();
		mY.showData();
		System.out.println("Total salary with incentive is : " + mY.getTotalSalary());
	}
}