package by.academy.lesson19.threads;

public class DaemonThread extends Thread {

	public DaemonThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// Checking whether the thread is Daemon or not
//
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("Daemon started: " + getName());
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		} else {
			System.out.println(getName() + " is User thread");
		}

	}
}
