package api_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class DateTimeTest {

	public static void main(String[] args) {
		// Wie lang sind Sie schon auf der Welt (Periode in Jahre, Monate und Tage?
		LocalDate meinGeburtstag = LocalDate.of(1983, 07, 8);
		LocalDate heute = LocalDate.now();
		Period lebensdauer = Period.between(meinGeburtstag, heute);
		System.out.println("Meine Lebensdauer: " + lebensdauer);

		
		//Wieviele Tage sind Sie schon auf der Welt?
		long lebensdauerInTage = ChronoUnit.DAYS.between(meinGeburtstag, heute);
		System.out.println("Meine Lebensdauer in Tagen: " + lebensdauerInTage);
		
		// Wie viele Sekunden sind seit Mitternacht vergangen?
		LocalTime aktuelleZeit = LocalTime.now();
		LocalTime mitternacht = LocalTime.MIDNIGHT;
		Duration sekunden = Duration.between(mitternacht, aktuelleZeit);
		System.out.println("Sekunden seit Mitternacht: " + sekunden.getSeconds());
		
		// Wie viele Minuten dauert die Java-Schulung (8:00 bis 13:00 Uhr mit 30 Minuten Pause) an einem Tag?
		LocalTime kursanfang = LocalTime.of(8, 0);
		LocalTime kursende = LocalTime.parse("13:00");
		Duration kurspause = Duration.of(30, ChronoUnit.MINUTES);
		Duration kursdauer = Duration.between(kursanfang, kursende).minus(kurspause);
		System.out.println("Kursdauer in Minuten " + kursdauer.toMinutes() );
		// oder kursdauer.get(ChronoUnit.SECONDS / 60);
		// 
		
		// Welches Datum ist heute in 3 Monaten und 10 Tagen?
		LocalDate datum = heute.plusMonths(3).plusDays(10);
		System.out.println("Datum heute in drei Monaten: " + datum);
		
		/*
		 * Meine Loesung:
		Period inDreiMonaten = Period.of(0, 3, 10);
		LocalDate heuteInDreiMonaten = heute.plus(inDreiMonaten)
		*/
	
		
		// Erzeugen Sie einen StringBuilder-Objekt und h�ngen Sie alle Tage des Januars vom 1. Januar 2021 bis zum 31. Januar 2021 als LocalDate-Objekte an.
		StringBuilder ganzerJanuar = new StringBuilder();
		
		for (int i = 1; i <= Month.JANUARY.maxLength(); i++) {
			LocalDate januarTag = LocalDate.of(2021, 1, i);
			ganzerJanuar.append(januarTag + "\n");
			//Sicherer Zeilenumbruch: System.LineSeparator()
		}
		System.out.println("Ganzer Januar: " + ganzerJanuar);
		
		// Erzeugen Sie eine ArrayList und bef�llen Sie diese mit den Uhrzeiten (LocalTime) 7:45, 6:15, 20:15, 12:00 (gerne auch als Konstante), 16:35 und 15:00.
		// Sortieren Sie die Liste und erzeugen Sie eine Ausgabe.
		
		ArrayList<LocalTime> uhrzeiten = new ArrayList<>();
		uhrzeiten.add(LocalTime.of(7, 45));
		uhrzeiten.add(LocalTime.parse("06:15"));
		uhrzeiten.add(LocalTime.of(20, 15));
		uhrzeiten.add(LocalTime.NOON);
		uhrzeiten.add(LocalTime.of(16, 35));
		uhrzeiten.add(LocalTime.of(15, 00));
		uhrzeiten.sort(Comparator.naturalOrder());
		//auch moeglich:
		// Collections.sort(uhrzeiten);
		// uhrzeiten.sort(null); nicht schoen
		
		for (LocalTime uhrzeit : uhrzeiten) {
			System.out.println("Uhrzeit: " + uhrzeit);
		}
		
		
		// Erzeugen Sie eine ArrayList und bef�llen Sie diese mit allen Tagen im Februar und der Uhrzeit 12:00 Uhr.
		//Entfernen Sie mit einem Predicate alle ungeraden Tage und geben Sie die Liste absteigend sortiert aus.
		
		ArrayList <LocalDateTime> alleTageFebruar = new ArrayList<>();
		int anzahlTage = LocalDate.now().isLeapYear() ? Month.FEBRUARY.maxLength() : Month.FEBRUARY.minLength();
		
		for (int i = 1; i <= anzahlTage; i++) {
			LocalDateTime februarTag = LocalDateTime.of(2021, 2, i, 12, 0); // Hier bessere Loesung vom Dozenten checken
			alleTageFebruar.add(februarTag);
		}
		Predicate <LocalDateTime> pred = tag -> tag.getDayOfMonth() %2 != 0;
		alleTageFebruar.removeIf(pred);
		
		
		Comparator <LocalDateTime> reverse = (o1, o2) -> o2.compareTo(o1);
		alleTageFebruar.sort(reverse);
		
		
		//Loesung mit Klasse erstellen und Objekt erstellen:
		// alleTageFebruar.sort(new MyComparator());
		
		//Loesung mit anonymer Klasse, kennen wir aber noch nicht offiziell:
		/*
		alleTageFebruar.sort(new Comparator<LocalDateTime>() {
			@Override
			public int compare(LocalDateTime o1, LocalDateTime o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
		//Meine Loesung:
		// alleTageFebruar.sort(Comparator.reverseOrder());
		//--> Das ist eben das neue aus Java 8, dass Funktionale Interfaces auch statische Methoden haben koennen
		
		System.out.println("Absteigend: ");
		alleTageFebruar.forEach(System.out::println);
		

	}
	

}

class MyComparator implements Comparator<LocalDateTime> {

	@Override
	public int compare(LocalDateTime o1, LocalDateTime o2) {
		return o2.compareTo(o1);
	}
	
}
