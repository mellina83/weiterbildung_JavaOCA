package klassen.person;

public class Person {
	
	//A1: Erstellen neue Klasse `Person`
	private String vorname, nachname;
	private int geburtsjahr;
	private String plz;
	
	//A2: Mindestens zwei Konstruktoren
	Person(String vorname, String nachname, int geburtsjahr, String plz) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
		this.plz = plz;
		System.out.println("Der Datensatz zu " + vorname + " " + nachname + " ist vollständig erstellt.");
	}
	
	Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		System.out.println("Zu " + vorname + " " + nachname + " fehlen noch Geburtsjahr und Plz!");
	}
	
	//A3: toString() Methode überschreiben
	public String toString() {
		return vorname + " " + nachname;
	}
	// Für einen Komplettausdruck:
		public void printPerson() {
			System.out.println(this.vorname + " " + this.nachname + ", geboren " + this.geburtsjahr + " und wohnhaft in PLZ " + this.plz + " .");
		}
	
	
	//A4 Opt: getter- und setter-Methoden nach JavaBeans:
	public String getVorname() {
		return vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public int getGeburtsjahr() {
		return geburtsjahr;
	}
	
	public String getPlz() {
		return plz;
	}
	
	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	
	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	//Nach JavaBeans aber nicht definiert (nur für 1 Argument):
	public void setGeburtsjahrPlz(int geburtsjahr, String plz) {
		this.geburtsjahr = geburtsjahr;
		this.plz = plz;
	}

	//A7.1: equals-Methode überschreiben
	public boolean equals(Object obj) {
		Person person1 = this;
		Person person2 = (Person)obj; // Casten zu Person
		
		
		//return person1.geburtsjahr == person2.geburtsjahr && person1.plz == person2.plz;
		return person1 == person2;
	}
	
	
	//a8: Factoring Method - Design Pattern
	public static Person getMustermann() {
		return new Person("Max", "Mustermann", 1745, "45678");
	}
	
	public static void main(String[] args) {

	} // Main Ende

}
