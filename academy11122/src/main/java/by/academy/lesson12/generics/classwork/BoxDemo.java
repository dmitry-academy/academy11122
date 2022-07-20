package by.academy.lesson12.generics.classwork;

public class BoxDemo {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();

		Box<Animal> catBox1 = new Box<>(dog);

		Box<Dog> dogBox1 = new Box<>(dog);

		System.out.println(catBox1.getItem());
		System.out.println(dogBox1.getItem());

//		Dog dog = new Dog();
//
//		Dog[] dogs = new Dog[10];
//
//		Box1<?>[] dogBox = new Box1[10];

//		System.out.println(dogBox.getItem());
	}

}
