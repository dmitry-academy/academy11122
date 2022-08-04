package by.academy.lesson15;

public class FinallyUse {

	public static void main(String[] args) {
//		try {
//			procA();
//		} catch (Exception e) {
//			System.out.println("Исключение выброшено");
//		} finally {
//			System.out.println("Выполняем всегда");
//		}
//		int i = procB();
//		System.out.println(i);
//		System.out.println("method main");
		procC();
	}

	// Нормальное выполнение try-блока
	public static void procC() {
		try {
			System.out.println("Внутри procC");
		} finally {
			System.out.println("finally procC");
		}
		System.out.println("конец метода для procC ");
	}

	// Возврат изнутри try-блока
	public static int procB() {
		try {
			System.out.println("Внутри procB");
			return 1;
		} finally {
			System.out.println("finally для procB ");
			return 100;
		}
	}

	// Выход из метода через исключение
	public static void procA() {
		try {
			System.out.println("Внутри procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("finally для procA ");
		}
	}
}