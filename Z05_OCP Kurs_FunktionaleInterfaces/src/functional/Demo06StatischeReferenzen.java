package functional;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Comparator<T>
 * 
 * int compare(T o1, T o2);
 * 
 * 
 * Comparator<Person>
 * 
 * int compare(Person o1, Person o2);
 */

public class Demo06StatischeReferenzen {

	public static void main(String[] args) {
		Person[] persons = { new Person("Christian", 44),
				new Person("Susanne", 33), new Person("Janine", 33),
				new Person("Heinz", 34), new Person("Franz", 34),
				new Person("Fabian", 22) };

		Comparator<Person> compareByAgeLambda = (Person p1, Person p2) -> {
			return Integer.compare(p1.getAge(), p2.getAge());
		};

		Comparator<Person> compareByAge = PersonUtility::vergleichNachAlter;

		for (Person person : persons) {
			System.out.println(person);
		}
		Arrays.sort(persons, compareByAge);
		Arrays.sort(persons, PersonUtility::vergleichNachAlter);
		System.out.println("+++++++++++++++");
		for (Person person : persons) {
			System.out.println(person);
		}
		Arrays.sort(persons, PersonUtility::vergleichNachName);
		System.out.println("+++++++++++++++");
		for (Person person : persons) {
			System.out.println(person);
		}
		Comparator<Person> name = PersonUtility::vergleichNachName;
				
		Arrays.sort(persons, name.reversed());
		System.out.println("+++++++++++++++");
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
