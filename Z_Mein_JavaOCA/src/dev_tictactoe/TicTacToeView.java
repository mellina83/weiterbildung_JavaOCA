package dev_tictactoe;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TicTacToeView extends JFrame{
	
	private TicTacToeController controller;
	
	// Deklaration des Men�s
	private JMenuBar menuBar;
	private JMenu mnuSpiel;
	private JMenuItem mniNeu;
	private JMenuItem mniBeenden;
	
	// Deklaration der Komponenten
	private JButton[] buttons;
	
	private JPanel pnlButtons;
	
	public TicTacToeView() {
		super("TicTacToe");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.controller = new TicTacToeController(this);
		
		// Komponenten initialisiert
		this.initComponents();
		
		// Men�leiste
		menuBar.add(mnuSpiel);
		mnuSpiel.add(mniNeu);
		mnuSpiel.add(mniBeenden);
		this.setJMenuBar(menuBar);
		
		Font font = new Font("Arial", Font.BOLD, 48);
		// Komponenten, Listener und Formatierung hinzuf�gen
		for (int i = 0; i < 9; i++) {
			pnlButtons.add(buttons[i]);
			buttons[i].addActionListener(controller);
			buttons[i].setFont(font);
		}
		
		// Layout 
		pnlButtons.setLayout(new GridLayout(3, 3));
		this.setContentPane(pnlButtons);
	}
	
	private void initComponents() {
		menuBar = new JMenuBar();
		mnuSpiel = new JMenu("Spiel");
		mniNeu = new JMenuItem("Neues Spiel");
		mniBeenden = new JMenuItem("Beenden");
		buttons = new JButton[9];
		for (int i = 0; i < 9; i++) {
			buttons[i] = new JButton("");
		}
		pnlButtons = new JPanel();
	}
	
	public JButton[] getButtons() {
		return buttons;
	}
	

}
