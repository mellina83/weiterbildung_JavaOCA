package interfaces;

public class Lebensmittel extends Ware {
	private int kalorien;
	
	

	public Lebensmittel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lebensmittel(String bezeichnung, int preis, int kalorien) {
		super(bezeichnung, preis);
		this.kalorien = kalorien;
		// TODO Auto-generated constructor stub
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
