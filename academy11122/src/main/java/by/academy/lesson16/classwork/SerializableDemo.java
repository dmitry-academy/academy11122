package by.academy.lesson16.classwork;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws IOException {

		File dir = new File("src\\io");
		if (!dir.exists()) {
			dir.mkdirs();
		}

		File file = new File(dir, "user.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		User user = new User("SuperAdmin", "qwerty");
//5.	Написать метод который циклически просматривает содержимое 
//		заданного каталога и выводит на печать информацию о всех файлах 
//		и каталогах, находящихся в нем и в его подкаталогах.
//		Используем рекурсию.
		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
				ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			oos.writeObject("test");
			oos.writeInt(1);
			oos.writeObject(user);
//			osu.writeObject(Integer.valueOf(123));

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		try (BufferedInputStream br = new BufferedInputStream(new FileInputStream(file));
				ObjectInputStream isu = new ObjectInputStream(br)) {
			String str = (String) isu.readObject();
			Integer i = isu.readInt();
			User user1 = (User) isu.readObject();
			System.out.println(str);
			System.out.println(i);
			System.out.println(user1);

		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
