package by.academy.lesson7;

public class D extends C {
	
	public String i;

	public D(String a, int b) {
		i = a;
		this.i = a;
		super.i = b;
	}

	@Override
	public void print() {
		System.out.println("D.i = " + i);
		super.print();
	}
}
