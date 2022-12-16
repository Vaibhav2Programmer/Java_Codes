import java.util.Scanner;

class Employee {

	protected String name;
	protected String department;
	protected String designation;
	protected int basicSalary;
	protected int hra;
	protected int da;
	protected int ca;
	

	public Employee() {}

	public Employee(String name, String department, String designation, int basicSalary, int hra, int da, int ca) {
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.ca = ca;
		this.da = da;
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

	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}
	public void setHra() {
		this.hra = hra;
	}

	public int getCa() {
		return ca;
	}
	public void setCa() {
		this.ca = ca;
	}

	public int getDa() {
		return da;
	}
	public void setDa() {
		this.da = da;
	}

	public int getTotalSalary() {
		return  (basicSalary + (basicSalary * hra/100) + (basicSalary * da/100) + (basicSalary * ca/100));
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
		System.out.println("Enter your house rent allowance : ");
		hra = in.nextInt();
		System.out.println("Enter your inflation allowance : ");
		da  = in.nextInt();
		System.out.println("Enter your Conveyance allowance : ");
		ca = in.nextInt();
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