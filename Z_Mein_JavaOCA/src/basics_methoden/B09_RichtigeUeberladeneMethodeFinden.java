package basics_methoden;

public class B09_RichtigeUeberladeneMethodeFinden {

	public static void main(String[] args) {

		int x = 12;

		print(x);

		short y = 12;
		
		print((byte)y);
		
		/*
		 * nicht in der Pr�fung:
		 */
//		print(12, 13); // Compilerfehler: ambiguous (zweideutig)
		print(12, (long)13);
		print((long)12, 13);
		
	} // end of main

	static void print(float x) { System.out.println("float"); }
	static void print(byte x) { System.out.println("byte"); }
	static void print(int x) { System.out.println("int"); }

	/*
	 * Suche nach der richtigen Methode:
	 * 
	 * 	- Die Reihenfolge in der die Methoden in der Klasse stehen ist EGAL
	 * 
	 *  - folgende Schritte geht der Compiler durch um die passende Methode zu finden:
	 *  
	 *  	1. Parametertyp ist exakt gleich dem Argumenten Typ
	 *  
	 *  	2. Widening (Argumenttyp erweitern):
	 *  		byte -> short -> int -> long -> float -> double
	 *  
	 *  	3. Widening schl�gt Boxing. Boxing schl�gt varargs. Widening plus Boxing nicht m�glich!
	 *  	  
	 *  	
	 * 
	 */
	
	/*
	 * Nicht empfohlen f�r die Praxis
	 */
	static void print(int a, long b) { System.out.println("int, long"); }
	static void print(long a, int b) { System.out.println("long, int"); }
	
}
