package wdh;

import java.util.Arrays;
import java.util.Random;

public class ArraysEinfach {

	public static void main(String[] args) {
		int[] arr = createArray(2, 15, 30);
		System.out.println(Arrays.toString(arr));
		// oder:
		printArray(arr); //A2
		System.out.println();
		
		char[] array = deutscheUmlaute();
		printArray(array);
		

	} // Ende Main
	
	static char[] deutscheUmlaute() {
		char[] array = {'ü', 'ä', 'ö'};
		return array;
	}
	
	
	static int[] createArray(int min, int max, int laenge) {
		int[] array = new int [laenge];
		Random random = new Random();
		
		for (int i = 0; i < array.length;i++) {
			int zufallszahl = random.nextInt(max-1)+min ;
			array[i] = zufallszahl;
		}
		return array;
	}
	
	static void printArray(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}
	}
	
	static void printArray(char[] array) {
		for (char element : array) {
			System.out.print(element + " ");
		}
	}

}
