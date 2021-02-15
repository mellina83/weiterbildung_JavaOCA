package api;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

	public static void main(String[] args) {
//		LocalDate heute = new LocalDate(2021, 2, 12); // Compiler-Fehler, Konstruktoren sind nicht sichtbar
		LocalDate heute = LocalDate.now();
		System.out.println(heute);
		int jahr = heute.getYear();
		System.out.println("Jahr = " + jahr);
		System.out.println("Monat = " + heute.getMonthValue());
		System.out.println("Monat = " + heute.getMonth());
		System.out.println("Tag = " + heute.getDayOfMonth());
		
//		Rechnungsdatum 01.02.2021
		LocalDate rechnungsdatum = LocalDate.of(2021, 2, 1);
		rechnungsdatum = LocalDate.of(2021, Month.FEBRUARY, 1);
		String eingabeDatum = "01.02.2021";	// false
		eingabeDatum = "2021-02-01"; // true
		eingabeDatum = "2021-2-1"; // false
		
		if (check(eingabeDatum)) {
		rechnungsdatum = LocalDate.parse(eingabeDatum);
		System.out.println("Rechnungsdatum: " + rechnungsdatum);
		} else {
			System.out.println("Ungueltiges Datum");
		}
		
		LocalDate test = LocalDate.ofEpochDay(30_000);
		System.out.println(test);
		
		
		
		
		
	} // Ende Main
	
	private static boolean check(String datum ) {
//		Check auf L�nge und auf richtige Position der Bindestriche
//		Check, ob es Zahlen sind
		
		if (datum.length() != 10 || datum.indexOf("-") != 4 || datum.lastIndexOf("-") != 7  ) {
			return false;
		}
		
//		String[] datumteile = datum.split("-"); Mit Doppelschleife dann
		String datumOhneBindestriche = datum.replace("-", "");
		for (char zeichen : datumOhneBindestriche.toCharArray()) {
			
		// Moeglichkeit 1: Asci Tabelle
		//	if (!(zeichen >=48 && zeichen <= 57 )) {
			// 1. b) oder de Morgensche Regel:
			/*
			if (zeichen < 48 || zeichen > 57 ) {
				return false;
			}
			*/
			
		// Moeglichkeit 2: Charakter.isDigit nehmen
			if (!Character.isDigit(zeichen)) {
				return false;
			}
			
		}
		
		return true;
	}

}
