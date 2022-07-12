package by.academy.lesson10.interfaces;

public class Pickup implements CargoAuto, PassengersAuto {
	public void transportCargo() {
		System.out.println("Везу груз");
	}

	public void transportPassengers() {
		System.out.println("Везу пассажиров");
	}
}