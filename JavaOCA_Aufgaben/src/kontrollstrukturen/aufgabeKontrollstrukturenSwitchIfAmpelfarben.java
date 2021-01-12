package kontrollstrukturen;

public class aufgabeKontrollstrukturenSwitchIfAmpelfarben {

	public static void main(String[] args) {
		
		/*
		 * # Aufgabe 'switch/if - Ampelfarben'
			- Gegeben ist die aktuelle Ampelfarbe, die in einer Variable `farbe` gespeichert ist.
			
			- Benutzen Sie bitte die switch-Anweisung um die Farbe zu analysieren. Setzen Sie folgende Zeichenketten ein, um den Zustand der Ampel auszugeben:
			
				"Rot. Bitte warten"
		    	"Gelb. Gleich get es los"
		    	"Grün. Weg frei"
		    	"Fehler! Diese Farbe gibt es nicht."
		    	
			- Lösen Sie dieselbe Aufgabe auch mit if / else if / else
		 */
		
		//Lösung mit Switch:
		System.out.println("Lösung mit Switch:");
		
		String farbe = "Grün";
		switch (farbe) {
		case "Rot":
			System.out.println("Rot. Bitte warten!");
			break;
		case "Gelb":
			System.out.println("Gelb. Gleich geht es los.");
			break;
		case "Grün":
			System.out.println("Grün. Weg frei.");
			break;
		default:
			System.out.println("Fehler! Diese Farbe gibt es nicht.");
			break;
		}
	
		//Lösung mit if:
		System.out.println("\n\nLösung mit if");
		
		if (farbe == "Rot") {
				System.out.println("Rot. Bitte warten!");
		} else if (farbe == "Gelb") {
				System.out.println("Gelb. Gleich geht es los.");
		} else if (farbe == "Grün") {
				System.out.println("Grün. Weg frei.");
		} else {
			System.out.println("Fehler! Diese Farbe gibt es nicht.");
		}
		
		
	} // Ende Main

}
