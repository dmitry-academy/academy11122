package by.academy.lesson7.deal;

public class SuperWood extends Wood {

	double speed;

	public SuperWood() {
		super();
	}

	public SuperWood(String type, String name, double price, double quantity, double weight) {
		super(type, name, price, quantity, weight);
	}

	public SuperWood(double speed) {
		super();
		this.speed = speed;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("SuperWood [speed=");
		builder.append(speed);
		builder.append("]");
		return builder.toString();
	}

}
