package by.academy.lesson17.classwork;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

//8.	Написать лямбда выражение, 
//которое возвращает случайное число от 0 до 10. 
//Используем функциональный интерфейс Supplier.
public class Task8 {
	public static void main(String... args) {

		Supplier<Integer> random = () -> {
			Random rand = new Random();
			return rand.nextInt(11);
		};
//		for (int i = 0; i < 100; i++) {
//			System.out.println(random.get());
//		}

		Function<Integer, Integer> generator = Integer::new;
		System.out.println(generator.apply(new Random().nextInt(11)));
	}
}
