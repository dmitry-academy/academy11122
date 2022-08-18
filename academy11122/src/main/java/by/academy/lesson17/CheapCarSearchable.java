package by.academy.lesson17;

public class CheapCarSearchable implements Searchable {

	@Override
	public boolean test(Car car) {
		return car.getCost() < 1000;
	}

}
