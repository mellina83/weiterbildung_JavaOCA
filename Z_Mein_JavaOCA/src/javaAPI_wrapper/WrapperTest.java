package javaAPI_wrapper;

import java.util.ArrayList;

public class WrapperTest {

	public static void main(String[] args) {
//		In Java gibt es acht Wrapperklassen, die aus den entsprechenden primitiven Variablen Objekt erzeugen. 
//		Byte, Short, Integer, Long, Float, Double erweitern die Klasse Number, Character, Boolean
//		Die Klasse Integer umh�llt (wrap) einen int-Wert mit einem Objekt
		Integer umsatz1 = new Integer(20000);
		Integer umsatz2 = new Integer(25000);
		Integer umsatz3 = new Integer(30000);
		Integer umsatz4 = new Integer(15000);
		
		// Collections/Lists k�nnen keine primitiven Variablen speichern
//		ArrayList umsaetze = new ArrayList(); // keine gute L�sung wegen fehlender Typsicherheit
		ArrayList<Integer> umsaetze = new ArrayList<>();
		umsaetze.add(umsatz1);
		umsaetze.add(umsatz2);
		umsaetze.add(umsatz3);
		umsaetze.add(umsatz4);
		
		int umsatz5 = 30_000; 
//		Beim Autoboxing packt der Compiler den primitiven Wert automatisch in ein Objekt (boxing)
		umsaetze.add(umsatz5); // seit Java 5: Autoboxing
//		umsaetze.add(new Integer(umsatz5)); // vor Java 5
		Integer umsatz6 = 25000;  // automatisches Boxing
		umsaetze.add(umsatz6);
		Integer temp = new Integer("10000");
		short s = temp.shortValue();
		int umsatz7 = temp; // automatisches Un-boxing
		umsaetze.add(umsatz7); // automatisches Boxing
		umsaetze.add(15000);
		umsaetze.forEach(System.out::println);
		
		String eingabeGroesse = "185";
		int groesse = Integer.parseInt(eingabeGroesse); // parseInt oder allgemein parseXXX liefert einen primitiven Wert zur�ck
		Integer groesseObj = new Integer(eingabeGroesse);
		groesseObj = Integer.valueOf(eingabeGroesse); // valueOf liefert ein Objekt zur�ck
		
	}

}
