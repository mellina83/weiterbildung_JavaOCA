package klassen.interfaces;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getVorname().equals(p2.getVorname())) {
			return p1.getNachname().compareTo(p2.getNachname());
		}
		
		return p1.getVorname().compareTo(p2.getVorname());
	}
	

}
