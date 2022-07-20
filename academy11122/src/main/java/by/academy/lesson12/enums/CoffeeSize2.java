package by.academy.lesson12.enums;

import by.academy.lesson10.classwork.Flyable;

public enum CoffeeSize2 implements Flyable {
	// 100, 150 и 200 передаются в конструктор
	BIG(100, "B") {
		@Override
		public void test() {
			System.out.println("Big coffee");
		}
	},

	HUGE(150, "H") {
		@Override
		public void test() {
			System.out.println("Huge coffee");
		}
	},
	OVERWHELMING(200, "O") {

		@Override
		public void test() {
			System.out.println("Huge coffee");
		}
	};

	private int ml;
	private String s;

	CoffeeSize2(int ml, String s) {
		this.ml = ml;
		this.s = s;
	}

	public int getMl() {
		return ml;
	}

	public String getS() {
		return s;
	}

	@Override
	public void fly() {
		System.out.println("Flyable");
	}

	public abstract void test();

}