package by.academy.lesson19.classwork;
//3.	Написать 3 класса, реализующие интефейс Runnable, в конструкторе принимают массив int. В главном потоке вывести: Закончили выполнение в главном потоке. Использовать join так, чтобы сообщения шли в порядке функциональности, описанной ниже(1,2,3). Сообщение из главного потока должно быть в самом конце. Каждый поток имеет свою функциональность. 

//1.	Ищет в массиве минимальное значение. (можно использовать Stream API) Выводит результат на экран.
//2.	Ищет в массиве максимальное значение. (можно использовать Stream API) Выводит результат на экран.
//3.	Находит стреднее значение. Выводи результат на экран.

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		Integer[] array = { 1, 6, 3, 21, 7, 34 };
		Runnable max = new MaxRunnable(array);
		Runnable min = new MinRunnable(array);
		Runnable avg = new AvgRunnable(array);

		Thread t1 = new Thread(max);
		Thread t2 = new Thread(min);
		Thread t3 = new Thread(avg);

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

		System.out.println("Закончили выполнение в главном потоке");

	}

}
