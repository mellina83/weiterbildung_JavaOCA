package zz_basicsVonHensel;

import java.util.Scanner;

public class Day02_03Verzweigung {

	public static void main(String[] args) {
		// Eingabe einer ganzen Zahl durch den Benutzer
		Scanner sc = new Scanner(System.in);
		System.out.println("Bitte geben Sie eine Ganzzahl ein.");
		int zahl = sc.nextInt();
		// �berpr�fung, ob die Zahl positiv ist
		if (zahl > 0) {
			System.out.println("Sie haben die positive Zahl " + zahl + " eingegeben.");
		} else if (zahl < 0) { // �berpr�fung, ob Zahl negativ ist
			System.out.println("Sie haben die negative Zahl " + zahl + " eingegeben.");
		} else { // 0 sonst
			System.out.println("Sie haben 0 eingegeben.");
		}
		
		// �berpr�fung, ob die Zahl gerade ist
		if (zahl % 2 == 0) {
			System.out.println("Sie haben die gerade Zahl " + zahl + " eingegeben.");
		} else {
			System.out.println("Sie haben die ungerade Zahl " + zahl + " eingegeben.");
		}
		
		System.out.println("Servus");			
		sc.close();
		
		// Bei mehreren Konditionen, die �berpr�ft werden, kommt der seltenste Fall nach unten / rechts
	}

}
