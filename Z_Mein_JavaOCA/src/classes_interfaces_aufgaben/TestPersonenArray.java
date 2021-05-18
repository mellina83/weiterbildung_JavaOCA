package classes_interfaces_aufgaben;

import java.util.Arrays;

public class TestPersonenArray {

	public static void main(String[] args) {
		Person[] personen = new Person[4];
		personen[0] = new Person("Paul","Smith");
		personen[1] = new Person("Paul","Black");
		personen[2] = new Person("John","Smith");
		personen[3] = new Person("John","Black");
		System.out.println(personen);
		System.out.println(Arrays.toString(personen));
		System.out.println("*********");
		for (Person person : personen) {
			System.out.println(person);
		}
		// Standard-Sortierung (Nachname, dann Vorname) => Comparable
		Arrays.sort(personen);
		System.out.println("*********");
		for (Person person : personen) {
			System.out.println(person);
		}
		// alternative Sortierung (Vorname, dann Nachname) => Comparator
		Arrays.sort(personen, new MyComparator());
		System.out.println("*********");
		for (Person person : personen) {
			System.out.println(person);
		}
		
	}

}
