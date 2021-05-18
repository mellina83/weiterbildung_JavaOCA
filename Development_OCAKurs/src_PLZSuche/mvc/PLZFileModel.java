package mvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PLZFileModel implements PLZModelInterface {
	
	private ArrayList<String> plzListe = new ArrayList<>();
	
	public PLZFileModel() {
		// Datei in Collection speichern, da geht die Suche schneller
		try {
			//Scanner sc = new Scanner(new File("files/plz.txt"), "UTF-8");
			Scanner sc = new Scanner(new File("files/zuordnung_plz_ort.csv"), "UTF-8");
			
			while (sc.hasNext()) {
				plzListe.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getPlzListe() {
		return plzListe;
	}
	

	@Override
	public String sucheOrt(String postleitzahl) {
		StringBuilder orte = new StringBuilder();
				
		for (String plzOrt : plzListe ) {
			//if (plzOrt.startsWith(postleitzahl)) {
			if (plzOrt.contains("," + postleitzahl)) {	
				String[] arrayZeile = plzOrt.split(",");
				if (!orte.toString().contains(arrayZeile[1])) {
					orte = orte.append(arrayZeile[1] + " ");
				}
			}
		}
		return orte.toString();
	}

	@Override
	public String sucheBundesland(String postleitzahl) {
		StringBuilder bundeslaender = new StringBuilder();
		
		for (String plzBundesland : plzListe ) {
			//if (plzBundesland.startsWith(postleitzahl)) {
			if (plzBundesland.contains("," + postleitzahl)) {
				String[] arrayZeile = plzBundesland.split(",");
				if (!bundeslaender.toString().contains(arrayZeile[3])) {
					bundeslaender = bundeslaender.append(arrayZeile[3] + " ");
				}
				
			}
			
		}
		
		return bundeslaender.toString();
		
	}
	
	public ArrayList<String> getPLZListe() {
		return plzListe;
	}
}
