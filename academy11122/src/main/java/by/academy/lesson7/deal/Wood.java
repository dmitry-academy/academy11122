package by.academy.lesson7.deal;

public class Wood extends Product {

	private double weight;

	public Wood() {
		super();
	}

	public Wood(String type, String name, double price, double quantity, double weight) {
		super(type, name, price, quantity);
	}

	public Wood(double weight) {
		super();
		this.weight = weight;
	}

	@Override
	protected double getDiscount() {
		if (weight >= 20) {
			return 0.8; // 20% discount
		}
		return 1;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Wood [weight=");
		builder.append(weight);
		builder.append("]");
		return builder.toString();
	}

}
