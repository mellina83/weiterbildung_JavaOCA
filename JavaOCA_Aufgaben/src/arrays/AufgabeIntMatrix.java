package arrays;

import java.util.Arrays;
import java.util.Random;

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
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j<array[i].length; j++) {
				array[i][j] = wert;
			}
		}
		
	}
	
	public int getWert(int zeile, int spalte) {
		return (array[zeile] [spalte]);
	}
	
	public void printMatrix() {
		for (int i = 0; i<array.length;i++) {
			for (int j = 0; j<array[i].length - 1;j++) { // Eine Zahl früher aufhören für Kommata an letzter Stelle
				System.out.print(array[i][j] + ", ");
				
			}
			System.out.println(array[i][array[i].length-1]); // das letzte Element
		}
	}
	
	/*
	public String toString() { // String Rückgabetyp ist MUSS!
		printMatrix();
		return
	*/
		
	public void getRandomMatrix(int zeile, int spalte, int wert) {
		Random random = new Random();
		
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; 0<array[i].length; j++) {
				int zufallszahl = random.nextInt(wert);
				array[i][j] = zufallszahl;
			}
		}
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		IntMatrix m1 = this;
		IntMatrix m2 = (IntMatrix)obj;
		return m1.zeile == m2.zeile && m1.spalte == m2.spalte && m1.wert == m2.wert;
	}
		
	
	
	
} // Ende Klasse

public class AufgabeIntMatrix {

	public static void main(String[] args) {
		
		/*
		 */
		
		 //A1: IntMatrix mit 2 Zeilen und 3 Spalten:
		 IntMatrix m1 = new IntMatrix(2, 3);
		 
		 //A2: IntMatrix mit 5 Zeilen und 3 Spalten. Alle Elemente mit Wert 100 initialisiert:
		 IntMatrix m2 = new IntMatrix(5, 3, 100);
		 
		 //A3: Ausdruck in Form {0,0,0} {0,0,0}
		// System.out.println(m1); Schaffe ich nicht in dieser Form
		 m1.printMatrix();
		 
		//A4: Methode m1.get: Liefert den Wert an Stelle (1,2) der Int Matrix (Zeile 1, Spalte 2)
	    int k = m1.getWert(1, 2);
	    System.out.println(k);
	    
	    k = m2.getWert(2, 2);
	    System.out.println(k);
		 
	     //A5: Erstellt Matrix mit Zufallszahlen. Parameter für Zeilen, Spalten, MaxBereich: 4 Zeilen, 6 Spalten, Wertebereich 0 bis 200
	    //IntMatrix m3 = IntMatrix.getRandomMatrix(4, 6, 200);
		 
	     //A6: Liefert true, falls die Matrizen die gleichen Werte an den entsprechenden Stellen gespeichert haben. Die Matrizen mit ungleichen Dimensionen sind ungleich:
	    System.out.println(m1.equals(m2));


	} // end of main
	
	

}
