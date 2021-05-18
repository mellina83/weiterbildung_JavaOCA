package classes_aufgaben;

class NamePrinter {
	private String nameToPrint;
	private int count;
	
	NamePrinter(String nameToPrint, int count) {
		this.nameToPrint = nameToPrint;
		this.count = count;
	}
	
	void print() {
		for (int i = 0; i < count; i++) {
			System.out.println(nameToPrint);
		}
	}
}

public class KleineAufgabeKonstruktoren {

	/*
	 * 'NamePrinter' ist die neue Klasse.
	 * 
	 * Objekte dieser Klasse werden einen beliebigen Namen 
	 * mehrmals untereinander ausgeben müssen.
	 * 
	 * z.B. wird NamePrinter Nr. 1 den Namen 'Tom' 10 mal untereinander ausgeben, 
	 * wenn der NamePrinter Nr. 1 aktiviert wird (seine Instanzmethode aufgerufen wird):
	 * 
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * Tom
	 * 
	 * z.B. wird NamePrinter Nr. 2 den Namen 'Jerry' 3 mal untereinander ausgeben, 
	 * wenn der NamePrinter Nr. 2 aktiviert wird (seine Instanzmethode aufgerufen wird):
	 * 
	 * Jerry
	 * Jerry
	 * Jerry
	 * 
	 * Bitte mit einem Kostruktor die Einstellungen eines NamePrinter-Objektes festlegen
	 * (welcher Name und wie oft ausgegeben werden soll).
	 */
	public static void main(String[] args) {
		
		NamePrinter p1 = new NamePrinter("Tom", 10);
		// p1.nameToPrint = "Tom";
		// p1.count = 10;
		p1.print();

		NamePrinter p2 = new NamePrinter("Jerry", 3);
		p2.print();
				
	}

}
