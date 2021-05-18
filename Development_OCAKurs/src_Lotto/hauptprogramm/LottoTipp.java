package hauptprogramm;

import java.util.Arrays;

public class LottoTipp {
	private int anzahlKugeln;
	private int anzahlKugelnGesamt;
	public int[] zahlen; 
	
	public LottoTipp(int anzahlKugeln, int anzahlKugelnGesamt) {	
		this.anzahlKugeln = anzahlKugeln;
		this.anzahlKugelnGesamt = anzahlKugelnGesamt;
	}
	
	public String toString() {
		String zahlenAlsText = "Noch keine Zahlen getippt.";
		if (zahlen!=null) {
			zahlenAlsText = Arrays.toString(zahlen); //Alternativ zu for Schleife
		}
		return "Getippt: Spiel " + anzahlKugeln + " aus " + anzahlKugelnGesamt + ". " + zahlenAlsText;
		//wären 0 0, daher in Objekt speichern, also in Konstruktor eingeben
		
	}
	
	public void abgeben() {
		zahlen = ArrayUtils.createUniqueRandomSortedArray(1, anzahlKugelnGesamt, anzahlKugeln);
	}

		
	public int[] getZahlen() {
		return zahlen;
	}


	
}
