package by.academy.lesson9.inheritance;

public class Cat extends Animal {

	String color = "red";

	public void mew() {
		System.out.println("Mew!!");
	}

	public void eat() {
		System.out.println("Уже 6 утра!! Давай есть!");
	}

	@Override
	void live() {
		System.out.println("Кот живет!");
	}

}
