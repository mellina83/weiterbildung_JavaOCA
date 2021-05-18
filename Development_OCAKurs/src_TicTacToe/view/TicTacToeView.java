package view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import controller.TicTacToeController;

public class TicTacToeView extends JFrame {
	
	private TicTacToeController controller;
	
	private JMenuBar menubar;
	private JMenu mnuSpiel;
	private JMenuItem mniNeu;
	private JMenuItem mniBeenden;
	private JButton[] buttons;
	
	private JPanel pnlButtons;
	
	private boolean sieger;
	
	
	
	
	public TicTacToeView() {
		super("TicTacToe");
		this.setSize(400, 400);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.initComponents();
		this.controller = new TicTacToeController(this);
		
		menubar.add(mnuSpiel);
		mnuSpiel.add(mniNeu);
		mnuSpiel.add(mniBeenden);
		this.setJMenuBar(menubar);
		
		Font font = new Font("Arial", Font.BOLD, 48);
		
		//Button Komponente, Listener und Formatierung hinzufuegen
		for (int i = 0; i < 9; i++) {
			pnlButtons.add(buttons[i]);
			buttons[i].addActionListener(controller);
			buttons[i].setFont(font);
		}
		
		//Listener fuer Menubar und Fenster schliessen
		mniNeu.addActionListener(controller);
		mniBeenden.addActionListener(controller);
		this.addWindowListener(controller);
		
		//Layout
		pnlButtons.setLayout(new GridLayout(3, 3));
		this.setContentPane(pnlButtons);
		
		
		
	}
	
	
	
	
	private void initComponents() {
		buttons = new JButton[9];
		for (int i = 0; i < 9;i++) {
			buttons[i] = new JButton();
		}
		
			
		this.pnlButtons = new JPanel();
		this.menubar = new JMenuBar();
		this.mnuSpiel = new JMenu("Spiel");
		this.mniNeu = new JMenuItem("Neu");
		this.mniBeenden = new JMenuItem("Beenden");
		
		
	}
	
	//Getter und Setter

	public JMenuBar getMenubar() {
		return menubar;
	}

	public JMenu getMnuSpiel() {
		return mnuSpiel;
	}

	public JMenuItem getMniNeu() {
		return mniNeu;
	}

	public JMenuItem getMniBeenden() {
		return mniBeenden;
	}

	public JButton[] getButtons() {
		return buttons;
	}
	
	public Boolean getSieger() {
		return sieger;
	}
	

}
