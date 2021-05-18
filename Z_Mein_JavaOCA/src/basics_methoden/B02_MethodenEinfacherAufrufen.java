package basics_methoden;


public class B02_MethodenEinfacherAufrufen {
	

	public static void main(String[] args) {

		/*
		 * Methode aufrufen, die in derselben Klasse definiert wurde:
		 */
		methoden.B02_MethodenEinfacherAufrufen.addAndPrint(); // mit dem vollqualifizierten Klassennamen 
		
		B02_MethodenEinfacherAufrufen.addAndPrint(); // mit dem 'einfachen' Klassennamen

		addAndPrint(); // ohne den Klassennamen
		
		
		/*
		 * Methode aufrufen, die in einer anderen Klasse definiert wurde:
		 */
		methoden.Greetings.sayHello();
		
		Greetings.sayHello(); // mit dem 'einfachen' Klassennamen
		
		// sayHello(); // ohne den Klassennamen: Compilerfehler
		
		
		/*
		 * Methode aus einer Klasse aus einem anderen Package
		 */
		aufgaben.Utils.printRandomNumber(); // mit dem vollqualifizierten Klassennamen
		
		// Utils.printRandomNumber(); // Compilerfehler (Klasse nicht gefunden)
		
		// printRandomNumber(); // Compilerfehler (Methode nicht gefunden)
	}

	
	static void addAndPrint() {
		int x = 2;
		int y = 3;
		
		int z = x + y;
		System.out.println("2 + 3 = " + z);
	}
}
