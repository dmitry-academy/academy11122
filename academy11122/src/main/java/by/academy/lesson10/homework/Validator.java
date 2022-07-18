package by.academy.lesson10.homework;

import java.util.regex.Pattern;

public interface Validator {

	default boolean isValid(String string) {
		return getPattern().matcher(string).matches();
	};

	Pattern getPattern();
}
