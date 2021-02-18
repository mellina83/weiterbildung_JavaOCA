package allumfassendeAufgaben;

public class Bahn extends Verkehrsmittel {
	String schaffnername;
	int wagenzahl;
	int sitzplaetzeProWagen;
	
	public Bahn (int liniennummer, String fahrername, String start, String ende, String schaffnername, int wagenzahl, int plaetzeProWagen) {
		super(liniennummer, fahrername, start, ende);
		setSchaffnername(schaffnername);
		setWagenzahl(wagenzahl);
		setSitzplaetzeProWagen(plaetzeProWagen);
		
	}
	
	public String toString() {
		return super.toString() + " Schaffner: " + getSchaffnername() + ". Wagen: " + getWagenzahl() + " x Sitzplaetze: " + getSitzplaetzeProWagen();
	}
	
	public String getSchaffnername() {
		return schaffnername;
	}
	public void setSchaffnername(String schaffnername) {
		this.schaffnername = schaffnername;
	}
	public int getWagenzahl() {
		return wagenzahl;
	}
	public void setWagenzahl(int wagenzahl) {
		
		if (wagenzahl < 0) {
			throw new IllegalArgumentException("Es kann nicht weniger als 0 Wagen geben");
		}
		this.wagenzahl = wagenzahl;
	}
	public int getSitzplaetzeProWagen() {
		return sitzplaetzeProWagen;
	}
	public void setSitzplaetzeProWagen(int sitzplaetzeProWagen) {
		
		if (sitzplaetzeProWagen < 0) {
			throw new IllegalArgumentException("Darf nicht weniger 0 sein.");
		}
		
		this.sitzplaetzeProWagen = sitzplaetzeProWagen;
	}
	
	

	
	
}
