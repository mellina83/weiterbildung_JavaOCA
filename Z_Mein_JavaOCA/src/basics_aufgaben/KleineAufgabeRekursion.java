package basics_aufgaben;

public class KleineAufgabeRekursion {

	public static void main(String[] args) {

		int summe = summeEinsBis(5); // 1 + 2 + 3 + 4 + 5
		System.out.println("summe = " + summe); // 15
		
		// Bitte eine alternative rekursive Lösung erstellen,
		// mit der auch die Summe aller Werte zwischen 1 bis max (inklusive) 
		// berechnet und zurückgeliefert wird.
		
		summe = summeEinsBisRekursv(5);
		System.out.println("summe = " + summe);
		
		
		summe = summeFromBisRekursiv(1, 5);
		System.out.println("summe = " + summe);
	}
	
	static int summeEinsBis(int max) {
		int summe = 0;
		
		for (int i = 1; i <= max; i++) {
			summe += i;
		}
		
		return summe;
	}
	
	static int summeEinsBisRekursv(int value) {
		if(value==0) {
			return 0;
		}
		
		return value + summeEinsBisRekursv(value - 1);
	}
	
	static int summeFromBisRekursiv(int i, int max) {
//		System.out.println("i = " + i + ", max = " + max);
		
		if(i > max) {
			return 0;
		}
		
		int summe = i + summeFromBisRekursiv(i+1, max);
		return summe;
	}

}
