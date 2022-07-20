package by.academy.lesson12.enums;

public class CoffeeSizeValuesDemo {
	public static void main(String[] args) {

		System.out.println("Константы перечислимого типа CoffeeSize:");
		CoffeeSize[] coffeeSizes = CoffeeSize.values();

		for (CoffeeSize c : coffeeSizes) {
			System.out.println(c);
		}
	}
}