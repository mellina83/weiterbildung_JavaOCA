package klassen_kapselung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Aufgabe Klassen "AttDCE"

/*
 * Aufgaben nachtraeglich:
 * -Exceptions einbauen
 * -Geburtsdatum anstatt Alter nehmen
 * -Methode definieren fuer ob Person heute Geburtstag hat, und fuer jede Person abfragen
 * -Liste wurde gegeben/erstellt, dafuer Sortierungen vornehmen
 */

public class HautproprammPersonKapselung {

	public static void main(String[] args) {
		Person person1 = new Person("Max", "Mustermann", "1967-01-05", "50389");
		Person person2 = new Person("Minnie", "Maus", "1958-02-18", "01234");
		Person person3 = new Person();
		Person person4 = new Person("Andreas", "Fuchs", "1977-07-07", "47058");
		Person person5 = new Person("Kevin", "Maier", "1976-11-11", "89123");
		person3.setGeburtsdatum("1987-10-24");
		person3.setVorname("Willi");
		person3.setNachname("Weissnix");
		person3.setPlz("50000");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		
		testAlter(person1.getAlter());
		testAlter(person2.getAlter());
		testAlter(person3.getAlter());

		
		System.out.println("Heute Geburtstag? " + person1.hatGeburtstag());
		System.out.println("Heute Geburtstag? " + person2.hatGeburtstag());
		System.out.println("Heute Geburtstag? " + person3.hatGeburtstag());
		System.out.println("***********");
		
		List<Person> personenListe = Arrays.asList(new Person[] {person1, person2, person3, person4, person5});
		personenListe.forEach(System.out::println);
		System.out.println("***********");
		
//		Standardsortierung nach Nachname aufsteigend, hier natuerliche Sortierung, mit Interface Comparable in Klasse
		personenListe.sort(null);
		// personenListe.sort(Comparator.naturalOrder()); 
		
//		Ausgabe
		System.out.println("*********** Nachname aufsteigend");
		personenListe.forEach(System.out::println);

		
//		Alternative Sortierung nach Geburtsdatum aufsteigend, hier Verwendung von Lambda
		personenListe.sort((p1, p2) -> LocalDate.parse(p1.getGeburtsdatum()).compareTo(LocalDate.parse(p2.getGeburtsdatum())));
		//funktioniert auch: personenListe.sort((p1, p2) -> p1.getGeburtsdatum().compareTo(p2.getGeburtsdatum)));
		
//		Ausgabe
		System.out.println("*********** Geburtsdatum aufsteigend");
		personenListe.forEach(System.out::println);
		

	} // Ende Main
	
	static void testAlter(int alter) {
		if (alter <= 50) {
			System.out.println("Bis 50");
		} else {
			System.out.println("Ueber 50");
		}
	}
	


}
