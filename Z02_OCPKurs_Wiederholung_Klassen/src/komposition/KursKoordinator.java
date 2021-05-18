package komposition;

public class KursKoordinator {

	public static void main(String[] args) {
		Kurs k01 = new Kurs();
		
		k01.addThema("Java Grundkurs");
		
		k01.zeigeAlleThemen();
		
		Thema t01 = k01.getThema();
		
		t01.setTitel("Java ist doof!");

		k01.zeigeAlleThemen();
		
		k01 = null;
	}

}
