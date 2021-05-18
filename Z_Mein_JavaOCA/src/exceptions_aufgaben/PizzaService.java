package exceptions_aufgaben;

import java.util.Arrays;
import java.util.List;

public class PizzaService {

	public static void main(String[] args) throws BadFoodException {
		if (args.length != 3) {
			throw new IllegalToppingsCountException("Anzahl der Bel�ge muss genau drei sein: " + args.length);
		}
		String[] gueltigeBelaege = {"Tomaten", "K�se", "Artischocken", "Pilze", "Broccoli", "Salami", "Schinken"}; 
		
//		1. Variante:
//		boolean gueltig; // flag: wird im g�nstigen Fall auf true gesetzt, im ung�nstigen Fall auf false
//		
//		for (String belag : args) {
//			gueltig = false;
//			for (String gueltigerBelag : gueltigeBelaege) {
//				if (belag.equals(gueltigerBelag)) {
//					gueltig = true;
//				}
//			}
//			if (!gueltig) {
//				throw new BadFoodException("Ung�ltiger Belag: " + belag);
//			}
//		}
		
//		2. Variante:
//		for (String belag : args) {
//			if (!check(belag, gueltigeBelaege)) {
//				throw new BadFoodException("Ung�ltiger Belag: " + belag);
//			}
//		}
		
//		3. Variante
		List<String> gueltigeBelaegeAsList = Arrays.asList(gueltigeBelaege);
		for (String belag : args) {
			if (!gueltigeBelaegeAsList.contains(belag)) {
				throw new BadFoodException("Ung�ltiger Belag: " + belag);
			}
		}
			
		System.out.println("Ihre Pizza ist fertig. Vielen Dank f�r Ihre Bestellung");
		System.out.println("Pizza mit");
		for (String belag : args) {
			System.out.println(belag);
		}
		System.out.println("Bis zum n�chsten Mal");

	}
	
	private static boolean check(String belag, String[] belaege) {		
			for (String gueltigerBelag : belaege) {
				if (belag.equals(gueltigerBelag)) {
					return true;
				}
			}
			return false;		
	}

}

class IllegalToppingsCountException extends RuntimeException {
	
	IllegalToppingsCountException(String msg) {
		super(msg);
	}
}

class BadFoodException extends Exception {
	
	BadFoodException(String msg) {
		super(msg);
	}
}