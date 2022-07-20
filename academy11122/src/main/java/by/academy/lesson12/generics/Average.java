package by.academy.lesson12.generics;

public class Average<T extends Number /* & Comparable<Number> & Serializable */> {

	private T[] array;

	public Average(T[] array) {
		this.array = array;
	}

	public double average() {
		double sum = 0.0;

		for (T value : array) {
			sum += value.doubleValue();
		}

		return sum / array.length;
	}

	public boolean sameAvg(Average<?> dob) {
		return average() == dob.average();
	}
}
