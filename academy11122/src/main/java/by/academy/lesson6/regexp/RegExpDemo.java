package by.academy.lesson6.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {

	public static final Pattern p = Pattern.compile("[a-zA-Z\\d]+\\.[a-z]{3}");

	public static void main(String[] args) {

		String text = "Используются файлы file1.doc, file2.txt."
				+ "А еще было бы неплохо обратить внимание на файл file3.img."
				+ "Также просмотрите содержимое file4.doc.";

		Matcher matcher = p.matcher(text);

		while (matcher.find()) {

			int start = matcher.start();
			int end = matcher.end();

			System.out.println(text.substring(start, end));
		}

	}

}
