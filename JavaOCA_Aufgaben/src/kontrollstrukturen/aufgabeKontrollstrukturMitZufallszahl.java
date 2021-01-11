package kontrollstrukturen;

public class aufgabeKontrollstrukturMitZufallszahl {

	public static void main(String[] args) {

		//Aufgabe 0
		//Gegeben ist x = 100. Dekrementieren Sie x um einen Zufälligen Wert aus dem Bereich [1 .. 5] solange x größer 0 ist. Geben Sie bei jeder Dekrementierung den neuen Wert der x aus.
		//**Tipp:** zum Generieren einer Zufallszahl kann man die Methode `random` der Klasse `java.lang.Math` ODER die Methode `nextInt(int)` der Klasse `java.util.Random` einsetzen:
			//java.util.Random generator = new java.util.Random();
			//int randomValue = generator.nextInt(10); // Zufallswert [ 0..10 )
		
		java.util.Random randomGenerator = new java.util.Random();
		
		int x = 100;
		while (x>0) {
			int y = randomGenerator.nextInt(5);
			if (y>0 && x-y >=0) {
				x = x - y;
				System.out.println("Zufallswert Y: " + y);
				System.out.println("Rest X: " + x );
			}
		}
		
		
		
	} // Main Ende

}
