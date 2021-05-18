package classes_aufgaben.vererbung;

public class Katze extends Tier {
	Katze(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	public void laufen() {
		System.out.println("Katze " + getName() + " läuft");
	}
}
