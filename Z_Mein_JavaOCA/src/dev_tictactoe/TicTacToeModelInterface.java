package dev_tictactoe;

public interface TicTacToeModelInterface {
	
	int getAnzahlSpielzuege(String[] spielfeld);
	
	boolean checkGewinner(String[] spielfeld);
	
	boolean istBelegt(int index, String[] spielfeld);

}
