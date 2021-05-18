package arrays_aufgaben;

/*public*/class Kreis {
	private int radius;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
}

public class KleineAufgabeKreise {

	public static void main(String[] args) {
		
		/*
		 * Jeder Kreis hat Radius (int).
		 * 
		 * Speichern Sie 100 Kreise in einem Array.
		 * Alle Kreise aus dem Array sollten unterschiedlichen Radius-Werte haben.
		 * 
		 * Danach alle Kreise durchnummeriert untereinander ausgeben.
		 * 
		 * 1. Kreis, R=1
		 * 2. Kreis, R=3
		 * 3. Kreis, R=5
		 * ...
		 */
		Kreis[] arrayKreise = new Kreis[100];
		
		for (int i = 0, radius = 1; i < arrayKreise.length; i++, radius+=2) {
			arrayKreise[i] = new Kreis(radius);
		}
		
		for(int i=0; i<arrayKreise.length; i++) {
			Kreis k = arrayKreise[i];
			System.out.println(i+1 + ". Kreis, R=" + k.getRadius());
		}

	} // end of main

}
