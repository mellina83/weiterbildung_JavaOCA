package classes_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
		
		// Ausgabe aller Namen, die mit B beginnen
//		for (String string : stringListe) {
//			if (string.startsWith("B")) {
//				System.out.println(string);
//			}
//		}
		// seit Java 8
		stringListe.stream().filter(name -> name.startsWith("B")).forEach(System.out::println);
		
		System.out.println("********");
		// L�schen aller Elemente, deren L�nge gr��er als 5 ist
//		for (String name : stringListe) {
//			if (name.length() > 5) {
//				stringListe.remove(name);
//			}
//		}
//		stringListe.removeIf(new MyPredicate());
		// L�schen aller Elemente, deren L�nge kleiner als 5 ist		
		Predicate<String> pred = (String s) -> {
			return s.length() < 5;
		};
		pred = s -> s.length() < 5; // Type inference (Typ-Herleitung)
		// L�schen aller Elemente, die mit B beginnen
		pred = name -> name.startsWith("B");
		stringListe.removeIf(pred);
		stringListe.removeIf(name -> name.startsWith("B"));
		System.out.println(stringListe);
		System.out.println("***********");
//		Externe Iteration
//		for (String name : stringListe) {
//			System.out.println(name);
//		}
		Consumer<String> c = name -> System.out.println(name);
		stringListe.forEach(c); // Interne Iteration
		stringListe.forEach(name -> System.out.println(name)); // Interne Iteration
		stringListe.forEach(System.out::println); // Methodenreferenz
		
		
	}

}
