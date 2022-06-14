package by.academy.lesson2.classwork;

public class Application {

	public static void main(String[] args) {

		Cat2 cat = new Cat2("Barsik");
		Cat2 cat1 = new Cat2("Bug", 3);

		cat.eat();
		cat.sleep();
		cat.walk();

		cat.printAge();
		cat.grow(1);
		cat.printAge();

		cat.grow(3);
		cat.printAge();
		cat1.printAge();

		int catAge = cat.getAge();

		System.out.println(catAge);
	}

}
