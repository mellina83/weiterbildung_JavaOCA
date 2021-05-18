package classes_interfaces;

import java.util.function.*;

// Das Interface Predicate ist ein funktionales Interface (functional interface).
// Ein funktionales Interface hat genau eine abstrakte Methode.
// Um funktionale Interfaces zu implementieren, kann man seit Java 8 Lambda-Ausdr�cke verwenden
// Ein Lambda-Ausdruck besteht aus einer Parameter-Liste, dem Pfeiloperator -> und einem Methodenk�rper.
public class MyPredicate implements Predicate<String>{

	@Override
	public boolean test(String s) {
		return s.length() > 5;
	}

	public void doIt() {
		
	}
	

}
