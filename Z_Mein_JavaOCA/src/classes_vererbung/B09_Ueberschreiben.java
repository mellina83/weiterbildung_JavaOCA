package classes_vererbung;

class Mannschaft {
	public void aufstellen() {
		System.out.println("Mannschaft");
	}
	
	int getSize() {
		return 0;
	}
	
	void siegen() { /*...*/ }
}

/*
 * Die Methode 'aufstellen' wird überschrieben.
 * 
 * Dadurch ersetzt die neue (überschreibende) Methode
 * die alte (überschreibene) Methode für alle VW-Objekte.
 * 
 * Regeln beim Überschreiben:
 * 
 * - Sichtbarkeiten nicht verschärfen
 * - Rückgabetyp nicht ändern (Ausnahme: Kovarianz)
 * - keine zusätzlichen checked Exceptions deklarieren (später)
 */


class FussballManschaft extends Mannschaft {
//	Compilerfehler (sichtbarkeit):
	
//	private void aufstellen() {
//		System.out.println("Fußballmannschaft");
//	}


//	Compilerfehler (Rückgabetyp):	
	
//	double getSize() {
//		return 33;
//	}
	
	
//	Compilerfehler (checked Exception)
	
//	void siegen() throws Exception {
//		
//	}
}



public class B09_Ueberschreiben {

	public static void main(String[] args) {
		
		Mannschaft m = new Mannschaft();
		
		m.aufstellen(); // <- polymorphischer Aufruf
		int x = m.getSize(); // <- polymorphischer Aufruf
		
		m = new FussballManschaft();
		
		m.aufstellen(); // <- polymorphischer Aufruf
		x = m.getSize(); // <- polymorphischer Aufruf
		
	}

}
