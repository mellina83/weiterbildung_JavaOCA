package javaApi_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

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
		eingabeDatum = "201-02-01"; // true
//		eingabeDatum = "2021-2-1"; // false
		
		if (check(eingabeDatum)) {
		rechnungsdatum = LocalDate.parse(eingabeDatum);
		System.out.println("Rechnungsdatum: " + rechnungsdatum);
		} else {
			System.out.println("Ung�ltiges Datum");
		}
		
		LocalDate test = LocalDate.ofEpochDay(30_000);
		System.out.println(test);
		
		// Ausgabe und Parsen mit Format
		System.out.println(heute);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d.M.yy");
		System.out.println(heute.format(formatter));
		formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(heute.format(formatter));
		
		eingabeDatum = "01.02.2021";
		rechnungsdatum = LocalDate.parse(eingabeDatum, DateTimeFormatter.ofPattern("dd.MM.y"));
		rechnungsdatum = LocalDate.parse(eingabeDatum, DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println("Rechnungsdatum: " + rechnungsdatum);
		
		eingabeDatum = "Freitag, 12. Februar 2021";
		rechnungsdatum = LocalDate.parse(eingabeDatum, DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
		System.out.println("Rechnungsdatum: " + rechnungsdatum);
		
		rechnungsdatum.plusDays(30);
		System.out.println("Rechnungsdatum: " + rechnungsdatum); // 12.2.21, da LocalDate-Objekt immutable sind (vergleichbar mit String)
		
//		1. Mahnstufe: nach 30 Tagen
		LocalDate ersteMahnstufe = rechnungsdatum.plusDays(30);
		System.out.println("1. Mahnstufe: " + ersteMahnstufe);
		
//		2. Mahnstufe nach 60 Tagen
		LocalDate zweiteMahnstufe = rechnungsdatum.plus(60, ChronoUnit.DAYS);
		System.out.println("2. Mahnstufe: " + zweiteMahnstufe);
		
//		3. Mahnstufe nach 100 Tagen
//		Zeitraum von 100 Tagen
		Period hundertTage = Period.ofDays(100);
		LocalDate dritteMahnstufe = rechnungsdatum.plus(hundertTage);
		System.out.println("3. Mahnstufe: " + dritteMahnstufe);
		
		Period periode = Period.between(ersteMahnstufe, dritteMahnstufe);
		System.out.println(periode);

	}
	
	private static boolean check(String datum ) {
//		Check auf L�nge und auf richtige Position der Bindestriche
		if (datum.length() != 10 || datum.indexOf('-') != 4 || datum.lastIndexOf('-') != 7) {
			return false;
		}
//		Erweiterung: Check, ob es Zahlen sind
//		String[] datumteile = datum.split("-");
		String datumOhneBindestriche = datum.replace("-", "");
		for (char zeichen : datumOhneBindestriche.toCharArray()) {
//			if (!(zeichen >= 48 && zeichen <= 57)) {
//			if (zeichen < 48 || zeichen > 57) {
//				return false;
//			}
			if (!Character.isDigit(zeichen)) {
				return false;
			}
		}		
		return true;
	}

}



