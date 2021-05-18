package classes_aufgaben;

public class AufgabeKlassenPerson {

	public static void main(String[] args) {

		Person p1 = new Person("Paul", "McCartney");
		System.out.println(p1);

		Person p2 = new Person("John", "Lennon", 1940, 22334);
		System.out.println(p2);
		
		Person p3 = new Person("Hans", "Birke", 1950, 12345);
		System.out.println(p3);
		
		p3.setNachname("Meyer");
		System.out.println(p3);
		
		System.out.println("*** Test equals:");
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		
		System.out.println("* p1.equals(p2): " + p1.equals(p2)); // false
		
		Person p4 = new Person("Paul", "McCartney");
		System.out.println("p4: " + p4);
		System.out.println("* p1.equals(p4): " + p1.equals(p4)); // true
		
		System.out.println("*** Test getMustermann");
	
		Person p5 = Person.getMustermann();
		System.out.println(p5); // Max Mustermann, Geburtsjahr: 1960, Plz: 12345
	}

}
