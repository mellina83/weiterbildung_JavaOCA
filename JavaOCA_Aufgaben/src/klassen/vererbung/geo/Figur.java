package klassen.vererbung.geo;

//Abstrakt: Als Countainer nur für gemeinsamen Code, aber Objekte daraus sollen nicht erstellt werden?

public abstract class Figur {
	
	private int x, y;
	
	public void bewegen(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	

	public abstract double getFlaeche();
	// Abstract! Meine Lösung: return flaeche und vorab int flaeche als Attribut definiert, auch wenn sie nicht benötigt wird, da die Subklassen unterschiedlich sind
	
	public String toString() {
		return "Koordinaten der Figur: " + getX() + " & " + getY() + ". Fläche " + getFlaeche();
	}
	


}
