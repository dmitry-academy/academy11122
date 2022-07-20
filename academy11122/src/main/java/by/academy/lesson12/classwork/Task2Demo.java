package by.academy.lesson12.classwork;

public class Task2Demo {

	public static void main(String[] args) {
		System.out.println(countUniqueChars("helloЫЫЫ"));
	}

	public static int countUniqueChars(String s) {

		int counter = 0;
		int[] allChars = new int[2048];
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			allChars[arr[i]]++;
		}

		for (int i = 0; i < allChars.length; i++) {
			if (allChars[i] > 0) {
				counter++;
			}
		}
		return counter;
	}
}
