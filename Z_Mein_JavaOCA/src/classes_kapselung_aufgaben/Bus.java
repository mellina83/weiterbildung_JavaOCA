package classes_kapselung_aufgaben;

public class Bus extends Verkehrsmittel{

	private int anzahlSitzplaetze;
	
	public Bus() {}
	
	public Bus(int liniennummer, String fahrer, String start, String ziel, int anzahlSitzplaetze) {
		super(liniennummer, fahrer, start, ziel);
		this.setAnzahlSitzplaetze(anzahlSitzplaetze);
	}

	public int getAnzahlSitzplaetze() {
		return anzahlSitzplaetze;
	}

	public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
		if (anzahlSitzplaetze < 8 || anzahlSitzplaetze > 120) {
			throw new IllegalArgumentException("Anzahl der Sitzpl�tze muss zwischen 8 und 120 liegen: " + anzahlSitzplaetze);
		}
		this.anzahlSitzplaetze = anzahlSitzplaetze;
	}
	
	public String toString() {
		return super.toString() + ", Anzahl Sitzpl�tze: " + anzahlSitzplaetze;
	}
}
