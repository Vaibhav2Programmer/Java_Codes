interface Stack {

	void push(int i);
	void pop();
	default void clear() {
		System.out.println("Clear implementation not provided");
	}

}

	

