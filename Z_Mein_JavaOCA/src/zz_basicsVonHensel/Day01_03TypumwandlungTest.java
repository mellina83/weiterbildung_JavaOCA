package zz_basicsVonHensel;

public class Day01_03TypumwandlungTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl1 = 42;
		int zahl2 = zahl1;
		System.out.println(zahl2);
		// short zahl3 = zahl1; // Compiler-Fehler, passt nicht in Short Variable
		// System.out.println(zahl3);
		short zahl3 = (short) zahl1; // L�sung: Typumwandlung in short ("cast")
		System.out.println(zahl3);
		long zahl4 = zahl1; //funktioniert, weil long gr��er als ein int
		float pi = 3.14f;
		// Funktioniert nicht: Float kann nicht zu long �bertragen werden, float passt nicht in long: zahl4 = pi;
		pi = zahl4;
		System.out.println(pi);
		//Reihenfolge von gro� nach klein: double - float - long - int - short - byte
		//														 - char - (hinter char steckt mehr, der ASCI-Code! )
		char buchstabe = 'A';
		zahl1 = buchstabe; // Zuweisung eines char zu int m�glich
		System.out.println(zahl1);
		int zahl = 97;
		// mit Cast dann umgekehrt m�glich
		buchstabe = (char) zahl;
		System.out.println(buchstabe);
	}

}
