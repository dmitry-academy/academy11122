package by.academy.lesson6.wrappers;

public class AutoBoxAndMethods {

	static int someMethod(Integer value) {
		return value;
	}

	public static void main(String[] args) {
		int i = 100;
		Integer iOb = someMethod(i);
		System.out.println(iOb);
	}
}