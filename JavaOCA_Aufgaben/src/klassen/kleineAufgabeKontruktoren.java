package klassen;

/*
 * NamePrinter ist die neue Klasse
 * 
 * Objekte dieser Klasse werden einen beliebigen Namen mehrmals untereinander ausgeben müssen.
 * 
 * Bitte mit Konstruktur
 * 
 * z. B. wird Name Printer Nr. 1 den Namen 'Tom' 10 mal untereinander ausgeben,
 * wenn der NamePrinter Nr. 1 aktiviert wird (seine Instanzmethode aufgerufen wird).
 * 
 * Tom
 * Tom
 * ... insgesamt 10x
 * 
 * 
 * z. B. wird NamePrinter Nr. 2 den Namen 'Jerry' 3x untereinander ausgeben,
 * wenn der NamePrinter Nr. 2 aktiviert wird (seine Instanzmethode ausgerufen wird):
 * 
 * Jerry
 * Jerry
 * Jerry
 */

class NamePrinter {
	String name;
	int wiederholung;
	
	//Wenn man die Attribute geheim halten möchte, nur für sich sichtbar machen möchte. Ich verbiete hier, damit weiterzuprogrammieren.
	// private String name;
	// private int wiederholung;
	
	//Konstruktor
	NamePrinter(String name, int wiederholung) {
		this.name = name;
		this.wiederholung = wiederholung;
	}
	
	//Instanzmethode:
	void nameWiederholen() {
		for (int i = 0; i < wiederholung; i++) {
			System.out.println(name);
		}
		System.out.println();
	}
	
} // Ende Class NamePrinter

public class kleineAufgabeKontruktoren {

	public static void main(String[] args) {
		NamePrinter nameprinter1 = new NamePrinter("Tom", 10);
		// nameprinter1.name = "Tom"; -> gespart durch Konstruktor
		// nameprinter1.wiederholung = 10; -> gespart durch Konstruktor
		
		NamePrinter nameprinter2 = new NamePrinter("Jerry", 3);
				
		nameprinter1.nameWiederholen();
		nameprinter2.nameWiederholen();

	} // Ende Main

}
