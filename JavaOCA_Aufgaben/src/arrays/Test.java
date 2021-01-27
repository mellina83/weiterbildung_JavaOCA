package arrays;

class Kreis1 {
	private int radius;
	
	//Konstruktor
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override //(Annotationen werden später besprochen)
	public String toString() {
		return "Kreis R(" + radius + ")";
	}
} //Ende class Kreis


public class Test {

	public static void main(String[] args) {
		
		
		int anzahlKreise = 100;
		int randomMax = 10;
		System.out.println("*** " + anzahlKreise + " Rechtecke: ");
		
		Random random = new Random();
		
		String [] arrayKreise = new String[anzahlKreise];
		
		for (int i=1; i<anzahlKreise;i++) {
			
			new Kreis();
			
			
			
			int zufallszahl = random.nextInt(randomMax) + 1;
			
			arrayKreise [i] = new Kreis(zufallszahl[i]);
			
			
			

		}
		
		

	} // Ende von Main

}
