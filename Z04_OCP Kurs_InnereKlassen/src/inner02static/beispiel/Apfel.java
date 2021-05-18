package inner02static.beispiel;

public class Apfel implements Obst {

	private int anzahl;
	
	public Apfel() {
		this(2);
	}

	public Apfel(int anzahl) {
		this.anzahl = anzahl;
	}

	@Override
	public int getAnzahl() {
		return this.anzahl;
	}

}
