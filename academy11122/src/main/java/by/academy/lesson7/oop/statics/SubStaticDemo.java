package by.academy.lesson7.oop.statics;

public class SubStaticDemo extends StaticDemo {

	static {
		System.out.println("Hello I'm static block from sub");
	}

	public SubStaticDemo() {
		super();
		System.out.println("Hello I'm SubStaticDemo constructor");
	}

	{
		System.out.println("Hello I'm block  from sub");
	}
}
