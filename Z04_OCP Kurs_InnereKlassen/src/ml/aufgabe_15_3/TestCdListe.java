package ml.aufgabe_15_3;

public class TestCdListe {

	public static void main(String[] args) {
		CdListe liste = new CdListe("Klassik", 3);
		liste.listeAnzeigen();
		liste.cdHinzufuegen("Zauberflöte", "Mozart", 2003);
		liste.cdHinzufuegen("Nussknacker", "Tschaikowsky", 2001);
		liste.listeAnzeigen();
		liste.cdHinzufuegen("Für Elise", "Beethoven", 1990);
		liste.listeAnzeigen();
		liste.cdHinzufuegen("Venezia 2000", "Rondo Veneziano", 1983);
		liste.listeAnzeigen();
		
	}

}
