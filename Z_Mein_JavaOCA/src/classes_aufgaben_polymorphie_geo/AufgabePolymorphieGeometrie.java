package classes_aufgaben_polymorphie_geo;

import java.util.Random;

public class AufgabePolymorphieGeometrie {

	public static void main(String[] args) {
		
		Rechteck r1 = new Rechteck(2, 3);
		System.out.println("Vor bewegen: " + r1);
		r1.bewegen(100, 77);
		System.out.println("Nach bewegen: " + r1);
		
		Kreis k1 = new Kreis(4);
		System.out.println("k1 vor bewegen: " + k1);
		k1.bewegen(22,  -6);
		System.out.println("k1 nach bewegen: " + k1);
		
		Kreis k2 = new Kreis(7, -33, 101);
		System.out.println("k2: " + k2);
		
		System.out.println("*** Viele Figuren: ");
//		Rechteck[] array = new Rechteck[10];
//		Kreis[] array = new Kreis[10];
		Figur[] array = new Figur[10];

		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			if(random.nextBoolean()) {
				array[i] = new Rechteck(i+1, i+1); // Figur <= IS-A <= Rechteck
			} else {
				array[i] = new Kreis(i+1);			// Figur <= IS-A <= Kreis
			}
		}
		
		printFlaechen(array);
	} // end of main

	static void printFlaechen(Figur[] array) {
		
		for (int i = 0; i < array.length; i++) {
			Figur figur = array[i];
			System.out.println(i+1 + ". " + figur);
			System.out.println(" * Fläche: " + figur.getFlaeche());
		}
	}
	
}
