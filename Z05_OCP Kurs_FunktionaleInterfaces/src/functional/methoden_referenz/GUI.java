package functional.methoden_referenz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener{

	MyController controller01 = new MyController("GUI Beispiel Controller");
	MyController controller02 = new MyController("controller02");
	MyController controller03 = new MyController("controller03");
	
	public static void main(String[] args) {
		new GUI();
	}
	
	public GUI() {
		this.setTitle("GUI Beispiel");
		this.setBounds(100, 100, 640, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		this.setContentPane(panel);
		
		JButton btn_exit = new JButton("Exit");
		JButton btn_save = new JButton("Save");
		panel.add(btn_exit);
		panel.add(btn_save);
		
		/*
		 * Statische Methoden Referenz
		 */
//		btn_exit.addActionListener(MyController::staticExitAction);
//		btn_exit.addActionListener(GUI::staticExitAction);
		
		/*
		 * Instanz Methoden Referenz
		 */
//		btn_exit.addActionListener(controller03::instanceExitAction);
//		btn_exit.addActionListener(this::instanceExitAction);
		btn_exit.addActionListener(this::actionPerformed);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("GUI lauscht ebenfalls");	
	}

	public static void staticExitAction(ActionEvent e) {
		System.out.println("Aus der Klasse selbst");
		System.exit(0);
	}
	
	public void instanceExitAction(ActionEvent e) {
		System.out.println("Aus der Klasse selbst");
		System.exit(0);
	}
}
