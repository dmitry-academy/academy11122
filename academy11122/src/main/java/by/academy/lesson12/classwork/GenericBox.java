package by.academy.lesson12.classwork;

import java.util.Arrays;

public class GenericBox<T> {

	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public GenericBox() {
		super();
		this.items = (T[]) new Object[10];
	}

	@SuppressWarnings("unchecked")
	public GenericBox(int capacity) {
		super();
		this.items = (T[]) new Object[capacity];
	}

	public int size() {
		return size;
	}

	public T get(int index) {
		if (index < 0 || index > items.length - 1) {
			System.err.println("Index of bound exception");
			return null;
		}
		return items[index];
	}

	public void remove() {
		if (size == 0) {
			System.err.println("Index of bound exception");
			return;
		}
		items[--size] = null;
	}

	public void remove(int index) {
		if (index < 0 || index > items.length - 1) {
			System.err.println("Index of bound exception");
			return;
		}
		System.arraycopy(items, index + 1, items, index, size - index);
		items[--size] = null;
	}

	public void add(T item) {
		if (size + 1 >= items.length) {
			grow();
		}
		items[size++] = item;
	}

	public void add(int index, T item) {
		if (index > items.length) {
			System.err.println("Index of bound exception");
			return;
		}
		if (size + 1 >= items.length) {
			grow();
		}
		System.arraycopy(items, index, items, index + 1, size - index);
		items[index] = item;
		size++;
	}

	@SuppressWarnings("unchecked")
	private void grow() {
		T[] newObj = (T[]) new Object[items.length * 2 + 1];
		System.arraycopy(items, 0, newObj, 0, items.length);
		items = newObj;
	}

	public T[] getItem() {
		return items;
	}

	public void setItem(T[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("T [items=");
		builder.append(Arrays.toString(items));
		builder.append("]");
		return builder.toString();
	}

}
