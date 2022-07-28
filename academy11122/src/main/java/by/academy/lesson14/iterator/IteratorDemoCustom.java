package by.academy.lesson14.iterator;

public class IteratorDemoCustom {

	public static void main(String[] args) {

		Integer[] arr = { 1, 7, 9 };

		CustomIterator<Integer> iterator = new CustomIterator<>(arr);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
