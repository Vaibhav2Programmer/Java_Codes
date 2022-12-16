class Book {

	protected int code;
	protected String name;

	public Book() {
	//	this.code = code;
	//	this.name = name;
	}
	
	public String toString() {
	//	return "Book[" + code + "," + name + "]";
		return "hello World";
	}
		
	public static void main(String args[]) {
		Book b = new Book();
		System.out.println(b);
	}
}