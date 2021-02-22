package methoden;

public class FakultaetTest {

	public static void main(String[] args) {
		int zahl = 7;
		long fakultaet = berechneFakultaet(zahl);
		System.out.println(zahl + "! = " + fakultaet);
		
		long fakultaetRekursiv = berechneFakultaetRekursiv(zahl);
		System.out.println(zahl + "! = " + fakultaet);
	}
	
	public static long berechneFakultaet(int zahl) {
		int fakultaet = 1;
			
		for (int i = 2; i <= zahl; i++) {
			fakultaet*= i;
		}
		
		return fakultaet;
	}
	
	
	public static long berechneFakultaetRekursiv(int zahl) {
		
	}
	
	
}
