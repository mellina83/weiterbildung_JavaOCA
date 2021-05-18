package classes_interfaces;

// Interface = Schnittstelle
// Bis Java 8: ein Interface ist ein vollst�ndig abstrakter Typ (implizit abstract)
// Es gab nur Klassenkonstanten und abstrakte Methoden (implizit public)

public interface Verleihbar {
	
	int VERLEIHDAUER = 7; // implizit public static final
	
	int getVerleihpreis(); // implizit public abstract
	
	void setVerleihpreis(int preis);
	
	// seit Java 8
	// default = Standard, voreingestellt
	// implizit public
	
	// Achtung bei DDOD Deadly Diamond of Death: Wenn eine Klasse von zwei Interfaces je eine gleichnamige Default Methode erbt:
	// Ueberschreiben und konkreter Aufruf, zB ISuess.super
	default void printVerleihpreis() {
		System.out.format("%.2f �%n", getVerleihpreis() / 100.0); // 2 Nachkommastellen plus Zeilenumbruch
	}
	
	// seit Java 8
	// implizit public
	static void printVerleihdauer() {
		System.out.println(VERLEIHDAUER + " Tage");
	} 

}
