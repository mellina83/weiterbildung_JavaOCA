package classes_vererbung;


class Himmelskoerper {
	int masse;
	
	Himmelskoerper(int masse) {
		this.masse = masse;
	}
}

//class Asteroid extends Himmelskoerper { // Compilerfehler
//}

class Meteorit extends Himmelskoerper {
	public Meteorit() {
		super(12);
	}
}

public class WdhKonstruktoren {

	public static void main(String[] args) {

	}

}
