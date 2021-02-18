package allumfassendeAufgaben;

public class Bus extends Verkehrsmittel {
	int sitzplaetze;
	
	public Bus() {
		
	}
	
	public Bus (int liniennummer, String fahrername, String start, String ende, int sitzplaetze) {
		super(liniennummer, fahrername, start, ende);
		setSitzplaetze(sitzplaetze);
		
	}
	
	public String toString() {
		return super.toString() + " Sitzplaetze: " + getSitzplaetze();
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		
		if (sitzplaetze < 0) {
			throw new IllegalArgumentException("Es kann nicht weniger als 0 Sitzplaetze geben");
		}
		
		this.sitzplaetze = sitzplaetze;
	}
	
	

}
