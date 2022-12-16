import java.util.Scanner;

class PerEmp extends Employee1 {

	protected String department;
	protected String designation;
	protected int basicSalary;

	public PerEmp() {
	department = new String();
	designation = new String();
	
	}	

	public PerEmp(String department, String designation, int basicSalary) {
		super("Sachin", 10);
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
	}

	public PerEmp(String name, int code, String department, String designation, int basicSalary) {
		super(name, code);
		this.department = department;
		this.designation = designation;
		this.basicSalary = basicSalary;
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

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Department : ");
		department = in.nextLine();
		System.out.println("Enter Your Designation : ");
		designation = in.nextLine();
		System.out.println("Enter Your Salary : ");
		basicSalary = in.nextInt();
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("Salary is = " + basicSalary + "\n");
		System.out.println("Department is = " + department + "\n");
		System.out.println("Designation is = " + designation + "\n");
	}

	public static void main(String args[]) {
		PerEmp p1 = new PerEmp();
		p1.acceptData();
		p1.showData();
	}

}