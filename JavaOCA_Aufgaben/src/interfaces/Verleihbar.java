package interfaces;

// Interface = Schnittstelle
// Bis Java 8: ein Interface ist ein vollst�ndig abstrakter Typ (implizit abstract)
// Es gab nur Klassenkonstanten und abstrakte Methoden (implizit public)

public interface Verleihbar {
	
	int VERLEIHDAUER = 7; // implizit public static final
	
	int getVerleihpreis(); // implizit public abstract
	
	void setVerleihpreis(int preis);

}
