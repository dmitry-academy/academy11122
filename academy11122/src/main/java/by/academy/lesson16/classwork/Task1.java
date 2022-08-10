package by.academy.lesson16.classwork;

import java.io.File;

public class Task1 {

	public static void main(String[] args) {
		File file = new File("src/io");

		if (!file.exists()) {
			file.mkdirs();
		}
		openDir(file);
	}

	private static void openDir(File file) {

		if (file != null && file.exists()) {
			if (file.isDirectory()) {
				for (File f : file.listFiles()) {
					if (f.isDirectory()) {
						openDir(f);
					} else {
						System.out.println("Мы нашли файл " + f.getName());
						if (f.getName() != null && f.getName().contains("VALDO")) {
							System.out.println("А вот и VALDO");
						}
					}
				}
			}
		}

	}

}
