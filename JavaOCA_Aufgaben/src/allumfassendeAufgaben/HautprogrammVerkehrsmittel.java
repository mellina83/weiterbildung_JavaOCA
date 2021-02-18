package allumfassendeAufgaben;

import java.util.ArrayList;
import java.util.List;

public class HautprogrammVerkehrsmittel {

	public static void main(String[] args) {
		Verkehrsmittel verkehrsmittel1 = new Bus(991, "Mutzke Max", "HBF", "HBF", 40);
		Verkehrsmittel verkehrsmittel2 = new Bus(631, "Mustermann Max", "HBF", "Friedhofsweg", 20);
		Verkehrsmittel verkehrsmittel3 = new Bahn(991, "Krause Kim", "Friedhofsweg", "HBF", "Mustermann Maxima", 2, 20);
		Verkehrsmittel verkehrsmittel4 = new Bahn(102, "Beutlin Bilbo", "Weststrasse", "Oststrasse", "Klabautermann Kim", 1, 20);
		System.out.println(verkehrsmittel1);
		System.out.println(verkehrsmittel2);
		System.out.println(verkehrsmittel3);
		System.out.println(verkehrsmittel4);
		
		System.out.println("***** Vergleiche:");
		System.out.println(verkehrsmittel1.equals(verkehrsmittel3));
		System.out.println(verkehrsmittel1.equals(verkehrsmittel4));
		
		System.out.println("***** Liste erstellen");
		List<Verkehrsmittel> liste = new ArrayList<>();
		liste.add(verkehrsmittel1);
		liste.add(verkehrsmittel2);
		liste.add(verkehrsmittel3);
		liste.add(verkehrsmittel4);
		
		for (Verkehrsmittel listenteil : liste) {
			System.out.println(listenteil);
		}
		
		System.out.println("***** Sortierung");
		liste.sort(null);
		// oder
		//liste.sort((p1, p2) -> p1.getLiniennummer() - p2.getLiniennummer());
		
		for (Verkehrsmittel listenteil : liste) {
			System.out.println(listenteil);
		}

	} // Ende Main

}
