package klassen.person;

public class AufgabeKlassenPersonen {

	public static void main(String[] args) {
		
		//A5: 2 Beispielinstanzen erstellen mit 2 verschiedenen Konstruktoren
		System.out.println("Anlegen der Personenstammdaten:");
		Person person1 = new Person("Sakura", "Schneider");
		Person person2 = new Person("Friedemann", "Friese", 1960, "12345");
		
		//A6: Die beiden erstellen Datensätze auslesen
		System.out.println("\nAuslesen der vorhandenen Daten");
		person1.printPerson();
		person2.printPerson();

		//Für mich: Fehlende Daten von Person 1 setten
		System.out.println("\nFehlende Daten von Person 1 setten:");
		person1.setGeburtsjahr(1960);
		person1.setPlz("42852");
		person1.printPerson();
		
		
		//A7.2: equals-Methode testen
		System.out.println("\nequals-Methode testen");
		System.out.println("Geburtsjahr-Vergleich " + person1.getVorname() + " und " + person2.getNachname() + ": " + (person1.getGeburtsjahr() == person2.getGeburtsjahr()));
		//System.out.println("Geburtsjahr-Vergleich " + person1 + " und " + person2 + ": " + (person1.geburtsjahr == person2.geburtsjahr)); Geht nicht, wenn private!!!!
		
		//Versuch:
		System.out.println("Geburtsjahr-Vergleich " + person1.getVorname() + " und " + person2.getNachname() + ": " + (person1.equals(person2)));
		// Ist das etwa ein Vergleich für alle Daten???? Ja, der Referenz, hat keinen Sinn, da wir Inhalte vergleichen wollen
		// Meine Frage: Kann nur ein Attribut per equals als gleich gesetzt werden (auch Python) oder hier das ganze Objekt?
		//Ja, voreingestellt ist die Speicheradresse. Aber möglich ist, alle Inhalte eines Objekts zu vergleichen!!!
		
		//wieso hat Dozent den ersten Satz Person person1 = this; auskommentiert?

		//A8 Statische Methode getMaxmustermann
		System.out.println("\nstatische GetMustermann Methode:");
		Person person5 = Person.getMustermann();
		person5.printPerson();
		

	} // Ende Main

}
