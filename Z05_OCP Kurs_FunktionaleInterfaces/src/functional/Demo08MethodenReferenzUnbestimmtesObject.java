package functional;

/*
 * Referenz auf eine Instanz-Methode eines unbestimmten Objektes vom speziellen Typ
 * 
 * (Instanz-Methode eines Parameters der abstrakten Methode
 * - hier die Methode 'entferneKerne' für den Parameter 'Apfel apfel').
 * 
 * Englisch: reference to an instance method of an arbitrary object of a particular type
 */

class Apfel {
	private int kerne;

	public Apfel(int kerne) {
		this.kerne = kerne;
	}

	public int getKerne() {
		return kerne;
	}

	public void setKerne(int kerne) {
		this.kerne = kerne;
	}

	@Override
	public String toString() {
		return "Apfel [getKerne()=" + getKerne() + "]";
	}

	public void entferneKerne(int kerne) {
		System.out.println("Ich bin ein Apfel");
		this.kerne -= kerne;
	}
}

class FarbApfel extends Apfel {

	public FarbApfel(int kerne) {
		super(kerne);
	}

	public void entferneKerne(int kerne) {
		System.out.println("Ich bin ein FarbApfel");
		this.setKerne(this.getKerne() - kerne);
	}

	@Override
	public String toString() {
		return "FarbApfel [getKerne()=" + getKerne() + "]";
	}
}

interface ApfelEntkerner {
	void entkernen(Apfel apfel, int kerne);
}

/*
 * Ursprünglich Implementierung
 */
//class MyApfelEntkerner implements ApfelEntkerner{
//	@Override
//	public void entkernen(Apfel apfel, int kerne) {
//		apfel.setKerne(apfel.getKerne()-kerne);
//	}
//}

public class Demo08MethodenReferenzUnbestimmtesObject {
	public static void main(String[] args) {
		Apfel a01 = new Apfel(222);
		FarbApfel f01 = new FarbApfel(444);

		/*
		 * Lambda
		 */
		ApfelEntkerner aeLambda = (Apfel apfel, int kerne) -> {
			apfel.setKerne(apfel.getKerne() - kerne);
		};

		/*
		 * Methoden Referenz Statisch
		 */
		ApfelEntkerner aeMethodenRefStat = Demo08MethodenReferenzUnbestimmtesObject::entkernen01;

		/*
		 * Methoden Referenz Instanz - Bestimmtes Objekt liefert die Methode
		 */
		Demo08MethodenReferenzUnbestimmtesObject dm08 = new Demo08MethodenReferenzUnbestimmtesObject();
		ApfelEntkerner aeMethodenRefIns = dm08::entkernen02;

		/*
		 * Methoden Referenz Instanz - Unbestimmtes Objekt eines Speziellen
		 * Typs.
		 * 
		 * Spezieller Typ wird von 1. Parameter abgeleitet.
		 * 
		 * ('Apfel' apfel, int kerne)
		 * 
		 * Mit diesem unbestimmten Objekt - hier 'apfel' - wird eine Methode
		 * Referenziert.
		 * 
		 * (Apfel 'apfel', int kerne)
		 * 
		 * Diese Methode muss als Parameterliste alle weiteren Parameter des
		 * Interfaces annehmen.
		 * 
		 * apfel.methode(int kerne)
		 */

		// Mit der Referenz auf eine Instanz-Methode des ersten Parameters der
		// abstrakten Methode 'entkernen':
		ApfelEntkerner aeMethodenRefInsUnbestimmt = Apfel::entferneKerne;
//		ApfelEntkerner aeMethodenRefInsUnbestimmt = FarbApfel::entferneKerne;
//		ApfelEntkerner aeMethodenRefInsUnbestimmt = Apfel::setKerne;

		System.out.println(a01);
		System.out.println(f01);
		aeMethodenRefInsUnbestimmt.entkernen(a01, 123);
		aeMethodenRefInsUnbestimmt.entkernen(f01, 123);
		System.out.println(a01);
		System.out.println(f01);

	}

	public void entkernen02(Apfel apfel, int kerne) {
		apfel.setKerne(apfel.getKerne() - kerne);
	}

	public static void entkernen01(Apfel apfel, int kerne) {
		apfel.setKerne(apfel.getKerne() - kerne);
	}
}
