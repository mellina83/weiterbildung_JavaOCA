package Aufgaben.ml.unchecked;

public class TestKonto {

	static Konto k1;
	static Konto k2;

	public static void main(String[] args) {
		k1 = new Konto(500);
		k2 = new Konto(100);

		System.out.println("k1 = " + k1);
		System.out.println("k2 = " + k2);

		try {
			k1.geldAbheben(480);
		} catch (NegativeSaldoRuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Bitte Saldo beachten");
		}

		System.out.println("k1 = " + k1.getSaldo());

		try {
			k1.geldAbheben(500);
		} catch (NegativeSaldoRuntimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Bitte Saldo beachten");
		}
		System.out.println("k1 = " + k1.getSaldo());
		
		System.out.println("----------------------");
		
		System.out.println("Kunde 2 holt Geld ab");

		k2.geldAbheben(500);

		System.out.println("Kunde 2 hat Geld abgeholt");

		System.out.println("k2 = " + k2.getSaldo());
	}

}
