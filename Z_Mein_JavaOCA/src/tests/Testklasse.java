package tests;

//Diese Klasse ist ein Bauplan für Autos:

class Auto {
	
	String farbe; //Attribut / Feld / Instanzvariable
	int x;
	int y;
	
	//...
	
} // Ende Bauplan für Autos



public class Testklasse {

	public static void main(String[] args) {
		
		
		// Objekt erstellen:
		/*
		 * 1. Auto entsteht
		 */
		Auto a1 = new Auto(); // Das wird später nicht ausreichen als professioneller Programmierer, aber damit fangen wir an)
		a1.farbe = "blau";
		
		printAuto(a1);
		
		Auto a2 = new Auto();
		a2.farbe = "rot";
		
		int x = a1.x; //Attribut x von a1 lesen und in eine lokale Variable x kopieren
		
		printAuto(a2);
		
		bewegen (a2, 7, -3);
		
		printAuto(a2);

	} // Ende Main
	
	static void bewegen(Auto auto, int deltaX, int deltaY) {
		//Auto auto ist Parameter, damit WÄHLE ich das auto aus
		//Neue Werte deltaX und deltaY bzw. werden geändert
		
		auto.x += deltaX;
		auto.y += deltaY;
		
	} // Ende bewegen
	
	static void printAuto(Auto auto ) { // auto ist der Parameter!
		System.out.println("Auto Farbe: " + auto.farbe + " " + auto.x + " " + auto.y);
		
	} // Ende printAuto

}
