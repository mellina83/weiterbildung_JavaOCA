package allumfassendeAufgaben;


public abstract class Verkehrsmittel implements Comparable<Verkehrsmittel> {
	private int liniennummer;
	private String fahrername;
	private String start;
	private String ende;
	
	public Verkehrsmittel() {
		
	}
	
	public Verkehrsmittel(int liniennummer, String fahrername, String start, String ende) {
		setLiniennummer(liniennummer);
		setFahrername(fahrername);
		setStart(start);
		setEnde(ende);
	}
	
	@Override
	public boolean equals(Object obj) {
		Verkehrsmittel obj1 = this;
		Verkehrsmittel obj2 = (Verkehrsmittel) obj; // Downcast aus Verkehrsmittel
		return ( obj1.getLiniennummer() == obj2.getLiniennummer());
	}

	public String toString() {
		return this.getClass().getSimpleName() + " Linie " + getLiniennummer() + " hat Fahrer: " + getFahrername() + ". Start: " + getStart() + ", Ende: " + getEnde() + ".";
	}
	
	
	@Override
	public int compareTo(Verkehrsmittel v) {
		return this.liniennummer - v.liniennummer;
	}
	
	
	public int getLiniennummer() {
		return liniennummer;
	}
	public void setLiniennummer(int liniennummer) {

		if (liniennummer <100 || liniennummer > 999 ) {
			throw new IllegalArgumentException("Liniennummern haben 3 Ziffern!");
		}
		this.liniennummer = liniennummer;
	}
	
	public String getFahrername() {
		return fahrername;
	}
	public void setFahrername(String fahrername) {
		
		if (fahrername ==null || fahrername.length() <2) {
			throw new IllegalArgumentException("Fahrername muss mindestens 2 Zeichen haben");
		}
		
		this.fahrername = fahrername;
	}

	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		
		if (start ==null || start.length() <2) {
			throw new IllegalArgumentException("Start muss mindestens 2 Zeichen haben");
		}	
		this.start = start;
	}

	public String getEnde() {
		return ende;
	}
	public void setEnde(String ende) {
		
		if (ende ==null || ende.length() <2) {
			throw new IllegalArgumentException("Ende muss mindestens 2 Zeichen haben");
		}	
		
		this.ende = ende;
	}



	
	

}
