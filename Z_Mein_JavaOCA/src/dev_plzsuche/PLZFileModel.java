package dev_plzsuche;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PLZFileModel implements PLZModelInterface{
	
	private ArrayList<String> plzListe = new ArrayList<>();
	
	public PLZFileModel() {
		try {
			Scanner sc = new Scanner(new File("zuordnung_plz_ort.csv"), "UTF-8");
			while (sc.hasNext()) {
				plzListe.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String sucheOrt(String postleitzahl) {
		StringBuilder ort = new StringBuilder();
		for (String plzOrt : plzListe) {
			if (plzOrt.contains("," + postleitzahl)) {
				String[] temp = plzOrt.split(",");
				ort.append(temp[1] + " ");
			}
		}
		return ort.toString();
	}

	@Override
	public String sucheBundesland(String postleitzahl) {
		StringBuilder bundesland = new StringBuilder();
		for (String plzOrt : plzListe) {
			if (plzOrt.contains("," + postleitzahl)) {
				String[] temp = plzOrt.split(",");
				bundesland.append(temp[3] + " ");
			}
		}
		return bundesland.toString();
	}
	
	public ArrayList<String> getPlzListe() {
		return plzListe;
	}

}
