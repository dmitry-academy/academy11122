package by.academy.lesson10.statics.classwork;

public class Block extends ParentBlock {

	String[] arr = null;
	static String[] staticArr = null;

	{
		arr = new String[10];
		arr[0] = "test string1";
		System.out.println("Block ex");
	}

	static {
		staticArr = new String[10];
		staticArr[0] = "static test string1";
		System.out.println("Static Block ex");
	}

	public Block() {
		super();
		System.out.println("Constructor ex");
	}

//	public static void printSmth() {
//		System.out.println("Print");
//	}
}
