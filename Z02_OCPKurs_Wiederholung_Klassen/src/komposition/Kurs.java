package komposition;

import java.util.ArrayList;

public class Kurs {

	private ArrayList<Thema> themen;

	public Kurs() {
		themen = new ArrayList<Thema>();
	}
	
	/**
	 * Beim Hinzufügen geben wir lediglich eine Information zu den neu zu
	 * erzeugenden Teil der Komposition mit.
	 * 
	 * @param nr
	 */
	public void addThema(String titel) {
		this.themen.add(new Thema(titel));
	}
	
	/**
	 * Es wird nur eine Kopie herausgegeben. Womit die Komposition ihre Aussage
	 * behält, wenn das Ganze gelöscht wird, werden auch die Teile gelöscht.
	 * 
	 * @return
	 */
	public Thema getThema() {
		String titel = themen.get(themen.size()-1).getTitel();
		Thema copy = new Thema(titel);
		return copy;
	}
	
	public void zeigeAlleThemen() {
		System.out.println("Themenliste Start");
		for (Thema thema : themen) {
			System.out.println(thema);
		}
		System.out.println("Themenliste Ende");
	}
}
