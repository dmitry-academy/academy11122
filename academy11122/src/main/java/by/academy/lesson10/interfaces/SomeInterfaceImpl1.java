package by.academy.lesson10.interfaces;

public class SomeInterfaceImpl1 implements SomeInterface, SomeInterface2 {

	@Override
	public String defaultMethod() {
		return SomeInterface.super.defaultMethod() + SomeInterface2.super.defaultMethod();
	}
}