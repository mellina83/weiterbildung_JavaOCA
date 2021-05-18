package javaAPI_wrapper;

import java.util.ArrayList;

public class WrapperDoubleTest {

	public static void main(String[] args) {
		ArrayList<Double> temperaturen = new ArrayList<>();
		double temp1 = -5.6;
		temperaturen.add(temp1); 
//		Double temp2 = new Double("-7.5"); //deprecated (veraltet seit Java 11)
		Double temp2 = Double.valueOf("-7.5");
		temperaturen.add(temp2);
		
		String tempEingabe = "6,8";
		Double temp3 = Double.valueOf(tempEingabe.replace(",", "."));
		temperaturen.add(temp3);
		int temp3Int = temp3.intValue();
		
//		temperaturen.add(new Double(-3.4)); //deprecated (veraltet seit Java 11)
//		temperaturen.add(new Double(-2.6));
//		temperaturen.add(new Double(1.2));
		temperaturen.add(Double.valueOf(-3.4));
		temperaturen.add(Double.valueOf(-2.6));
		temperaturen.add(Double.valueOf(1.2));
		
		temperaturen.forEach(System.out::println);
		
		// Durchschnittstemperatur?
		double summe = 0;
		for (double temperatur : temperaturen) {
			summe = summe + temperatur;
		}
		double durchschnitt = summe / temperaturen.size();
		System.out.println("Durchschnittstemperatur: " + durchschnitt);
		System.out.printf("Durchschnittstemperatur: %.2f�C%n", durchschnitt);
		
//		double max = Double.MIN_VALUE;
		double max = temperaturen.get(0);
		for (double temperatur : temperaturen) {
			if (temperatur > max) {
				max = temperatur;
			}
		}
		System.out.printf("Maximaltemperatur: %.1f�C%n", max);
		
		double min = temperaturen.get(0);
		for (double temperatur : temperaturen) {
			if (temperatur < min) {
				min = temperatur;
			}
		}
		System.out.printf("Minimaltemperatur: %.1f�C%n", min);
		
		
		
		
	}

}
