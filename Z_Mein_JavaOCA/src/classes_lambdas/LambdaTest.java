package classes_lambdas;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaTest {

	public static void main(String[] args) {
//		Addierbar add = new AddierbarKlasse();
//		printAddierbar(add);
//		Anonyme Klassen und Objekte		
		printAddierbar(new Addierbar() {		
			@Override
			public int addieren(int zahl1, int zahl2) {
				return zahl1 + zahl2;
			}
		});
		
		printAddierbar((int zahl1, int zahl2) -> {
			return zahl1 + zahl2;
		});
		
		printAddierbar((zahl1, zahl2) -> zahl1 + zahl2 + 2);
		
		// Der Typ eines Lambda-Ausdrucks ist ein funktionales Interface
		Addierbar a = (zahl1, zahl2) -> zahl1 + zahl2 + 2;
		BiFunction<Integer, Integer, Integer> test = (zahl1, zahl2) -> zahl1 + zahl2 + 2;
		Predicate<Integer> pred = (zahl1) -> zahl1 + zahl1 > 2;

	}
	
	public static void printAddierbar(Addierbar a) {
		System.out.println(a.addieren(34, 45));
	}

}
