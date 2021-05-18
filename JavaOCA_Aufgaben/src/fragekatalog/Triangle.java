package fragekatalog;

public class Triangle {

	public static void main(String[] args) {

	}

	public int Methode09(double km = 1) {
		int x = 1;
		return x;
	}

// erlaubte Überladung, da andere Anzahl an Parametern
	public int Methode09(double km, int Geschwindigkeit) {
		return Geschwindigkeit;
	}

// erlaubte Überladung da andere Reihenfolge
	public int Methode09(int Geschwindigkeit, double km) {
		return Geschwindigkeit;
	}

	public int Methode09(int Geschwindigkeit, double km, double Zeit) {
		return Geschwindigkeit;
	}

}