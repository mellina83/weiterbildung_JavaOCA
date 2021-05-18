package functional;

import java.time.LocalDate;

public class Demo03LambdaRules {

	/*
	 * Runde Klammer sind nötig für die leere Parameterliste
	 */
	interface IFunc01 {
		void methode01();
	}

	IFunc01 member01a = () -> System.out.println();
	IFunc01 member01b = () -> {
	};

	/*
	 * Runde Klammer sind nötig für die Parameterliste mit mehreren Parameter
	 */
	interface IFunc02 {
		void methode01(int x, int y);
	}

	IFunc02 member02a = (int x, int y) -> {
	};
	IFunc02 member02b = (zahl01, zahl02) -> System.out.println(zahl01 + zahl02);

//	Ohne Klammern bei den Parametern, Kompilierfehler
//	IFunc02 member02c = int x, int y -> {};
//	IFunc02 member02d = x, y -> {};

	/*
	 * Runde Klammer sind 'optional' für die Parameterliste mit einem Parameter,
	 * wenn wir keinen Datentyp angeben.
	 */
	interface IFunc03 {
		void methode01(int x);
	}

	IFunc03 member03a = (int x) -> {
	};
	IFunc03 member03b = (x) -> {
	};
	IFunc03 member03c = x -> {
	};

//	Ohne Klammern bei den Parameter mit Datentyp angabe, Kompilierfehler
//	IFunc03 member03d = int x -> {};

	/*
	 * Rumpf der Methode darf beliebig viele Zeilen haben
	 */
	public static String memberString = "Hallo";

	interface IFunc04 {
		void methode01();
	}

	IFunc04 member04a = () -> {
	};
	IFunc04 member04b = () -> {
		System.out.println(memberString);
		memberString = "Java ist auch eine Insel";
		int count = 1;
		LocalDate date = LocalDate.now();
		System.out.println("Dies ist zeile :" + count++);
		System.out.println("Dies ist zeile :" + count++);
		System.out.println("Dies ist zeile :" + count++);
		System.out.println("date = " + date);
	};

	/*
	 * Wenn die realisierte Methode aus einer einzigen return-Anweisung besteht,
	 * sind die geschweiften Klammer (und 'return') optional.
	 */
	interface IFunc05 {
		int methode01();
	}

	IFunc05 member05a = () -> {
		return 0;
	};
	IFunc05 member05b = () -> 666 * 999;

	static class Person {
		public String name = "Herbert";
	}

	public static void main(String[] args) {
		String localString = "Java ist auch eine Insel";
		Person person01 = new Person();
		int[] zahlen = new int[6];

		IFunc01 localLambda01 = () -> {
			System.out.println(localString);
			System.out.println(person01.name);
			person01.name = "Christian";
			System.out.println(person01.name);
			
			zahlen[3] = 6;
			zahlen[1+1] = 2;
			int i = 666;
//			zahlen[i+i] = 42;
			
			/*
			 * Local variable person01 defined in an enclosing scope must be
			 * final or effectively final
			 */
			//person01 = new Person();
			System.out.println(memberString);
			memberString = "Hawaii ist ebenfalls eine Insel";
			System.out.println(memberString);
		};

		localLambda01.methode01();
	}
}
