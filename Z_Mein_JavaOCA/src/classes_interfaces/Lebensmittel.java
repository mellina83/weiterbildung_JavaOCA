package classes_interfaces;

public class Lebensmittel extends Ware{

	private int kalorien;
	
	public Lebensmittel() {}

	public Lebensmittel(String bezeichnung, int preis, int kalorien) {
		super(bezeichnung, preis);
		this.setKalorien(kalorien);
	}

	public int getKalorien() {
		return kalorien;
	}

	public void setKalorien(int kalorien) {
		this.kalorien = kalorien;
	}
	
	public String toString() {
		return super.toString() + ", Kalorien: " + kalorien;
	}
	
}
