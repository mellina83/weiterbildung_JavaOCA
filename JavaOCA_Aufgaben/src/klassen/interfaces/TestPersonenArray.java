package klassen.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPersonenArray {

	public static void main(String[] args) {
		
		Person[] personen = new Person[4];
		personen[0] = new Person("Paul", "Smith");
		personen[1] = new Person ("Paul", "Black");
		personen[2] = new Person ("John", "Smith");
		personen[3] = new Person ("John", "Black");
		
		for (Person person : personen) {
			System.out.println(person);
		}
		// Oder: System.out.println(Arrays.toString(personen));
		
		//Standardsortierung (Nachname, dann Vorname) -> Comparable
		System.out.println("+++++++++");
		Arrays.sort(personen); 
		
		for (Person person : personen) {
			System.out.println(person);
		}
		
		//alternative Sortierung (Vorname, dann Nachname) -> Comparator
		System.out.println("+++++++++");
		Arrays.sort(personen, new MyComparator());
		for (Person person : personen) {
			System.out.println(person);
		}
		
		
	}// End of Main
	
	
	

}
