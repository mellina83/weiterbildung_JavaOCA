package klassen.vererbung.tiere;

public class Test {

	public static void main(String[] args) {
		
		Hund hund1 = new Hund("Rex", 11, true);
		Katze katze1 = new Katze("Kitty", 9, false);
		
		katze1.laufen();
		hund1.laufen();
		
		System.out.println(katze1);
		System.out.println(hund1);

	}
	
	
	public static void print(Tier tier) {
		System.out.println(tier);
	}
	

}
