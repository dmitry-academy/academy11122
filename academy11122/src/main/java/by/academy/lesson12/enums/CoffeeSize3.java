package by.academy.lesson12.enums;

public enum CoffeeSize3 {

	BIG, HUGE, OVERWHELMING(200);

	private int ml;

	CoffeeSize3(int ml) {
		this.ml = ml;
	}

	CoffeeSize3() {
		this.ml = 350;
	}

	public int getMl() {
		return ml;
	}
}