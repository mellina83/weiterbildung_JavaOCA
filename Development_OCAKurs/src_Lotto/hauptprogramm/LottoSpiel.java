package hauptprogramm;

import java.util.Arrays;

public class LottoSpiel {
	private int anzahlKugeln;
	private int anzahlKugelnGesamt;
	int[] zahlen; 
	
	public LottoSpiel (int anzahlKugeln, int anzahlKugelnGesamt) {
		this.anzahlKugeln = anzahlKugeln;
		this.anzahlKugelnGesamt = anzahlKugelnGesamt;
	}
	

	
	public String toString() {
		String zahlenAlsText = "Es gab noch keine Ziehung";
		if (zahlen!=null) {
			zahlenAlsText = Arrays.toString(zahlen); //Alternativ zu for Schleife
		}
		
		return "Spiel " + anzahlKugeln + " aus " + anzahlKugelnGesamt + ". " + zahlenAlsText;
		//wären 0 0, daher in Objekt speichern, also in Konstruktor eingeben
		
	}
	
	public void ziehen() {
		zahlen = ArrayUtils.createUniqueRandomSortedArray(1, anzahlKugelnGesamt, anzahlKugeln);
	}
	

	
	public int vergleichen(LottoTipp tipp) {
		int anzahlRichtige = getAnzahlRichtige(tipp);
		return (int)Math.pow(10, anzahlRichtige-1);
	}
	
	public int getAnzahlRichtige(LottoTipp tipp) {
		int count = 0;
		int[] tippZahlen = tipp.getZahlen();
		
		//Für alle Tipp-Zahlen:
		for (int i = 0; i < tippZahlen.length; i++) {
			int tippZahl = tippZahlen[i];
			
			//Suche eine Tipp-Zahl in this.zahlen (in gezogenen Zahlen)
			for (int j = 0; j <zahlen.length; j++) {
				if (zahlen[j] == tippZahl) {
					count++;
				}
			}
			
		}
		return count;
	
	
	}
}
