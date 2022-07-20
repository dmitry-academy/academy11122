package by.academy.lesson12;

import by.academy.lesson10.classwork.Car;

public class ApplicationNoGenericBox {

	public static void main(String[] args) {

		Box<Cat> b1 = new Box<>(new Cat());
		System.out.println(b1);

		NoGenericBox<Car> b2 = new NoGenericBox<>();
		System.out.println(b2);
	}

}
