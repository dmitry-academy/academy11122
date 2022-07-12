package by.academy.lesson10.statics;

public class Ball {

	int count = 0;
	static int globalCount = 0;
	String color = "none";
	String size = "small";

	public Ball(String color) {
		this.color = color;
		count++;
	}

	public void showCount() {
		System.out.println("Count is: " + count);
	}

	public static void showGlobalCount() {
		System.out.println("Count is: " + globalCount);
	}

}