package by.academy.lesson4.classwork;

import java.util.Random;

public class ArrayDemo {

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 1000; i++) {
			System.out.println(rand.nextInt(10));
		}

	}

}
