package classes_aufgaben.vererbung.geo;

public class AufgabeVererbungGeometrie {

	public static void main(String[] args) {

		Kreis k1 = new Kreis(5);
		System.out.println(k1);
		k1.bewegen(14,  6);
		System.out.println(k1);
		
		Rechteck r1 = new Rechteck(2, 3); 
		System.out.println(r1);
		r1.bewegen(7, -2);
		System.out.println(r1);
	}

}
