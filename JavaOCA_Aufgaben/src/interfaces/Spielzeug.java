package interfaces;

public class Spielzeug extends Ware implements Verleihbar {
	private int mindestalter;
	private int verleihpreis;
	

	public Spielzeug() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Spielzeug(String bezeichnung, int preis, int mindestalter) {
		super(bezeichnung, preis);
		this.mindestalter = mindestalter;
		// TODO Auto-generated constructor stub
	}

	public int getMindestalter() {
		return mindestalter;
	}

	public void setMindestalter(int mindestalter) {
		this.mindestalter = mindestalter;
	}
	
	public String toString() {
		return super.toString() + ", Mindestalter: " + getMindestalter();
	}
	
	public int getVerleihpreis() {
		return verleihpreis;
	}
	public void setVerleihpreis(int verleihpreis) {
		this.verleihpreis = verleihpreis;
	}
	
}
