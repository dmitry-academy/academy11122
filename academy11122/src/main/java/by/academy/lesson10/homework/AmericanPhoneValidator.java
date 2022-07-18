package by.academy.lesson10.homework;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private Pattern pattern = Pattern.compile("regexp");

	@Override
	public Pattern getPattern() {
		return pattern;
	}

}
