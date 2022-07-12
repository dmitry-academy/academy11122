package by.academy.lesson10.statics;

public class BallDemo {
	public static void main(String[] args) {

		Ball ball1 = new Ball("красный");
		Ball ball2 = new Ball("голубой");
		Ball ball3 = new Ball("желтый");

		System.out.println("Количество созданных объектов: " + Ball.count);
		Ball.showCount();
	}
}