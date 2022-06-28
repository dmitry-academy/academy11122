package by.academy.lesson6.classwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {

	public static void main(String[] args) {
//		cab, ccab, cccab
		Pattern pattern = Pattern.compile("c{1,3}ab");
		Matcher matcher = pattern.matcher("ccccab");
		boolean b = matcher.matches();
		System.out.println(b);
	}
}
