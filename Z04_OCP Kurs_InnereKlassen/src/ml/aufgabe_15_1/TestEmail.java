package ml.aufgabe_15_1;

public class TestEmail {

	public static void main(String[] args) {

		Email e1 = new Email("Klaus.Gross*", "Lotte.Klein@gmz.de", "Hallo", "Hallo Welt");
		e1.senden();
		System.out.println();

		Email e2 = new Email("Klaus.Gross*", "Lotte.Kleingmz.de", "Hallo", "Hallo Welt 2");
		e2.senden();
		System.out.println();

		Email e3 = new Email("Klaus.Gross*", "Lotte.Klein*", "Hallo", "Hallo Welt 3");
		e3.senden();
		System.out.println();

		Email e4 = new Email("Klaus.Gross", "Lotte.Klein", "Hallo", "Hallo Welt 4");
		e4.senden();
		System.out.println();

	}
	
	public static void zweiterWeg() {

//		Email e1 = new Email("Klaus.Gross*", "Lotte.Klein@gmz.de", "Hallo", "Hallo Welt");
//		System.out.println();
//		if (e1.senden()) {
//			System.out.println("Die Mail wurde gerade verschickt.");;
//		
//		} else {
//			System.out.println("Die Mail konnte nicht verschickt werden.");;
//		}
//		System.out.println();
//		Email e2 = new Email("Klaus.Gross*", "Lotte.Kleingmz.de", "Hallo", "Hallo Welt");
//		System.out.println();
//		if (e2.senden()) {
//			System.out.println("Die Mail wurde gerade verschickt.");;
//		
//		} else {
//			System.out.println("Die Mail konnte nicht verschickt werden.");;
//		}
//		System.out.println();

	}

}
