package klassen;

class Rechteck {
	int breite;
	int hoehe;
	int nummer;
	
	//Konstruktor (Methode)
	Rechteck(int breite, int hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}
	//Methode: Ausgabe Maße Rechteck
	void printRechteck() {
	System.out.println("Rechteck: ( " + breite + " x " + hoehe + " )");
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
	//Methode: Ausgabe Maße Kreis
	void printKreis() {
		System.out.println("R = " + this.radius);
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
		
		//Erzeugen von 100 Rechtecken mit Konstruktor:
		Rechteck r1 = new Rechteck(1,2);
		Rechteck r2 = new Rechteck(2,8);
		Rechteck r3 = new Rechteck(7,18);
		
		//???? Eher gewünscht: 100 Rechtecke, zufällige Werte
		//100 Rechtecke generieren: Mit for? oder gar mit rekursiv? Mein Problem: Den Referenznamen generieren (Ich dachte, man hat keinen Zugriff drauf)
		//Zufällige Werte: Mit Zufallsmethoden
		
		//Ausdruck manuell ohne explizite Methoden:
		System.out.println("Ausdruck Manuell (Zur Überprüfung): Rechteck");
		System.out.println("Rechteck: " + r1.breite + " x " + r1.hoehe);
		System.out.println("Rechteck: " + r2.breite + " x " + r2.hoehe);
		System.out.println("Rechteck: " + r3.breite + " x " + r3.hoehe);
		
		//Masse von Rechtecken ändern, einmal mit Objektmethode, einmal mit statischer Methode:
		r1.setBreiteHoehe(5, 9);
		setNeueBreiteNeueHoehe(r2, 1, 20);
		
		//Ausdruck über Objektmethode:
		System.out.println("\nAusdruck über Objektmethode: Rechteck (nach Ändern von Werten für r1 und r2)");
		r1.printRechteck();
		r2.printRechteck();
		r3.printRechteck();
		
		//Ausdruck über statische Methode:
		System.out.println("\nAusdruck über statische Methode: Kreis");
		
		
		//Erzeugen eines Kreises mit Konstruktor:
		Kreis k1 = new Kreis(5);
		
		//Ausdruck Radius über Instanzmethode
		k1.printKreis();
		

	} // Ende Main
	
	
	//Statische Methode: Setzen neuer Werte
	static void setNeueBreiteNeueHoehe(Rechteck rechteck, int neueBreite, int neueHoehe) {
		rechteck.breite = neueBreite;
		rechteck.hoehe = neueHoehe;
	}

}
