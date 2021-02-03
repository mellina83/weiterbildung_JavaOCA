package klassen;



class Person {
	private String name;
	private String id;
	private JavaKurs kurs;
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
		
	}
	

	void teilnehmen(JavaKurs kurs) {
		this.kurs = kurs;
		
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public JavaKurs getKurs() {
		return kurs;
	}
	
	public void setKurs(JavaKurs kurs) {
		this.kurs = kurs;
	}
}

class Dozent extends Person {
	public Dozent (String name, String id) {
		super(name, id);
	}
	

}

class Teilnehmer extends Person {
	public Teilnehmer (String name, String id) {
		super(name, id);
	}
	
}


class JavaKurs {
	private int nummer;
	
	public JavaKurs (int nummer) {
		this.nummer = nummer;
		
	}
	
	public int getNummer () {
		return nummer;
	}
	

}




public class AufgabeVererbungDozent {
	

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
		

	} // Ende Main

}
