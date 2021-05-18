package classes_classes;

class GlobaleAutos {
	/*
	 * statische ('globale') Autos sind möglich aber nicht empfohlen
	 */
	
	static String farbe1 = "grün";
	static int x1 = 0;
	static int y1 = 0;
	
	static String farbe2 = "orange";
	static int x2 = 0;
	static int y2 = 0;
}

public class B00_AutosOhneKlassen {

	/*
	 * Aufgabe: Autos simulieren.
	 * 
	 * 	- Jedes Auto hat eine Farbe
	 *  - Jedes Auto hat Koordinaten x und y
	 *  - Jedes Auto lässt seine Koordinaten ändern
	 *  
	 *  - Jedes Auto kann auf der Console präsentiert werden
	 *  
	 */
	public static void main(String[] args) {

		// 1. Auto entsteht:
		String farbe = "blau";
		int x = 0;
		int y = 0;
		printAuto(farbe, x, y);
		
		// Auto 1 wird bewegt:
		x = 5;
		y = 3;
		
		printAuto(farbe, x, y); // x = 5, y = 3 

		//2. Auto entsteht
		String farbe2 = "rot";
		int x2 = 0;
		int y2 = 0;
		
		// printAuto(farbe2, x, y2); // Bug hier!
		printAuto(farbe2, x2, y2); 

		// Auto 2 wird bewegt:
		int delatX2 = 7;
		int delatY2 = -3;
		x2 += delatX2;
		y2 += delatY2;
		
		printAuto(farbe2, x2, y2); // x = 7, y = -3
		
	} // end of main
	
	static void printAuto(String farbe, int x, int y) {
		System.out.println("Auto. Farbe: " + farbe + ". Koordinaten: " + x + ", " + y);
	}
	
	/*
		Eine solche Methode wird die Autos aus der main nicht bewegen können,
		da sie die VAriablen der main-Methode nicht ändern kann:
		
		static void fahrenAuto(int x, int y, int deltaX, int deltaY) {
			x += deltaX;
			y += deltaY;
		}
	*/
	
	/*
		Eine solche Methode kann zwar globale (statische) Autos bewegen, ist
		aber sehr unschön (nicht flexibel, unlesbar...):
		
		static void fahrenGlobalesAuto(int autoNummer, int deltaX, int deltaY) {
			switch (autoNummer) {
				case 1:
					GlobaleAutos.x1 += deltaX;
					GlobaleAutos.y1 += deltaY;
					break;
				case 2:
					GlobaleAutos.x2 += deltaX;
					GlobaleAutos.y2 += deltaY;
					break;
				//...
				default:
					//...
					break;
			}
		}
	*/

}
