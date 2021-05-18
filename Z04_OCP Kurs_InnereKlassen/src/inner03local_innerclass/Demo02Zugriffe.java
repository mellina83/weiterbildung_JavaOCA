package inner03local_innerclass;

import java.util.function.Predicate;

public class Demo02Zugriffe {

	private static String attStatic01 = "private Klassen Attribut";
	private String attInstance02 = "privates Instanz Attribut";

	public void methodForLocalClass(int v01, final int v02) {

//		final or effectively final
		
		final int v03 = 5;
		int v04 = 10;
//		v03 = 6;

		Predicate<Integer> filter01 = (Integer i) -> {
//			An Local variable xxx defined in an enclosing scope must be
//			final or effectively final
			return i == v04;
		};

//		v04 = 20;
		final int predicateInt = v04;
		Predicate<Integer> filter02 = (Integer i) -> {
			return i == predicateInt;
		};
		
		Predicate<Integer> filter03 = new Predicate<Integer>() {	
			@Override
			public boolean test(Integer t) {
				return t == predicateInt;
			}
		};

		class Inside {
			public void seeFromOuterClass() {
				System.out.println(attStatic01);
				System.out.println(attInstance02);
				System.out.println(v01);
				System.out.println(v02);

//				Local variable v03 defined in an enclosing scope must be
//				final or effectively final
				System.out.println(v03);

				System.out.println(v04);
//				Local variable v04 defined in an enclosing scope must be
//				final or effectively final
//				v04 = 42;
			}

		}

	}

}
