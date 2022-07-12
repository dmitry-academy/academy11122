package by.academy.lesson7;

public class D extends C {

	public String i;

	public D(String i, int b) {
		i = i;
		this.i = i;
		super.i = b;
		
		
	}

	@Override
	public void print() {
		System.out.println("D.i = " + i);
		super.print();
	}
}
