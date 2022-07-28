package by.academy.lesson14.classwork.linkedlist;

public class LinkedListCustomDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListCustom<String> stringList = new LinkedListCustom<>();

		stringList.add("Ф");
		stringList.add("И");
		stringList.add("И");
		stringList.add("З");

		stringList.add(0, "new");

		System.out.println(stringList.get(1));
	}

}
