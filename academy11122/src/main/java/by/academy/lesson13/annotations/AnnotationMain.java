package by.academy.lesson13.annotations;

public class AnnotationMain {

//	@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
//		System.out.println(AnnotationMain.class);
//		System.out.println(Version.class);
//
//		AnnotationTest t = new AnnotationTest();
//		
//		Class<? extends AnnotationTest> c2 = t.getClass();
//		Version version = (Version) c2.getAnnotation(Version.class);
//
//		System.out.println(version.info());
		A a = new A();
		Class<? extends A> c2 = a.getClass();
		Version version = (Version) c2.getAnnotation(Version.class);
		System.out.println(version.info());

		B b = new B();
		
		b.test();
		
		Class<? extends B> c3 = b.getClass();
		Version versionB = (Version) c3.getAnnotation(Version.class);
		System.out.println(versionB.info());

	}
}
