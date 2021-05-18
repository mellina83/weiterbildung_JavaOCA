package arrays_aufgaben;

public class VarargsTest {

	public static void main(String... args) {
		int zahl1 = 42;
		int zahl2 = 54;
		int zahl3 = 77;
		int summe = bildeSumme(zahl1, zahl2);				
		System.out.println("summe = " + summe);
		summe = bildeSumme(zahl1, zahl2, zahl3);				
		System.out.println("summe = " + summe);
		int zahl4 = 11;
		int zahl5 = 23;
//		int[] intArr = {zahl1, zahl2, zahl3, zahl4, zahl5};
//		summe = bildeSumme(intArr);		
//		summe = bildeSumme(new int[]{zahl1, zahl2, zahl3, zahl4, zahl5});		
//		System.out.println("summe = " + summe);
		summe = bildeSumme("+", zahl1, zahl2, zahl3, zahl4, zahl5);		
		System.out.println("summe = " + summe);
//		summe = bildeSumme(); // compiler-Fehler, mind. 2 int notwendig	
//		System.out.println("summe = " + summe);
//		int[] intArr = toArray(zahl3, zahl4, zahl5);
//		summe = bildeSumme(zahl1, zahl2, intArr);		
//		System.out.println("summe = " + summe);
		
	}
	
	public static int[] toArray(int ...zahlen) {
		return zahlen;
	}
	
	// vargargs: bildeSumme kann mit beliebig vielen int Argumenten aufgerufen werden (auch 0 m�glich)
//	public static int bildeSumme(int ... zahlen) {
////		if (zahlen.length < 2) {
////			throw new IllegalArgumentException("Bitte mind. 2 Zahlen �bergeben:" + Arrays.toString(zahlen));
////		}
//		int summe = 0;
//		for (int i : zahlen) {
//			summe += i;
//		}
//		return summe;
//	}
	
	// vargargs mit anderen Parametern gemischt: bildeSumme kann mit mindestens zwei int Argumenten aufgerufen werden
	public static int bildeSumme(String operator, int zahl1, int zahl2, int ... zahlen) {
		int summe = zahl1 + zahl2;
		for (int i : zahlen) {
			summe += i;
		}
		return summe;
	}
	
//	public static int bildeSumme(int[] intArr) {
//		int summe = 0;
//		for (int i : intArr) {
//			summe += i;
//		}
//		return summe;
//	}
	
	public static int bildeSumme(int zahl1, int zahl2) {
		return zahl1 + zahl2;
	}
	
	public static int bildeSumme(int zahl1, int zahl2, int zahl3) {
		return zahl1 + zahl2 + zahl3;
	}

}
