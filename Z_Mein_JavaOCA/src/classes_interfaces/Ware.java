package classes_interfaces;

public abstract class Ware implements Comparable<Ware>{
	
	private String bezeichnung;
	private int preis;
	
	public Ware() {}
	public Ware(String bezeichnung, int preis) {
		this.setBezeichnung(bezeichnung);
		this.setPreis(preis);
	}
	
	public String getBezeichnung() {
		return this.bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public int getPreis() {
		return this.preis;
	}
	public void setPreis(int preis) {
		if (preis < 0) {
			throw new IllegalArgumentException("Preis darf nicht negativ sein:  + preis");
		}
		this.preis = preis;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ": " + bezeichnung + ", Preis: " + preis / 100.0;
	}
	
	@Override
	public int compareTo(Ware ware) {
//		Vergleich nach Bezeichnung der Ware: R�ckgabe negative Zahl, wenn Bezeichnung von this "kleiner" als Bezeichnung von ware
//		R�ckgabe 0, wenn Bezeichnung von this "gleich" Bezeichnung von ware
//		R�ckgabe positive Zahl, wenn Bezeichnung von this "gr��er" als Bezeichnung von ware.
//		return this.bezeichnung.compareTo(ware.bezeichnung);
		return ware.preis - this.preis;
	}

}
