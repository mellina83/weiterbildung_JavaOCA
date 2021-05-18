package classes_classes;

class Hund {
	private String name;
	private int alter;

	public Hund(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
	
	public int getAlter() {
		return alter;
	}
	
	public String getName() {
		return name;
	}
	
	/*
	 * Neue Definizion der toString() (sie wird überschrieben)
	 */
	public String toString() {
		return "Hund " + name + ", Alter: " + alter;
	}
	
} // end of Hund


class Katze {
	
} // end of Katze

public class B04_toString {

	public static void main(String[] args) {

		/*
		 * Oft möchte man beim Programmieren mit einer solchen Klasse wie Hund
		 * Objekte bilden, ändern und auf der Konsole sehen, 
		 * was für Werte die Attribute der Hund-Objekte haben
		 * 
		 */
		
		Hund h1 = new Hund("Bello", 5);
		
		// Aufwendig für den Programmierer, der auf die Klasse Hund programmiert:
		System.out.println( "Hund: " + h1.getName() + ", Alter: " + h1.getAlter() );
		
		// Bequem für den Programmierer, der auf die Klasse Hund programmiert:
		
		// diese println ruft toString zu der übergebenen Referenz auf
		System.out.println( h1 );  // Hund Bello, Alter: 5
		
		String text = h1.toString();
		System.out.println( text ); // Hund Bello, Alter: 5
	
		Katze k1 = new Katze();
		// die Klasse Katze überschreibt die toString nicht
		System.out.println(k1);  // classes.Katze@41a4555e
		System.out.println(k1.toString()); // classes.Katze@41a4555e
		
	} // end of main

}
