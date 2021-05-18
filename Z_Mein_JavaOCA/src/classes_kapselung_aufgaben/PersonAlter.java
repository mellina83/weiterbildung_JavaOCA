package classes_kapselung_aufgaben;

public class PersonAlter {
	private String vorname;
	private String nachname;
	private int alter;
	private String postleitzahl;
	
	public PersonAlter() {
		this("Petra", "Mustermann", 49, "12345");
	}
	public PersonAlter(String vorname, String nachname, int alter, String postleitzahl) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setAlter(alter);
		this.setPostleitzahl(postleitzahl);	
	}
	
	public String getVorname() {
		return this.vorname;
	}
	
//	Beim setter wird h�ufig Shadowing (Verdecken) angewendet. Das bedeutet, der Name des Parameter/Arguments mit dem Namen der Instanzvariablen �bereinstimmt
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return this.nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	public void setAlter(int alter) {
		if (alter < 18 || alter >= 100) {
			throw new IllegalArgumentException("alter muss zwischen 18 und 99 liegen: " + alter);
		}
		this.alter = alter;
	}
	
	public String getPostleitzahl() {
		return this.postleitzahl;
	}
	
	public void setPostleitzahl(String postleitzahl) {
//		if (postleitzahl.length() != 5 ) {
//			throw new IllegalArgumentException("postleitzahl muss genau 5 Zeichen haben: " + postleitzahl);
//		}
//		for (char zeichen : postleitzahl.toCharArray()) {
//			if (!Character.isDigit(zeichen)) {
//				throw new IllegalArgumentException("postleitzahl darf nur aus Ziffern bestehen: " + postleitzahl);
//			}
//		}
		// OCP: regul�re Ausdr�cke, genau f�nf Ziffern
		if (!postleitzahl.matches("\\d{5}")) {
			throw new IllegalArgumentException("postleitzahl muss genau 5 Zeichen haben und darf nur aus Ziffern bestehen: " + postleitzahl);
		}
			
		this.postleitzahl = postleitzahl;
	}
	
	@Override
	public String toString() {
		return "Person: " + vorname + " " + nachname + ", Alter: " + alter + ", Postleitzahl: " + postleitzahl;
	}
	
}
