import java.util.Scanner;

class TempEmp extends Employee1 {

	protected String wageGrade;
	protected int daysWorked;

	public TempEmp() {
		super("Vaibhav", 890);
		wageGrade = "C";
		daysWorked = 234;
	}

	public TempEmp(String wageGrade, int daysWorked) {
		super("Anish", 697);
		this.wageGrade = wageGrade;
		this.daysWorked = daysWorked;
	} 

	public TempEmp(String name, int code, String wageGrade, int daysWorked) {
		super(name, code);
		this.wageGrade = wageGrade;
		this.daysWorked = daysWorked;
	}

	public String getWageGrade() {
		return wageGrade;
	}

	public void setWageGrade(String wageGrade) {
		this.wageGrade = wageGrade;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked() {
		this.daysWorked = daysWorked;
	}
	
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your Pay Grade = " );
		wageGrade = in.nextLine();
		System.out.println("Enter Your Working Days = " );
		daysWorked = in.nextInt();	
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("Your Pay Grade is = " + wageGrade +"\n");
		System.out.println("No. of Days You Worked is = " + daysWorked + "\n");
	}

	public static void main(String args[]) {
		TempEmp t1 = new TempEmp();
		TempEmp t2 = new TempEmp();
		t1.acceptData();
		t1.showData();
		
		t2.showData();	
	}
}