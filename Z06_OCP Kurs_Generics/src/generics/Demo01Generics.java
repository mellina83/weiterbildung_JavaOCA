package generics;

import java.util.ArrayList;
import java.util.List;

public class Demo01Generics {

	public static void main(String[] args) {
		demoPreJava1_5();

	}

	/**
	 * Neu der <> Diamond Operator auf der Instanzseite für Innere Anonyme Klassen bekommen.
	 * 
	 * In Java 8 können wir den Diamond Operator NICHT für Innere Anonyme Klassen verwenden.
	 */
	private static void demoSinceJava1_9() {
//		List<String> listOfStrings = new ArrayList<>() {
//			@Override
//			public void add(int index, String element) {
//				super.add(index, element);
//			}
//		};
		
	}
	
	/**
	 * Neu der <> Diamond Operator auf der Instanzseite
	 */
	private static void demoSinceJava1_7() {
		List<String> list = new ArrayList<>();
		
//		Generics schützen uns nicht vor NullPointerExceptions
//		list.add(null);
	}
	
	/**
	 * Mit der Generizität von Klassen, Schnittstellen und Methoden werden die
	 * folgenden Ziele verfolgt:
	 * 
	 * ---- Höhere Typsicherheit: Erkennen von Typ-Umwandlungsfehlern zur
	 * Kompilierzeit statt zur Laufzeit.
	 * 
	 * ---- Wiederverwendbarkeit von Quellcode.
	 * 
	 * ---- Vermeiden des expliziten Casts beim Auslesen aus einer Collection
	 * aus Elementen vom Typ Object.
	 * 
	 * Generisch bedeutet, dass Klassen, Schnittstellen und Methoden ---
	 * Parameter verwenden, welche einen Typ darstellen.
	 */
	private static void demoSinceJava1_5() {
		List<String> list = new ArrayList<String>();

//		list.add(5);
		list.add("Fuenf");
//		list.add(new Object());
//		list.add(new StringBuilder("Hallo Liste"));

		list.get(0);
	}

	private static void demoPreJava1_5() {
		List list = new ArrayList();

		list.add(5);
		list.add("Fuenf");
		list.add(new Object());
		list.add(new StringBuilder("Hallo Liste"));

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) instanceof Integer) {
				Integer tmp = (Integer) list.get(i);
				System.out.println(tmp);
			} else if (list.get(i) instanceof String) {
				String tmp = (String) list.get(i);
				System.out.println(tmp);
			}

		}
	}

}
