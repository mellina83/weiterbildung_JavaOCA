package mvc;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class PLZView extends JFrame {
	
	//Controller
	private PLZController controller;
	
	//Deklaration der Komponenten
	
	// Menubar
	private JMenuBar menubar;
	private JMenu mnuDatei;
	private JMenu mnuInfo;
	private JMenuItem mniInfo;
	private JMenuItem mniSuchen;
	private JMenuItem mniLoeschen;
	private JMenuItem mniBeenden;
	private KeyStroke kstSuchen;
	private KeyStroke kstLoeschen;
	private KeyStroke kstBeenden;
	
	//Labels, Textfelder, Buttons
	private JLabel lblTitle;
	private JLabel lblPlz;
	private JLabel lblOrt;
	private JLabel lblBundesland;
	private JTextField txfPlz;
	private JTextField txfOrt;
	private JTextField txfBundesland;
	private JButton btnSuchen;
	private JButton btnLoeschen;
	private JButton btnBeenden;
	private JPanel pnlInhalt;
	private JPanel pnlTitle;
	private JPanel pnlGesamt;
	private JPanel pnlButtons;
	
	//Konstruktor
	public PLZView () {
		this.setTitle("Postleitzahlensuche");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		this.initComponents();
		
		//Komponenten in Panel hinzufuegen
		pnlGesamt.add(pnlTitle);
		pnlGesamt.add(pnlInhalt);
		pnlGesamt.add(pnlButtons);
		
		//Pnl als Inhaltsscheibe setzen
		this.setContentPane(pnlGesamt); 
		
		//Nicht editierbare Felder festlegen
		txfOrt.setEditable(false);
		txfBundesland.setEditable(false);
		
		//Menubar: Setzen, zusammensetzen und Aussehen
		menubar.add(mnuDatei);
		menubar.add(mnuInfo);
		mnuDatei.add(mniSuchen);
		mnuDatei.add(mniLoeschen);
		mnuDatei.add(mniBeenden);
		mnuInfo.add(mniInfo);
		this.setJMenuBar(menubar);
		mnuDatei.setMnemonic(KeyEvent.VK_D);
		mnuInfo.setMnemonic(KeyEvent.VK_I);
		mniSuchen.setAccelerator(null);
		mniLoeschen.setAccelerator(null);
		mniBeenden.setAccelerator(null);
		
		//Den Panels jeweils ihre Komponenten hinzufuegen (Legt die Reihenfolge im GUI fest)
		pnlTitle.add(lblTitle);
		pnlInhalt.add(lblPlz);
		pnlInhalt.add(txfPlz);
		pnlInhalt.add(lblOrt);
		pnlInhalt.add(txfOrt);
		pnlInhalt.add(lblBundesland);
		pnlInhalt.add(txfBundesland);
		pnlButtons.add(btnSuchen);
		pnlButtons.add(btnLoeschen);
		pnlButtons.add(btnBeenden);
		
		//Layout
		pnlInhalt.setLayout(new GridLayout(3, 2, 0,40));
		pnlGesamt.setLayout(new FlowLayout(FlowLayout.CENTER, 1000, 30));
		pnlGesamt.setBackground(Color.WHITE);
		pnlInhalt.setOpaque(false);
		pnlButtons.setOpaque(false);
		pnlTitle.setOpaque(false);
		
		
		//Initialisieren des Controllers
		this.controller = new PLZController(this);
		
		//Listener festlegen
		txfPlz.addKeyListener(controller);
		btnSuchen.addActionListener(controller);
		btnLoeschen.addActionListener(controller);
		btnBeenden.addActionListener(controller);
		mniInfo.addActionListener(controller);
		mniSuchen.addActionListener(controller);
		mniLoeschen.addActionListener(controller);
		mniBeenden.addActionListener(controller);
		this.addWindowListener(controller);
		
	}
	
	//Initialisieren der Komponenten
	public void initComponents() {
		this.menubar = new JMenuBar();
		this.mnuDatei = new JMenu("Datei");
		this.mnuInfo = new JMenu("Info");
		this.mniInfo = new JMenuItem("Info");
		this.mniSuchen = new JMenuItem("Suchen");
		this.mniLoeschen = new JMenuItem("Loeschen");
		this.mniBeenden = new JMenuItem("Beenden");
		
		this.lblBundesland = new JLabel("Bundesland");
		this.lblOrt = new JLabel("Ort");
		this.lblPlz = new JLabel("Postleitzahl");
		this.lblTitle = new JLabel("Postleitzahlensuche");
		
		this.txfBundesland = new JTextField(20);
		this.txfOrt = new JTextField(20);
		this.txfPlz = new JTextField(20);
		
		this.btnBeenden = new JButton("Beenden");
		this.btnLoeschen = new JButton("Loeschen");
		this.btnSuchen = new JButton("Suchen");
		
		this.pnlButtons = new JPanel();
		this.pnlGesamt = new JPanel();
		this.pnlInhalt = new JPanel();
		this.pnlTitle = new JPanel();
		
	}
	
	//Zuletzt: Getter und Setter
	
	public JTextField getTxfPlz() {
		return txfPlz;
	}

	public void setTxfPlz(JTextField txfPlz) {
		this.txfPlz = txfPlz;
	}

	public JTextField getTxfOrt() {
		return txfOrt;
	}

	public void setTxfOrt(JTextField txfOrt) {
		this.txfOrt = txfOrt;
	}

	public JTextField getTxfBundesland() {
		return txfBundesland;
	}

	public void setTxfBundesland(JTextField txfBundesland) {
		this.txfBundesland = txfBundesland;
	}

	public JMenu getMnuDatei() {
		return mnuDatei;
	}

	public JMenu getMnuInfo() {
		return mnuInfo;
	}

	public JMenuItem getMniInfo() {
		return mniInfo;
	}
	
	public JMenuItem getMniSuchen() {
		return mniSuchen;
	}

	public JMenuItem getMniLoeschen() {
		return mniLoeschen;
	}

	public JMenuItem getMniBeenden() {
		return mniBeenden;
	}

	public KeyStroke getKstSuchen() {
		return kstSuchen;
	}

	public KeyStroke getKstLoeschen() {
		return kstLoeschen;
	}

	public KeyStroke getKstBeenden() {
		return kstBeenden;
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


}
