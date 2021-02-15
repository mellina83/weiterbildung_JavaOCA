package interfaces;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		

		List<String> stringListe = new ArrayList<>();
		stringListe.add("Betty");
		stringListe.add("Fred");
		stringListe.add("Wilma");
		stringListe.add("Barney");
		stringListe.add("Pebbles");
		stringListe.add("Bam-Bam");
		stringListe.add("Dino");
		
		//Loeschen aller Elemente, deren Laenge groesser als 5 ist
		// for (String name: stringListe( {
		//		if (name.length() > 5 {
		//			stringListe.remove(name);
		//Nicht moeglich
		
		/*
		 * removeIf braucht Objekt, das funktionales Objekt Predicate implementiert hat
		 * Hier erstellte Klasse Mypredicate eingebunden als neues Objekt:
		stringListe.removeIf(new Mypredicate());
		*
		*/
		
		// Hier Lambda Methode, womit man sich die Klasse spart:
		// Wohl grosser Ausdruck
		Predicate<String> pred = (String s) -> {
			return s.length() < 5;
		};
		
		
		// Wohl kleiner Ausdruck:
		pred = s -> s.length() < 4; // Type Inference (Typ Herleitung)
		
		//Loeschen aller Elemente, die mit B beginnen
		//pred = name -> name.startsWith("B");
		
		
		stringListe.removeIf(pred);
		System.out.println(stringListe);
		stringListe.removeIf(name -> name.startsWith("B"));
		System.out.println(stringListe);
		
		System.out.println("+++++");
		Consumer<String> c = name -> System.out.println(name);
		stringListe.forEach(c);
		// anstatt: for (String name : stringListe) {
		//				Sysout(name);
		


	}

}
