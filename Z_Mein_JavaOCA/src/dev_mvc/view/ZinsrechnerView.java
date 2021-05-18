package dev_mvc.view;

import java.awt.GridLayout;

import javax.swing.*;

public class ZinsrechnerView extends JFrame{
	
	// Deklaration der Komponenten
	private JLabel lblStartkapital;
	private JLabel lblZinssatz;
	private JLabel lblLaufzeit;
	private JLabel lblEndkapital;
	
	private JTextField txfStartkapital;
	private JTextField txfZinssatz;
	private JTextField txfLaufzeit;
	private JTextField txfEndkapital;
	
	private JButton btnBerechnen;
	private JButton btnBeenden;
	
	private JPanel pnlInhalt; // Panel als Container f�r die Komponenten
	
	public ZinsrechnerView() {
		super("Zinsrechner"); // Setzen der Titelleiste
		this.setTitle("Zinsrechner"); // Setzen der Titelleiste (Alternative)
		this.setSize(300, 400); // Setzen der Gr��e auf 300 mal 400 Pixel
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Beim Klick auf Schlie�feld soll Anwendung beendet werden
		this.setLocationRelativeTo(null); // Fenster zentrieren auf dem Bildschirm
		
		this.initComponents(); // Komponenten initialisieren
		
//		Hinzuf�gen der Komponenten
		pnlInhalt.add(lblStartkapital);
		pnlInhalt.add(txfStartkapital);
		pnlInhalt.add(lblZinssatz);
		pnlInhalt.add(txfZinssatz);
		pnlInhalt.add(lblLaufzeit);
		pnlInhalt.add(txfLaufzeit);
		pnlInhalt.add(lblEndkapital);
		pnlInhalt.add(txfEndkapital);
		pnlInhalt.add(btnBerechnen);
		pnlInhalt.add(btnBeenden);
		
//		Panel als "Inhaltsscheibe" (content pane) des JFrame definieren
		this.setContentPane(pnlInhalt);
		
//		Layout des Panels setzen (Gitter- Layout mit 5 Zeilen und 2 Spalten)
		pnlInhalt.setLayout(new GridLayout(5, 2, 30,30));
	}
	
	public void initComponents() {
		this.lblStartkapital = new JLabel("Startkapital");
		this.lblZinssatz = new JLabel("Zinssatz");
		this.lblLaufzeit = new JLabel("Laufzeit");
		this.lblEndkapital = new JLabel("Endkapital");
		
		this.txfStartkapital = new JTextField(10);
		this.txfZinssatz = new JTextField(10);
		this.txfLaufzeit = new JTextField(10);
		this.txfEndkapital = new JTextField(10);
		
		this.btnBerechnen = new JButton("Berechnen");
		this.btnBeenden = new JButton("Beenden");
		
		this.pnlInhalt = new JPanel();
	}

}
