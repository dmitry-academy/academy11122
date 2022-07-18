package by.academy.lesson10.interfaces.validator;

import java.util.regex.Pattern;

public interface Validator {

	Pattern getPattern();

	default boolean isValid(String s) {
		return getPattern().matcher(s).matches();
	}
}
