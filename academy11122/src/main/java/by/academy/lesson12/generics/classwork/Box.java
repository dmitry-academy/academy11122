package by.academy.lesson12.generics.classwork;

public class Box<T> {

	private T item;

	public Box() {
		super();
	}

	public Box(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItems(T item) {
		this.item = item;
	}

}
