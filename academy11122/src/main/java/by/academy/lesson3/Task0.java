package by.academy.lesson3;

import java.util.Scanner;

public class Task0 {
//	0. Ввести через консоль название месяца -> 
//	вывести номер месяца (использовать switch/case)

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String month = sc.next();
//		if (sc.hasNextInt()) {
//			int str = sc.nextInt();
//			System.out.println("Your string is:" + str);
//		} else {
//			String str = sc.next();
//			System.out.println("Your string is:" + str);
//		}

		month = month.toLowerCase();
		switch (month) {
		case "январь":
			System.out.println("1 месяц");
			break;

		default:
			System.out.println("ЭЭТО не месяц!");
		}
		sc.close();
	}

}
