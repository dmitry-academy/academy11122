package by.academy.lesson7.deal;

public class PlasticBag extends Product {

	public PlasticBag(String type, String name, double price, double quantity) {
		super(type, name, price, quantity);
	}

	@Override
	protected double getDiscount() {
		return 0.5;
	}

}
