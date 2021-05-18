package arrays_projectLotto;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

	public static int[] createUniqueRandomSortedArray(int min, int max, int length) {
		if(length > max-min+1) { // dass soll die endlose Schleife verhindern (wenn es nicht genug einzigartige Werte gibt)
			throw new IllegalArgumentException("Es gibt nicht genug einzigartige Werte in dem Bereich " 
						+ min + " .. " + max + " um ein Array der Länge " + length + " zu füllen");
		}
		
		int[] array = new int[length];

		Random random = new Random();
		
		mainloop:
		for (int i = 0; i < array.length; i++) {
			int value = random.nextInt(max-min+1) + min;
			
			// überprüfen ob es die Zahl bereits gibt:
			for (int j = 0; j < i; j++) {
				if(array[j]==value) {
					// mainloop soll für die Position i erneut eine Zahl generieren:
					i--;
					continue mainloop;
				}
			}
			
			array[i] = value;
		}
		
		Arrays.sort(array);
		
		return array;
	}

	
	public static void main(String[] args) {
		int[] array = createUniqueRandomSortedArray(1, 3, 3);
		System.out.println(Arrays.toString(array));
		
		array = createUniqueRandomSortedArray(1, 3, 5);
		System.out.println(Arrays.toString(array));
	}
}
