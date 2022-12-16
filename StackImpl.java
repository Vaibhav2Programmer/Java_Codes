public class StackImpl implements Stack {

	public static final int SIZE = 3;
	int num[];
	int top;
	
	public StackImpl() {
		num = new int[SIZE];
		top = -1;
	}

	public void push(int i) {
		if(top < SIZE -1) {
			top++;
			num[top] = i;	
			System.out.println("Element Pushed !!");
		}
		else
			System.out.println("Stack OverFlow !");
	}

	public void pop() {
		if(top >= 0) {
			top--;
			System.out.println("Element Popped !!");
		}
		else 
			System.out.println("Stack Underflow !!");
	}
	
	public void clear() {
		top = -1;
		num = new int[SIZE];
	}

	public static void main(String args[]) {
		StackImpl s = new StackImpl();
		s.push(10);
		s.push(20);
		s.push(30);

		// s.clear();

		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

}