package by.academy.lesson10.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	// hello <-> hlleo
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		String str2 = scan.nextLine();

		char temp = 0;
		boolean result = true;

		if (str1.length() != str2.length()) {
			result = false;
		} else {
			int[] letters = new int[256];

			for (char c : str1.toCharArray()) {
				letters[c]++;
			}
			System.out.println(Arrays.toString(letters));
			for (char c : str2.toCharArray()) {
				if (--letters[c] < 0) {
					result = false;
				}
			}

			System.out.println(Arrays.toString(letters));
		}
		System.out.println("result: ");
		System.out.println((int) temp);

		scan.close();
	}
}
