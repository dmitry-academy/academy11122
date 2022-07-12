package by.academy.lesson9.inheritance;

public class Main {
	public static void main(String[] args) {

		System.out.println("Creature");
		Creature creature = new Creature();
		creature.live();

		System.out.println("Animal");
		Animal animal = new Animal();
		animal.live();
		animal.walk();

		System.out.println("Cat");
		Cat cat = new Cat();
		cat.live();
		cat.walk();
		cat.eat();
		cat.eat();
		cat.mew();
		cat.eat();

		System.out.println(cat.age);
		System.out.println(cat.color);

		Creature cat1 = new Cat();

		cat1.live();

	}
}
