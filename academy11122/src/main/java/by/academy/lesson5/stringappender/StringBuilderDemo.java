package by.academy.lesson5.stringappender;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("ABC");

//		sb.setCharAt(0, 'B');
		sb.append("D");
//		sb.reverse();
//		sb.replace(1, 2, "!!!");
//		sb.insert(1, "???");
//		sb.delete(1, 4);
		sb.deleteCharAt(1);

		String s = sb.toString();
		System.out.println(s);
		
		
	}

}
