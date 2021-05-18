package classes_aufgaben.vererbung;

/*
 * - Ein Java-Kurs hat eine Nummer.

	- Dozent hat einen Namen.
	- Dozent hat eine ID (String).
	- Dozent kann einen Java-Kurs leiten. 
	
	- Teilenehmer hat einen Namen.
	- Teilenehmer hat eine ID (String).
	- Teilenehmer kann an einem Java-Kurs teilnehmen. 

 */

class JavaKurs {
	private int nummer;

	public JavaKurs(int nummer) {
		this.nummer = nummer;
	}
	
	public int getNummer() {
		return nummer;
	}
} // end of JavaKurs

class PersonInJavaKurs {
	private String name;
	private String id;
	private JavaKurs kurs;
	
	public PersonInJavaKurs(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setKurs(JavaKurs kurs) {
		this.kurs = kurs;
	}
	
	public JavaKurs getKurs() {
		return kurs;
	}
} // end of Person

class Dozent extends PersonInJavaKurs {
	public Dozent(String name, String id) {
		super(name, id);
	}
	
} // end of Dozent

class Teilnehmer extends PersonInJavaKurs {
	public Teilnehmer(String name, String id) {
		super(name, id);
	}
	
} // end of Teilnehmer


public class AufgabeVererbungDozentTeilnehmer {

	public static void main(String[] args) {

		JavaKurs kurs = new JavaKurs(192314);
		
		Dozent d1 = new Dozent("Tom", "D1");
		System.out.println( "Dozent: " + d1.getName() ); // Tom
		
		d1.setKurs(kurs);
		System.out.println( "Sein Kurs: " + d1.getKurs().getNummer() ); // 192314
		
		Teilnehmer t1 = new Teilnehmer("Jerry", "T1");
		t1.setKurs(kurs);
		
		System.out.println("Teilnehmer: " + t1.getName());
		System.out.println("Teilnehmer belegt den Kurs: " + t1.getKurs().getNummer()); 
	}

}
