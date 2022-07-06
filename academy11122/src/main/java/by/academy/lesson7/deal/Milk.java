package by.academy.lesson7.deal;

public class Milk {
	private final double v;
	private static double st;
	private static String[] arr;

//	static {
//		System.out.println("Call static block");
//	}
//
//	{
//		System.out.println("Call simple block");
//	}

	public Milk() {
		super();
		System.out.println("Call default constructor");
		this.v = 1;
	}

	public Milk(double v) {
		super();
		this.v = v;
	}

	public final double getV() {
		return v;
	}

	public static double getSt() {
		return st;
	}

	public static void setSt(double st) {
		Milk.st = st;
	}
}
