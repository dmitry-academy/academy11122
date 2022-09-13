package by.academy.lesson19.threads;

public class DeamonDemo {
	public static void main(String[] args) throws InterruptedException {
//		for (int i = 0; i < 10; i++) {
			DaemonThread t1 = new DaemonThread(0 + " thread 1 p10");
//			DaemonThread t2 = new DaemonThread(i + " thread 2 p5");
//			DaemonThread t3 = new DaemonThread(i + " thread 3 p1");

			System.out.println(t1.getState());
//			t1.setDaemon(true);
//			t2.setDaemon(true);
//			t3.setDaemon(true);
//			t1.setPriority(10);
//			t2.setPriority(5);
//			t3.setPriority(1);
			t1.start();
//			t2.start();
			System.out.println(t1.getState());

			// Setting user thread t3 to Daemon
//			t3.start();
//		}

//		WhileThread whileThread = new WhileThread("t4");
//		whileThread.setDaemon(true);
//		whileThread.start();
		// Setting user thread t1 to Daemon
			System.out.println(t1.getState());

		// starting first 2 threads

			Thread.currentThread().sleep(3000);
		System.out.println("END!");
		
		System.out.println(t1.getState());
		

	}
}
