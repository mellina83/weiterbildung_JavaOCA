package klassen.interfaces;

public class Person implements Comparable<Person> {
	private String vorname;
	private String nachname;
	
	public Person() {}
	
	public Person(String vorname, String nachname) {
		super();
		setVorname(vorname);
		setNachname(nachname);
		/*
		 * anstatt wie wir es kennen:
		this.vorname = vorname;
		this.nachname = nachname;
		Wichtig, damit auch bei Definition bei Erstellung der Objekte die Exceptions und Einschraenkungen gelten
		
		Also immer dann, wenn Einschraenkungen bei Setter Methoden drin sind :) !!!!
		
		*/
		
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public String toString() {
		return "Person" + " " + this.getVorname() + " " + this.getNachname();
	}
	
	
	@Override
	public int compareTo(Person person) {
		if(this.nachname.equals(person.nachname)) {
			return this.vorname.compareTo(person.vorname);
		}
		return this.nachname.compareTo(person.nachname); // & this.vorname.compareTo(person.vorname);
	}
	/*
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.nachname.compareTo(p.nachname)
	}
	*/
	
	//Comparable mit spitzen Klammern bewirkt dass wir nicht downcasten muessen, seit Java 5

}
