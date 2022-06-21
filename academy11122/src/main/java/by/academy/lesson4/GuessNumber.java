package by.academy.lesson4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Random rand = new Random();

		int randomNumber = rand.nextInt(10);
		int i = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);
//		System.out.println("Загаданное число: " + randomNumber);
		do {
			if (i > Integer.MIN_VALUE) {
				System.out.println("А вот и нет!");
			}
			System.out.println("Введите число: ");
			i = scan.nextInt();
		} while (i != randomNumber);
		System.out.println("Вы угадали! ");
		scan.close();
	}

}
