import java.util.Scanner;

class Employee1 {

	protected String name;
	protected int code;

	public Employee1() {
		name = new String();
	}

	public Employee1(String name, int code) {
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

	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Name = ");
		name = in.nextLine();
		System.out.println("Enter Your Code = ");
		code = in.nextInt();
	}

	public void showData() {
		System.out.println("Name is = " + name + "\n");
		System.out.println("Code is = " + code + "\n");
	}

	public static void main(String args[]) {
		Employee1 a = new Employee1();
		a.acceptData();
		a.showData();
	}

}