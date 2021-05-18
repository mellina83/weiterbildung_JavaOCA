package classes_aufgaben;

public class Person {
	public static Person getMustermann() {
		return new Person("Max", "Mustermann", 1960, 12345);
	}
	
	
	private String vorname, nachname;
	
	private int geburtsjahr;
	
	private int postleitzahl;

	public Person(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public Person(String vorname, String nachname, int geburtsjahr, int postleitzahl) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
		this.postleitzahl = postleitzahl;
	}

	public String getNachname() {
		return nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	// Hans Meyer, Geburtsjahr: 1950, Plz: 12345
	public String toString() {
		return vorname + " " + nachname + ", Geburtsjahr: " + geburtsjahr + ", Plz: " + postleitzahl; 
	}
	
	public boolean equals(Object obj) {
		// Person p1 = this;
		Person p2 = (Person)obj;
		
		if(!vorname.equals(p2.vorname)) {
			return false;
		}

		if(!nachname.equals(p2.nachname)) {
			return false;
		}
		
		return geburtsjahr == p2.geburtsjahr && postleitzahl == p2.postleitzahl;
	}
	
}
