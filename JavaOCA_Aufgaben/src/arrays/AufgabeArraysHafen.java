package arrays;


class Hafen {
	
	for (int i = 0; i<12;i++) {
		Schiff schiff = new Schiff();
	}
	
	

	//@Override
	//public String toString() {
		//return schiff;
	//}
	
}

class Schiff {
	private String name;
	
	Schiff() {
		this("0");
	}
	
	Schiff (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Schiffname: " + name;
	}
	
}



public class AufgabeArraysHafen {

	public static void main(String[] args) {
		
		// Array Hafen erstellen mit 100 Plätzen
		Hafen[] h = new Hafen[100];
		Schiff schiff = new Schiff();
		int bestellteschiffe = 12;
		
		
		//Array für die Referenzen der Schiffe
		Schiff[] schiffe = new Schiff[bestellteschiffe];
		
		//Objekte aus Klasse Schiffe erstellen
		for (int i = 0; i < bestellteschiffe ;i++) {
			Schiff referenz = new Schiff();
			schiffe[i] = referenz;
			System.out.println("Schiff Nr. " + (i+1) + " erstellt " + schiffe[i]);

		}
		
		//Schiffe[12] in Hafen[100] parken: Hapert an den unterschiedlichen Datentypen....
		//for (int i = 0; i < schiffe.length;i++ ) {
		//	h[i] = schiffe[i];
		//}
		
		//Hafen erstellen: Wie mehrere?
		//Hafen h1 = new Hafen();
		
		//Hafen (Schiffe: 12. Freie Plätze: 88)
		
		
		System.out.println(h);
		
		//h[0] = schiff1.name; Geht nicht, da h eine Liste von Referenzen ist
		//h[0] = schiff1; 
		
		
	} // Ende Main

}
