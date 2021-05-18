package classes_classes;

class Berg {
	int hoehe;
	
	Berg(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public String toString() {
		return "Berg der Höhe " + hoehe;
	}
	
	/*
	 * Nach Vereinbarung wird die equals-Methode überschrieben um damit die Objekte
	 * nach ihren Inhalten (Attributen) zu vergleichen.
	 */
	public boolean equals(Object obj) {
		Berg b1 = this;
		Berg b2 = (Berg)obj;
		
		return b1.hoehe == b2.hoehe; // <- Attribute werden vergliechen
	}
	
} // end of Berg

public class B05_equals {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 3;
		
		System.out.println("x == y: " + (x==y)); // true

		Berg b1 = new Berg(100);
		Berg b2 = new Berg(100);
		
		System.out.println("b1 == b2: " + (b1==b2)); // false (Referenzenvergleich)
		
		boolean result = b1.equals(b2);
		System.out.println("b1.equals(b2): " + result); // true (Vergleich nach Inhalten)
		
	}

}
