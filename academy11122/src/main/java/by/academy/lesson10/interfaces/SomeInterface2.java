package by.academy.lesson10.interfaces;

public interface SomeInterface2 {

	default String defaultMethod() {
		return "Объект типа String по умолчанию from SomeInterface2";
	}
}
