package klassen.vererbung.tiere;

public class Hund extends Tier {
	
	public Hund(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}

	public void laufen() {
		System.out.println("Hund " + getName() + " laeuft");
	}
}
