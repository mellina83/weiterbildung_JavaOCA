package basics_methoden;

/*
 * static Methode 'sayHello' hat:
 * 
 * 
 * 		static 		- 'global', überall ohne weiteres aufrufbar
 * 		void		- Rückgabetyp, in diesem Fall void
 * 		sayHello	- Name der Methode
 * 		()			- Liste der Parameter, in diesem Fall ist sie leer
 * 		{}			- Rumpf (body) der Methode
 * 
 * 		sayHello()	- Signatur
 * 
 * 	- Signatur: Methodenname + Liste der Parametertypen
 * 	- Signatur muss eindeutig sein
 */

class Greetings {
	
	/*
	 * Methode 'sayHello' definieren
	 */
	static void sayHello() {
		System.out.println("**************");
		System.out.println("*** Hallo! ***");
		System.out.println("**************");
	}
	
//	static void sayHello() {  // <- Compilerfehler: es gibt bereits eine 
							  // Methode mit derselben Signatur in der Klasse 
//	}
	
}

public class B01_StatischeMethodenDefinierenUndAufrufen {

	public static void main(String[] args) {

		/*
		 * Methode 'sayHello' aus der Klasse methoden.Greetings aufrufen 
		 */
		Greetings.sayHello();

		//...
		
		Greetings.sayHello();

		/*
		 * Methode 'printRandomNumber' aus der Klasse aufgaben.Utils aufrufen
		 */
		aufgaben.Utils.printRandomNumber();
		
	}

}
