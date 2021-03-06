package classes_interfaces;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListWaren {

	public static void main(String[] args) {
		ArrayList<Ware> warenListe = new ArrayList<>();
		
		Ware eis = new Lebensmittel("Speiseeis", 150, 500);
		Buch buch1 = new Buch("Herr der Ringe", 1990, "Tolkien");
		Spielzeug spielzeug1 = new Spielzeug("Playmobil Ritterburg", 5900, 6);
		Buch buch2 = new Buch("Java 10 ist eine Insel", 4900, "Christian Ullenboom");
		Ware buch3 = new Buch("Java  8 - Die Neuerungen", 2490, "Michael Inden");
		Spielzeug spielzeug2 = new Spielzeug("Lego Ninja 2", 3950, 9);
		Spielzeug spielzeug3 = new Spielzeug("Cluedo", 3995, 8);
		Lebensmittel kaffee = new Lebensmittel("Kaffee", 690, 30);
		Lebensmittel schokolade = new Lebensmittel("Milka Schokolade", 90, 550);
		
		warenListe.add(eis);
		warenListe.add(buch1);
		warenListe.add(spielzeug1);
		warenListe.add(buch2);
		warenListe.add(buch3);
		warenListe.add(spielzeug2);
		warenListe.add(spielzeug3);
		warenListe.add(kaffee);
		warenListe.add(schokolade);
		
		warenListe.forEach(System.out::println);
		
		// L�schen aller Waren mit einem Preis gr��er als 2000 Cent
		//warenListe.removeIf(ware -> ware.getPreis() >= 2000);
		// L�schen aller Java-B�cher
		//warenListe.removeIf(ware->ware.getBezeichnung().contains("Java"));
		
		// L�schen aller Spielzeuge
		System.out.println("+++++++++++++Bla++++");
		for(Ware ware : warenListe) {
			if (ware instanceof Lebensmittel && ((Lebensmittel) ware).getKalorien() >= 500) {
				System.out.println(ware);
			}
		}
		
		
		
		System.out.println("**********");
		warenListe.removeIf(ware -> ware instanceof Lebensmittel && ((Lebensmittel) ware).getKalorien() >= 500);
		warenListe.forEach(System.out::println);
	}

}
