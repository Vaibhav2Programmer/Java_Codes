1. Run in Current Class

class Program implements Runnable {

	Thread t;

	public Program() {
		t = new Thread(this);        
	}

	public void run() {
	}
}

2. Run in Another Class