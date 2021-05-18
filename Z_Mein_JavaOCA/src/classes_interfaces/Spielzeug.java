package classes_interfaces;

public class Spielzeug extends Ware implements Verleihbar{

	private int mindestalter;
	private int verleihpreis;
	
	public Spielzeug() {}

	public Spielzeug(String bezeichnung, int preis, int mindestalter) {
		super(bezeichnung, preis);
		this.setMindestalter(mindestalter);
	}

	public int getMindestalter() {
		return mindestalter;
	}

	public void setMindestalter(int mindestalter) {
		if (mindestalter < 1) {
			throw new IllegalArgumentException("Mindestalter muss mind. 1 sein: " + mindestalter);
		}
		this.mindestalter = mindestalter;
	}
	
	public String toString() {
		return super.toString() + ", Mindestalter: " + mindestalter;
	}

	@Override
	public int getVerleihpreis() {
		return this.verleihpreis;
	}

	@Override
	public void setVerleihpreis(int verleihpreis) {
		this.verleihpreis = verleihpreis;		
	}
	
}
