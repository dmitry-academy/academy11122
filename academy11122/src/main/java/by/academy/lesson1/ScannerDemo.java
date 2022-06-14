package by.academy.lesson1;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		System.out.println(s);

//		System.out.println("Введите первое число:");
//		int i1 = sc.nextInt();
//		System.out.println("Введите второе число:");
//		int i2 = sc.nextInt();
//		System.out.println("Сумма " + i1 + " и " + i2 + " = " + (i1 + i2));

		System.out.println("test".charAt(0));

		sc.close();
	}

}
