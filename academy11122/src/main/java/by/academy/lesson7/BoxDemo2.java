package by.academy.lesson7;

public class BoxDemo2 {
	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();

//		myBox1.setDim(1, 20, 15);
//		myBox1.setDim(2, 20, 15);
//		myBox1.setDim(10, 20, 15);
//		myBox2.setDim(1, 5, 5);

		System.out.println("Width: " + myBox1.getWidth());
		System.out.println("Width: " + myBox2.getWidth());

		System.out.println("Объем: " + myBox1.getVolume());
		System.out.println("Объем: " + myBox2.getVolume());
	}
}