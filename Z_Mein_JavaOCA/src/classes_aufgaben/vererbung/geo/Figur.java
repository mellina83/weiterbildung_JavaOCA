package classes_aufgaben.vererbung.geo;

public class Figur {
	private int x, y;

	public void bewegen(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "Koordinaten: [" + getX() + ", " + getY() + "]";
	}
}
