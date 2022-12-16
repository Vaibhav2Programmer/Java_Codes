import java.util.Scanner;

class Student {

		protected String name;
		protected int c;
		protected String section;
		protected String subject1;
		protected String subject2;
		protected String subject3;
		protected String subject4;
		protected int mark1;
		protected int mark2;
		protected int mark3;
		protected int mark4;

		public Student() {
		}
		
		public Student(String name, int c, String section, String subject1, String subject2, String subject3, String subject4, int mark1, int mark2, int mark3, int mark4) {
			this.name = name;
			this.c = c;
			this.section = section;
			this.subject1 = subject1;
			this.subject2 = subject2;
			this.subject3 = subject3;
			this.subject4 = subject4;
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
			this.mark4 = mark4;
		}
		public String getSection() {
			return section;
		}		
		public void getSection(String section) {
			this.section = section;
		}

		public  String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getC() {
			return c;
		}
		public void setClass(int c) {
			this.c = c;
		}
		
		public String getSubject1() {
			return subject1;
		}
		public void setSubject1(String subject1) {
			this.subject1 = subject1;
		}

		public String getSubject2() {
			return subject2;
		}
		public void setSubject2(String subject2) {
			this.subject2 = subject2;
		}

		public String getSubject3() {
			return subject3;
		}
		public void setSubject3(String subject3) {
			this.subject3 = subject3;
		}
		
		public String getSubject4() {
			return subject4;
		}
		public void setSubject4(String subject4) {
			this.subject4 = subject4;
		}

		public int getMark1() {
			return mark1;
		}
		public void setMark1(int mark1) {
			this.mark1  = mark1;
		}

		public int getMark2() {
			return mark2;
		}
		public void setMark2(int mark2) {
			this.mark2  = mark2;
		}

		public int getMark3() {
			return mark3;
		}
		public void setMark3(int mark3) {
			this.mark3  = mark3;
		}

		public int getMark4() {
			return mark4;
		}
		public void setMark4(int mark4) {
			this.mark4  = mark4;
		}
		
		public int getTotal() {
			return (mark1 + mark2 + mark3 + mark4);
		}
		
		public float getPercentage() {
			return (float) ((getTotal()/400) * 100);
		}
		
		public void acceptData() {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your Name : ");
			name = in.nextLine();
			System.out.println("Enter your Class : ");
			c = in.nextInt();
			System.out.println("Enter Your Section : ");
			section = in.next();
			System.out.println("Enter your Subjects : ");
			subject1 = in.next();
			subject2 = in.next();
			subject3 = in.next();
			subject4 = in.next();
			System.out.println("Enter Your marks : ");
			mark1 = in.nextInt();
			mark2 = in.nextInt();
			mark3 = in.nextInt();
			mark4 = in.nextInt();
			
		}
		
		public void showData() {
			System.out.println("Name is :" + name);
			System.out.println("Class is : " + c);
			System.out.println("Section is:" + section);
			System.out.println("Subjects are : " + subject1 + ", " + subject2 + "," + subject3 + "," + subject4);
			System.out.println("Marks are :" + mark1 + "," + mark2 + "," + mark3 + "," +mark4);
			
		}
		
		public static void main(String args []) {
			Student s = new Student();
			s.acceptData();
	//		s.setMark1(70);
			s.showData();
			System.out.println("Total marks are:" + s.getTotal());
			System.out.println("Percentage are:" + s.getPercentage());
		}
		
}