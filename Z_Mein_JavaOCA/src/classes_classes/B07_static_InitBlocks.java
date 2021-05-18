package classes_classes;

import java.util.Random;

/*
 * - Klassen werden beim 1. Benutzen geladen.
 * 
 * - Der Byte-Code der Klasse wird in einem Objekt vom Typ 'Class' stehen
 * 
 * - Statische Variablen (Konstanten) der Klasse entstehen beim Laden der Klasse
 * 
 * - Beim Laden der Klasse werden alle statischen Initialisierungsblöcke der Klasse ausgeführt
 * 	 
 * 	Statische Init-Block kann eingesetzt werden, 
 *  wenn die Klasse dynamisch vorbereitet werden soll. 
 */

class Papagei {
	static final int MAX_ALTER;
	
	// Statischer Initialisierungsblock:
	static {
		System.out.println("Klasse Papagei, static init 1");
		
		// Klasse vorbereiten (den Werde der statischen Konstante berechnen):
		Random random = new Random();
		MAX_ALTER = random.nextInt(1000) + 1000;
	}
	
	
	static {
		System.out.println("Klasse Papagei, static init 2");
	}
	
	
	public Papagei() {
		System.out.println("Konstruktor Papagei");
	}
}

public class B07_static_InitBlocks {

	public static void main(String[] args) throws Exception {
		
		// Klasse Papagei noch nicht geladen
		System.out.println("main 1");
		
		new Papagei(); // Klasse wird zum 1. mal verwendet und dafür geladen (nur ein mal)

		System.out.println("main 2");
		
		new Papagei(); // Klasse wird zum 2. mal verwendet, ist bereits geladen
		
		/*
		 * Klassen-Objekte sind einmalig für jede Klasse.
		 */
		Class papageiClass = Papagei.class; 
		
		// So könnte man die Klasse Laden ohne sie zu verwenden 
		// (oder die bereits geladene Klasse finden):
		Class c2 = Class.forName("classes.Papagei");
		
		System.out.println("Dieselbe Referenz? " + (papageiClass==c2)); // true
		
		Papagei p1 = new Papagei();
		
		// Auch so kann das KLassen-Objekt finden:
		Class c3 = p1.getClass();
		
		System.out.println("Wieder dieselbe Referenz? " + (c2 == c3)); // true
		
	}
}
