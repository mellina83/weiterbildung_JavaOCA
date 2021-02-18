package exceptions;

import java.util.Scanner;

//Achtung!!! Aufgabe ist hier, args aus der Main Methode zu nutzen
//und die Argumente per Run -> Run Configuration zu uebergeben
//Also kein Scanner vonnoeten

public class PizzaService {

	public static void main(String[] args) throws BadFoodException{
		
		if (args.length != 3) {
			throw new IllegalToppingsCountException("Anzahl der Belaege muss genau drei sein" + args.length);
		}
		
		String[] belaege = {"Tomaten", "Pilze", "Salami", "Schinken", "Artischocken", "Kaese", "Broccoli"};
			
		for (String belag : args) {
			if(!check(belag, belaege)) {
				throw new BadFoodException("Ungueltiger Belag " + belag);
			}
		}
		//2 andere Varianten siehe Aufloesung Dozent
		//ich haette wahrscheinlich auch Methode contains verwendet
		
		System.out.println("Ihre Pizza ist fertig. Vielen Dank fuer Ihre Bestellung");
		System.out.println("Pizza mit");
		for (String belag : args) {
			System.out.println(belag);
		}
		System.out.println("Bis zum naechsten Mal");	
		
				
		


	} // Ende Main
	
	private static boolean check(String belag, String[] belaege) {
		for (String gueltigerBelag : belaege) {
			if (belag.equals(gueltigerBelag)) {
				return true;
			}
		}
		return false;
	}
	
	
	

}




