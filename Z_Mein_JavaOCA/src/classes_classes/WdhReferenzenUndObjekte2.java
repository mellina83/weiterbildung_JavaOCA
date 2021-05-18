package classes_classes;

class Konto {
	int betrag;
}

public class WdhReferenzenUndObjekte2 {

	public static void main(String[] args) {

		Konto x = new Konto();
		
		Konto var = x;
		
		var.betrag = 12; 
		
		System.out.println("x.betrag: " + x.betrag); // 12
		
		var = null;
		
		System.out.println("x.betrag: " + x.betrag); // 12
		
		Konto temp = x;
		
		x = null;
		
		// System.out.println(var.betrag); // NullPointerException
		// System.out.println(x.betrag); // NullPointerException
		
		System.out.println("temp.betrag: " + temp.betrag); // 12
		
		var = new Konto();
		
		System.out.println("var.betrag: " + var.betrag); // 0
		
	} // end of main

}
