package classes_kapselung_aufgaben;

public abstract class Verkehrsmittel implements Comparable<Verkehrsmittel>{
	
	private int liniennummer;
	private String fahrer;
	private String start;
	private String ziel;
	
	public Verkehrsmittel() {}

	public Verkehrsmittel(int liniennummer, String fahrer, String start, String ziel) {
		this.setLiniennummer(liniennummer);
		this.setFahrer(fahrer);
		this.setStart(start);
		this.setZiel(ziel);
	}

	public int getLiniennummer() {
		return liniennummer;
	}

	public void setLiniennummer(int liniennummer) {
		if (liniennummer < 1) {
			throw new IllegalArgumentException("Liniennummer muss positiv sein: " + liniennummer);
		}
		this.liniennummer = liniennummer;
	}

	public String getFahrer() {
		return fahrer;
	}

	public void setFahrer(String fahrer) {
		if (fahrer == null || fahrer.length() < 2) {
			throw new IllegalArgumentException("Fahrer muss mind. 2 Zeichen enthalten: " + fahrer);
		}
		this.fahrer = fahrer;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		if (start == null || start.length() < 2) {
			throw new IllegalArgumentException("Start muss mind. 2 Zeichen enthalten: " + start);
		}
		this.start = start;
	}

	public String getZiel() {
		return ziel;
	}

	public void setZiel(String ziel) {
		if (ziel == null || ziel.length() < 2) {
			throw new IllegalArgumentException("Ziel muss mind. 2 Zeichen enthalten: " + ziel);
		}
		this.ziel = ziel;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName().replace("_","-") +  " Linie " + liniennummer + ", Fahrer: " + fahrer + ", Start: " + start + ", Ziel: " + ziel;
	}
	
	@Override
	public boolean equals(Object o) {
		return this.liniennummer == ((Verkehrsmittel) o).liniennummer;
	}
	
	@Override
	public int compareTo(Verkehrsmittel v) {
		return this.liniennummer - v.liniennummer;
	}
	

}



