package by.academy.lesson17;

public class CompactCarSearch implements Searchable {
	public boolean test(Car car) {
		return car.getType().equals(CarTypes.COMPACT);
	}
}
