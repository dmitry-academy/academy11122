package by.academy.lesson18;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionChangingValuesDemo {
	public static void main(String... args) {

		Car car = new Car(500, "1233");
		Class<Car> carClass = Car.class;

		try {
			Field serialNumberField = carClass.getDeclaredField("serialNumber");
			serialNumberField.setAccessible(true);

			System.out.println("Before change:" + serialNumberField.get(car));
			serialNumberField.set(car, "7777");

			System.out.println("After change:" + serialNumberField.get(car));

			System.out.println(Modifier.isPrivate(serialNumberField.getModifiers()));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
}
