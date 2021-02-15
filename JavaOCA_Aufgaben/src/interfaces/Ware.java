package interfaces;


public abstract class Ware implements Comparable<Ware> {
	
	private String bezeichnung;
	private int preis;
	
	public Ware() {
		
	}
	
	
	public Ware(String bezeichnung, int preis) {
		super();
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}


	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + ": " + bezeichnung + " hat Preis: " + preis;
	}
	
	
	public int compareTo(Ware ware) {
//		Vergleich nach Bezeichnung der Ware: Rueckgabe negative Zahl, wenn Bezeichnung von this "kleiner" als Bezeichnung von ware
//		Rueckgabe 0, wenn Bezeichnung von this "gleich" Bezeichnung von ware
//		Rueckgabe positive Zahl, wenn Bezeichnung von this "groesser" als Bezeichnung von ware.
//		return this.bezeichnung.compareTo(ware.bezeichnung);
		return this.preis - ware.preis;
		
	}

	

}
