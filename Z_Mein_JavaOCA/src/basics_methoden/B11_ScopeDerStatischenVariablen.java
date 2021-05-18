package basics_methoden;

public class B11_ScopeDerStatischenVariablen {
	
	static int count; // wird implizit mit 0 initialisiert 

	public static void main(String[] args) {

		/*
		 * count aus B11 
		 */
		System.out.println("*** count aus B11: ");
		System.out.println("1. count: " + count); // 0
		System.out.println("2. count: " + B11_ScopeDerStatischenVariablen.count); // 0
		
		count++;
		System.out.println("3. count: " + count); // 1
		
		/*
		 * count aus Blumen
		 */
		System.out.println("*** count aus Blumen: ");
		System.out.println("4. " + Blumen.count); // 12

		
		Blumen.count++;
		System.out.println("5. " + Blumen.count); // 13
		
		/*
		 * Bsp. statischer Konstanten
		 */
		System.out.println("*** statische Konstanten: ");
		System.out.println("Blumen.MAX_COUNT: " + Blumen.MAX_COUNT);
		System.out.println("Math.PI: " + Math.PI);
		
	} 

}
