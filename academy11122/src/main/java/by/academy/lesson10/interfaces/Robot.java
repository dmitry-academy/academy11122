package by.academy.lesson10.interfaces;

public class Robot implements Moveable {

	@Override
	public void moveRight() {
		System.out.println("Робот поворачивает вправо.");
	}

	@Override
	public void moveLeft() {
		System.out.println("Робот поворачивает влево.");
	}

}