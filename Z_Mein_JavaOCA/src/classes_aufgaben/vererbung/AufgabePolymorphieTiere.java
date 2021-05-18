package classes_aufgaben.vererbung;

public class AufgabePolymorphieTiere {

	public static void main(String[] args) {

		Hund h1 = new Hund("Rex", 4, true);
		h1.laufen();
		
		Katze k1 = new Katze("Tom", 7, true);
		k1.laufen();
		
		print(h1);
		print(k1);
	}

	static void print(Tier tier) {
		System.out.println(tier);
	}
}
