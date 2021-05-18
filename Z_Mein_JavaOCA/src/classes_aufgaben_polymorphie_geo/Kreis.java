package classes_aufgaben_polymorphie_geo;

public class Kreis extends Figur {
	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public Kreis(int radius, int x, int y) {
		super(x, y);
		this.radius = radius;
	}
	
	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return "Kreis R = " + radius 
				+ ". " + super.toString();
	}
}
