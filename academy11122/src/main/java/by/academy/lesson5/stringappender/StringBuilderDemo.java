package by.academy.lesson5.stringappender;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("ABC");
		StringBuilder sb1 = new StringBuilder("ABC");

//		sb.setCharAt(0, 'B');
//		sb.append("D");
////		sb.reverse();
//		sb.replace(1, 100, "!!!");
////		sb.insert(1, "???");
//		System.out.println(sb);
////		sb.delete(1, 4);
//		sb.deleteCharAt(1);
		String s = sb.toString();
		String s1 = sb1.toString();
		System.out.println(s.equals(s1));

		System.out.println(s);

	}

}
