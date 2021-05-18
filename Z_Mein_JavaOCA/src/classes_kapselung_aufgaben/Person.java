package classes_kapselung_aufgaben;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Person implements Comparable<Person>{
	private String vorname;
	private String nachname;
	private String geburtsdatum;
	private String postleitzahl;
	
	public Person() {
		this("Petra", "Mustermann", "1970-01-01", "12345");
	}
	public Person(String vorname, String nachname, String geburtsdatum, String postleitzahl) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setGeburtsdatum(geburtsdatum);
		this.setPostleitzahl(postleitzahl);	
	}
	
	public String getVorname() {
		return this.vorname;
	}
	
//	Beim setter wird h�ufig Shadowing (Verdecken) angewendet. Das bedeutet, der Name des Parameter/Arguments mit dem Namen der Instanzvariablen �bereinstimmt
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return this.nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public String getGeburtsdatum() {
		return this.geburtsdatum;
	}
	
	public void setGeburtsdatum(String geburtsdatum) {
		try{
			LocalDate.parse(geburtsdatum);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Ung�ltiges Datum: " + geburtsdatum, e);
		}
		this.geburtsdatum = geburtsdatum;
	}
	
	public String getPostleitzahl() {
		return this.postleitzahl;
	}
	
	public void setPostleitzahl(String postleitzahl) {
//		if (postleitzahl.length() != 5 ) {
//			throw new IllegalArgumentException("postleitzahl muss genau 5 Zeichen haben: " + postleitzahl);
//		}
//		for (char zeichen : postleitzahl.toCharArray()) {
//			if (!Character.isDigit(zeichen)) {
//				throw new IllegalArgumentException("postleitzahl darf nur aus Ziffern bestehen: " + postleitzahl);
//			}
//		}
		// OCP: regul�re Ausdr�cke, genau f�nf Ziffern
		if (!postleitzahl.matches("\\d{5}")) {
			throw new IllegalArgumentException("postleitzahl muss genau 5 Zeichen haben und darf nur aus Ziffern bestehen: " + postleitzahl);
		}
			
		this.postleitzahl = postleitzahl;
	}
	
	public int getAlter() {
		LocalDate gebDat = LocalDate.parse(geburtsdatum);
		Period lebensdauer = Period.between(gebDat, LocalDate.now());
		return lebensdauer.getYears();
	}
	
	public boolean hatGeburtstag() {
		LocalDate gebDat = LocalDate.parse(geburtsdatum);
		LocalDate heute = LocalDate.now();
//		return gebDat.getDayOfYear() == heute.getDayOfYear(); // Problem mit Schaltjahren
		return gebDat.getDayOfMonth() == heute.getDayOfMonth() && gebDat.getMonthValue() == heute.getMonthValue();
	}
	
	@Override
	public String toString() {
		return "Person: " + vorname + " " + nachname + ", Geburtsdatum: " + geburtsdatum + ", Postleitzahl: " + postleitzahl + ", Alter: " + getAlter();
	}
	@Override
	public int compareTo(Person p) {
		return this.nachname.compareTo(p.nachname);
	}
	
}
