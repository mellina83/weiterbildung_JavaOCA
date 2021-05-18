package classes_classes;

import java.util.Random;

/*
 * Die nichtstatischen Init-Blöcke werden automatisch und intelligent in alle Konstruktoren
 * der Klasse eingebaut (Init-Blick wird nur einmal in jedem Konstruktor aktiv).
 * 
 * Sie sind hilfreich, wenn alle Konstruktoren den Code aus denm Init-Block haben sollen.
 * 
 * Wenn es mehrere init-Blöcke gibt, werden sie alle zu einem init-Block zusammengefasst
 */

class Kunde {
	private int id;
	private String name;
	private int kontostand;
	
	// init-Block: gemeinsamer Code in allen Konstruktoren
	{
		System.out.println("init-Block 1");
		id = new Random().nextInt();		
	}
	
	public Kunde(String name) {
		this(name, 0); // <- häufige Lösung: den anderen überladenen Konstruktor aufrufen
	}
	
	public Kunde(String name, int kontostand) {
		if(name==null) {
			// throw new IllegalArgumentException("Name darf nicht null sein"); // <- gute Lösung
			name = "???";
		}
		this.name = name;
		this.kontostand = kontostand;
	}
	
	@Override
	public String toString() {
		return "id: " + id + ". Name: " + name + ". Konto: " + kontostand;
	}
	
	// noch ein init-Block
	{
		System.out.println("init-Block 2");
	}
}

public class B08_InitBlocks {

	public static void main(String[] args) {
		Kunde k1 = new Kunde("Tom");
		System.out.println(k1);

		Kunde k2 = new Kunde("Jerry", 20);
		System.out.println(k2);
		
		
	}

}
