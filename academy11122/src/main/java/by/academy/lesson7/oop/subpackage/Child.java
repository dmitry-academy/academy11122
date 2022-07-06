package by.academy.lesson7.oop.subpackage;

import by.academy.lesson7.Parent;

public class Child extends Parent {
	public void someMethod() {
		publicAccessMethod();
//		defaultAccessMethod();
		protectedAccessMethod();
	}
}