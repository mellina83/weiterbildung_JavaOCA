package classes_aufgaben.vererbung.geo;

public class Kreis extends Figur {
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Kreis. R = " + radius 
				+ ". " + super.toString();
	}
}
