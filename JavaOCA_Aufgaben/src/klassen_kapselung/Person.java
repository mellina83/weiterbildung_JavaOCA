package klassen_kapselung;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Person implements Comparable<Person> {
	String vorname, nachname, plz;
	int alter;
	String geburtsdatum;
	
	public Person (String vorname, String nachname, String geburtsdatum, String plz) {
		setVorname(vorname);
		setNachname(nachname);
		setGeburtsdatum(geburtsdatum);
		setPlz(plz);
	}
	
	public Person () {
		
	}
	
	@Override
	public String toString() {
		return vorname + " " + nachname + ", Geburtsdatum: " + geburtsdatum + " (Alter: " +  getAlter() + ") " + ", PLZ: " + plz;
	}
	
	public boolean hatGeburtstag() {
		LocalDate gebDat = LocalDate.parse(geburtsdatum);
		LocalDate heute = LocalDate.now();
		return heute.getDayOfMonth() == gebDat.getDayOfMonth() && heute.getMonth() == gebDat.getMonth();
		
		/* Lange Version ohne If, mit return false, return true:
		if (heute.getDayOfMonth() == gebDat.getDayOfMonth() && heute.getMonth() == gebDat.getMonth()) {
			return true;
		}
		return false;
		*/
		
		//getDayofYear anstatt beide Pruefungen:
		//Auch moeglich, aber macht in Schaltjahren Probleme
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
	
	public String getGeburtsdatum() {
		return geburtsdatum;
	}

	public void setGeburtsdatum(String geburtsdatum) {
		try {
			LocalDate.parse(geburtsdatum);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Geburtsdatum ungueltig");
		}
		this.geburtsdatum = geburtsdatum;
	}
	

	public int getAlter() {
		LocalDate gebDat = LocalDate.parse(geburtsdatum);
		Period period = Period.between(gebDat, LocalDate.now());
		alter = period.getYears();
		return alter;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		if (plz.length() != 5) {
			throw new IllegalArgumentException("Die Laenge muss 5 sein. Eingegeben war: " + plz);
		}
		
		for (char zeichen : plz.toCharArray()) {
			if (!Character.isDigit(zeichen)) {
				throw new IllegalArgumentException("PLZ darf nur aus Ziffern bestehen. Eingegeben war: " + plz);
			}
		}
		
		//OCP: regulaere Ausdruecke
		//if (!plz.matches("\\d{5}")) {
		//	throw new IllegalArgumentException("Bla");
		//}
		
		this.plz = plz;
	}
	
	//Standardsortierung:
	@Override
	public int compareTo(Person p) {
		return this.nachname.compareTo(p.nachname);
	}

	

}
