package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class LottozahlenTest {

	public static void main(String[] args) {
		// Erzeugen Sie eine ArrayList und f�llen Sie diese mit sechs zuf�llig erzeugten Lottozahlen.
		// Geben Sie die ArrayList sortiert aus. 
		// Erweiterung: Versuchen Sie, doppelte Lottozahlen zu verhinden.
		
		ArrayList<Integer> lottozahlen = new ArrayList<>();
		
		Random random = new Random();
		
		
		while (lottozahlen.size() < 6) {
			int temp = random.nextInt(49) + 1;
			if (!lottozahlen.contains(temp)) {
				lottozahlen.add(temp);
			}
		}
		lottozahlen.sort(null); // ??
		Collections.sort(lottozahlen); // ??
		lottozahlen.sort(Comparator.naturalOrder()); // ??
		
		for (Integer lottozahl : lottozahlen) {
			System.out.println(lottozahl);
		}
		
		// Und siehe OCP Variante vom Dozenten
		
			
		
	
		

		
	}

}
