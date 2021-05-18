package classes_aufgaben_geo;

import java.util.Random;

public class AufgabeKlassenGeometrie {

	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println(r1); // Rechteck 2 X 3

		
		int anzahlRechtecke = 5;
		System.out.println("*** " + anzahlRechtecke + " Rechtecke: ");
		
		Random random = new Random();
		
		int randomBound = 20;
		
		for (int i = 1; i <= anzahlRechtecke; i++) {
			int breite = random.nextInt(randomBound) + 1;
			int hoehe = random.nextInt(randomBound) + 1;
			
			Rechteck r = new Rechteck(breite, hoehe);
			System.out.println( i + ". " + r );
		}
		
		System.out.println("*** Kreis mit R = 5 untersuchen");
		Kreis k1 = new Kreis(5);
		System.out.println(k1); // Kreis. R = 5
		System.out.println("Kreis. R = " + k1.getRadius());
		
		
		System.out.println("*** Rechteck ändern");
		Rechteck r2 = new Rechteck(4, 5);
		System.out.println("1. r2: " + r2); // 4 X 5
		
		// mit der statischen Methode
		Rechteck.setDimensionen(r2, 22, 17);
		System.out.println("2. r2: " + r2); // 2 X 17
		
		// mit der Instanzmethode
		r2.setDimensionen(57, 12);
		
	} // end of main

}
