package by.academy.lesson17.classwork;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import by.academy.lesson7.deal.Cheese;
import by.academy.lesson7.deal.Product;

//6.	Написать лямбда выражение, 
//которое принимает на вход объект типа Product и выводит на консоль 
//сообщение “Отгрузили продукт n”. 
//“Отправляем продукт n” Используем функциональный интерфейс Consumer 
//и метод по умолчанию andThen.
public class Task6 {

	public static void main(String... args) {

		Cheese c = new Cheese("Cheese", "Сырный сыр", 100.99, 3, 10);

		Consumer<Product> consumerОтгрузки = product -> {
			System.out.println("Отгрузили продукт " + product.getName());
		};
		Consumer<Product> consumerОтправки = product -> System.out.println("Отправили продукт " + product.getName());
		Consumer<Product> consumer1Отправки = System.out::println;

		consumerОтгрузки.andThen(consumerОтправки).accept(c);

		Function<String, Boolean> function1 = Boolean::valueOf;
		Function<String, Boolean> function2 = e -> Boolean.valueOf(e);

		System.out.println(function1.apply("TRUE"));

		Integer integer = 5;
		Supplier<String> supplier1 = () -> integer.toString();
		System.out.println(supplier1.get());

		Supplier<String> supplier2 = integer::toString;
		System.out.println(supplier2.get());

//		Function<Integer, Cheese> function = Cheese::new;
//
//		Function<String, Integer> function4 = Integer::new;

//		function4.apply("1");
	}

}
