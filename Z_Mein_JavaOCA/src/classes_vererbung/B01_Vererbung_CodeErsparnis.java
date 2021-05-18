package classes_vererbung;

/*
 * Vererbung kann zu einer besseren Klassenstruktur beitragen wenn:
 * 
 * - Es sind mehrere Klassen geplant, die gleiche Realisierungen (Teile davon) haben, 
 *   aber auch Unterschiede zeigen.
 * - UND diese Klassen haben einen gemeinsamen logischen Oberbegriff (abstrakteren Namen)   
 *  
 */

class Fahrzeug /* extends Object */  { // Fahrzeug IS-A Object
	int baujahr = 1998;
	
	public int getBaujahr() {
		return baujahr;
	}
}

class LKW extends Fahrzeug { // LKW IS-A Fahrzeug
	int ladung;
}

class PKW extends Fahrzeug { // PKW IS-A Fahrzeug
	int sitzplaetze;
}


public class B01_Vererbung_CodeErsparnis {

	public static void main(String[] args) {
		
		Fahrzeug f = new Fahrzeug();
		System.out.println( f.baujahr );
		System.out.println( f.getBaujahr() );
		
		LKW lkw1 = new LKW(); 
		System.out.println( lkw1.baujahr ); // LKW hat baujahr
		System.out.println( lkw1.getBaujahr() ); // LKW hat getBaujahr()
		
		PKW pkw1 = new PKW();
		System.out.println( pkw1.baujahr );
		System.out.println( pkw1.getBaujahr() );
		
	}

}
