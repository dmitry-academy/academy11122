package by.academy.lesson3;

public class IfElseDemo {

	public static void main(String[] args) {
		int i = 100;

		if (i < 4) {
			System.out.println("Привет-привет");
		} else {
			System.out.println("Пока-пока!");
		}

		String s = i < 50 ? "Меньше 1" : (i < 40 ? "Меньше 2" : (i < 50 ? "Меньше 3" : "АХАХАХА"));

		System.out.println(s);

		System.out.println(i < 4 ? "Привет-привет" : "Пока-пока!");

		if (i < 4) {
			System.out.println("Вот сюда");
			if (i < 4) {
				System.out.println("Привет-привет");
			} else {
				System.out.println("Пока-пока!");
				if (i < 4) {
					System.out.println("Привет-привет");
				} else {
					System.out.println("Пока-пока!");
				}

				if (i < 4) {
					System.out.println("Привет-привет");
					if (i < 4) {
						System.out.println("Привет-привет");
						if (i < 4) {
							System.out.println("Привет-привет");
						} else {
							System.out.println("Пока-пока!");
						}
					} else {
						System.out.println("Пока-пока!");
					}
				} else {
					System.out.println("Пока-пока!");
				}

			}

		} else if (i < 5) {
			System.out.println("И Вот сюда");
		} else if (i < 6) {

		}
	}

}
