package arrays;

public class AufgabeVarargs {

	public static void main(String[] args) {
		
		/*
		 * A1
		 * Definieren Sie eine Methode `produkt`, die 'beliebig viele' übergebene int-Werte untereinander multipliziert und das Ergebnis zurück liefert.
		 * Sie dürfen das mögliche 'int overflow' bei dieser Aufgabe ignorieren.
		 * Falls keine Argumente übergeben werden, soll die Methode 1 zurück liefern.
		 */
		System.out.println("Aufgabe 1:");
		int result = produkt();
		System.out.println(result);
		result = produkt(3, 4, 2);
		System.out.println(result);
		
		
		/*
		 * A2
		 * Definieren Sie eine Methode `concat`, die 'beliebig viele' übergebene Strings
		 * zu einem Gesamtstring konkateniert und ihn dann zurück liefert.
		 */
		
		System.out.println("\nAufgabe 2:");
		String kette = concat("Du", "bist", "Programmierer");
		System.out.println(kette);
		kette = concat();
		System.out.println(kette);
		
		
		/*
		 * A3
		 * Überladen Sie die Methode `concat`, die 'beliebig viele' übergebene Strings zu einem Gesamtstring konkateniert und ihn dann zurück liefert.
		 * Zusätzlich bekommt die neue Methode als Argument den String 'delimeter',
		 * der im Gesamtstrings zwischen den einzelnen konkatenierten Unterstrings steht. 
		 * Z.B. wird die neue Methode die Strings "mo", "di" und "mi" mit dem delimeter ", " zu dem String "mo, di, mi" konkatenieren.
		 * 
		 * Hat bei mir nicht mit überladen geklappt!!!!!
		 * Ist klar, die Zeichen kann man ja auch in die erste concat-Variante kopieren
		 * Meine Überlegung: Char reinnehmen, aber das geht nicht bei nur einer Methode, wenn ein Wert zurückgegeben werden soll.
		 */
		
		System.out.println("\nAufgabe 3:");
		kette = concat2("-", "Mo", "Di", "Mi");
		System.out.println(kette);
		kette = concat2("!", "Do", "Re", "Mi", "Fa");
		System.out.println(kette);
		
		

	} // Ende of Main
	
	//A1 Multiplikation aller Werte
	static int produkt(int... values) {
		int produkt = 1;
		for (int element : values) {
			produkt *= element;
		}
		return produkt;
	}
	
	//A2 String Kette
	static String concat(String...strings) {
		String kette = "";
		for (String element: strings) {
			kette += element + " ";
		}
		return kette;
	}
	
	//A3 String Kette mit extra Parameter für Trennzeichen
	
	static String concat2(String delimiter, String... strings) {
		String trennzeichen = delimiter;
		String kette = "";
		int letzterwert = 0;
		
		for (int i = 0; i<strings.length -1; i++) {
			kette += strings[i] + trennzeichen;
			letzterwert = strings.length - 1;
		}
		kette = kette + strings[letzterwert];

		return kette;
		
		// result.substring(0,
		//result.lastIndexOf(',');
		
	}


}
