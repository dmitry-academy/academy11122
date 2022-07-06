package by.academy.lesson7;

public class BoxDemo6 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Box b1 = new Box();
		Box b2 = (Box) b1.clone();
//		Box b2 = new Box();

		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.width = 10;
		b1.height = 20;
		b1.depth = 15;

		b2.width = 11;
		b2.height = 21;
		b2.depth = 11;
		System.out.println("-----");

		System.out.println(b1);
		System.out.println(b2);

		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));

	}
}