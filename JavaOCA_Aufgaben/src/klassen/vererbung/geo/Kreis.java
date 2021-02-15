package klassen.vererbung.geo;

public class Kreis extends Figur {
	
	private int radius;
	// wegen Math.PI nicht nötig: final double pi = 3.141593;
	
	Kreis(int radius) {
		this.radius = radius;
	}
	
	Kreis(int radius, int x, int y) {
		this.radius = radius;
		
		//üblich mit setter Methoden
		setX(x);
		setY(y);
		
		//oder möglich:
		//bewegen(x,y);
	}
	
	//geerbt: getter und setter Methoden
	//geerbt: getFlaeche()
	
	//geerbt: bewegen (x,y)
	
	//"überschrieben" aber abstrakt
	public double getFlaeche () {
		return (Math.PI  * radius);
	}
	
	//überschrieben:
	public String toString() {
		return "Radius vom Kreis: " + radius + ". Fläche " + getFlaeche() + " . " + super.toString();
	}

}
