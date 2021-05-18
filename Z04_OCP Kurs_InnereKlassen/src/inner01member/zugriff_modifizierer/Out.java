package inner01member.zugriff_modifizierer;

public class Out {

	private int number = 8;
	
	public static In instantiateIn() {
		In in = new Out().new In();
//		in.seeOut();
		return in;
	}
	
	/**
	 * Erlaubte Modifizierer:
	 * Sichtbarkeit: public, protected, private, default
	 * private: Instanzieeren der Klasse In von ausserhalb nicht möglich
	 *
	 * final: erlaubt - Klasse kann nicht abgeleitet werden
	 * abstract: erlaubt - Kindsklasse sollte existieren sonst unbrauchbar
	 */
	public class In implements Seeable{
		public String attIn = "Hallo Welt";
		public void seeOut(){
			System.out.println("Methode der Klasse In");
			System.out.println("Attribut der Klasse Out " + number);
		}
	}
	
	void see(){
		System.out.println("Methode der Klasse Out");
	}
	
	public static void main(String[] args) {
		// In zwei Schritten
		Out out = new Out();
		In in = out.new In();
		
		//In einem Schritt
		Out.In in2 = new Out().new In();
		
		in.seeOut();
	}
}


