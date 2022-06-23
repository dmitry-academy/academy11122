package by.academy.lesson5.classwork;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

//		3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) 
//		средней длинны, а также длину.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string quantity:");
		int quantity = sc.nextInt();

		String[] array = new String[quantity];
		double d = 0;
		for (int i = 0; i < quantity; i++) {
			System.out.println("Enter string " + (i + 1));
			array[i] = sc.next();
			d += array[i].length();
		}

		d = d / quantity;

		for (int i = 0; i < quantity; i++) {
			if (array[i].length() <= d) {
				System.out.println("String: " + array[i] + " Length: " + array[i].length());
			}
		}

		System.out.println("Array:");
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
