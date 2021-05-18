package arrays_aufgaben;

public class AufgabeArraysHafen {

	public static void main(String[] args) {

		Hafen h1 = new Hafen();
		
		System.out.println( "Schiffe im Hafen: " + h1.getAnzahlSchiffe() );
		System.out.println( "Gesamtanzahl Plätze im Hafen: " + h1.getMaxSchiffe() );
		
		System.out.println(h1); // Hafen (Schiffe: 0. Freie Plätze: 100)
		
		for (int i = 0; i < 12; i++) {
			Schiff s = new Schiff( "S"+i );
			if( !h1.addSchiff(s) ) {
				System.out.println("Hafen ist voll. Kein weiteres Schiff konnte ankern");
			}
		}
		
		System.out.println(h1); // Hafen (Schiffe: 12. Freie Plätze: 88)
		
		Schiff[] schiffeImHafen = h1.getSchiffeImHafen();
		System.out.println("Schiffe im Hafen: " + schiffeImHafen.length);
		
		for (Schiff schiff : schiffeImHafen) {
			System.out.println(schiff);
		}
		
	} // end of main

}
