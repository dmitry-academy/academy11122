package by.academy.lesson10.classwork;

public interface Mouse {

	String COLOR = "red";

	void clickRigt();

	void clickLeft();

	void scrollUp();

	void scrollDown();

	default void eatCheese() {
		System.out.println("Im eating cheese");
	}
}
