package by.academy.lesson10.classwork2;

//е) Создать статический метод printMagazines(Printable[] printable) в классе Magazine, 
// который выводит на консоль названия только журналов.  Создать статический метод 
// printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только 
// книг. Используем оператор instanceof.
public class Magazine implements Printable {

	private String name;

	public Magazine(String name) {
		super();
		this.name = name;
	}

	public static void printMagazines(Printable[] printable) {
		for (Printable p : printable) {
			if (p instanceof Magazine) {
				p.print();
			}
		}
	}

	@Override
	public void print() {
		System.out.print("Magazine name: " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
