package klassen;

import java.util.Random;

class Rechteck {
	int breite; // Wenn ich auf private setze, gehen nicht: Manueller Ausdruck ab Z79
	int hoehe; // und statische Methode ab Z108 (Compilerfehler)
	
	//Konstruktor (Methode)
	Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	
	@Override //(Annotationen werden später besprochen)
	public String toString() {
		return "Rechteck: " + breite + " x " + hoehe;
	}
	
	//Methode: Setzen neuer Werte
	void setBreiteHoehe(int neueBreite, int neueHoehe) {
		this.breite = neueBreite;
		this.hoehe = neueHoehe;
	}
} //Ende class Rechteck


class Kreis {
	int radius;
	
	//Konstruktor
	Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override //(Annotationen werden später besprochen)
	public String toString() {
		return "Kreis R(" + radius + ")";
	}
} //Ende class Kreis


/*
 * # Aufgabe 'Klassen - Geometrie'

- Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.

- Es soll auch Kreise geben können. Jeder Kreis soll ein Radius haben. 

- Ein Rechteck soll es ermöglichen seine Maße auf der Konsole auszugeben.

- Ein Kreis soll eine bequeme Möglichkeit anbieten sein Radius auf der Konsole auszugeben.

- Erzeugen Sie 100 Rechtecke mit zufälligen Breiten und Höhen. Die Werte für die Breite und Höhe müssen aber aus dem Bereich zwischen 1 und 20 gewählt werden.
  Geben Sie auf der Konsole die Informationen zu den erzeugten Objekten in etwa so aus:
		1. Rechteck (3 X 5)
		2. Rechteck (7 X 15)
		...
		100. Rechteck (19 X 11)

- Erzeugen Sie einen Kreis und setzen Sie sein Radius auf 5. Erzeugen Sie die Ausgabe in folgender Form:
		Kreis. R = 5

- Definieren Sie eine statische Methode, mit der sich die beiden Dimensionen eines Rechteckes ändern lassen.

- Definieren Sie eine NICHT-statische Methode, mit der sich die beiden Dimensionen eines Rechteckes ändern lassen.
 */

public class AufgabeKlassenGeometrie {

	public static void main(String[] args) {
		
		int anzahlRechtecke = 25;
		System.out.println("*** " + anzahlRechtecke + "Rechtecke: ");
		
		Random random = new Random();
		
		int randomBound = 20;
		
		for (int i=1; i<=anzahlRechtecke;i++) {
			int breite = random.nextInt(randomBound) + 1;
			int hoehe = random.nextInt(randomBound) + 1;
			
			Rechteck r = new Rechteck(breite,hoehe);
			System.out.println(i + ". " + r);
		}
		
		//Masse von Rechtecken ändern, einmal mit Objektmethode, einmal mit statischer Methode:
		//r1.setBreiteHoehe(5, 9);
		//setNeueBreiteNeueHoehe(r2, 1, 20);
		
		//Ausdruck über toString
		System.out.println("\nAusdruck über toString-Methode: Rechteck (nach Ändern von Werten für r1 und r2)");
	
		//Ausdruck über statische Methode:
		System.out.println("\nAusdruck über statische Methode: Kreis");
		
		//Erzeugen eines Kreises mit Konstruktor:
		Kreis k1 = new Kreis(5);
		
		//Ausdruck Kreis mit toString/println:
		System.out.println(k1);
		

	} // Ende Main
	
	
	//Statische Methode: Setzen neuer Werte
	static void setNeueBreiteNeueHoehe(Rechteck rechteck, int neueBreite, int neueHoehe) {
		rechteck.breite = neueBreite;
		rechteck.hoehe = neueHoehe;
	}

}
