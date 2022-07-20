package by.academy.lesson12.classwork;

public class NotGenericBox<T> {

	private T[] items;

	@SuppressWarnings("unchecked")
	public NotGenericBox() {
		super();
		this.items = (T[]) new Object[4];
	}
	@SuppressWarnings("unchecked")

	public NotGenericBox(int capacity) {
		super();
		this.items = (T[]) new Object[capacity];
	}

	public T[] getArray() {
		return items;
	}

	public void setArray(T[] items) {
		this.items = items;
	}

	public void putItem(T item) {
		System.out.println("polojili item");
	}

	public T takeItem() {
		System.out.println("dostali item");
		return null;
	}
}
