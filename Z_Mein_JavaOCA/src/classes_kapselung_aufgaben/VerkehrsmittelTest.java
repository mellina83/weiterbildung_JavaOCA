package classes_kapselung_aufgaben;

public class VerkehrsmittelTest {

	public static void main(String[] args) {
		Verkehrsmittel v1 = new S_Bahn(1, "Meier", "Dortmund Hbf", "Solingen Hbf", "M�ller", 2, 244);
		Verkehrsmittel v2 = new Bus(911, "Schmidt", "Duisburg Hbf", "Oberhausen Hbf", 96);
		Verkehrsmittel v3 = new Bus(911, "Abel", "Duisburg Hbf", "Oberhausen Hbf", 120);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println("v2.equals(v3): " + v2.equals(v3));
	}


}
