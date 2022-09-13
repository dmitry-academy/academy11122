package by.academy.lesson19;

import java.util.List;
import java.util.stream.Collector;

public class MyRunnableDemo {
	public static void main(String[] args) {
//		2.	Создать класс, реализующий интерфейс Runnable. 
//		Переопределить run() метод. Создать цикл for. 
//		В цикле распечатываем значения от 0 до 100 делящиеся на 10 без остатка. 
//		Используем статический метод Thread.sleep() чтобы сделать паузу. 
//		Создать три потока, выполняющих задачу распечатки значений.

		int[] array = { 1, 2, 3, 5, 6 };
		MyRunnable myRunnable = new MyRunnable(array);

		Thread thread1 = new Thread(myRunnable, "Вася");
		Thread thread2 = new Thread(myRunnable);
		Thread thread3 = new Thread(myRunnable);

		Thread thread4 = new Thread(() -> System.out.println("Hello from lambda thread"));

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		
		System.out.println(thread1.getName());

		System.out.println(thread1.getPriority());

		System.out.println(Thread.currentThread().getPriority());

		System.out.println(thread1.getId());

	}
}