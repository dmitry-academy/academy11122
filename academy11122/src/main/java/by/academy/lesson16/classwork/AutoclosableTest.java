package by.academy.lesson16.classwork;

import java.io.Closeable;
import java.io.IOException;

public class AutoclosableTest implements Closeable {

	@Override
	public void close() throws IOException {
		System.out.println("Я закрылся!");
	}

}
