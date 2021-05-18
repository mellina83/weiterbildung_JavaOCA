package arrays_aufgaben;

/**
 * Hafen für maximal 100 Schiffe
 *
 */
public class Hafen {
	
	private final static int MAX_SCHIFFE = 100;

	private final Schiff[] schiffe = new Schiff[MAX_SCHIFFE];
	
	/**
	 * Ein Schiff ankern lassen (im Hafen speichern)
	 * 
	 * @param s
	 * @return true wenn hinzugefügt, false, wenn es kein Platz gibt
	 */
	public boolean addSchiff(Schiff s) {
		
		// 1. freie Stelle im Array finden
		int index = -1;
		for(int i= 0; i<schiffe.length; i++) {
			if(schiffe[i]==null) {
				index = i;
				break;
			}
		}
		
		if(index==-1) {
			return false;
		}
		
		// 2. Dort die Schiff-Referenz kopieren
		schiffe[index] = s;
		
		return true;
	}
	
	public Schiff[] getSchiffeImHafen() {
		int anzahlSchiffe = getAnzahlSchiffe();
		
		Schiff[] schiffe = new Schiff[anzahlSchiffe];
		
		for(int indexAttribute=0, indexLocal=0; indexAttribute<this.schiffe.length; indexAttribute++) {
			Schiff s = this.schiffe[indexAttribute];
			
			if(s!=null) {
				schiffe[indexLocal++] = s;
			}
		}
		
		return schiffe;
	}
	
	public int getAnzahlSchiffe() {
		int count = 0;
		
		for(Schiff s : schiffe) {
			if(s!=null) {
				count++;
			}
		}
		
		return count;
	}
	
	public int getMaxSchiffe() {
		return schiffe.length;
	}
	
	public String toString() {
		int anzahlSchiffe = getAnzahlSchiffe();
		int anzahlFreiePlaetze = getMaxSchiffe() - anzahlSchiffe;
		
		return "Hafen (Schiffe: " + anzahlSchiffe + ". Freie Plätze: " 
				+ anzahlFreiePlaetze + ")";
	}
	
}
