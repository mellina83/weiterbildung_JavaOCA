package arrays_arrays;

class Auto {
	private int baujhar;

	public Auto(int baujhar) {
		this.baujhar = baujhar;
	}
	
	public void setBaujhar(int baujhar) {
		this.baujhar = baujhar;
	}
	
	public String toString() {
		return "Auto von " + baujhar;
	}
}

public class B05_ArraysMitReferenzen {

	/*
	 * Arrays mit Referenzen speichern keine Objekte!
	 * 
	 * Elemente in einem Array mit Referenzen sind Referenzen!
	 */
	public static void main(String[] args) {

		System.out.println("*** Test mit einem String[]");
		
		String[] arrStr = { "Mo", "Di", null, "Do" }; // Array hat 4 Referenzen.
		
		for (String s : arrStr) {
			System.out.println(s);
		}
		
		arrStr[0] = "Montag";
		arrStr[2] = "Mi";
		
		System.out.println("* nochmal:");
		
		for (String s : arrStr) {
			System.out.println(s);
		}
		
		System.out.println("*** Test mit Auto[]");
		
		Auto[] arrAutos = new Auto[3]; // <- keine Autos erzeugt, Array hat 3 Referenzen
		
		System.out.println("1. autos: ");
		for (Auto auto : arrAutos) {
			System.out.println(auto);
		}
		
		Auto a1 = new Auto(2001);
		arrAutos[0] = a1;
		arrAutos[1] = new Auto(2012);
		arrAutos[2] = a1; // nochmal die Referenz a1 kopieren (nicht empfohlen)
		
		System.out.println("2. autos: ");
		for (Auto auto : arrAutos) {
			System.out.println(auto);
		}
		
		// Auto ändern
		System.out.println("a1: " + a1); // Auto von 2001
		
		arrAutos[0].setBaujhar(1997); // <- Auto ändern
		
		System.out.println("a1: " + a1); // Auto von 1997
		
		System.out.println("3. autos: ");
		for (Auto auto : arrAutos) {
			System.out.println(auto);
		}
		
		// Nochmal eine Stelle überschreiben:
		arrAutos[2] = new Auto(1880);
		
		System.out.println("4. autos: ");
		for (Auto auto : arrAutos) {
			System.out.println(auto);
		}
	} // end of main

}
