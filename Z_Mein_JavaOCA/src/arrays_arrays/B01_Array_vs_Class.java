package arrays_arrays;

class Vektor {
	int x0, x1; //x2, x3, x4...
}

public class B01_Array_vs_Class {

	public static void main(String[] args) {


		/*
		 * v1 hat den Typ 'Vektor'
		 * 
		 * Das mit new erzeugete Vektor-Objekt hat 2 int-Attribute.
		 * Die Attribute haben Namen x0 und x1.
		 */
		Vektor v1 = new Vektor();
		
		
		/*
		 * a1 hat den Typ 'int[]'
		 * 
		 * Das mit new erzeugte int[]-Objekt hat 2+1 int-Attribute
		 * 
		 * 2 int-Attribute haben keine Namen, sondern ihre Positionen.
		 * 
		 * 1 int-Attribut gibt es in jedem Array. Sein Name ist 'length'
		 */
		int[] a1 = new int[2];
		
		/*
		 * Attribut x0 aus dem Vektor-Objekt lesen
		 */
		System.out.println("v1.x0 = " + v1.x0); // 0
		/*
		 * Attribut length aus dem int[]-Objekt lesen
		 */
		System.out.println("a1.length = " + a1.length); // 2
		/*
		 * Attribut ohne Namen von der nullten Position lesen
		 * Attribut ohne Namen von der ersten Position lesen
		 */
		System.out.println("a1[0] = " + a1[0]); // 0
		System.out.println("a1[1] = " + a1[1]); // 0
		
		/*
		 * Attribut x0 aus dem Vektor-Objekt ändern
		 */
		v1.x0 = -7;
		
		/*
		 * Attribut length aus dem int[]-Objekt ist konstant!
		 */
		// a1.length = 33; // Compilerfehler (final-Attribut darf nicht geändert werden)
		
		/*
		 * Attribut ohne Namen von der ersten Position des Arrays ändern 
		 * (es gibt auch Position 0, aber die bleibt unverändert)
		 */
		a1[1] = 333;
		
		kleineAufgabe();
		
	} // end of main
	
	static void kleineAufgabe() {
		System.out.println("*** kleine Aufgabe");
		/*
		 * Erzeugen Sie ein neues int-Array der Länge 10.
		 * 
		 * Geben Sie mit einer for-Schleife alle Elemente des Arrays aus
		 * 
		 */
		
		int[] array = new int[10];

		for(int i=0; i<array.length ;i++) {
			System.out.println(array[i]);
		}
	}

}
