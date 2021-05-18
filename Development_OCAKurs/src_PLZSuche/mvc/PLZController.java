package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class PLZController extends WindowAdapter implements ActionListener, KeyListener {

	// Deklarationen
	private PLZView view;
	private PLZModelInterface model;

	// Konstruktor
	public PLZController(PLZView view) {
		this.view = view;
	//	this.model = new PLZFileModel();
		this.model = new PLZDBModel();
	}

	@Override
	public void windowClosing(WindowEvent e) {
		beenden();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.getBtnBeenden()) {
			beenden();
		} else if (e.getSource() == view.getBtnSuchen()) {
			suchen();
		} else if (e.getSource() == view.getBtnLoeschen()) {
			loeschen();
		} else if (e.getSource() == view.getMniInfo()) {
			infoText();
		} else if (e.getSource() == view.getMniSuchen()) {
			suchen();
		} else if (e.getSource() == view.getMniLoeschen()) {
			loeschen();
		} else if (e.getSource() == view.getMniBeenden()) {
			beenden();
		}
		
	}
	
	private void infoText() {
		JOptionPane.showMessageDialog(view, "Postleitzahlesuche 2021" + System.lineSeparator() + "Melanie Duerbeck" , "Information", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private void loeschen() {
		view.getTxfBundesland().setText("");
		view.getTxfOrt().setText("");
		view.getTxfPlz().setText("");
	}

	private void suchen() {
		// Textfeld auslesen
		String plzEingabe = view.getTxfPlz().getText();

		// Aufruf der Methoden im Model
		String ortAusgabe = model.sucheOrt(plzEingabe);
		String bundeslandAusgabe = model.sucheBundesland(plzEingabe);

		// Schreiben in Textfelder
		view.getTxfOrt().setText(ortAusgabe);
		view.getTxfBundesland().setText(bundeslandAusgabe);

	}

	public void beenden() {
		// Sicherheitsabfrage, ob wirklich beendet werden soll
		// Mit JOptionPane
		int antwort = JOptionPane.showConfirmDialog(null, "Moechten Sie die Anwendung beenden?", "Beenden",
				JOptionPane.YES_NO_OPTION);
		if (antwort == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == 10 && e.getSource() == view.getTxfPlz()) {
			suchen();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
