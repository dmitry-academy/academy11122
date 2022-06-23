package by.academy.lesson5.strings;

public class ModifyStringDemo {
	public static void main(String[] args) {
		System.out.println("Hello".concat(" World"));
		System.out.println("HelWlo" + " World");
		System.out.print("Hello");
		System.out.println(" World");
		String str = "H e l l o";
		String str1 = str.replace(" ", "");
		System.out.println("Hello".equals(str1));

		System.out.println("Hello".toLowerCase());
		System.out.println("Hello".toUpperCase());
		
		System.out.println("    Hello World ");
		System.out.println("			Hello World ".trim());
		System.out.println("			Hello World ".stripLeading());
		System.out.println("    Hello World           ".stripTrailing());
		System.out.println("			Hello World ".strip());

		String s = "Hellollo";
		String s1 = s.replace("ll", "");
		System.out.println("s: " + s);
		System.out.println("s1: " + s1);

	}
}