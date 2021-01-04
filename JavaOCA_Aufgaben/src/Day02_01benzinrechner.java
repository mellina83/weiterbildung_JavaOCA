

import java.util.Scanner;

public class Day02_01benzinrechner {

	public static void main(String[] args) {
		

	    // Programmieren Sie einen Benzinrechner, der zu dem Gesamtverbrauch in Liter und den gefahrenen Kilometern den Verbrauch auf 100 Kilometer 
		// berechnet. Beispieldaten: 60 Liter, 400 Kilometer = 15 Liter / 100 Kilometer

		// Eingabe, Deklaration und Zuweisung
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie ihre gefahrenen Kilometer ein:");
		int gefahrenekm = sc.nextInt();
		System.out.println("Bitte geben Sie ihren Spritverbrauch ein:");
		int gesamtverbrauch = sc.nextInt();
		
		double spritverbrauch100km;
		
		// Berechnung
		spritverbrauch100km = gesamtverbrauch * 100.0 / gefahrenekm;
		
		//a) Ausgabe
		System.out.println("Ihr Spritverbrauch auf 100 km betr�gt ungerundet " + spritverbrauch100km + " Liter");
		
		//b) Ausgabe mit Formatierung, auf 1 Nachkommastelle -> Wurde hier nur angerissen, Thema kommt ausf�hrlicher
		System.out.printf("Ihr Spritverbrauch auf 100 km betr�gt gerundet %.1f Liter.741%n", spritverbrauch100km);
		//Mit printf wird Formatierung eingeleitet. Wird lt. Dozent aber eher weniger verwendet; kommt aus C.
		//Im Strg-Text gilt % als Platzhalter f�r Argument, dann Nachkommastelle.
		//%n f�r Zeilenumbruch, wenn gew�nscht
		//Dann Argument = Variable, die an Stelle des Platzhalters % gesetzt werden soll; Mehrere Argumente m�glich
		
		
		// Schlie�en des Scanners
		sc.close();
		
	}

}
