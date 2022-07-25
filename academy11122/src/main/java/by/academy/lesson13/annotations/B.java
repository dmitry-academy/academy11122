package by.academy.lesson13.annotations;

@Version(info = "Hello world", minArgs = 10, aliases = { "Hello", "World" })
public class B extends A {

	@Deprecated
	@Version(info = "qweqwe")
	public void test() {

	}

	public void test1(@Version(info = "[qwe]*") String s) {

	}
}
