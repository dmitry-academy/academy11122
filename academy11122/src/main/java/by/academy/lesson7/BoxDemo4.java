package by.academy.lesson7;

public class BoxDemo4 {
	public static void main(String[] args) {

		Box b = new Box();

		Box myBox1 = new Box(10, 20, 15);
		Box myBox2 = new Box(3.0, 6.0, 9.0);
		Box myBox3 = new Box("3", "5", "9");
		// Не можем использовать конструктор по умолчанию
		// Box myBox3 = new Box();

		System.out.println("Объем: " + myBox1.getVolume());
		System.out.println("Объем: " + myBox2.getVolume());
	}
}