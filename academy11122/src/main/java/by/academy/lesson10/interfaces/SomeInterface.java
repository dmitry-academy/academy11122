package by.academy.lesson10.interfaces;

public interface SomeInterface {

	default String defaultMethod() {
		return "Объект типа String по умолчанию";
	}
}