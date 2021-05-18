package classes_interfaces;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> stringListe = new ArrayList<>();
		stringListe.add("Betty");
		stringListe.add("Fred");
		stringListe.add("Wilma");
		stringListe.add("Betty");
		stringListe.add("Barney");
		stringListe.add("Wilma");
		stringListe.add("Betty");
		stringListe.add("Pebbles");
		stringListe.add("Bam-Bam");
		stringListe.add("Betty");
		stringListe.add("Fred");
		stringListe.add("Pebbles");
		stringListe.add("Dino");
		System.out.println(stringListe);
//		stringListe.clear(); // Alle Elemente entfernen
		System.out.println("Anzahl der Elemente: " + stringListe.size());
		System.out.println("Ist die Liste leer: " + stringListe.isEmpty());
//		stringListe.remove(5);
		System.out.println(stringListe);
		Set<String> stringMenge = new HashSet<>(stringListe);
		System.out.println(stringMenge);
		stringListe = new ArrayList<>(stringMenge);
		System.out.println(stringListe);
		System.out.println("******");
		for (String name : stringListe) {
			System.out.println(name);
		}
//		Sortierung der Liste
//		Collections.sort(stringListe); // vor Java 8
//		stringListe.sort(null); // seit Java 8, null f�r nat�rliche Sortierung (Comparable)
//		stringListe.sort(Comparator.naturalOrder()); // seit Java 8, null f�r nat�rliche Sortierung (Comparable)
		// Sortierung absteigend
		stringListe.sort(new MyComparator());
		System.out.println("******");
		for (String name : stringListe) {
			System.out.println(name);
		}
	}

}








