package hauptprogramm;

import java.util.Arrays;

/*
 * Lotto Spiel simulieren
 * 
 * Was soll möglich sein:
 * - Tipp abgeben (7 aus 49, 6 aus 36 ... oder x aus y) X
 * - Lotto-Ziehung durchführen X
 * - Vergleich von den getippten Zahlen mit den gezogenen
 * - Gewinn berechnen
 * 
 * Gewinn-Regeln:
 * 0 richtige: 0 Euro
 * 1 richtige: 1 Euro
 * 2 richtige: 10 Euro
 * 3 richtige: 100 Euro
 * ...
 * 
 * 
 */


public class Lotto {

	public static void main(String[] args) {
		int anzahlKugeln = 7;
		int anzahlKugelnGesamt = 49;

		//Objekt lottoschein erstellen
		System.out.println("Lottoschein-Abgabe:");
		LottoTipp lottotipp = new LottoTipp(anzahlKugeln, anzahlKugelnGesamt);
		System.out.println(lottotipp); // Tipp 7 aus 49. Noch kein Tipp abgegeben
		lottotipp.abgeben();
		System.out.println(lottotipp); // Tipp 7 aus 49. [Zahlenarray]
		
		
		
		//Objekt lottospiel erstellen
		System.out.println("\nZiehung der Lottozahlen:");
		LottoSpiel lottospiel = new LottoSpiel(anzahlKugeln, anzahlKugelnGesamt);
		System.out.println(lottospiel); // Spiel 7 aus 49. Noch keine Ziehung ausgeführt.
		lottospiel.ziehen();
		System.out.println(lottospiel); // Spiel 7 aus 49. [Zahlenarray]

		int gewinn = lottospiel.vergleichen(lottotipp);
		int anzahlRichtige = lottospiel.getAnzahlRichtige(lottotipp);
		System.out.println("* Anzahl Richtige: " + anzahlRichtige);
		System.out.println("* Gewinn: " + gewinn);
		
	} // End of Main
	

	
}
