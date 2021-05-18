package dev_plzsuche;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PLZView extends JFrame{
	
//	View kennt seinen Controller
	private PLZController controller;
	
//	Deklaration der Men�leiste, des Men�s und der Men�punkte
	private JMenuBar menuBar;
	private JMenu mnuInfo;
	private JMenuItem mniInfo;
	
//	Deklaration der Schriftart
	Font myFont = new Font("Verdana", Font.BOLD, 16);
	
	// Deklaration der Komponenten
	private JLabel lblTitel;
	private JLabel lblPostleitzahl;
	private JLabel lblOrt;
	private JLabel lblBundesland;
	
	private JTextField txfPostleitzahl;
	private JTextField txfOrt;
	private JTextField txfBundesland;
	
	private JButton btnSuchen;
	private JButton btnLoeschen;
	private JButton btnBeenden;
		
	private JPanel pnlInhalt; // Panel als Container f�r die Komponenten
	private JPanel pnlButtons;
	private JPanel pnlGesamt;
	private JPanel pnlTitel;

	
	public PLZView() {
		super("Postleitzahlensuche"); // Setzen der Titelleiste
		this.setTitle("Postleitzahlensuche"); // Setzen der Titelleiste (Alternative)
		this.setSize(500, 400); // Setzen der Gr��e auf 300 mal 400 Pixel
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Beim Klick auf Schlie�feld soll Anwendung beendet werden
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// Beim Klick auf Schlie�feld soll nichts passieren, Controller steuert diese Funktion
		this.setLocationRelativeTo(null); // Fenster zentrieren auf dem Bildschirm
		
		this.initComponents(); // Komponenten initialisieren
		
//		Hinzuf�gen der Men�leiste
		menuBar.add(mnuInfo);
		mnuInfo.add(mniInfo);
		this.setJMenuBar(menuBar);
		
//		Hinzuf�gen der Komponenten
		pnlTitel.add(lblTitel);
		
		pnlInhalt.add(lblPostleitzahl);
		pnlInhalt.add(txfPostleitzahl);
		pnlInhalt.add(lblOrt);
		pnlInhalt.add(txfOrt);
		pnlInhalt.add(lblBundesland);
		pnlInhalt.add(txfBundesland);
		
		pnlButtons.add(btnSuchen);
		pnlButtons.add(btnLoeschen);
		pnlButtons.add(btnBeenden);
			
		pnlGesamt.add(pnlTitel);
		pnlGesamt.add(pnlInhalt);
		pnlGesamt.add(pnlButtons);
		
//		Panel als "Inhaltsscheibe" (content pane) des JFrame definieren
		this.setContentPane(pnlGesamt);
		
//		Layout des Panels setzen (Gitter- Layout mit 6 Zeilen und 2 Spalten)
		pnlInhalt.setLayout(new GridLayout(3, 2, 0,30));
		pnlGesamt.setLayout(new FlowLayout(FlowLayout.CENTER, 10000, 30));
		
//		Textfelder f�r Ort und Bundesland auf nicht editierbar setzen
		txfOrt.setEditable(false);
		txfBundesland.setEditable(false);
		
//		Hintergrundfarbe setzen
		pnlGesamt.setBackground(Color.ORANGE);
//		Panels durchsichtig machen
		pnlTitel.setOpaque(false);
		pnlInhalt.setOpaque(false);
		pnlButtons.setOpaque(false);
		
//		Setzen der Schriftart
		lblTitel.setFont(myFont);
		
		// Initialisieren des Controllers
		this.controller = new PLZController(this);
		
//		Hinzuf�gen eines Listeners zu dem Button Beenden
//		btnBeenden.addActionListener(new MyActionListener());
//		btnBeenden.addActionListener(new ActionListener() {			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});
//		btnBeenden.addActionListener(e -> System.exit(0));
		mniInfo.addActionListener(controller);
		btnBeenden.addActionListener(controller);
		btnLoeschen.addActionListener(controller);
		btnSuchen.addActionListener(controller);
		
//		Hinzuf�gen eines WindowListeners zum JFrame
		this.addWindowListener(controller);
		
//		Registrieren der KeyListener bei den Textfeldern
		txfPostleitzahl.addKeyListener(controller);
		txfOrt.addKeyListener(controller);
		txfBundesland.addKeyListener(controller);
		
	}
	
	public void initComponents() {
		this.menuBar = new JMenuBar();
		this.mnuInfo = new JMenu("Info");
		this.mniInfo = new JMenuItem("Info");
		
		this.lblTitel = new JLabel("PLZ-Suche");
		this.lblPostleitzahl = new JLabel("Postleitzahl");
		this.lblOrt = new JLabel("Ort");
		this.lblBundesland = new JLabel("Bundesland");
		
		this.txfPostleitzahl = new JTextField(20);
		this.txfOrt = new JTextField(20);
		this.txfBundesland = new JTextField(20);
		
		this.btnSuchen = new JButton("Suchen");
		this.btnLoeschen = new JButton("L�schen");
		this.btnBeenden = new JButton("Beenden");
		
		
		this.pnlInhalt = new JPanel();
		this.pnlTitel = new JPanel();
		this.pnlButtons = new JPanel();
		this.pnlGesamt = new JPanel();
	}

	public JMenuItem getMniInfo() {
		return mniInfo;
	}

	public JTextField getTxfPostleitzahl() {
		return txfPostleitzahl;
	}

	public JTextField getTxfOrt() {
		return txfOrt;
	}

	public JTextField getTxfBundesland() {
		return txfBundesland;
	}

	public JButton getBtnSuchen() {
		return btnSuchen;
	}

	public JButton getBtnLoeschen() {
		return btnLoeschen;
	}

	public JButton getBtnBeenden() {
		return btnBeenden;
	}

	// Die ben�tigten getter und setter-Methoden
	
}



