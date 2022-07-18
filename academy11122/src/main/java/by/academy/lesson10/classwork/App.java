package by.academy.lesson10.classwork;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
//		System.out.println(Mouse.COLOR);

//		Mouse m = new LogitechMouse();
//		m.eatCheese();

		Robot r = new Robot();
		Car car = new Car();

		test(car);
		test(r);

		List<Flyable> list = new ArrayList<>();

		list.add(r);
		list.add(car);

		for (Flyable f : list) {
			f.fly();
		}
	}

	public static void test(Flyable f) {
		f.start();
		f.fly();
		f.stop();
	}

}
