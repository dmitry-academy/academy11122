package by.academy.lesson10.abstracts;

public class FindAreas2 {

	public static void main(String[] args) {
		Figure2[] figures = new Figure2[3];
		figures[0] = new Rectangle2(20, 10);
//		 figures[0] = new Figure2(10, 10);
		figures[1] = new Rectangle2(10, 10);
		figures[2] = new Triangle2(10, 10);
		for (Figure2 figure : figures) {
			figure.printArea();
		}
		
//		Figure2 figure = new Triangle2(10, 5);
//		figure.printArea();
	}
}