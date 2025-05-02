package Thread;

class ThreadRunnableInterfaceDemo implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ThreadRunnableInterfaceDemo m1 = new ThreadRunnableInterfaceDemo();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}