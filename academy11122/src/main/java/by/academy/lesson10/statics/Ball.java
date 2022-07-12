package by.academy.lesson10.statics;

public class Ball {

	static int count = 0;
	String color = "none";

	public Ball(String color) {
		this.color = color;
		count++;
	}

	public static void showCount() {
		System.out.println("Count is: " + count);
	}

}