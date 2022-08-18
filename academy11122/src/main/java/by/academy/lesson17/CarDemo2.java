package by.academy.lesson17;

import java.io.IOException;

public class CarDemo2 {
	public String a = "1";

	public static void main(String[] args) throws IOException {
		Car[] cars = { new Car(CarTypes.COMPACT, 34000), new Car(CarTypes.COMPACT, 800), new Car(CarTypes.SPORT, 44000),
				new Car(CarTypes.COMPACT, 14000), new Car(CarTypes.COMPACT, 10000), };

		System.out.println(countCompactCar(cars));
		System.out.println(countSportCar(cars));
		System.out.println(countMiddlePriceCar(cars));

		System.out.println(countCar(cars, new Searchable() {
			@Override
			public boolean test(Car car) {
				return car.getCost() > 15000;
			}
		}));

		Searchable cheapCars = new CheapCarSearchable();
		System.out.println(countCar(cars, cheapCars));

		System.out.println(countCar(cars, new CheapCarSearchable()));

		Searchable expensiveCars = c -> c.getCost() > 30000;
//		System.out.println(countCar(cars, expensiveCars));
//
//		System.out.println(countCar(cars, c -> c.getCost() > 30000));

		System.out.println(expensiveCars.test(new Car(CarTypes.COMPACT, 34000)));

	}

	public static int countCar(Car[] cars, Searchable s) {
		int counter = 0;
		for (Car c : cars) {
			if (s.test(c)) {
				counter++;
			}
		}
		return counter;
	}

	public static int countMiddlePriceCar(Car[] cars) {
		int counter = 0;
		for (Car c : cars) {
			if (c.getCost() < 15000) {
				counter++;
			}
		}
		return counter;
	}

	public static int countCompactCar(Car[] cars) {
		int counter = 0;
		for (Car c : cars) {
			if (c.getType() == CarTypes.COMPACT) {
				counter++;
			}
		}
		return counter;
	}

	public static int countSportCar(Car[] cars) {
		int counter = 0;
		for (Car c : cars) {
			if (c.getType() == CarTypes.SPORT) {
				counter++;
			}
		}
		return counter;
	}

	private int getCompactCarsNumber(Car[] cars) {
		int result = 0;
		for (Car car : cars) {
			if (car.getType().equals(CarTypes.COMPACT)) {
				result++;
			}
		}
		return result;
	}
//	
//	private int getExpensiveCarsNumber(Car[] cars) {
//	    int result = 0;
//	    for (Car car : cars) {
//	        if (car.getCost() > 20000) {
//	            result++;
//	        }
//	    }
//	    return result;
//	}
//	private int getCarsNumber(Car[] cars, Searchable compactCarSearch) throws IOException {
//		int result = 0;
//
//		for (Car car : cars) {
//			if (compactCarSearch.test(car)) {
//				result++;
//			}
//		}
//		return result;
//	}
}
