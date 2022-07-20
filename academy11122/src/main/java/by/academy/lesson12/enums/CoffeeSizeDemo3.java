package by.academy.lesson12.enums;

public class CoffeeSizeDemo3 {
	public static void main(String[] args) {

		CoffeeSize coffeeSize = CoffeeSize.valueOf("OVERWHELMING");

		System.out.println(CoffeeSize.OVERWHELMING == coffeeSize);
		System.out.println("Переменная coffeeSize содержит " + coffeeSize);

		System.out.println(coffeeSize.ordinal());
	}
}