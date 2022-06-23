package by.academy.lesson4.classwork;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number on integers:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Your number " + i + ": ");
			int number = sc.nextInt();
			System.out.println(number);
		}

		System.out.println(Double.parseDouble("3.4"));
		sc.close();

	}

}
