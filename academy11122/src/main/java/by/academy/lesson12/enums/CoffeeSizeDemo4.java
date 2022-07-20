package by.academy.lesson12.enums;

public class CoffeeSizeDemo4 {
	public static void main(String[] args) {

		CoffeeSize[] cs = CoffeeSize.values();

		for (CoffeeSize c : CoffeeSize.values()) {
			System.out.println(c + " " + c.ordinal());
		}

		for (int i = 0; i < CoffeeSize.values().length; i++) {
			CoffeeSize c = CoffeeSize.values()[i];
			System.out.println(c + " " + c.ordinal());
		}
	}
}