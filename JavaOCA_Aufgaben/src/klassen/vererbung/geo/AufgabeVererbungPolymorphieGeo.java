package klassen.vererbung.geo;

import java.util.Random;

/*
 * - Führen Sie den Begriff "Rechteck" in einem Projekt ein. Ein Rechteck hat Breite und Höhe.


- Es soll auch Kreise geben können. Jeder Kreis soll ein Radius haben. 
- Sowohl ein Rechteck als auch ein Kreis hat die x und y Koordinaten.
- Sowohl ein Rechteck als auch ein Kreis hat eine Methode "bewegen", mit der sich die Koordinaten ändern lassen.
- Mit einer Instanz-Methode "getFlaeche" soll die Fläche eines Rechteckes ermittelt werden können.
- Mit einer Instanz-Methode "getFlaeche" soll die Fläche eines Kreises ermittelt werden können.
- Erzeugen Sie 100 zufällige Figuren (Kreise oder Rechtecke zufällig) und speichern Sie alle in einem Array.
- Erzeugen Sie eine statische Methode, an die das Array aus der vorherigen Aufgabe übergeben werden kann. Die Methode soll die Flächen aller Figuren aus dem Array berechnen und ausgeben.
 */

public class AufgabeVererbungPolymorphieGeo {

	public static void main(String[] args) {
		
		//Test: Vererbung, Polymorphismus toString
		Rechteck r1 = new Rechteck(2,3);
		System.out.println(r1);
		r1.bewegen(100, 7);
		System.out.println("Nach bewegen: " + r1);
		
		Kreis k1 = new Kreis(4);
		System.out.println(k1);
		k1.bewegen(57, 7);
		System.out.println("Nach bewegen: " + k1);
		
		
		//Viele Figuren erzeugen:
		Figur[]array = new Figur[10];
		//randomFiguren();
		
		Random random = new Random();
		for (int i = 0; i<array.length; i++) {
			if (random.nextBoolean()) {
				array[i] = new Rechteck(i+1, i+1);
			} else { 
			array[i] = new Kreis(i+1);
			}
			
		}
		
		printFlaechen(array);
		

	} // Ende Main
	
	static void printFlaechen(Figur[] array) {
		for (int i = 0; i < array.length; i++) {
			Figur figur = array[i];
			System.out.println(i+1 + ". " + figur); // figur.toString -> polymorphisch
			System.out.println(" Fläche: " + figur.getFlaeche());
		}
	}
	
	static void randomFiguren() {
			// Wieviele Rechtecke und wieviele Kreise:
			Random random = new Random();
			int value = random.nextInt(100);
			
			
			//Array für Figur und darin die Rechtecke speichern
			Figur[] arrayRechteck = new Figur[value];
			
			for (int i = 0; i < value; i++ ) {
				random = new Random();
				int zufallBreite = random.nextInt(10);
				random = new Random();
				int zufallHoehe = random.nextInt(10);
				arrayRechteck[i] = new Rechteck(zufallHoehe, zufallBreite);
				
			}
			
			//Array für Figur und darin die Kreise speichern
			Figur[] arrayKreis = new Figur [100-value];
			
			for (int i = 0; i < value; i++ ) {
				random = new Random();
				int zufallX = random.nextInt(10);
				
				arrayKreis[i] = new Kreis(zufallX);
				
			}
			
	}
	
	static void alleFlaechenZusammen() {
		//Array aus Methode randomFiguren() soll übergeben werden und die Fläche aller Figuren aus dem Array berechnen und ausgeben
	}
	

}
