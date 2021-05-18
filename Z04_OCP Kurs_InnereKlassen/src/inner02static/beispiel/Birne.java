package inner02static.beispiel;

public class Birne implements Obst {

	private int anzahl;
	
	public Birne() {
		this(2);
	}

	public Birne(int anzahl) {
		this.anzahl = anzahl;
	}

	@Override
	public int getAnzahl() {
		return this.anzahl;
	}

}
