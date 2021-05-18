package dev_mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

import dev_mvc.model.*;
import dev_mvc.view.*;

public class ZinsrechnerController extends WindowAdapter implements ActionListener, KeyListener  {
// implements WindowListener weg, dafur extend Window Adapter = nice to have / Comfortklasse
	
	//wir deklarieren auf das Interface
	private ZinsrechnerView view;
	private ZinsrechnerModelInterface model; // hier Basistypvariable
	
	//wir muessen drauf achten dass wir an View uebergeben
	public ZinsrechnerController(ZinsrechnerView view) {
		this.view = view;
		this.model = new ZinsrechnerMatheModel();
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
//		Programm beenden, falls der Button btnBeenden geklickt wird
		if (e.getSource() == view.getBtnBeenden()) {
			beenden();
		} else if (e.getSource() == view.getBtnBerechnen()) {
			if (view.getRbtEndkapital().isSelected()) {
				berechneEndkapital();
			} else if (view.getRbtLaufzeit().isSelected()) {
				berechneLaufzeit();
			}
		} else if (e.getSource() == view.getRbtEndkapital()) {
			// is Selected fuehrt irgendwie dazu, dass der letzte Fall, info, nicht aktiv wird...
			view.getTxfLaufzeit().setEditable(true);
			view.getTxfEndkapital().setEditable(false);
			loeschen();
		} else if (e.getSource() == view.getRbtLaufzeit()) {
			view.getTxfEndkapital().setEditable(true);
			view.getTxfLaufzeit().setEditable(false);
			loeschen();
		} else if (e.getActionCommand().equals("Loeschen")) { //hier gebunden an Beschriftung des Buttons, und man benoetigt keinen getter
			loeschen();
		} else if (e.getSource() == view.getMniInfo()) {
			info();
		}
		
		
	}
	
	private void info() {
		JOptionPane.showMessageDialog(view, "Zinsrechner 2021" + System.lineSeparator() + "Melanie Duerbeck" , "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void loeschen() {
		view.getTxfStartkapital().setText("");
		view.getTxfLaufzeit().setText("");
		view.getTxfEndkapital().setText("");
		view.getTxfZinssatz().setText("");
		view.getTxaVerlauf().setText("");
		view.getTxfStartkapital().requestFocusInWindow();
		//oder grabFocus();
	}
	
	private void beenden() {
		//Sicherheitsabfrage, ob wirklich beendet werden soll
				// Mit JOptionPane
			int antwort = JOptionPane.showConfirmDialog(null, "Moechten Sie die Anwendung beenden?", "Beenden", JOptionPane.YES_NO_OPTION);
			if (antwort == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
	}
	

	
	
	private void berechneEndkapital() {
		//Drei Textfelder auslesen (getText)
		String startkapitalStr = view.getTxfStartkapital().getText();
		String zinssatzStr = view.getTxfZinssatz().getText();
		String laufzeitStr = view.getTxfLaufzeit().getText();
		
		/*
		int startkapital = Integer.parseInt(view.getTxfStartkapital().getText());
		int laufzeit = Integer.parseInt(view.getTxfLaufzeit().getText());
		double zinssatz = Integer.parseInt(view.getTxfZinssatz().getText());
		 */
		
		//Umwandeln in die entsprechenden primitiven Datentypen (Wrapper)
		
		int startkapital = 0;
		double zinssatz = 0;
		int laufzeit = 0;
		
		
		try {
			startkapital = Integer.parseInt(startkapitalStr);
			zinssatz = Double.parseDouble(zinssatzStr.replace(',', '.')); // Punkt fuer Komma noch ersetzen
			laufzeit = Integer.parseInt(laufzeitStr);
		} catch (NumberFormatException e)  {
			JOptionPane.showMessageDialog(view, "Bitte Zahlen eingeben", "Eingabefehler", JOptionPane.ERROR_MESSAGE);
			loeschen();
			return;
		}
		
		//Aufruf der berechneEndkapital/Methode aus dem Model
		double endkapital = model.berechneEndkapital(startkapital, zinssatz, laufzeit);
		
		//Schreiben des Ergebnisses in das Textfeld mit setText)
		view.getTxfEndkapital().setText(String.format("%, .2f Euro", endkapital));
		
		//Schreiben des Verlaufs in den Textbereich
		view.getTxaVerlauf().setText("");
		for (int i = 1; i <=laufzeit;i++) {
			view.getTxaVerlauf().append(i + ". " + "\t" + String.format("%, .2f Euro", model.berechneEndkapital(startkapital, zinssatz, i))+ "\n");
			
		}
		
	}
	
	private void berechneLaufzeit() {
		String startkapitalStr = view.getTxfStartkapital().getText();
		String zinssatzStr = view.getTxfZinssatz().getText();
		String endkapitalStr = view.getTxfEndkapital().getText();
		
		int startkapital = 0;
		double zinssatz = 0;
		int endkapital = 0;
		
		try {
			startkapital = Integer.parseInt(startkapitalStr);
			zinssatz = Integer.parseInt(zinssatzStr);
			endkapital = Integer.parseInt(endkapitalStr);
		} catch (NumberFormatException e) {
		JOptionPane.showMessageDialog(view, "Bitte Zahlen eingeben", "Eingabefehler", JOptionPane.ERROR_MESSAGE);
		loeschen();
		return;
			
		}
		
		
		double laufzeit = model.berechneLaufzeit(startkapital, zinssatz, endkapital);
		
		view.getTxfLaufzeit().setText(String.format("%.1f", laufzeit));
		
		//Schreiben des Verlaufs in den Textbereich
		view.getTxaVerlauf().setText("");
		for (int i = 1; i <= Math.ceil(laufzeit);i++) {
			view.getTxaVerlauf().append(i + ". " + "\t" + String.format("%, .2f Euro", model.berechneEndkapital(startkapital, zinssatz, i))+ "\n");
					
		}
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		beenden();
	}

	@Override
	public void keyPressed(KeyEvent e) { // Wenn Taste gedrueckt
		if (e.getKeyCode() == 10) {
			
			//falls Textfeld Startkapital aktiv, Fokus in Textfeld Zinssatz
			if (e.getSource() == view.getTxfStartkapital()) {
				view.getTxfZinssatz().requestFocus();
			}
			
			//falls Textfeld Zinssatz aktiv, je nach aktivem Optionsfeld Fokus in Laufzeit oder Endkapital
			else if (e.getSource() == view.getTxfZinssatz()) {
				if (view.getRbtEndkapital().isSelected()) {
					view.getTxfLaufzeit().requestFocus();
				} else if (view.getRbtLaufzeit().isSelected()) {
					view.getTxfEndkapital().requestFocus();
				}
			}
	
			//falls Textfeld Laufzeit oder Endkapital aktiv, dann berechnen
			if (e.getSource() == view.getTxfLaufzeit()) {
				berechneEndkapital();
			} else if (e.getSource() == view.getTxfEndkapital()) {
				berechneLaufzeit();
			} 
				 
		}
		
			
	}

	// oder ((JTextField)e.getSource()).transferFocus(); bei zu vielen Textfeldern


	@Override
	public void keyReleased(KeyEvent e) { // Taste loslassen
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) { // Taste abfragen
		
	}
	
	
}
