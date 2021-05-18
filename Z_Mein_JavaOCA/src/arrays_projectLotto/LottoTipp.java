package arrays_projectLotto;

import java.util.Arrays;

public class LottoTipp {
	
	private int anzahlKugeln;
	private int anzahlKugelnGesamt;
	private int [] zahlen;

	public LottoTipp(int anzahlKugeln, int anzahlKugelnGesamt) {
		this.anzahlKugeln = anzahlKugeln;
		this.anzahlKugelnGesamt = anzahlKugelnGesamt;
	}

	public void abgeben() {
		zahlen = ArrayUtils.createUniqueRandomSortedArray(1, anzahlKugelnGesamt, anzahlKugeln);
	}
	
	public int[] getZahlen() {
		return zahlen;
	}

	@Override
	public String toString() {
		String zahlenAlsText = "Noch kein Tipp abgegeben";
		
		if(zahlen!=null) {
			zahlenAlsText = Arrays.toString(zahlen);
		}
		
		return "Tipp " + anzahlKugeln + " aus " + anzahlKugelnGesamt + ". " + zahlenAlsText;
	}
}
