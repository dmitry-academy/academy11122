package by.academy.lesson10.classwork2;

public class Book implements Printable {

	private String name;

	public Book(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.print("Book name: " + name);
	}

}
