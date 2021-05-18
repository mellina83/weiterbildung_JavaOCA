package classes_aufgaben_polymorphie_geo;

public abstract class Figur {
	private int x, y;
	
	public Figur() {
	}
	
	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void bewegen(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double getFlaeche() ;
	
	@Override
	public String toString() {
		return "Koordinaten [" + x + ", " + y + "]";
	}
}
