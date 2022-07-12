package by.academy.lesson10.interfaces;

public class StaticMethodDemo {
	
	
	public static void main(String[] args) {

		MyIf obj1 = new MyIfImpl();

		System.out.println(obj1.getNumber());

		System.out.println(MyIf.staticMethod());
	}
}