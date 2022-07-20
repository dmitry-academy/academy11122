package by.academy.lesson12;

public class MinMax<T extends Number> {

	private T[] items;

	public MinMax(T[] items) {
		super();
		this.items = items;
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public T min() {
		if (items != null && items.length == 0) {
			return null;
		}
		T min = items[0];
		for (T n : items) {
			if (min.doubleValue() > n.doubleValue()) {
				min = n;
			}
		}

		return min;
	}

	public T max() {
		if (items != null && items.length == 0) {
			return null;
		}
		T max = items[0];
		for (T n : items) {
			if (max.doubleValue() < n.doubleValue()) {
				max = n;
			}
		}

		return max;
	}

}
