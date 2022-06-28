package by.academy.lesson6.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VeryGreedRegExp {
	public static void main(String[] args) {
		String text = "aaa";
		Pattern pattern = Pattern.compile("a++b");
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(text.substring(matcher.start(), matcher.end()));
		}
	}
}
