package by.academy.lesson4.classwork;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		do {
			if (a > 0) {
				System.out.println("Число равно: " + a);
			}
			System.out.println("Введите число: ");
			a += scan.nextInt();
		} while (a < 500);

		System.out.println(a);
		scan.close();
	}

}
