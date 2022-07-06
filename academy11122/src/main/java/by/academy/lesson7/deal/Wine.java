package by.academy.lesson7.deal;

import by.academy.lesson7.oop.deal.annotations.Producer;

@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
public class Wine extends Product {

	private static final long serialVersionUID = 1L;
	
	@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
	public Integer test;
	
	@Override
	@Producer(country = "New Zeland", founderFullName = "NewZelander", startYear = 1600)
	public double getDiscount() {
		if (quantity * price > 100) {
			return 0.95;// 5% discount
		}
		return 1;
	}
}
