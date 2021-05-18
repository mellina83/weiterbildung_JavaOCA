package inner02static;

public class Lampe {

	static String lampeS = "Licht AN";//statisch
	int lampeI = 1;//objekt
	
	public static class Gluehbirne {
		
		public static String gluehBirneS = "Dunkel";//statisch
		public int gluehBirneI = 6;//objekt
		
		public static void ausgabeStatic() {
			System.out.println("Statics");
			System.out.println(lampeS);
			System.out.println(gluehBirneS);
//			Cannot make a static reference to the non-static field gluehBirneI
//			System.out.println(gluehBirneI);
//			Cannot make a static reference to the non-static field lampeI
//			System.out.println(lampeI);
		}
		
		public void ausgabe() {
			System.out.println("Instance");
			System.out.println(lampeS);
			System.out.println(gluehBirneS);
			System.out.println(gluehBirneI);
//			Cannot make a static reference to the non-static field lampeI
//			System.out.println(lampeI);
		}
	}
	
	public static void main(String[] args) {
		Gluehbirne birne01 = new Gluehbirne();
		Gluehbirne birne02 = new Lampe.Gluehbirne();
		Lampe.Gluehbirne birne03 = new Gluehbirne();
		Lampe.Gluehbirne birne04 = new Lampe.Gluehbirne();
		System.out.println(birne01.getClass());
		System.out.println(birne02.getClass());
		System.out.println(birne03.getClass());
		System.out.println(birne04.getClass());
	
	}
}





