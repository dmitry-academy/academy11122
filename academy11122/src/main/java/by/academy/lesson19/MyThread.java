package by.academy.lesson19;

public class MyThread extends Thread {

	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Важная работа выполняется в потоке " + getName());
		}
	}

//	public void run(String s) {
//		System.out.println("String in run is " + s);
//	}
}