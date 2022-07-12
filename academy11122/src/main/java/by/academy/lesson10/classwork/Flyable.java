package by.academy.lesson10.classwork;

public interface Flyable {

	default void start() {
		System.out.println("Flyable default method start");
	}

	default void stop() {
		System.out.println("Flyable default method start");
	}

	void fly();
}
