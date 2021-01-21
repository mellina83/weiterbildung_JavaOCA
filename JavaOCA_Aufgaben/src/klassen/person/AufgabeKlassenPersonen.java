package klassen.person;

public class AufgabeKlassenPersonen {

	public static void main(String[] args) {
		
		//A5: 2 Beispielinstanzen erstellen mit 2 verschiedenen Konstruktoren
		System.out.println("Anlegen der Personenstammdaten:");
		Person person1 = new Person("Sakura", "Schneider");
		Person person2 = new Person("Friedemann", "Friese", 1960, "12345");
		
		//A6: Die beiden erstellen Datensätze auslesen
		System.out.println("\nAuslesen der vorhandenen Daten");
		System.out.println(person1);
		System.out.println(person2);
		person1.printPerson(person1);
		person2.printPerson(person2);

		//Für mich: Fehlende Daten von Person 1 setten
	
		person1.setGeburtsjahr(1960);
		person1.setPlz("42852");
		person1.printPerson(person1);
		
		
		//A7.2: equals-Methode testen
		System.out.println("\nequals-Methode testen");
		System.out.println("Geburtsjahr-Vergleich " + person1 + " und " + person2 + ": " + (person1.geburtsjahr == person2.geburtsjahr));


	} // Ende Main

}
