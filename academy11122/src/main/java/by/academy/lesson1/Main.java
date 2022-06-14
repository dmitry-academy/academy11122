package by.academy.lesson1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		int age = 20;
		System.out.println("Age: " + age);

		double money = 20_000.0000000000000000001;
		System.out.println(money);

		char c1 = 100;
		char c2 = 'c';
		System.out.println(c1);
		System.out.println((int) c2);

		long maxLong = Long.MAX_VALUE;
		int i = (int) maxLong;
		System.out.println("Max long: " + maxLong);
		System.out.println("int: " + i);

		int maxInt = Integer.MAX_VALUE;
		System.out.println("Max int: " + maxInt);
		System.out.println(maxInt + 1);
		System.out.println("Max int: " + maxInt);
		System.out.println(maxInt + 1);

		double dbl1 = 4.2;
		double dbl2 = 4.9;
		System.out.println((int) dbl1);
		System.out.println((int) dbl2);

		Man m1 = new Man();
		m1.age = 999;
		System.out.println(m1);
		m1.grow();
		m1.printName();
		System.out.println(m1);

	}
}
