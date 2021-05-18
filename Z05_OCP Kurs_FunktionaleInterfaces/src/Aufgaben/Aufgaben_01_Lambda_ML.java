package Aufgaben;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

/*
 * 1. Realisieren Sie bitte einen Comparator<String>, der die Strings
 * aus dem Array nach ihren Längen vergleicht:
 * 
 * 2. Realisieren Sie bitte einen Comparator<String>, der die Strings
 * aus dem Array alphabetisch vergleicht:
 * 
 * je mit einer anonymen Klasse
 * je mit Lambda-Funktionen (bitte alle Notationen ausprobieren, die kompilieren)
 * 
 * Geben Sie das Array jeweils sortiert aus.
 * 
 * Filtern Sie das Array, alles was echte Zahlen sind, soll nicht in der Ausgabe erscheinen.
 * Nutzen Sie dafür Predicate<String>;
 * 
 * Geben Sie das gefilterte und sortierte Array aus.
 * 
 * Wie kann ein Comparator oder Predicate einfach umgekehrt werden?
 */
public class Aufgaben_01_Lambda_ML {
	static String[] arr = { "achtzehnbuchstaben", "vier", "1", "2", "42",
			"Zwölf", "Elf", "fuenf", "neunzehn Buchstaben", "dry", "VIER" };

	static Comparator<String> compareLength = (o1, o2) -> {
		return Integer.compare(o1.length(), o2.length());
	};

	static Comparator<String> compareByAlpha = (o1, o2) -> {
		return o1.compareToIgnoreCase(o2);
	};

	/*
	 * Methodenreferenz Referenz auf eine statische Methode.
	 */
	static Comparator<String> compareByAlphaTyp2 = Aufgaben_01_Lambda_ML::compareByAlpha;

	/*
	 * Methodenreferenz Typ 4.
	 * 
	 * Typ 4. Referenz auf eine Instanz-Methode eines unbestimmten Objektes vom
	 * speziellen Typ
	 * 
	 * (Instanz-Methode des ersten Parameters der abstrakten Methode)
	 * 
	 * (String o1, String o2)
	 * 
	 * o1.compareTo(o2);
	 */
	static Comparator<String> compareByAlphaTyp4 = String::compareTo;

	static Predicate<String> filterNumbers = (String text) -> {
		boolean compareToA = text.compareTo("A") < 1;
		boolean matches = text.matches("(.*[0-9].*)");
		boolean isDigit = Character.isDigit(text.charAt(0));
		
//		try {
//			Integer.parseInt(text);
//		} catch (NumberFormatException e) {
//			return false;
//		}
		
		return isDigit;
	};

	private static int compareByAlpha(String o1, String o2) {
		return o1.compareTo(o2);
	}

	public static void main(String[] args) {
		Arrays.sort(arr, compareLength);

		for (String string : arr) {
			System.out.println(string);
		}

		Arrays.sort(arr, compareByAlpha.reversed());
		System.out.println("*************************");
		for (String string : arr) {
			System.out.println(string);
		}
		
		System.out.println("*************************");
		for (String string : arr) {
			if (!filterNumbers.test(string)) {
				System.out.println(string);
			}
			
		}
	}
}
