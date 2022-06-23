package by.academy.lesson5.classwork;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {

		String s1 = "str";
		String s2 = "stri";
		String s3 = "stra";
		String s4 = "Str";
		String s5 = "str ";
		String s6 = "str n";
		String s7 = " str";
		String s8 = "str5";
		String[] array = { s1, s2, s3, s4, s5, s6, s7, s8 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

}
