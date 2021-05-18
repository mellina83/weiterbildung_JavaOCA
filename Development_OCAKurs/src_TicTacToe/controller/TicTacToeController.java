package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import model.TicTacToeModel;
import model.TicTacToeModelInterface;
import view.TicTacToeView;

public class TicTacToeController extends WindowAdapter implements ActionListener {
	TicTacToeView view;
	TicTacToeModelInterface model;
	
	public TicTacToeController(TicTacToeView view) {
		this.view = view;
		this.model = new TicTacToeModel();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			if (button.getText() == null || button.getText().equals("")) {
				feldsetzen(e);
			}
			
		} else if (e.getSource() instanceof JMenuItem) {
			if (e.getSource() == view.getMniBeenden()) {
				beenden();
			} else if (e.getSource() == view.getMniNeu()) {
				allesLoeschen(); 
				
			}
		}
		
	}
	
	public void beenden() {
		int antwort = JOptionPane.showConfirmDialog(null, "Moechten Sie beenden?", "Beenden", JOptionPane.YES_NO_OPTION);
		if (antwort == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	public void allesLoeschen() {
		for (int i = 0; i < 9; i++) {
			view.getButtons()[i].setText("");
		}
		
	}
	
	public void feldsetzen(ActionEvent e) {
		String symbol = model.getAnzahlSpielzuege(getFelder()) % 2 == 0 ? "X" : "O";
		((JButton) e.getSource()).setText(symbol);
		
		if(model.checkGewinner(getFelder())) {
			JOptionPane.showMessageDialog(view, "Gewonnen!");
		}
		

	}
	

	
	private String[] getFelder() {
		String[] felder = new String[9];
		JButton[] buttons = view.getButtons();
		for (int i = 0; i < 9; i++) {
			felder[i] = buttons[i].getText();
		}
		return felder;
	}


	@Override
	public void windowClosing(WindowEvent e) {
		beenden();
	}


		
		
	

}
