package classes_kapselung_aufgaben;

//Dazu gehoeren: PersonAlter und Person

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonTest {

	public static void main(String[] args) {
		Person person1 = new Person("Peter", "Abel", "1967-01-05", "47058");
		Person person2 = new Person("Ilse", "Berger", "1958-02-18", "44139");
		Person person3 = new Person();
		Person person4 = new Person("Andrea", "Fuchs", "1977-07-07", "23456");
		Person person5 = new Person("Kevin", "Meier", "1976-11-11", "89123");
		person3.setVorname("Anna");
		person3.setNachname("Schmidt");
		person3.setGeburtsdatum("1987-10-24");
		person3.setPostleitzahl("34567");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		testAlter(person1.getAlter());
		testAlter(person2.getAlter());
		testAlter(person3.getAlter());
		System.out.println("Heute Geburtstag? " + person1.hatGeburtstag()); // false
		System.out.println("Heute Geburtstag? " + person2.hatGeburtstag()); // true
		System.out.println("Heute Geburtstag? " + person3.hatGeburtstag()); // false
		
		System.out.println("****************");
		List<Person> personenListe = Arrays.asList(new Person[]{person1, person2, person3, person4, person5});
		personenListe.forEach(System.out::println);
//		Standardsortierung nach Nachname aufsteigend
		personenListe.sort(Comparator.naturalOrder());
//		Ausgabe
		System.out.println("****************");
		personenListe.forEach(System.out::println);
		
//		Alternative Sortierung nach Geburtsdatum aufsteigend
		personenListe.sort((p1, p2) -> p1.getGeburtsdatum().compareTo(p2.getGeburtsdatum()));
		personenListe.sort((p1, p2) -> LocalDate.parse(p1.getGeburtsdatum()).compareTo(LocalDate.parse(p2.getGeburtsdatum())));
//		Ausgabe
		System.out.println("****************");
		personenListe.forEach(System.out::println);
	}
	
	public static void testAlter(int alter) {
		if (alter <= 50) {
			System.out.println("bis 50");
		} else {
			System.out.println("�ber 50");
		}
	}

}
