package dev_mvc;

import java.util.Locale;

import javax.swing.JFrame;

import dev_mvc.view.ZinsrechnerView;

public class ZinsrechnerTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.GERMAN); 
		JFrame frame = new ZinsrechnerView();
		frame.setVisible(true); // JFrame ist standardm��ig nicht sichtbar
		
	}

}

