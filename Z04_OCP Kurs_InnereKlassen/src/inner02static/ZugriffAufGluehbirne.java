package inner02static;

import inner02static.Lampe.Gluehbirne;
import static inner02static.Lampe.Gluehbirne.ausgabeStatic;

public class ZugriffAufGluehbirne {

	public static void main(String[] args) {
		// Ohne Import - müssen wir das Package und die Umgebende Klasse angeben
		Lampe.Gluehbirne birne01 = new Lampe.Gluehbirne();
		Lampe.Gluehbirne.ausgabeStatic();
		
		// Mit Import
		Gluehbirne birne02 = new Lampe.Gluehbirne();
		Gluehbirne birne03 = new Gluehbirne();
		birne01.ausgabe();
		birne01.ausgabeStatic();
		ausgabeStatic();
		
		System.out.println(birne01.getClass());
		System.out.println(birne02.getClass());
		System.out.println(birne03.getClass());
	}

}
