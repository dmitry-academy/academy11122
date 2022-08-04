package by.academy.lesson15.classwork;

import java.util.TreeSet;

public class HeavyBoxComparableDemo {

	public static void main(String[] args) {
		TreeSet<HeavyBox> set = new TreeSet<>();

		HeavyBox h1 = new HeavyBox(1, 2, 3, 5);
		HeavyBox h2 = new HeavyBox(2, 2, 3, 6);
		HeavyBox h3 = new HeavyBox(3, 2, 3, 7);
		HeavyBox h4 = new HeavyBox(4, 2, 3, 8);
		HeavyBox h5 = new HeavyBox(5, 2, 3, 9);

		set.add(h1);
		set.add(h2);
		set.add(h3);
		set.add(h4);
		set.add(h5);

		System.out.println(set);
	}

}
