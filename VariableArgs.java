class VariableArgs {

	public static int sum(int... n) {
		int sum = 0;
		for(int i = 0; i < n.length; i++)
			sum += n[i];
		return sum;
}

	public static void main(String args[]) {                                  // public static void main(String.. args)
		System.out.println(sum(10,20,89,90));
		System.out.println(sum(9,9,9));
		System.out.println(sum());

		int num[] = {9, 10, 12};
		System.out.println(sum(num));
	}

}