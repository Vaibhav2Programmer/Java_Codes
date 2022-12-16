import java.util.Scanner;

class Employee4 extends PerEmp {

	protected String name;
	protected int code;

	public Employee4() {
		name = new String();
	}

	public Employee4(String name, int code, String department, String designation, int basicSalary) {
		super(department, designation, basicSalary);
		this.name = name;
		this.code = code;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		name = in.nextLine();
		System.out.println("Enter Your Code : ");
		code = in.nextInt();
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Name is : " + name);
		System.out.println("Code is : " + code);
	}

	public static void main(String args[]) {
		Employee4 a = new Employee4();
		a.acceptData();
		a.showData();
	}
}