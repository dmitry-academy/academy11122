package by.academy.lesson2.operators;

public class SimpleOperators {

	public static void main(String[] args) {
		int number = 5;
		number = -number;
		number = +number;

		System.out.println(number);

		boolean bool = true;
		bool = !bool;
		System.out.println(bool);

		char c = 'A';
		c = (char) (c + 1);
		System.out.println(c);

		int a = 6 % 5;
		double b = 6.2 % 5.0;
		System.out.println(a);
		System.out.println(b);

		int number1 = 10;
		System.out.println(number1);
		number1 += 10;
		System.out.println(number1);
		number1 -= 10;
		System.out.println(number1);
		number1 *= 10;
		System.out.println(number1);
		number1 /= 10;
		System.out.println(number1);
		number1 %= 10;
		System.out.println(number1);

		int i = 1;
		i++;
		System.out.println(i);
		i += 1;
		System.out.println(i);
		i = i + 1;
		System.out.println(i);

		i--;
		System.out.println(i);
		i -= 1;
		System.out.println(i);
		i = i - 1;
		System.out.println(i);

		int j = 0;
//		--i;
//		++i;
//		j++;
//		System.out.println(j);
//		++j;
		System.out.println(j++); // 0
		// j = 1
		System.out.println(++j); // 2
	}

}
