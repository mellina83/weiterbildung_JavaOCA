package dev_plzsuche;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class PLZController extends WindowAdapter implements ActionListener, KeyListener{
	
	private PLZView view;
	private PLZModelInterface model;
	
	public PLZController(PLZView view) {
		this.view = view;
//		this.model = new  PLZFileModel();
		this.model = new PLZDBModel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Programm beenden, falls der Button btnBeenden geklickt wird
		if (e.getSource() == view.getBtnBeenden()) {
			beenden();		
		} else if (e.getSource() == view.getBtnSuchen()) {
			suchePLZ();		
		}  else if (e.getActionCommand().equals("L�schen")) {
			loeschen();
		} else if (e.getSource() == view.getBtnLoeschen()) {
			loeschen();
		} else if (e.getSource() == view.getMniInfo()) {
			info();
		}
		
	}
	
	private void info() {
		JOptionPane.showMessageDialog(view, "Zinsrechner 2021" + System.lineSeparator() + "Marco Hensel", "Info", JOptionPane.INFORMATION_MESSAGE);		
	}

	private void loeschen() {
		// Cursor (Fokus) in das Textfeld Startkapital
		view.getTxfPostleitzahl().requestFocusInWindow();
		view.getTxfPostleitzahl().setText("");
		view.getTxfOrt().setText("");
		view.getTxfBundesland().setText("");
		
	}
	
	
	
	private void beenden() {
//		Sicherheitsabfrage, ob wirklich beendet werden soll
//		JOptionPane
		int antwort = JOptionPane.showConfirmDialog(view,
				"Sind Sie sicher?", "Beenden", JOptionPane.YES_NO_OPTION);
		if (antwort == JOptionPane.YES_OPTION) {
			System.exit(0);		
		}
	}
	
	private void suchePLZ() {
		// Drei Textfelder auslesen (getText)
		String postleitzahl = view.getTxfPostleitzahl().getText();
		
		// Aufruf der berechneLaufzeit-Methode aus dem Model
		String ort = model.sucheOrt(postleitzahl);
		String bundesland = model.sucheBundesland(postleitzahl);
				
		// Schreiben des Ergebnisses in das Textfeld (setText)
		view.getTxfOrt().setText(ort);
		view.getTxfBundesland().setText(bundesland);
		
	}

	

	@Override
	public void windowClosing(WindowEvent e) {
		beenden();		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10) {
//			falls Textfeld Postleitzahl aktiv, Suche starten
			if (e.getSource() == view.getTxfPostleitzahl()) {
				suchePLZ();
			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {}

}
