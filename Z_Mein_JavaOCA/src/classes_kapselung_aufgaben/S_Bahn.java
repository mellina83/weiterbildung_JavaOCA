package classes_kapselung_aufgaben;

public class S_Bahn extends Verkehrsmittel{
	
	private String schaffner;
	private int anzahlWagen;
	private int anzahlSitzplaetzeProWagen;
	
	public S_Bahn() {}

	public S_Bahn(int liniennummer, String fahrer, String start, String ziel, String schaffner, int anzahlWagen,
			int anzahlSitzplaetzeProWagen) {
		super(liniennummer, fahrer, start, ziel);
		this.setSchaffner(schaffner);
		this.setAnzahlWagen(anzahlWagen);
		this.setAnzahlSitzplaetzeProWagen(anzahlSitzplaetzeProWagen);
	}

	public String getSchaffner() {
		return schaffner;
	}

	public void setSchaffner(String schaffner) {
		if (schaffner == null || schaffner.length() < 2) {
			throw new IllegalArgumentException("Schaffner muss mind. 2 Zeichen enthalten: " + schaffner);
		}
		this.schaffner = schaffner;
	}
	
	public int getAnzahlWagen() {
		return anzahlWagen;
	}

	public void setAnzahlWagen(int anzahlWagen) {
		if (anzahlWagen < 1 || anzahlWagen > 10) {
			throw new IllegalArgumentException("Anzahl der Wagen muss zwischen 1 und 10 liegen: " + anzahlWagen);
		}
		this.anzahlWagen = anzahlWagen;
	}

	public int getAnzahlSitzplaetzeProWagen() {
		return anzahlSitzplaetzeProWagen;
	}

	public void setAnzahlSitzplaetzeProWagen(int anzahlSitzplaetzeProWagen) {
		if (anzahlSitzplaetzeProWagen < 100 || anzahlSitzplaetzeProWagen > 250) {
			throw new IllegalArgumentException("Anzahl der Sitzpl�tze pro Wagen muss zwischen 100 und 250 liegen: " + anzahlSitzplaetzeProWagen);
		}
		this.anzahlSitzplaetzeProWagen = anzahlSitzplaetzeProWagen;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Schaffner: " + schaffner + ", Anzahl Wagen: " + anzahlWagen + ", Anzahl Sitzpl�tze pro Wagen: " + anzahlSitzplaetzeProWagen;
	}

	
	
	

}
