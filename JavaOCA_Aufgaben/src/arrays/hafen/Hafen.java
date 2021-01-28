package arrays.hafen;

public class Hafen {
	
	final private static int Max_Schiffe = 100;
	
	//Platz für maximal 100 Schiffe
	private final Schiff[] schiffe = new Schiff[Max_Schiffe];
	
	//
	public void addSchiff(Schiff s) {
		//Damit die Exception in Main nicht erscheint, boolean etc s Lösung von Dozent
		
		//1. freie Stelle im Array finden
		int index = -1;
		for (int i = 0; i<schiffe.length;i++) {
			if(schiffe[i]==null) {
				index = i;
				break;
			}
		}

		//2. Dort die Schiffreferenz kopieren
		schiffe[index] = s;
		
	}
	
	public Schiff[] getSchiffeImHafen() {
		int anzahlSchiffe = getAnzahlSchiffe();
		
		Schiff[] schiffe = new Schiff[anzahlSchiffe];
		
		for (int indexAttribute = 0, indexLocal=0; indexAttribute < this.schiffe.length;indexAttribute++) {
			Schiff s = this.schiffe[indexAttribute];
			
			if(s!=null) {
				schiffe[indexLocal++] = s;
			}
		}
		
		return schiffe;
	}
	
	//Get Anzahl Schiffe, die gerade im Hafen sind:
	public int getAnzahlSchiffe() {
		int count = 0;
		for (Schiff s : schiffe) {
			if (s!=null) {
				count++;
			}
		}
		return count;
	}
	
	//Get Anzahl für Plätze im Hafen:
	public int getMaxSchiffe() {
		return schiffe.length;
	}
	
	//toString überschreiben
	public String toString() {
		int anzahlSchiffe = getAnzahlSchiffe();
		int anzahlFreiePlaetze = getMaxSchiffe() - anzahlSchiffe;
		return "Hafen (Schiffe: " + anzahlSchiffe 
				+ ". Freie Plätze: " + anzahlFreiePlaetze;
	}
	
}
