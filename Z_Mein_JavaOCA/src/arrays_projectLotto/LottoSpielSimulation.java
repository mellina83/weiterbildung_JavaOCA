package arrays_projectLotto;

public class LottoSpielSimulation {

	public static void main(String[] args) {
		int anzahlKugel = 7;
        int anzahlKugelGesamt = 49;
        
        LottoSpiel lotto = new LottoSpiel(anzahlKugel, anzahlKugelGesamt);
        
        System.out.println( lotto ); //  Spiel 7 aus 49. Noch keine Ziehung durchgefürt
        
        lotto.ziehen();
        
        System.out.println( lotto ); //  Spiel 7 aus 49. [3, 7, 11, 28, 35, 40, 48]
        
        
        LottoTipp tipp = new LottoTipp(anzahlKugel, anzahlKugelGesamt);
        
        System.out.println( tipp ); // Tipp 7 aus 49. Noch kein Tipp abgegeben
        
        tipp.abgeben();
        
        System.out.println( tipp ); // Tipp 7 aus 49. [6, 9, 17, 23, 35, 41, 42]
        
        
        int gewinn = lotto.vergleichen(tipp);
        
        int anzahlRichtige = lotto.getAnzahlRichtige(tipp);
        
        System.out.println("* Anzahl richtig getippten Zahlen: " + anzahlRichtige);
        System.out.println("* Gewinn: " + gewinn);
        
	} // end of main

}
