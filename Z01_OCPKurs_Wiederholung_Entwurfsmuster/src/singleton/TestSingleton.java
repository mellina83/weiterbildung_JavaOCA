package singleton;

public class TestSingleton {

	public static void main(String[] args) {
//		testSimpleSingleton();
		testSimpleSingletonLazy();
	}

	private static void testSimpleSingletonLazy() {
		SimpleSingletonLazy ssl01 = SimpleSingletonLazy.getInstance();
		SimpleSingletonLazy ssl02 = SimpleSingletonLazy.getInstance();
		
		System.out.println(ssl01 == ssl02);
		System.out.println(ssl01);
		System.out.println(ssl02);
	}

	private static void testSimpleSingleton() {
		SimpleSingleton sst01 = SimpleSingleton.getInstance();
		SimpleSingleton sst02 = SimpleSingleton.getInstance();

		System.out.println(sst01 == sst02);
		System.out.println(sst02);
		System.out.println(sst02);

	}

}
