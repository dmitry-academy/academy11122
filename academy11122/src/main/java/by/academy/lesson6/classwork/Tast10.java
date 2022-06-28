package by.academy.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tast10 {
//	Дана строка: 
//	“Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”  
//	Найти все подстроки "Java <X>" и распечатать их.

	private static final String str = "Java\\s+\\d+";
	private static final Pattern pattern = Pattern.compile(str);

	public static void main(String[] args) {
		String text = "Versions: Java	5, Java 6, Java   7, Java 8, Java 12.";
		Matcher m = pattern.matcher(text);

		while (m.find()) {
			int start = m.start();
			int end = m.end();

			System.out.println(text.substring(start, end));
		}
		System.out.println(text.replaceAll("\\s+", " "));
		
	}

}
