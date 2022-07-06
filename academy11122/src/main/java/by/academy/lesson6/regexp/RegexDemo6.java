package by.academy.lesson6.regexp;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegexDemo6 {
	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("(\\s+)|(\\d+)");
//		String[] words = pattern.split("java5tiger 77 java6mustang");
//		System.out.println(Arrays.toString(words));

		String s = "              2 3333333332     qwe asd       345345 asd    ";
		System.out.println(s.replaceAll("\\s+", "0").trim());
	}
}
