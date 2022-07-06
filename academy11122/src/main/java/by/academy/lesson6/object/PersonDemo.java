package by.academy.lesson6.object;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Вася", 25, true);
		Person p2 = new Person("Вася", 25, true);

		System.out.println(p1.equals(p2));

		System.out.println(p2);

		System.out.println(p2.getFullName());
		System.out.println(p2.getFullName());

	}

}
