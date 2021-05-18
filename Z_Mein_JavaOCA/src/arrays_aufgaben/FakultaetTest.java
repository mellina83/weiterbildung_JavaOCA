package arrays_aufgaben;

public class FakultaetTest {

	public static void main(String[] args) {
		int zahl = 20;
		long fakultaet = berechneFakultaet(zahl);
		System.out.println(zahl + "! = " + fakultaet);
		long fakultaetRekursiv = berechneFakultaetRekursiv(zahl);
		System.out.printf("%d! = %,d %n",zahl, fakultaetRekursiv);
	}
	
	public static long berechneFakultaet(int zahl) {
		if (zahl < 0) {
			throw new IllegalArgumentException("zahl darf nicht negativ sein: " + zahl);
		}
		long fakultaet = 1;
		for (int i = 2; i <= zahl; i++) {
			fakultaet *= i;
		}		
		return fakultaet;
	}
	
	public static long berechneFakultaetRekursiv(int zahl) {
		if (zahl < 0) {
			throw new IllegalArgumentException("zahl darf nicht negativ sein: " + zahl);
		}
		if (zahl == 0 || zahl == 1) {
			return 1;
		}
		return zahl * berechneFakultaetRekursiv(zahl -1);
	}
}
