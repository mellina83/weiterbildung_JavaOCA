package dev_mvc.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;

import dev_mvc.controller.ZinsrechnerController;

public class ZinsrechnerView extends JFrame {
	
	//Muss Controller kennen
	private ZinsrechnerController controller;
	
	//Deklaration der Menueleiste, des Menues und der Menuepunkte
	private JMenuBar menuBar;
	private JMenu mnuInfo;
	private JMenuItem mniInfo;
	
	//Deklaration der Schriftart
	Font myFont = new Font("Verdana", Font.BOLD, 16 );
	
	// Deklaration der Komponenten
	private JLabel lblStartkapital;
	private JLabel lblZinssatz;
	private JLabel lblLaufzeit;
	private JLabel lblEndkapital;
	private JLabel lblTitel;
	
	private JTextField txfStartkapital;
	private JTextField txfZinssatz;
	private JTextField txfLaufzeit;
	private JTextField txfEndkapital;
	private JTextArea txaVerlauf;
	private JScrollPane scpVerlauf;
	
	private JRadioButton rbtEndkapital;
	private JRadioButton rbtLaufzeit;
	
	private ButtonGroup btgModus;
	private JButton btnBerechnen;
	private JButton btnBeenden;
	private JButton btnLoeschen;
	
	private JPanel pnlInhalt; // Panel als Container f�r die Komponenten
	private JPanel pnlButtons;
	private JPanel pnlGesamt;
	private JPanel pnlTitel;
	private JPanel pnlVerlauf;
	


	
	public ZinsrechnerView() {
		super("Zinsrechner"); // Setzen der Titelleiste
		this.setTitle("Zinsrechner"); // Setzen der Titelleiste (Alternative)
		this.setSize(400, 750); // Setzen der Gr��e auf 300 mal 400 Pixel
		//this.setBounds(200, 200, 640, 480);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Beim Klick auf Schlie�feld soll Anwendung beendet werden
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// Beim Klick auf Schlie�feld soll nichts passieren, Controller steuert diese Funktion
		
		this.setLocationRelativeTo(null); // Fenster zentrieren auf dem Bildschirm
		
		this.initComponents(); // Komponenten initialisieren
		
//		Optionsfelder gruppieren		
		btgModus.add(rbtEndkapital);
		btgModus.add(rbtLaufzeit);
		
//		Optionsfeld Endkapital standardmaessig auswaehlen
		rbtEndkapital.setSelected(true);
		
//		Textfeld Endkapital darf standardmaessig nicht bearbeitet werden
		txfEndkapital.setEditable(false);
		txaVerlauf.setEditable(false);
		
//		ScrollPane nur mit vertikalem Scrollbalken, wenn noetig.
		scpVerlauf.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
//		Hinzufuegen der Menueleiste
		menuBar.add(mnuInfo);
		mnuInfo.add(mniInfo);
		this.setJMenuBar(menuBar);
		
//		Hinzufuegen der Komponenten - Hier wird die Reihenfolge festgelegt
		
		pnlTitel.add(lblTitel);
		
		pnlInhalt.add(lblStartkapital);
		pnlInhalt.add(txfStartkapital);
		pnlInhalt.add(lblZinssatz);
		pnlInhalt.add(txfZinssatz);
		pnlInhalt.add(lblLaufzeit);
		pnlInhalt.add(txfLaufzeit);
		pnlInhalt.add(lblEndkapital);
		pnlInhalt.add(txfEndkapital);
		pnlInhalt.add(rbtEndkapital);
		pnlInhalt.add(rbtLaufzeit);
		
		pnlButtons.add(btnBerechnen);
		pnlButtons.add(btnLoeschen);
		pnlButtons.add(btnBeenden);
		
		pnlVerlauf.add(scpVerlauf); //vorher war txaVerlauf drin
		
		pnlGesamt.add(pnlTitel);
		pnlGesamt.add(pnlInhalt);
		pnlGesamt.add(pnlButtons);
		pnlGesamt.add(pnlVerlauf);
		
//		Panel als "Inhaltsscheibe" (content pane) des JFrame definieren
		this.setContentPane(pnlGesamt);
		
//		Layout des Panels setzen (Gitter- Layout mit 5 Zeilen und 2 Spalten) spaeter mit RadioButtons 6 Zeilen
		pnlInhalt.setLayout(new GridLayout(5, 2, 30,30));
		pnlGesamt.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));

//		Hintergrundfarbe setzen im Gesamtpanel, Rest durchsichtig machen
		pnlGesamt.setBackground(Color.YELLOW);
		pnlTitel.setOpaque(false);
		pnlButtons.setOpaque(false);
		pnlVerlauf.setOpaque(false);
		pnlInhalt.setOpaque(false);
		rbtEndkapital.setOpaque(false);
		rbtLaufzeit.setOpaque(false);
	
		//Setzen der Schriftart
		lblTitel.setFont(myFont);
	
//		Initialisieren des Controllers
		// Achtung!!! Das muss vor dem Hinzufuegen des Listeners sein
		this.controller = new ZinsrechnerController(this);
		
// 		Hinzufuegen eines Listeners zu dem Button Beenden (Normalerweise in Controller)
		mniInfo.addActionListener(controller);
		btnBeenden.addActionListener(controller); //ueberlasse ich dem COntroller
		btnBerechnen.addActionListener(controller);
		btnLoeschen.addActionListener(controller);
		rbtEndkapital.addActionListener(controller);
		rbtLaufzeit.addActionListener(controller);
		
		
//		Hinzufuegen eines WIndow Listeners zum JFrame
		this.addWindowListener(controller);
		
//		Registrieren der Key-Listener bei den Textfeldern
		txfStartkapital.addKeyListener(controller);
		txfZinssatz.addKeyListener(controller);
		txfLaufzeit.addKeyListener(controller);
		txfEndkapital.addKeyListener(controller);
		
	}
	
	public void initComponents() {
		
		this.menuBar = new JMenuBar();
		this.mnuInfo = new JMenu("Info");
		this.mniInfo = new JMenuItem("Info");
		
		this.lblTitel = new JLabel("Zinsrechner");
		this.lblStartkapital = new JLabel("Startkapital");
		this.lblZinssatz = new JLabel("Zinssatz");
		this.lblLaufzeit = new JLabel("Laufzeit");
		this.lblEndkapital = new JLabel("Endkapital");
		
		this.txfStartkapital = new JTextField(10);
		this.txfZinssatz = new JTextField(10);
		this.txfLaufzeit = new JTextField(10);
		this.txfEndkapital = new JTextField(10);
		this.txaVerlauf = new JTextArea(10,25);
		
		this.btgModus = new ButtonGroup();
		this.rbtEndkapital = new JRadioButton("Endkapital");
		this.rbtLaufzeit = new JRadioButton("Laufzeit");
		
		this.btnBerechnen = new JButton("Berechnen");
		this.btnLoeschen = new JButton("Loeschen");
		this.btnBeenden = new JButton("Beenden");
		
		this.pnlInhalt = new JPanel();
		this.pnlButtons = new JPanel();
		this.pnlGesamt = new JPanel();
		this.pnlTitel = new JPanel();
		this.pnlVerlauf = new JPanel();
		this.scpVerlauf = new JScrollPane(txaVerlauf);
	}
	
	//Die benoetigten Getter und Setter Methoden
	
	public JMenuItem getMniInfo() {
		return mniInfo;
	}
	
	public JTextField getTxfStartkapital() {
		return txfStartkapital;
	}

	public JTextField getTxfZinssatz() {
		return txfZinssatz;
	}

	public JTextField getTxfLaufzeit() {
		return txfLaufzeit;
	}

	public JTextField getTxfEndkapital() {
		return txfEndkapital;
	}

	public void setTxfLaufzeit(JTextField txfLaufzeit) {
		this.txfLaufzeit = txfLaufzeit;
	}

	public void setTxfEndkapital(JTextField txfEndkapital) {
		this.txfEndkapital = txfEndkapital;
	}

	public JButton getBtnBerechnen() {
		return btnBerechnen;
	}

	public JButton getBtnBeenden() {
		return btnBeenden;
	}

	public JRadioButton getRbtEndkapital() {
		return rbtEndkapital;
	}

	public JRadioButton getRbtLaufzeit() {
		return rbtLaufzeit;
	}
	
	public JButton getBtnLoeschen() {
		return btnLoeschen;
	}
	
	public JTextArea getTxaVerlauf() {
		return txaVerlauf;
	}
	
	

}
