package by.academy.lesson6.wrappers;

public class WrapperDemo1 {
	public static void main(String[] args) {
		// Если передаваемая в конструктор строка не содержит числового значения,
		// то выбросится исключение NumberFormatException.

		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("Some String");

		Boolean boolean3 = Boolean.valueOf(false);
		Boolean boolean4 = Boolean.valueOf("true");

		Boolean boolean5 = false;
		Boolean boolean6 = true;

		boolean b = boolean5;

		Integer i1 = new Integer(42);
		Integer i2 = new Integer("42");
		
		Integer i = Integer.valueOf(1);
		
		Float f1 = new Float(3.14f);
		Float f2 = new Float("3.14f");

		Character c1 = new Character('c');

		System.out.println(boolean2);
	}
}