package arrays_projectLotto;

import java.util.Arrays;

public class LottoSpiel {
	
	private int anzahlKugeln, anzahlKugelnGesamt;
	
	private int[] zahlen;

	public LottoSpiel(int anzahlKugeln, int anzahlKugelnGesamt) {
		this.anzahlKugeln = anzahlKugeln;
		this.anzahlKugelnGesamt = anzahlKugelnGesamt;
	}
	
	public void ziehen() {
		zahlen = ArrayUtils.createUniqueRandomSortedArray(1, anzahlKugelnGesamt, anzahlKugeln);
	}
	
	public String toString() {
		String zahlenAlsText = "Es gab noch keine Ziehung";
		
		if(zahlen!=null) {
			zahlenAlsText = Arrays.toString(zahlen);
		}
		
		return "Spiel " + anzahlKugeln + " aus " + anzahlKugelnGesamt + ". " + zahlenAlsText;
	}

	/*
 		0 richtige: 0 Euro
        1 richtige: 1 Euro
        2 richtige: 10 Euro
        3 richtige: 100 Euro
        4 richtige: 1000 Euro
	 */
	public int vergleichen(LottoTipp tipp) {
		int anzahlRichtige = getAnzahlRichtige(tipp);
		
		return (int)Math.pow(10, anzahlRichtige-1);
	}

	public int getAnzahlRichtige(LottoTipp tipp) {
		int count = 0;
		
		int[] tippZahlen = tipp.getZahlen();
		
		// Für alle Tipp-Zahlen:
		for (int i = 0; i < tippZahlen.length; i++) {
			int tippZahl = tippZahlen[i];
			
			// Suche eine Tipp-Zahl in this.zahlen (in gezogenen Zahlen)
			for (int j = 0; j < zahlen.length; j++) {
				if(zahlen[j] == tippZahl) {
					count++;
				}
			}
			
		}
		
		return count;
	}
}
