package by.academy.lesson6.wrappers;

public class WrapperDemo4 {

	public static void main(String[] args) {
		String str = "45";

		Integer i = null;
		i = Integer.MAX_VALUE + 1;
//		Integer.valueOf(str);

//		System.out.println(i);
//		System.out.println(str);

//		toHexString(), toOctalString(), toBinaryString() 
//		System.out.println(Integer.toHexString(i));
//		System.out.println(Integer.toOctalString(i));
//		System.out.println(Integer.toBinaryString(i));

//		double d1 = 123.0;
		int i1;
//		i1 = i;
//		i = i1;
//		System.out.println(i);

		Double d1 = null;
		Double d2 = 0.0;

		double d11 = d1;
		
		double d22 = 0.0;
		int d33 = 100 / 0;
		
		System.out.println(d11);
	}

}
