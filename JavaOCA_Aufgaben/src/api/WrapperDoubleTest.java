package api;

import java.util.ArrayList;

public class WrapperDoubleTest {

	public static void main(String[] args) {
		ArrayList<Double> temperaturen = new ArrayList<>();
		double temp1 = -5.6;
		temperaturen.add(temp1); 
		Double temp2 = new Double("-7.5");
		temperaturen.add(temp2);
		
		String tempEingabe = "6,8";
		Double temp3 = Double.valueOf(tempEingabe.replace(",", "."));
		temperaturen.add(temp3);
		int temp3Int = temp3.intValue();
		
		temperaturen.add(new Double(-3.4));
		temperaturen.add(new Double(-2.6));
		temperaturen.add(new Double(1.2));

		temperaturen.forEach(System.out::println);
		
		// Durchschnittstemperatur berechnen
		// zuerst Summe berechnen, dann durch Laenge teilen:
		double summe = 0;
		for (Double temperatur : temperaturen) {
			summe += temperatur;
			
		}
		System.out.println("Durchschnitt: " + summe / temperaturen.size());
		
		// Minimal und Maximal ausrechnen
		System.out.println("Min und Max");
		// Es gibt zwei Moeglichkeiten fuer den Startwert !!!!!!!
		//Hier Moeglichkeit mit dem maximal/minimalstmoeglichen Wert als Startwert:
		double max = Double.MIN_VALUE;
		for (Double temperatur : temperaturen) {
			if (temperatur > max) {
				max = temperatur;
			}
		}
		System.out.println("Maximal: " + max);
		
		//Hier Moeglichkeit erster Wert der Liste nehmen als Startwert
		double min = temperaturen.get(0);
		for (Double temperatur : temperaturen) {
			if (temperatur < min) {
				min = temperatur;
			}	
		}
		System.out.println("Minimal: " + min);
		
		
		
		
	}

}
