package by.academy.lesson1;

public class Man {
	// Comments one line
	int age; // поле класса
	double money; // поле класса
	String name = "Вася"; // поле класса

	public Man() {
		super();
	}

	public Man(String name) {
		super();
		this.name = name;
	}

	public Man(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Man(String name, int age, double money) {
		super();
		this.name = name;
		this.age = age;
		this.money = money;
	}

	/**
	 * Comments several lines Comments several lines
	 */
	public void grow() {
		age = age + 1;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void pay(double amount, String service) {
		System.out.println("Стоимость услуги " + service + ": " + amount);
		money = money - amount;
		System.out.println("Денег осталось: " + money);
	}

	public void printName() {
		System.out.println(name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Man [age=");
		builder.append(age);
		builder.append(", money=");
		builder.append(money);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

}
