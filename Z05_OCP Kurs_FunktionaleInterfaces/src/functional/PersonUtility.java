package functional;

public class PersonUtility {

	public static int vergleichNachAlter(Person p1, Person p2) {
		return Integer.compare(p1.getAge(), p2.getAge());
	}
	
	public static int vergleichNachName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
}
