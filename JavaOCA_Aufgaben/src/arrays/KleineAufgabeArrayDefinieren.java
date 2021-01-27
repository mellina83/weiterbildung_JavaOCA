package arrays;

public class KleineAufgabeArrayDefinieren {

	public static void main(String[] args) {

		/*
		 * Definieren Sie bitte eine Methode createBooleanArray,
		 * die ein Array (boolean[]) mit den Werten true, true, false, false
		 * erzeugt und zurück liefert.
		 * 
		 * Testen Sie die Methode: erhalten Sie das Array und 
		 * geben Sie dann das Array aus.
		 */
		
		boolean[] array = createBooleanArrayV1();
		
		for(int i=0; i<array.length ;i++) {
			System.out.println(i + ". " + array[i]);
		}
		
	} // end of main

	static boolean[] createBooleanArrayV1() {
		boolean[] back = new boolean[4];
		
		back[0] = true;
		back[1] = true;
		
		return back;
	}
	
	static boolean[] createBooleanArrayV2() {
		boolean[] back = { true, true, false, false };
		return back;
	}
	
	static boolean[] createBooleanArrayV3() {
		return new boolean[] { true, true, false, false };
	}
	
	
}
