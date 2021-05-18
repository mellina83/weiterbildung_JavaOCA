package dev_tictactoe;

public class TicTacToeModel implements TicTacToeModelInterface{

	@Override
	public int getAnzahlSpielzuege(String[] spielfeld) {
		int anzahlSpielzuege = 0;
		for (String feld : spielfeld) {
			if (feld.equals("X") || feld.equals("O")) {
				anzahlSpielzuege++;
			}
		}
		return anzahlSpielzuege;
	}

	@Override
	public boolean checkGewinner(String[] spielfeld) {
		// Senkrechte Gewinner
		for(int i = 0; i < 3 ; i++) {
			if (!spielfeld[i].equals("") && spielfeld[i].equals(spielfeld[i + 3]) && spielfeld[i].equals(spielfeld[i + 6])) {
				return true;
			}
		}
		// Waagerechte Gewinner
		for (int i = 0; i < 7; i += 3) {
			if (!spielfeld[i].equals("") && spielfeld[i].equals(spielfeld[i + 1]) && spielfeld[i].equals(spielfeld[i + 2])) {
				return true;
			}
		}
		// Diagonale 1
		if (!spielfeld[0].equals("") && spielfeld[0].equals(spielfeld[4]) && spielfeld[0].equals(spielfeld[8])) {
			return true;
		}
		// Diagonale 2
		if (!spielfeld[2].equals("") && spielfeld[2].equals(spielfeld[4]) && spielfeld[2].equals(spielfeld[6])) {
			return true;
		}
		return false;
	}

	@Override
	public boolean istBelegt(int index, String[] spielfeld) {
		return spielfeld[index].equals("X") || spielfeld[index].equals("O");
	}

}
