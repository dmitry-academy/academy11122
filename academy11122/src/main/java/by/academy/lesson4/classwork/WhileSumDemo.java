package by.academy.lesson4.classwork;

public class WhileSumDemo {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while (i < 20) {
			if (i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.print("sum = " + sum);

	}

}
