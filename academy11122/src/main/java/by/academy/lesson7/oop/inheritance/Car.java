package by.academy.lesson7.oop.inheritance;

public class Car extends Vehicle {

	private double weight;
	public Car() {
		super();
	}

	public Car(int maxSpeed) {
		super(maxSpeed);
	}

	public void stop() {
		System.out.println("Стоп!");
	}
}
