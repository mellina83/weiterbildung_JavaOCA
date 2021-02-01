package arrays;

import arrays.hafen.Schiff;

class IntMatrix {
	private int zeile;
	private int spalte;
	private int wert;
	private int[][] array;
	
	public IntMatrix (int zeile, int spalte) {
		this.zeile = zeile;
		this.spalte = spalte;
		this.array = new int[zeile] [spalte];
		
		
	}
	
	IntMatrix (int zeile, int spalte, int wert) {
		this.zeile = zeile;
		this.spalte = spalte;
		this.wert = wert;
		this.array = new int [zeile] [spalte];
		
	}
	
	
	
	public String toString() { // String Rückgabetyp ist MUSS!
		for (int i = 0; i < this.array.length; i++) {
			for (int j = 0; j < this.array[i].length; i++) {
				System.out.println(this.array[i][j] + " ");
				
			}
		}
		return "1";
	}
} // Ende Klasse

public class AufgabeIntMatrix {

	public static void main(String[] args) {
		
		/*
		 * Erstellen Sie eine Klasse 'IntMatrix', die eine Matrix von int-Elementen definiert.
		 * Beim Testen in einer main-Methode sollen folgende Aufgaben mit Hilfe der Klasse 'IntMatrix' gelöst werden:
		 * -A1 Erstellt eine IntMatrix mit 2 Zeilen und 3 Spalten
		 * -A2 Erstellt eine IntMatrix mit 5 Zeilen und 3 Spalten. Alle Elemente der IntMatrix sind mit dem Wert 100 initialisiert
		 * -A3 Ausdruck in Form {0,0,0} {0,0,0}
		 * -A4 Liefert den Wert an Stelle (1, 2) der IntMatrix (Zeile 1, Spalte 2)
		 * -A5 Erstellt eine IntMatrix mit 4 Zeilen und 6 Spalten. Alle Elemente werden zufällig initialisiert. Der erlaubte Wertebereich für die Elemente: 0 bis 200
		 */
		
		 //A1: IntMatrix mit 2 Zeilen und 3 Spalten:
		 IntMatrix m1 = new IntMatrix(2, 3);
		 
		 //A2: IntMatrix mit 5 Zeilen und 3 Spalten. Alle Elemente mit Wert 100 initialisiert:
		 IntMatrix m2 = new IntMatrix(5, 3, 100);
		 
		 //A3: Ausdruck in Form {0,0,0} {0,0,0}
		 System.out.println(m1);
		 
		 //A4: Methode m1.get
	    // int i = m1.get(1, 2);
		 
	     //A5: Erstellt Matrix mit Zufallszahlen. Parameter für Zeilen, Spalten, MaxBereich
	     //IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);
		 
	     //A6: Vergleich von Matrizen und ob gleiche Werte an den entsprechenden Stellen gespeichert. Die Matrizen mit ungleichen Dimensionen sind ungleich
	   //  m1.equals(m2);


	} // end of main
	
	

}
