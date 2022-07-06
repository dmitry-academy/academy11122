package by.academy.lesson7.deal;

public class Cheese extends Product {

	private int age;

	public Cheese() {
		super();
	}

	public Cheese(String type, String name, double price, double quantity, int age) {
		super(type, name, price, quantity);
		this.age = age;
	}

	@Override
	protected double getDiscount() {
		if (age >= 20) {
			return 0.8;
		}
		return 1;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
