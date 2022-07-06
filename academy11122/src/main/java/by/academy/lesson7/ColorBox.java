package by.academy.lesson7;

public class ColorBox extends Box {
	String color;

	double width;

	public ColorBox() {
		super();
	}

	public ColorBox(double width, double height, double depth) {
		super(width, height, depth);
	}

	public ColorBox(int width, int height, int depth, String color) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.color = color;
	}

	@Override
	public void print() {
		System.out.println("ColorBox print" + color);
	}

	public void paint() {
		System.out.println("ColorBox is painting: " + color);
	}
}