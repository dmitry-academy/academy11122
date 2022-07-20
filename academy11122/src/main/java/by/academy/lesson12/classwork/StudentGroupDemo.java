package by.academy.lesson12.classwork;

public class StudentGroupDemo {

	public static void main(String[] args) {
		StudentGroup sg = new StudentGroup(1);

		sg.add(new Student("Петя", 18));
		sg.add(new Student("Вася", 18));
		sg.add(new Student("Таня", 18));
//		sg.remove(0);
//		sg.remove(1);

//		sg.add(new Student("Маша", 18));
//		sg.add(0, new Student("Старт", 18));
//		sg.add(3, new Student("Середина", 18));
//		sg.add(3, new Student("Середина1", 18));
//		sg.add(3, new Student("Середина2", 18));

//		System.out.println(Arrays.toString(sg.getStudents()));

//		for (int i = 0; i < sg.size(); i++) {
//			System.out.println(sg.get(i));
//		}

		for (int i = 0; i < sg.getStudents().length; i++) {
			System.out.println(sg.getStudents()[i]);
		}
	}

}
