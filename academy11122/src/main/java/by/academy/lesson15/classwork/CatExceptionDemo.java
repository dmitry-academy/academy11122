package by.academy.lesson15.classwork;

import by.academy.lesson3.cat.Cat;

public class CatExceptionDemo {

	public static void main(String[] args) throws CatException {
		Cat cat = new Cat(130, "Васька");
		try {
			catThrowException(cat);
			System.out.println("Кот живой");
		} catch (CatException e) {
			System.out.println("Кот не очень живой");
		}
		System.out.println("лалала");
	}

	public static void catThrowException(Cat cat) throws CatException {
		if (cat.getAge() > 30) {
			throw new CatException(cat.getAge(), "Коты столько не живут");
		}

		System.out.println("Вашему коту " + cat.getAge() + " лет.");
	}
}
