package by.academy.lesson16.classwork;

import java.io.IOException;

public class AutoclosableDemo {

	public static void main(String[] args) throws IOException {

		try (AutoclosableTest test = new AutoclosableTest()) {
			throw new RuntimeException("alala");
		}

	}

}
