package by.academy.lesson10.interfaces.pac;

public class ABImpl implements A, B {
	@Override
	public void someMethod() {
		A.super.someMethod();
		B.super.someMethod();
	}

}
