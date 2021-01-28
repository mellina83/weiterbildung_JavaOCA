package arrays.hafen;

public class AufgabeArraysHafen {

	public static void main(String[] args) {
		
		//1 Hafen erstellen
		Hafen h1 = new Hafen();

		System.out.println("Gerade im Hafen: " + h1.getAnzahlSchiffe()); // bequemer, als im Array zu suchen (alle die nicht null sind)
		System.out.println("Gesamtanzahl Plätze im Hafen: " + h1.getMaxSchiffe());
		
		System.out.println(h1); //Aussehen: Hafen (Schiffe: 12. Freie Plätze: 88)
		
		
		
		//Objekte aus Klasse Schiffe erstellen und Referenzen werden in Array schiffe kopiert
		for (int i = 0; i < 12 ;i++) {
			
			Schiff s = new Schiff();
			h1.addSchiff(s); 

		}
		
		System.out.println(h1); //Hafen (Schiffe: 12. Freie Plätze: 88)
		
		Schiff[] schiffeImHafen = h1.getSchiffeImHafen();
		System.out.println("Schiffe im Hafen: " + schiffeImHafen.length);
		for (Schiff schiff : schiffeImHafen) {
			System.out.println(schiff);
		}

		

		
		
	} // Ende Main

}
