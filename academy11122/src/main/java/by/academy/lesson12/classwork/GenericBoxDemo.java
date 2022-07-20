package by.academy.lesson12.classwork;

import by.academy.lesson7.deal.Cheese;
import by.academy.lesson7.deal.Product;

public class GenericBoxDemo {

	public static void main(String[] args) {
		GenericBox<Product> products = new GenericBox<>();

		GenericBox<Integer> integers = new GenericBox<>();

//		products = integers;
		
		products.add(new Cheese());
//		products.remove(0);
		Product p = products.get(0);
		System.out.println(p);
	}

}
