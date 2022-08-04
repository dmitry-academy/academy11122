package by.academy.lesson15;

public class MultiCatch2 {
	public static void main(String[] args) {
		try {
			int b = 42 / 0;
			int[] c = new int[1];
			c[1] = 6;
		} catch (ArithmeticException e) {
			System.out.println("охохох ArithmeticException." + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ошибка ArrayIndexOutOfBoundsException." + e);
		} catch (Exception e) {
			System.out.println("Ошибка я обработаю остальные ошибки." + e);
		} finally {
			System.out.println("finally");
		}

		System.out.println("Уже после блока try-catch.");
	}
}