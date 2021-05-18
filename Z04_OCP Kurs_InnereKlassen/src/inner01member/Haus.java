package inner01member;

public class Haus {

	private String eigentuemer = "Hauseigentuemer";

	public class Raum {
		public String eigentuemer = "Raumeigentuemer";

		public static final String staticAttr = "static Attr";

		void ok() {
			System.out.println(eigentuemer);
		}

		void leseVonHaus() {
			System.out.println(eigentuemer);// "Nicht ich"
			System.out.println(this.eigentuemer);// "Nicht ich"
			System.out.println(Haus.this.eigentuemer);// "Ich"
		}
		
		Haus getHaus() {
			return Haus.this;
		}

		/*
		 * The method doStuff cannot be declared static;
		 * 
		 * static methods can only be declared in a static or top level type
		 */
//		static void doStuff() {		}
	}

	public static void main(String[] args) {
		/*
		 * Instanziierung von Raum in 2 Schritten
		 */

		// Schritt 1 - eine instanz der umgebenden Klasse erzeugen
		Haus refHaus = new Haus();

		// Schritt 2 - mit der Referenz der umgebenden Klasse und dem
		// nachgestellten new schlüsselwort können wir eine Instanz der inneren
		// Klasse erzeugen.
		Raum refRaum01Raum = refHaus.new Raum();
		Raum refRaum02Raum = refHaus.new Raum();
		Raum refRaum03Raum = refHaus.new Raum();
		Raum refRaum04Raum = refHaus.new Raum();
		refHaus.eigentuemer = "Comcave";
		refRaum01Raum.leseVonHaus();
		System.out.println("-------------");
		/*
		 *  Instanziierung von Raum in 1 Schritt
		 */
		Raum refRaumOne = new Haus().new Raum();
		refRaumOne.leseVonHaus();
		refRaumOne.getHaus().eigentuemer= "Finanzamt";
		refRaumOne.leseVonHaus();
	}
}
