package functional;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class MyActions {

	public static void exitAction(ActionEvent e){
		System.exit(0);
	}
	
	public static void loadAction(ActionEvent e){
		System.out.println("Datei Laden");
	}
	
	public static void saveAction(ActionEvent e){
		System.out.println("Datei Speichern");
	}
	
	public static void beendenAction(ActionEvent e){
		JOptionPane.showMessageDialog(null, "Alles mit Methodenreferenz");
	}
}
