package by.academy.lesson14.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//Создайте HashMap, содержащий пары значений  - 
//имя игрушки и объект игрушки (класс Toy).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.
public class ToyDemo {

	public static void main(String[] args) {
		Map<String, Toy> map1 = new HashMap<>();

		Toy t1 = new Toy();
		Toy t2 = new Toy();
		Toy t3 = new Toy();

		map1.put("a", t1);
		map1.put("b", t2);
		map1.put("c", t3);

		printKey(map1);
		printValue(map1);
		printValueAndKey(map1);
	}

	public static void printKey(Map<String, Toy> map1) {
		for (String key : map1.keySet()) {
			System.out.println(key);
		}
	}

	public static void printValue(Map<String, Toy> map1) {
		for (Toy value : map1.values()) {
			System.out.println(value);
		}
	}

	List<Integer> list = List.of( 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9 );

	public static void printValueAndKey(Map<String, Toy> map1) {
		for (Entry<String, Toy> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
