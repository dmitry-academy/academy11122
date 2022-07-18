package by.academy.lesson7.deal;

public class DealDemo {

	public static void main(String[] args) {
		Deal deal = new Deal();
		for (int i = 0; i < 100; i++) {
			deal.addProduct(new Wood(i));
		}
		System.out.println(deal);
	}

}
