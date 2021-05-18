package classes_aufgaben_geo;

public class Kreis {
	
	private int radius;

	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public String toString() {
		return "Kreis. R = " + radius;
	}
}
