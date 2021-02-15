package interfaces;

import java.util.Arrays;

public class Warenprogramm {

	public static void main(String[] args) {
		Ware eis = new Lebensmittel("Speiseeis", 150, 500);
		System.out.println(eis);
		Buch buch1 = new Buch("Herr der Ringe", 1990, "Tolkien");
		System.out.println(buch1);
		Spielzeug spielzeug1 = new Spielzeug("Playmobil Ritterburg", 5900, 6);
		System.out.println(spielzeug1);
		
		buch1.setVerleihpreis(2);
		System.out.println(buch1.getVerleihpreis());
		System.out.println(Buch.VERLEIHDAUER);
		spielzeug1.setVerleihpreis(5);
		Buch buch2 = new Buch("Java 10 ist eine Insel", 4900, "Christian Ullenboom");
		Verleihbar buch3 = new Buch("Java  8 - Die Neuerungen", 2490, "Michael Inden");
		Spielzeug spielzeug2 = new Spielzeug("Lego Ninja 2", 3950, 9);
		Spielzeug spielzeug3 = new Spielzeug("Cluedo", 3995, 8);
		spielzeug2.setVerleihpreis(5);
		spielzeug3.setPreis(4900);
		buch2.setVerleihpreis(2);
		buch3.setVerleihpreis(1);
		spielzeug3.setVerleihpreis(4);
		
//		Wenn alle sechs Verleihobjekt f�r eine Woche verliehen sind, wie hoch sind die Einnahmen?
		Verleihbar[] verleihobjekte = {buch1, spielzeug1, buch2, buch3, spielzeug2, spielzeug3};
		int gesamtverleihpreispreis = 0;
		for (Verleihbar verleihobjekt : verleihobjekte) {
			gesamtverleihpreispreis += verleihobjekt.getVerleihpreis();
		}
		System.out.println("Gesamtverleihpreis: " + gesamtverleihpreispreis);
		Ware[] waren = {eis, buch1, spielzeug1, buch2, (Ware) buch3, spielzeug2, spielzeug3};
		int gesamtpreis = 0;
		for (Ware ware : waren) {
			gesamtpreis += ware.getPreis();
		}
		System.out.println("Gesamtpreis: " + gesamtpreis);
		System.out.println("*****************");
		for (Ware ware : waren) {
			System.out.println(ware);
		}
//		System.out.println("Vergleich Spielzeug: " + spielzeug2.compareTo(spielzeug3));
//		System.out.println("Vergleich Buch: " + buch2.compareTo((Buch) buch3));
		
		// Sortieren des Arrays waren absteigend nach Preis
		Arrays.sort(waren);
		System.out.println("*****************");
		for (Ware ware : waren) {
			System.out.println(ware);
		}
		


	
	
	}
	
	
	
	
	

}
