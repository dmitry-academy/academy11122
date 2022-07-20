package by.academy.lesson12;

public class MinMaxDemo {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 5, 7, 2, 8, 2, 4, 6, 8, 2435, 234234, 5345, 23 };

		MinMax<Integer> intMinMax = new MinMax<>(intArray);

		System.out.println(intMinMax.max());
		System.out.println(intMinMax.min());
	}

}
