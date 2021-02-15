package klassen.vererbung.tiere;

public class Katze extends Tier {
	
	public Katze(String name, int alter, boolean gesund) {
		super(name, alter, gesund);
	}
	
	public void laufen() {
		System.out.println("Katze " + getName() + " laeuft");
	}

}
