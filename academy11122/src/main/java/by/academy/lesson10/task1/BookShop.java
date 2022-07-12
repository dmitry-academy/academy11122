package by.academy.lesson10.task1;

public class BookShop {
//	1.	а) Определить интерфейс Printable, содержащий метод void print().
//	б) Определить класс Book, реализующий интерфейс Printable.
//	в) Определить класс Magazine, реализующий интерфейс Printable.
//	г) Создать массив типа Printable, который будет содержать книги и журналы.
//	д) В цикле пройти по массиву и вызвать метод print() для каждого объекта. 
//	е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
//	который выводит на консоль названия только журналов. 
//	Создать статический метод printBooks(Printable[] printable) в классе Book,
//	который выводит на консоль названия только книг. Используем оператор instanceof.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printable [] array = new Printable[4];
		array[0] = new Book();
		array[1] = new Magazine();
		array[2] = new Book();
		array[3] = new Magazine();
		
		for(int i=0; i<array.length; i++) {
			array[i].print();
		
		}
		System.out.println("meow");
		Magazine.printMagazines(array);
		
		System.out.println("meow");
		Book.printBooks(array);
	}
	
}
