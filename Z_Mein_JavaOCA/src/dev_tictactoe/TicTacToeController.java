package dev_tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TicTacToeController implements ActionListener{
	
	private TicTacToeView view;
	private TicTacToeModelInterface model;
	
	public TicTacToeController(TicTacToeView view) {
		this.view = view;
		this.model = new TicTacToeModel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			if (button.getText() == null || button.getText().equals("")) {
				feldSetzen(e);
			}
		}
		
	}
	
	private void feldSetzen(ActionEvent e) {
		String symbol = model.getAnzahlSpielzuege(getFelder()) % 2 == 0 ? "X" : "O";
		((JButton)e.getSource()).setText(symbol);
		if (model.checkGewinner(getFelder())) {
			JOptionPane.showMessageDialog(view, "Gewonnen!");
		}
	}
	
	private String[] getFelder() {
		String[] felder = new String[9];
		JButton[] buttons = view.getButtons();
		for (int i = 0; i < 9 ; i++) {
			felder[i] = buttons[i].getText();
		}
		return felder;
	}

}
