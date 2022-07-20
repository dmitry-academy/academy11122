package by.academy.lesson12.generics.classwork;

public class BoxNumber<T extends Number> {

	private T[] items;

	private T item;

	@SuppressWarnings("unchecked")
	public BoxNumber() {
		super();
		this.items = (T[]) new Object[10];
	}

	public BoxNumber(T[] items) {
		super();
		this.items = items;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public T[] getItems() {
		return items;
	}

	public void setItem(T[] items) {
		this.items = items;
	}

}
