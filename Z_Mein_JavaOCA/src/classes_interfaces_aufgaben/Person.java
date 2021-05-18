package classes_interfaces_aufgaben;

public class Person implements Comparable<Person>{
	
	private String vorname;
	private String nachname;
	
	public Person() {}
	public Person(String vorname, String nachname) {
		setVorname(vorname);
		setNachname(nachname);
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
		if (nachname == null || nachname.length() < 2) {
			throw new IllegalArgumentException("nachname darf nicht null sein und muss mind. 2 Zeichen enthalten: " + nachname);
		}
		this.nachname = nachname;
	}
	
	public String toString() {
		return "Person: " + vorname + " " + nachname;
	}
	
	@Override
	public int compareTo(Person p) {
		if (this.nachname.equals(p.nachname)) {
			return this.vorname.compareTo(p.vorname);
		}
		return this.nachname.compareTo(p.nachname);
	}
	
//	@Override
//	public int compareTo(Object o) {
//		Person p = (Person) o;
//		return this.nachname.compareTo(p.nachname);
//	}
	
	
	
	

}
