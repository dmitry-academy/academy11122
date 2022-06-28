package by.academy.lesson6.wrappers;

public class AutoBoxDemo1 {
	public static void main(String[] args) {
//		int i = iOb; // распаковать
//
//
//		Integer intObject = 100;
//
//		System.out.println(i + " " + iOb);
		int in = 100;
		Integer iOb = 100; // упаковать значение int
		test(in);
		test(iOb);
		int i = Integer.MAX_VALUE;
		test(i);
	}

	private static void test(int i) {
		System.out.println("int: " + i);
	}

	private static void test(Integer i) {
		System.out.println("Integer:" + i);
	}

}