enum Colors {

	RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

	String code;

	Colors(String code) {
		this.code = code;
		}

	public String getCode() {
		return code;
		}

	
}


class enumExp2 {

	public static void main(String args[]) {
		Colors color = Colors.RED;
		System.out.println(color);
		System.out.println(color.getCode());
	}
}