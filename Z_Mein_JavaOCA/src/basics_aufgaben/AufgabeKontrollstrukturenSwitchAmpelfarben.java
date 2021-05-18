package basics_aufgaben;

public class AufgabeKontrollstrukturenSwitchAmpelfarben {

	public static void main(String[] args) {

		/*
		 * Gegeben ist die aktuelle Ampelfarbe, die in einer Variable 
		 * `farbe` gespeichert ist.
		 * 
		 * Benutzen Sie bitte die switch-Anweisung um die Farbe zu analysieren.
			Setzen Sie folgende Zeichenketten ein, um den Zustand der Ampel auszugeben:

		    "Rot. Bitte warten"
		    "Gelb. Gleich get es los"
		    "Grün. Weg frei"
		    "Fehler! Diese Farbe gibt es nicht."
		 */
		
		String farbe = "gelb"; // "rot" oder "ROT", "gelb" oder "GELB", "grün" oder "GRÜN"
//		int farbe = 1;
//		double farbe = 0.0;
		
		switch(farbe) {
			case "rot":
			case "ROT":
				System.out.println("Rot. Bitte warten");
				break;
			case "gelb":
			case "GELB":
				System.out.println("Gelb. Gleich get es los");
				break;
			case "grün":
			case "GRÜN":
				System.out.println("Grün. Weg frei");
				break;
			default:
				System.out.println("Fehler! Diese Farbe gibt es nicht.");
		}
		
		System.out.println("---- mit if/else ----");
		
		/*
		 * Achtung! Der Vergleichsoperator ist beim Vergleich der Referenzen
		 * ist falsch. Besser wäre die equals-Methode für den Vergleich zu verwenden.
		 * (wird in weiteren Beispielen erklärt)
		 */
		if(farbe == "rot" || farbe == "ROT") {
			System.out.println("Rot. Bitte warten");
		} else if(farbe == "gelb" || farbe == "GELB") {
			System.out.println("Gelb. Gleich get es los");
		} else if(farbe == "grün" || farbe == "GRÜN") {
			System.out.println("Grün. Weg frei");
		} else {
			System.out.println("Fehler! Diese Farbe gibt es nicht.");
		}
		

	} // end of main

}
