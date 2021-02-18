package klassen_kapselung;

import java.util.ArrayList;
import java.util.Comparator;

import klassen_kapselung_anderespackage.*;

public class KapselungTest {

	public static void main(String[] args) {
		Buch buch = new Buch();
//		System.out.println(buch.test);
//		buch.isbn = "XYZ"; // Compiler-Fehler: isbn ist private
//		System.out.println("ISBN: " + buch.isbn);  // Compiler-Fehler: isbn ist private
		buch.setIsbn("9783866019294"); // richtig
//		buch.setIsbn("XYZ"); // falsch
//		buch.setIsbn("97838668019"); // falsch
//		buch.setIsbn("978386680X933"); // falsch
//		System.out.println("ISBN: " + buch.getIsbn()); 
		
		Buch krimi = new Buch("9783543045294", "A. Conan Doyle", "Sherlock Holmes: A study in scarlett", 1895, 1990);
		krimi.setBeschreibung(new StringBuilder("Spannender Krimi, erster Fall von Sherlock Holmes"));
		System.out.println(krimi);
//		StringBuilder temp = new StringBuilder("Krimi");
//		krimi.setBeschreibung(temp);
		krimi.getBeschreibung().delete(0, krimi.getBeschreibung().length());
		System.out.println(krimi);
		Buch sachbuch = new Buch("9783512345294", "M. Inden", "Java 11: Alle Neuerungen", 2017, 1490);
		Buch thriller = new Buch("9783412345694", "T. Harris", "Das Schweigen der L�mmer", 1985, 2495);
		
		ArrayList<Buch>  buecherListe = new ArrayList<>();
		buecherListe.add(krimi);
		buecherListe.add(sachbuch);
		buecherListe.add(thriller);
		System.out.println("+++++++++");
		
//		Standardsortierung nach Autor aufsteigend - Comparator muss importiert werden
		buecherListe.sort(Comparator.naturalOrder()); // Comparable implementieren in Buch
//		Ausgabe
		for (Buch b : buecherListe) {
			System.out.println(b);
		}
		
		System.out.println("*********");
		
//		Alternative Sortiertung nach Erscheinungsjahr absteigend
		buecherListe.sort((buch1, buch2) -> buch2.getErscheinungsjahr() - buch1.getErscheinungsjahr()); // Lambda
//		Ausgabe
		for (Buch b : buecherListe) {
			System.out.println(b);
		}
		
//		Mit Comparing
		buecherListe.sort(Comparator.comparing(Buch::getErscheinungsjahr).reversed());
		
	} // Ende Main
}
